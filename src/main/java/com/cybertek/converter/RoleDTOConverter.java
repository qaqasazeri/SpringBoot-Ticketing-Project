package com.cybertek.converter;


import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class RoleDTOConverter implements Converter<String,RoleDTO> {
@Autowired
    RoleService roleService;

    @Override
    public RoleDTO convert(String source) {

        RoleDTO object=new RoleDTO();

        object=roleService.findById(Long.parseLong(source));

        return object;
    }
}
