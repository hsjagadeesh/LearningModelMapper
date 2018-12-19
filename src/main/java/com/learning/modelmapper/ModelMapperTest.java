package com.learning.modelmapper;

import com.learning.modelmapper.model.Classification;
import com.learning.modelmapper.model.Reproducible;
import com.learning.modelmapper.model.Request;
import com.learning.modelmapper.model.RequestDTO;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import sun.tools.java.ClassDefinition;

public class ModelMapperTest {

    public static void main(String[] args) {

        Request request = new Request();
        request.setRequestId(101L);
        request.setTitle("Title");
        request.setClassification("Security");
        request.setReproducible("Always");

        Converter<String, Integer> classificationConverter = ctx -> ctx.getSource() == null ? null : Classification.getProblemClassificationByName(ctx.getSource()).getCode();
        Converter<String, Integer> reproducibleConverter = ctx -> ctx.getSource() == null ? null : Reproducible.getProblemReproducibleByName(ctx.getSource()).getCode();

        ModelMapper modelMapper = new ModelMapper();
        PropertyMap<Request, RequestDTO> requestRequestDTOPropertyMap = new PropertyMap<Request, RequestDTO>() {
            @Override
            protected void configure() {
                using(classificationConverter).map(source.getClassification(),destination.getClassification());
                using(reproducibleConverter).map(source.getReproducible(),destination.getReproducibleCode());
            }
        };
        modelMapper.addMappings(requestRequestDTOPropertyMap);

        System.out.println(modelMapper.map(request, RequestDTO.class));

    }
}
