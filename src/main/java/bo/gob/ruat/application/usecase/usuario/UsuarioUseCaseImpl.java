package bo.gob.ruat.application.usecase.usuario;

import java.util.ArrayList;
import java.util.List;

import bo.gob.ruat.application.port.primary.usuario.IUsuarioUseCase;
import bo.gob.ruat.application.port.secondary.usuario.IEnpRolRepository;
import bo.gob.ruat.application.port.secondary.usuario.IEntUsuarioRepository;
import bo.gob.ruat.application.port.secondary.usuario.IEntUsuarioRolRepository;
import bo.gob.ruat.domain.Entity.EnpRolEntity;
import bo.gob.ruat.domain.Entity.EntUsuarioEntity;
import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;
import bo.gob.ruat.domain.Entity.UsuarioRolesEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class UsuarioUseCaseImpl implements IUsuarioUseCase{

    @Inject
    IEntUsuarioRepository iEntUsuarioRepository;

    @Inject
    IEntUsuarioRolRepository iEntUsuarioRolRepository;

    @Inject
    IEnpRolRepository iEnpRolRepository;
    
    @Override
    public UsuarioRolesEntity buscarUsuarioRoles(Long pIdentificador) {
        
        UsuarioRolesEntity vUsuarioRolesEntity = new UsuarioRolesEntity();

        EntUsuarioEntity  vEntUsuarioEntity = iEntUsuarioRepository.getUsuario(pIdentificador);

        vUsuarioRolesEntity.setNombre(vEntUsuarioEntity.getNombre());
        vUsuarioRolesEntity.setPrimerApellido(vEntUsuarioEntity.getPrimerApellido());
        vUsuarioRolesEntity.setSegundoApellido(vEntUsuarioEntity.getSegundoApellido());
        vUsuarioRolesEntity.setDocIdentidad(vEntUsuarioEntity.getDocIdentidad());
        vUsuarioRolesEntity.setTipoDocumento(vEntUsuarioEntity.getTipoDocumento());
        vUsuarioRolesEntity.setExpedido(vEntUsuarioEntity.getExpedido());
        vUsuarioRolesEntity.setTipoUsuario(vEntUsuarioEntity.getTipoUsuario());
        vUsuarioRolesEntity.setTipoInstitucion(vEntUsuarioEntity.getTipoInstitucion());
        vUsuarioRolesEntity.setCorreoElectronico(vEntUsuarioEntity.getCorreoElectronico());
        vUsuarioRolesEntity.setCorreoElectronico(vEntUsuarioEntity.getCorreoElectronico());
        vUsuarioRolesEntity.setFecha(vEntUsuarioEntity.getFecha());
        vUsuarioRolesEntity.setCelular(vEntUsuarioEntity.getCelular());
        vUsuarioRolesEntity.setFechaNacimiento(vEntUsuarioEntity.getFechaNacimiento());
        
        //List<EntUsuarioRolEntity> vListRolesUsuarioEntity = iEntUsuarioRolRepository.getRolesUsuario(pIdentificador);

        List<EnpRolEntity> vListaRolesEntity = new ArrayList<EnpRolEntity>(); 
        for (EntUsuarioRolEntity rolUsuario : vEntUsuarioEntity.getEntUsuarioRolByNumSec()) {
            //EnpRolEntity vEnpRolEntity = iEnpRolRepository.getRol(rolUsuario.getRolEnpRol());
            //System.out.println(rolUsuario);
            vListaRolesEntity.add(rolUsuario.getEnpRolByRolEnpRol());
            //vListaRolesEntity.add(vEnpRolEntity);
        }

        vUsuarioRolesEntity.setRolesUsuario(vListaRolesEntity);

        
        
        return vUsuarioRolesEntity;
        
        
        
    }
    

}
