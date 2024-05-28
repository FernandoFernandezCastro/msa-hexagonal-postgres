package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;


import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.PersonaJPA;

@Mapper(componentModel = "jakarta")
public interface IPersonaEntityConverter {
    PersonaEntity toPersonaEntity (PersonaJPA personaJPA);
        
}
