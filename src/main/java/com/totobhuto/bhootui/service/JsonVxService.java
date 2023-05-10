package com.totobhuto.bhootui.service;

import com.sun.codemodel.JCodeModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Service
public class JsonVxService {

    public boolean isValidJson(String jsonToValidate) {

        try {
            new JSONObject(jsonToValidate);
        } catch (Exception e) {
            try {
                new JSONArray(jsonToValidate);
            } catch (JSONException ex) {
                return false;
            }
        }
        return true;
    }

    public void convertJsonToJavaPojo(URL inputJsonUrl, File outputJavaPojoDirectory, String packageName, String javaClassName) throws IOException {

        JCodeModel jCodeModel = new JCodeModel();
        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config),
                new SchemaStore()), new SchemaGenerator());

        mapper.generate(jCodeModel, javaClassName, packageName, inputJsonUrl);

        jCodeModel.build(outputJavaPojoDirectory);

    }
}
