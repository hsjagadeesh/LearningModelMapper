package com.learning.modelmapper;

import com.learning.modelmapper.model.Classification;
import com.learning.modelmapper.model.Reproducible;
import com.learning.modelmapper.model.Request;
import com.learning.modelmapper.model.RequestDTO;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ModelMapperTest {

    public static void main(String[] args) {

        Request request = new Request();
        request.setRequestId(101L);
        request.setTitle("Title");
        request.setClassification(Classification.POWER);
        request.setReproducible(Reproducible.ALWAYS);

//        Converter<Classification, Integer> classificationConverter = ctx -> ctx.getSource() == null ? null : ctx.getSource().getCode();
        Converter<Reproducible, Integer> reproducibleConverter = ctx -> ctx.getSource() == null ? null : ctx.getSource().getCode();

        ModelMapper modelMapper = new ModelMapper();
        PropertyMap<Request, RequestDTO> requestRequestDTOPropertyMap = new PropertyMap<Request, RequestDTO>() {
            @Override
            protected void configure() {
//                using(classificationConverter).map(source.getClassification(),destination.getClassification());
                using(reproducibleConverter).map(source.getReproducible(),destination.getReproducibleCode());
            }
        };
        modelMapper.addMappings(requestRequestDTOPropertyMap);

        System.out.println(modelMapper.map(request, RequestDTO.class));

    }
}
