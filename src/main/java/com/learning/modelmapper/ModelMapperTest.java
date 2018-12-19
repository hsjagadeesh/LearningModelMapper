package com.learning.modelmapper;

import com.learning.modelmapper.model.ProblemClassification;
import com.learning.modelmapper.model.ProblemReproducible;
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
        request.setClassification(ProblemClassification.POWER);
        request.setReproducible(ProblemReproducible.ALWAYS);

//        Converter<ProblemClassification, Integer> classificationConverter = ctx -> ctx.getSource() == null ? null : ctx.getSource().getCode();
        Converter<ProblemReproducible, Integer> reproducibleConverter = ctx -> ctx.getSource() == null ? null : ctx.getSource().getCode();

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
