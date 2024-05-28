package bo.gob.ruat.domain.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;



public class EntUsuarioEntity {

    private Long numSec;
    
    private Long nsecPersona;
    
    private String nombre;
    
    private String primerApellido;

    private String segundoApellido;

    private String docIdentidad;

    private String tipoDocumento;

    private String expedido;

    private String tipoUsuario;

    private String tipoInstitucion;

    private String correoElectronico;

    private LocalDateTime fecha;

    private String celular;

    private LocalDate fechaNacimiento;

    private String estado;

    private Collection<EntUsuarioRolEntity> entUsuarioRolByNumSec;


    public EntUsuarioEntity() {
    }

    public Long getNumSec() {
        return numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public Long getNsecPersona() {
        return nsecPersona;
    }

    public void setNsecPersona(Long nsecPersona) {
        this.nsecPersona = nsecPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getExpedido() {
        return expedido;
    }

    public void setExpedido(String expedido) {
        this.expedido = expedido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<EntUsuarioRolEntity> getEntUsuarioRolByNumSec() {
        return entUsuarioRolByNumSec;
    }

    public void setEntUsuarioRolByNumSec(Collection<EntUsuarioRolEntity> entUsuarioRolByNumSec) {
        this.entUsuarioRolByNumSec = entUsuarioRolByNumSec;
    }
    
    
}
