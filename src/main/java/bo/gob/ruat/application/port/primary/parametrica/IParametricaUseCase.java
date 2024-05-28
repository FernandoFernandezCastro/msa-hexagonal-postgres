package bo.gob.ruat.application.port.primary.parametrica;

import java.util.*;

import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;

public interface IParametricaUseCase {
    
    List<TramiteParametricaEntity> recuperarTramitesParametricas();
}
