package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.usuario;

import java.util.List;


import bo.gob.ruat.application.port.secondary.usuario.IEntUsuarioRolRepository;

import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioRolJPA;
import bo.gob.ruat.infrastructure.converter.IEntUsuarioRolEntityConverter;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EntUsuarioRolRepositoryJPAImpl implements PanacheRepository<EntUsuarioRolJPA>,IEntUsuarioRolRepository {

    @Inject
    IEntUsuarioRolEntityConverter iEntUsuarioRolEntityConverter;

    @Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public List<EntUsuarioRolEntity> getRolesUsuario(Long pSecUsuario) {
        List<EntUsuarioRolJPA> vListEntUsuarioRolJPA  =  find("nsecEntUsuario", pSecUsuario).list();
        List<EntUsuarioRolEntity> vListEntUsuarioEntity =  iEntUsuarioRolEntityConverter.toEntUsuarioRolEntity(vListEntUsuarioRolJPA);
        return vListEntUsuarioEntity;
    }

    

}
