package bo.gob.ruat.application.port.secondary.parametrica;

import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;

import java.util.List;

public interface ITramiteParametricaRepository {

    List<TramiteParametricaEntity> getTramiteParametrica();
}
