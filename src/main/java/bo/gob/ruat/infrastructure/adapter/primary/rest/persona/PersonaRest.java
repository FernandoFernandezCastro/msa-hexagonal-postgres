package bo.gob.ruat.infrastructure.adapter.primary.rest.persona;

import java.io.IOException;

import bo.gob.ruat.application.port.primary.persona.IPersonaUseCase;
import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response.PersonaResponse;
import bo.gob.ruat.infrastructure.converter.IPersonaResponseConverter;
//import bo.gob.ruat.lib.core.domain.exception.ExcepcionLogica;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("personas/persona")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaRest {

    @Inject
    IPersonaUseCase iPersonaUseCase;

    @Inject
    IPersonaResponseConverter iPersonaResponseConverter;
    

    @GET
    @Path("/consulta-pesona")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response buscarPersona(
            @QueryParam("identificador") Long pIndentificador){   

        PersonaBusquedaEntity vUsuarioBusquedaEntity = iPersonaUseCase.buscarPersona(pIndentificador);

        //PersonaResponse vPersonaResponse = new PersonaResponse();
        PersonaResponse vPersonaResponse = iPersonaResponseConverter.toPersonaResponse(vUsuarioBusquedaEntity);

        return Response.ok(vPersonaResponse).build();

    }
}
