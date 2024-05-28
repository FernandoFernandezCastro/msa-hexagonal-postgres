package bo.gob.ruat.infrastructure.converter;

import java.util.List;

import org.mapstruct.Mapper;

import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioRolJPA;

@Mapper(componentModel = "jakarta")
public interface IEntUsuarioRolEntityConverter {
     List<EntUsuarioRolEntity> toEntUsuarioRolEntity (List<EntUsuarioRolJPA> pListEntUsuarioRolJPA);
        

}
