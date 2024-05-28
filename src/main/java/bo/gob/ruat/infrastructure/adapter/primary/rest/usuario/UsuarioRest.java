package bo.gob.ruat.infrastructure.adapter.primary.rest.usuario;

import java.io.IOException;

import bo.gob.ruat.application.port.primary.usuario.IUsuarioUseCase;
import bo.gob.ruat.domain.Entity.UsuarioRolesEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.usuario.dto.response.UsuarioRolesResponse;
import bo.gob.ruat.infrastructure.converter.IUsuarioRolesResponseConverter;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("Usuarios/usuario")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioRest {

    @Inject 
    IUsuarioUseCase iUsuarioUseCase;

    @Inject
    IUsuarioRolesResponseConverter iUsuarioRolesResponseConverter;

    @GET
    @Path("/consulta-usuario-roles")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response recuperarUsuarioRoles(@QueryParam("identificador") Long pIndentificador){
        UsuarioRolesEntity vUsuarioRolesEntity = iUsuarioUseCase.buscarUsuarioRoles(pIndentificador);

        //PersonaResponse vPersonaResponse = new PersonaResponse();
        UsuarioRolesResponse vUsuarioRolesResponse = iUsuarioRolesResponseConverter.toUsuarioRolesResponse(vUsuarioRolesEntity);

        return Response.ok(vUsuarioRolesResponse).build();


    }  
}
