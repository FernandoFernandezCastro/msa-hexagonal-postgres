package bo.gob.ruat.application.port.primary.usuario;

import bo.gob.ruat.domain.Entity.UsuarioRolesEntity;

public interface IUsuarioUseCase {

    UsuarioRolesEntity buscarUsuarioRoles(Long pIdentificador);


}
