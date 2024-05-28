package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.usuario;

import bo.gob.ruat.application.port.secondary.usuario.IEnpRolRepository;
import bo.gob.ruat.domain.Entity.EnpRolEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EnpRolJPA;
import bo.gob.ruat.infrastructure.converter.IEnpRolEntityConverter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EnpRolRepositoryJPAImpl implements PanacheRepository<EnpRolJPA>,IEnpRolRepository{
    @Inject
    IEnpRolEntityConverter iEnpRolEntityConverter;
    
    @Override
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public EnpRolEntity getRol(String pRol) {
        EnpRolJPA vEnpRolJPA  = find("rol", pRol).singleResult();
        EnpRolEntity vEnRolEntity =  iEnpRolEntityConverter.toEnpRolEntity(vEnpRolJPA);
        return vEnRolEntity;
    }

}
