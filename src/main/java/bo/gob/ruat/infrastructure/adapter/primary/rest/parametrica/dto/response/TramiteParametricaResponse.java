package bo.gob.ruat.infrastructure.adapter.primary.rest.parametrica.dto.response;

import java.time.LocalDate;

public class TramiteParametricaResponse {
    private String codigo;
    private String descripcion;
    private LocalDate fecha;


    public TramiteParametricaResponse() {
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
