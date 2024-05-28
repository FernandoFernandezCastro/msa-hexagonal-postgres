package bo.gob.ruat.application.port.primary.persona;

import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;

public interface IPersonaUseCase {
    PersonaBusquedaEntity buscarPersona(Long pIdentificador);
    
}
