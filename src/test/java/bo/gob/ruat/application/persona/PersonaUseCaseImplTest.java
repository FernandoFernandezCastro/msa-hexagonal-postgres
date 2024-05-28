package bo.gob.ruat.application.persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bo.gob.ruat.application.usecase.persona.PersonaUseCaseImpl;
import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@QuarkusTest
public class PersonaUseCaseImplTest {

    @Inject
    PersonaUseCaseImpl personaUseCaseImpl;

    @Test
    @Transactional
    public void buscarPersonaTest(){
        String vNombre = "MARIA";
        Long vIdentificador = 1000L;

        PersonaBusquedaEntity vPersonaBusquedaEntity = personaUseCaseImpl.buscarPersona(vIdentificador);
        assertEquals(vNombre, vPersonaBusquedaEntity.getNombre());

    }
    
}
