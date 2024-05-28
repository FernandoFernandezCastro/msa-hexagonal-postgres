package bo.gob.ruat.domain.Entity;

import java.util.Collection;

public class EnpRolEntity {

    private String rol;

    private String tipoInstitucion;

    private String codAplicacion;

    private String descripcion;

    private String nivelCriticidad;

    private String habilitacionMenu;

    private String tipoHabilitacion;

    private int orden;

    private String estado;
    
	//private Collection<EntUsuarioRolEntity> entUsuarioRolByRol;

    public EnpRolEntity() {
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public String getCodAplicacion() {
        return codAplicacion;
    }

    public void setCodAplicacion(String codAplicacion) {
        this.codAplicacion = codAplicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelCriticidad() {
        return nivelCriticidad;
    }

    public void setNivelCriticidad(String nivelCriticidad) {
        this.nivelCriticidad = nivelCriticidad;
    }

    public String getHabilitacionMenu() {
        return habilitacionMenu;
    }

    public void setHabilitacionMenu(String habilitacionMenu) {
        this.habilitacionMenu = habilitacionMenu;
    }

    public String getTipoHabilitacion() {
        return tipoHabilitacion;
    }

    public void setTipoHabilitacion(String tipoHabilitacion) {
        this.tipoHabilitacion = tipoHabilitacion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
/* 
    public Collection<EntUsuarioRolEntity> getEntUsuarioRolByRol() {
        return entUsuarioRolByRol;
    }

    public void setEntUsuarioRolByRol(Collection<EntUsuarioRolEntity> entUsuarioRolByRol) {
        this.entUsuarioRolByRol = entUsuarioRolByRol;
    }

   */ 
    
}
