package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.persona;

import bo.gob.ruat.application.port.secondary.persona.IPersonaRepository;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.PersonaJPA;
import bo.gob.ruat.infrastructure.converter.IPersonaEntityConverter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PersonaRepositoryJPAImpl implements PanacheRepository<PersonaJPA> , IPersonaRepository{

    @Inject
    IPersonaEntityConverter iPersonaEntityConverter;

    @Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public PersonaEntity getPersona(Long pNumSecPersona) {
        PersonaJPA vPersonaJPA  = find("numSec", pNumSecPersona).singleResult();
        PersonaEntity vPersonaEntity =  iPersonaEntityConverter.toPersonaEntity(vPersonaJPA);
        return vPersonaEntity;
    }
    
}
