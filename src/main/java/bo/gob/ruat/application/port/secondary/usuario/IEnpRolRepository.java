package bo.gob.ruat.application.port.secondary.usuario;

import bo.gob.ruat.domain.Entity.EnpRolEntity;

public interface IEnpRolRepository {
    EnpRolEntity getRol(String pRol);
}
