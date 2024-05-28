package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ent_usuarios", schema = "public", catalog = "hexagonal")
public class EntUsuarioJPA extends PanacheEntityBase{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ent_usuario_sec")
	@SequenceGenerator(name = "ent_usuario_sec", schema = "hexagonal_schema", sequenceName = "ent_usuario_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec;    
    
    @Column(name = "nsec_persona", nullable = false)
	private Long nsecPersona;

    @Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

    @Column(name = "primer_apellido", nullable = false, length = 100)
	private String primerApellido;

    @Column(name = "segundo_apellido", nullable = false, length = 100)
	private String segundoApellido;

    @Column(name = "doc_identidad", nullable = false, length = 20)
	private String docIdentidad;

    @Column(name = "tipo_documento", nullable = false, length = 50)
	private String tipoDocumento;

    @Column(name = "expedido", nullable = false, length = 50)
	private String expedido;

    @Column(name = "tipo_usuario", nullable = false, length = 50)
	private String tipoUsuario;

    @Column(name = "tipo_institucion", nullable = false, length = 100)
    private String tipoInstitucion;

    @Column(name = "correo_electronico", nullable = false, length = 100)
    private String correoElectronico;

    @Column(name = "fecha", nullable = true)
	private LocalDateTime fecha;

    @Column(name = "celular", nullable = true, length = 20)
	private String celular;

    @Column(name = "fecha_nacimiento", nullable = true)
	private LocalDate fechaNacimiento;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nsec_persona", referencedColumnName = "num_sec", nullable = false, insertable = false, updatable = false)
	private PersonaJPA personaByNumSecPersona;

    @OneToMany(mappedBy = "entUsuarioByNumSecEntUsuario")
	private Collection<EntUsuarioRolJPA> entUsuarioRolByNumSec;

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

    public PersonaJPA getPersonaByNumSecPersona() {
        return personaByNumSecPersona;
    }

    public void setPersonaByNumSecPersona(PersonaJPA personaByNumSecPersona) {
        this.personaByNumSecPersona = personaByNumSecPersona;
    }

    public Collection<EntUsuarioRolJPA> getEntUsuarioRolByNumSec() {
        return entUsuarioRolByNumSec;
    }

    public void setEntUsuarioRolByNumSec(Collection<EntUsuarioRolJPA> entUsuarioRolByNumSec) {
        this.entUsuarioRolByNumSec = entUsuarioRolByNumSec;
    }

    @Override
    public String toString() {
        return "EntUsuarioJPA [numSec=" + numSec + ", nsecPersona=" + nsecPersona + ", nombre=" + nombre
                + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", docIdentidad="
                + docIdentidad + ", tipoDocumento=" + tipoDocumento + ", expedido=" + expedido + ", tipoUsuario="
                + tipoUsuario + ", tipoInstitucion=" + tipoInstitucion + ", correoElectronico=" + correoElectronico
                + ", fecha=" + fecha + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", estado="
                + estado + ", entUsuarioRolByNumSec="
                + entUsuarioRolByNumSec + "]";
    } 

    
}


