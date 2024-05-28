package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.util.Collection;
import java.util.Objects;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "enp_roles", schema = "public", catalog = "hexagonal")
public class EnpRolJPA extends PanacheEntityBase{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "rol", nullable = false, length = 30)
	private String rol;

    @Column(name = "tipo_institucion", nullable = false, length = 15)
	private String tipoInstitucion;

    @Column(name = "cod_aplicacion", nullable = false, length = 10)
	private String codAplicacion;

    @Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;

    @Column(name = "nivel_criticidad", nullable = false, length = 2)
	private String nivelCriticidad;

    @Column(name = "habilitacion_menu", nullable = false, length = 2)
	private String habilitacionMenu;

    @Column(name = "tipo_habilitacion", nullable = false, length = 100)
	private String tipoHabilitacion;

    @Column(name = "orden", nullable = false)
	private int orden;

    @Column(name = "estado", nullable = false, length = 2)
	private String estado;

    @OneToMany(mappedBy = "enpRolByRolEnpRol")
	private Collection<EntUsuarioRolJPA> entUsuarioRolByRol;

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

    public Collection<EntUsuarioRolJPA> getEntUsuarioRolByRol() {
        return entUsuarioRolByRol;
    }

    public void setEntUsuarioRolByRol(Collection<EntUsuarioRolJPA> entUsuarioRolByRol) {
        this.entUsuarioRolByRol = entUsuarioRolByRol;
    } 
    
    public EnpRolJPA() {
    }

    public EnpRolJPA(String rol, String tipoInstitucion, String codAplicacion, String descripcion, String nivelCriticidad,
            String habilitacionMenu, String tipoHabilitacion, int orden, String estado) {
        this.rol = rol;
        this.tipoInstitucion = tipoInstitucion;
        this.codAplicacion = codAplicacion;
        this.descripcion = descripcion;
        this.nivelCriticidad = nivelCriticidad;
        this.habilitacionMenu = habilitacionMenu;
        this.tipoHabilitacion = tipoHabilitacion;
        this.orden = orden;
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rol, tipoInstitucion, codAplicacion, descripcion, nivelCriticidad, habilitacionMenu, tipoHabilitacion, orden, estado);
    }

    

    @Override
    public boolean equals(Object o) {

        if (o == this)
            return true;
        if (!(o instanceof PersonaJPA)) {
            return false;
        }
        EnpRolJPA enpRolJPA = (EnpRolJPA) o;
        return Objects.equals(rol, enpRolJPA.rol) && Objects.equals(tipoInstitucion, enpRolJPA.tipoInstitucion) && Objects.equals(codAplicacion, enpRolJPA.codAplicacion) && Objects.equals(descripcion, enpRolJPA.descripcion) && Objects.equals(nivelCriticidad, enpRolJPA.nivelCriticidad) && Objects.equals(habilitacionMenu, enpRolJPA.habilitacionMenu) && Objects.equals(tipoHabilitacion, enpRolJPA.tipoHabilitacion) && Objects.equals(orden, enpRolJPA.orden) && Objects.equals(estado, enpRolJPA.estado) && Objects.equals(entUsuarioRolByRol, enpRolJPA.entUsuarioRolByRol);

    }

    

    
    
}
