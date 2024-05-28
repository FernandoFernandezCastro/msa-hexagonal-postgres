package bo.gob.ruat.application.usecase.parametrica;

import java.util.List;

import bo.gob.ruat.application.port.primary.parametrica.IParametricaUseCase;
import bo.gob.ruat.application.port.secondary.parametrica.ITramiteParametricaRepository;
import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ParametricaUseCaseImpl implements IParametricaUseCase {

    @Inject
    ITramiteParametricaRepository tramiteParametricaRepository;

    @Override
    public List<TramiteParametricaEntity> recuperarTramitesParametricas() {
        List<TramiteParametricaEntity> vTramiteParametricaEntities= tramiteParametricaRepository.getTramiteParametrica();
        return vTramiteParametricaEntities;
    }
    
}
