package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.usuario;

import java.util.Collection;
import java.util.List;

import bo.gob.ruat.application.port.secondary.usuario.IEntUsuarioRepository;
import bo.gob.ruat.domain.Entity.EntUsuarioEntity;
import bo.gob.ruat.domain.Entity.EntUsuarioRolEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioJPA;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EntUsuarioRolJPA;
import bo.gob.ruat.infrastructure.converter.IEntUsuarioEntityConverter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EntUsuarioRepositoryJPAImpl implements PanacheRepository<EntUsuarioJPA>,IEntUsuarioRepository {

    @Inject
    IEntUsuarioEntityConverter iEntUsuarioEntityConverter;

    @Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public EntUsuarioEntity getUsuario(Long pIdentificador){
        Collection<EntUsuarioRolEntity> vLstUsuarioRolEntities;
        EntUsuarioJPA vEntUsuarioJPA  = find("numSec", pIdentificador).singleResult();
        Collection<EntUsuarioRolJPA> vusuarioRol = vEntUsuarioJPA.getEntUsuarioRolByNumSec();

        for (EntUsuarioRolJPA elemento : vusuarioRol) {
            System.out.println(elemento.getEnpRolByRolEnpRol().getDescripcion()) ;
                
        }
        
        EntUsuarioEntity vEntUsuarioEntity =  iEntUsuarioEntityConverter.toEntUsuarioEntity(vEntUsuarioJPA);
        vLstUsuarioRolEntities = iEntUsuarioEntityConverter.toEntUsuarioRolEntity(vEntUsuarioJPA.getEntUsuarioRolByNumSec());
        
        vEntUsuarioEntity.setEntUsuarioRolByNumSec(vLstUsuarioRolEntities);

        return vEntUsuarioEntity;
    }

}
