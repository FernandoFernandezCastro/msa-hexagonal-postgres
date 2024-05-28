package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.parametrica;

import java.util.List;

import bo.gob.ruat.application.port.secondary.parametrica.ITramiteParametricaRepository;
import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.TramiteParametricaJPA;
import bo.gob.ruat.infrastructure.converter.ITramiteParametricaEntityConverter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TramiteParametricaRepositoryJPAImpl implements PanacheRepository<TramiteParametricaJPA>, ITramiteParametricaRepository {

    @Inject
    ITramiteParametricaEntityConverter tramiteParametricaEntityConverter;

    @Override
    public List<TramiteParametricaEntity> getTramiteParametrica() {
        List<TramiteParametricaJPA> vTramiteParametricaJPAs = findAll().list();

        List<TramiteParametricaEntity> vTramiteParametricaEntity = tramiteParametricaEntityConverter.toTramiteParametricaEntity(vTramiteParametricaJPAs);

        return vTramiteParametricaEntity;
    }


}
