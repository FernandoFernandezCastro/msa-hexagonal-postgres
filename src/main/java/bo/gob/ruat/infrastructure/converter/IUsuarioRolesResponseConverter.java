package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;

import bo.gob.ruat.domain.Entity.UsuarioRolesEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.usuario.dto.response.UsuarioRolesResponse;

@Mapper(componentModel = "jakarta")
public interface IUsuarioRolesResponseConverter {
    
    UsuarioRolesResponse toUsuarioRolesResponse(UsuarioRolesEntity pUsuarioRolesEntity);
}
