package bo.gob.ruat.application.port.secondary.usuario;

import java.util.List;

import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;

public interface IEntUsuarioRolRepository {
    List<EntUsuarioRolEntity> getRolesUsuario(Long pSecUsuario);
}
