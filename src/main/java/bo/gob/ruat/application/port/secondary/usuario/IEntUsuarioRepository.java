package bo.gob.ruat.application.port.secondary.usuario;

import bo.gob.ruat.domain.Entity.EntUsuarioEntity;

public interface IEntUsuarioRepository {
    EntUsuarioEntity getUsuario(Long pIdentificador);
}
