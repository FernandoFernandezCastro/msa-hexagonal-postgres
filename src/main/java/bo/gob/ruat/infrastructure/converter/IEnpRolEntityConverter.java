package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;

import bo.gob.ruat.domain.Entity.EnpRolEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.EnpRolJPA;

@Mapper(componentModel = "jakarta")
public interface IEnpRolEntityConverter {
    EnpRolEntity toEnpRolEntity (EnpRolJPA pEnpRolJPA);
}
