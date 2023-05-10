package com.totobhuto.bhootui.controller;

import com.totobhuto.bhootui.service.JsonVxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class JsonWorkController {

    @Autowired
    JsonVxService jsonVxService;
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/uploads";

    public static String GENERATED_POJO_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources";


    @GetMapping("/jsoncx")
    public String jscx(Model model) {
        model.addAttribute("title", "Bhoot UI - JSON to Java class converter");
        model.addAttribute("message", "Here you can convert a Json to Pojo");
        model.addAttribute("jsoncxPage", true);
        return "jscx";
    }

    @PostMapping("/convertJson2Java")
    public String convertJson2Java(Model model,
                                   @RequestParam("jsxToConvert") MultipartFile jsxToConvert,
                                   @RequestParam("javaClassName") String javaClassName)
            throws IOException {

        model.addAttribute("title", "Bhoot UI - JSON to Java class converter");
        model.addAttribute("jsoncxPage", true);

        String responseMessage = "Something went wrong";
        if (jsxToConvert.getOriginalFilename().contains(".json")) {

            try {
                if (jsonVxService.isValidJson(new String(jsxToConvert.getBytes()))) {

                    StringBuilder fileNames = new StringBuilder();
                    fileNames.append(jsxToConvert.getOriginalFilename());

                    //Saving the JSON in /uploads directory
                    Path filenameAndPath = Paths.get(UPLOAD_DIRECTORY, jsxToConvert.getOriginalFilename());
                    Files.write(filenameAndPath, jsxToConvert.getBytes());
                    System.out.println("JSON uploaded successfully: " + fileNames.toString());

                    //Converting the JSON into a POJO
                    File outputPojoDirectory = new File(GENERATED_POJO_DIRECTORY + File.separator + "generatedpojos");
                    outputPojoDirectory.mkdirs();

                    jsonVxService.convertJsonToJavaPojo(filenameAndPath.toFile().toURL(), outputPojoDirectory,
                            "com.toto", javaClassName);
                    responseMessage = "JSON converted successfully at: " + outputPojoDirectory.getAbsolutePath();
                } else {
                    throw new RuntimeException(String.format("JSON file %s is invalid ", jsxToConvert.getOriginalFilename()));
                }
            } catch (IOException e) {
                model.addAttribute("errormessage", e.getMessage());
                model.addAttribute("errordetails", e);
                return "error";

            } finally {

                model.addAttribute("successmessage", responseMessage);
            }


        } else {
            responseMessage = "Please upload a JSON file only";
            model.addAttribute("errormessage", responseMessage);
        }

        return "jscx";
    }


    @GetMapping("/jsonvx")
    public String jsvx(Model model) {
        model.addAttribute("title", "Bhoot UI - JSON Validator");
        model.addAttribute("message", "Here you can validate a Json");
        model.addAttribute("jsonvxPage", true);
        return "jsvx";
    }

    @PostMapping("/validateJSON")
    public String validateJSON(Model model, @RequestParam("jsxToValidate") MultipartFile jsxToValidate
    ) throws IOException {
        model.addAttribute("title", "Bhoot UI - JSON Validator");
        model.addAttribute("message", "Here you can validate a Json");
        model.addAttribute("jsonvxPage", true);

        String responseMessage = null;
        boolean validJSON = false;

        if (jsxToValidate.getOriginalFilename().contains(".json")) {
            if (jsonVxService.isValidJson(new String(jsxToValidate.getBytes()))) {
                responseMessage = "Hurray ! This JSON is valid";
                validJSON = true;

            }else {
                responseMessage = "Oh No ! This JSON is NOT valid";
            }
        } else {
            responseMessage = "Please upload a JSON file only";
        }
        model.addAttribute("validationMessage", responseMessage);
        model.addAttribute("validJSON", validJSON);
        return "jsvx";
    }
}
