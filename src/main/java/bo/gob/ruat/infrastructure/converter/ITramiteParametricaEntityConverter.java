package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;

import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.TramiteParametricaJPA;

import java.util.*;

@Mapper(componentModel = "jakarta")
public interface ITramiteParametricaEntityConverter {

    List<TramiteParametricaEntity> toTramiteParametricaEntity(List<TramiteParametricaJPA> pTramiteParametricaJPAs);
    
}
