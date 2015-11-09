package com.softserveinc.ita.jresume.common.mapper;

import org.springframework.stereotype.Component;

import com.softserveinc.ita.jresume.common.dto.SoftServeUserInformationDTO;
import com.softserveinc.ita.jresume.common.entity.SoftServeUserInformation;

/**
 * Mapper for map SoftServeUserInformation DTO and entity.
 * 
 * @author Bohdan Khudoba.
 *         
 */
@Component
public class SoftServeUserInformationMapper implements
        GenericMapper<SoftServeUserInformation, SoftServeUserInformationDTO> {
        
    @Override
    public final SoftServeUserInformationDTO
            toDto(final SoftServeUserInformation softServeUserInformation) {
        SoftServeUserInformationDTO softServeUserInformationDto =
                new SoftServeUserInformationDTO();
                
        softServeUserInformationDto
                .setFirstName(softServeUserInformation.getFirstName());
        softServeUserInformationDto
                .setLastName(softServeUserInformation.getLastName());
        softServeUserInformationDto
                .setPosition(softServeUserInformation.getPosition());
        softServeUserInformationDto
                .setSummary(softServeUserInformation.getSummary());
        softServeUserInformationDto
                .setBirthDate(softServeUserInformation.getBirthDate());
        softServeUserInformationDto
                .setFrameworks(softServeUserInformation.getFrameworks());
        softServeUserInformationDto
                .setHardware(softServeUserInformation.getHardware());
        softServeUserInformationDto.setMethodologies(
                softServeUserInformation.getMethodologies());
        softServeUserInformationDto.setOperatingSystems(
                softServeUserInformation.getOperatingSystems());
        softServeUserInformationDto.setProgrammingLanguages(
                softServeUserInformation.getProgrammingLanguages());
        softServeUserInformationDto
                .setRdbms(softServeUserInformation.getRdbms());
        softServeUserInformationDto
                .setTechnologies(softServeUserInformation.getTechnologies());
        softServeUserInformationDto
                .setTestingTools(softServeUserInformation.getTestingTools());
        softServeUserInformationDto
                .setTools(softServeUserInformation.getTools());
        softServeUserInformationDto
                .setWebServers(softServeUserInformation.getWebServers());
        return softServeUserInformationDto;
    }
    
    @Override
    public final SoftServeUserInformation
            toEntity(
                    final SoftServeUserInformationDTO dto) {
        SoftServeUserInformation softServeUserInformation =
                new SoftServeUserInformation();
        softServeUserInformation.setFirstName(dto.getFirstName());
        softServeUserInformation.setLastName(dto.getLastName());
        softServeUserInformation.setPosition(dto.getPosition());
        softServeUserInformation.setSummary(dto.getSummary());
        softServeUserInformation.setBirthDate(dto.getBirthDate());
        softServeUserInformation.setFrameworks(dto.getFrameworks());
        softServeUserInformation.setHardware(dto.getHardware());
        softServeUserInformation.setMethodologies(dto.getMethodologies());
        softServeUserInformation.setOperatingSystems(dto.getOperatingSystems());
        softServeUserInformation
                .setProgrammingLanguages(dto.getProgrammingLanguages());
        softServeUserInformation.setRdbms(dto.getRdbms());
        softServeUserInformation.setTechnologies(dto.getTechnologies());
        softServeUserInformation.setTestingTools(dto.getTestingTools());
        softServeUserInformation.setTools(dto.getTools());
        softServeUserInformation.setWebServers(dto.getWebServers());
        return softServeUserInformation;
    }
}
