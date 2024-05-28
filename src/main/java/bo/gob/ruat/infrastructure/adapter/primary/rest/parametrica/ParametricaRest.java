package bo.gob.ruat.infrastructure.adapter.primary.rest.parametrica;

import java.io.IOException;

import bo.gob.ruat.application.port.primary.parametrica.IParametricaUseCase;
import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.parametrica.dto.response.TramiteParametricaResponse;
import bo.gob.ruat.infrastructure.converter.ITramiteParametricaResponseConverter;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.*;

@Path("parametricas/parametrica")
public class ParametricaRest {

    @Inject
    IParametricaUseCase iParametricaUseCase;

    @Inject
    ITramiteParametricaResponseConverter iTramiteParametricaResponseConverter;

    @GET
    @Path("/consulta-parametrica-tramites")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response recuperarTramitesParametricas(){
        List<TramiteParametricaEntity> vTramiteParametricaEntities= iParametricaUseCase.recuperarTramitesParametricas();

        List<TramiteParametricaResponse> vTramiteParametricaResponses = iTramiteParametricaResponseConverter.toTramiteParametricaResponses(vTramiteParametricaEntities);

        return Response.ok(vTramiteParametricaResponses).build();

    }    
}
