package com.totobhuto.bhootui.service;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Service
public class Json2PojoService {

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
