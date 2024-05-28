package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;

import bo.gob.ruat.domain.Entity.TramiteParametricaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.parametrica.dto.response.TramiteParametricaResponse;

import java.util.*;

@Mapper(componentModel = "jakarta")
public interface ITramiteParametricaResponseConverter {
    
    List<TramiteParametricaResponse> toTramiteParametricaResponses(List<TramiteParametricaEntity> pTramiteParametricaEntities);

}
