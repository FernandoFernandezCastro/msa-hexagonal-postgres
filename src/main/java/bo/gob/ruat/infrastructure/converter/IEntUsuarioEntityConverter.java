package bo.gob.ruat.infrastructure.converter;

import java.util.Collection;


import org.mapstruct.Mapper;


import bo.gob.ruat.domain.Entity.EntUsuarioEntity;
import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;

import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioJPA;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioRolJPA;


@Mapper(componentModel = "jakarta")
public interface IEntUsuarioEntityConverter {    
    EntUsuarioEntity toEntUsuarioEntity (EntUsuarioJPA entUsuarioJPA);

    Collection<EntUsuarioRolEntity> toEntUsuarioRolEntity (Collection<EntUsuarioRolJPA> entUsuarioRolJPA); 
}
