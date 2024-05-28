package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ent_usuarios_roles", schema = "public", catalog = "hexagonal")
public class EntUsuarioRolJPA extends PanacheEntityBase{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ent_usuario_rol_sec")
	@SequenceGenerator(name = "persona_sec", schema = "hexagonal_schema", sequenceName = "persona_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec;    
    
    @Column(name = "nsec_ent_usuario", nullable = false)
	private Long nsecEntUsuario;

    @Column(name = "rol_enp_rol", nullable = false, length = 100)
	private String RolEnpRol;

    @Column(name = "estado", nullable = false, length = 2)
	private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nsec_ent_usuario", referencedColumnName = "num_sec", nullable = false, insertable = false, updatable = false)
	private EntUsuarioJPA entUsuarioByNumSecEntUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol_enp_rol", referencedColumnName = "rol", nullable = false, insertable = false, updatable = false)
	private EnpRolJPA enpRolByRolEnpRol;

    

    public Long getNumSec() {
        return numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public Long getNsecEntUsuario() {
        return nsecEntUsuario;
    }

    public void setNsecEntUsuario(Long nsecEntUsuario) {
        this.nsecEntUsuario = nsecEntUsuario;
    }

    public String getRolEnpRol() {
        return RolEnpRol;
    }

    public void setRolEnpRol(String rolEnpRol) {
        RolEnpRol = rolEnpRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EntUsuarioJPA getEntUsuarioByNumSecEntUsuario() {
        return entUsuarioByNumSecEntUsuario;
    }

    public void setEntUsuarioByNumSecEntUsuario(EntUsuarioJPA entUsuarioByNumSecEntUsuario) {
        this.entUsuarioByNumSecEntUsuario = entUsuarioByNumSecEntUsuario;
    }

    public EnpRolJPA getEnpRolByRolEnpRol() {
        return enpRolByRolEnpRol;
    }

    public void setEnpRolByRolEnpRol(EnpRolJPA enpRolByRolEnpRol) {
        this.enpRolByRolEnpRol = enpRolByRolEnpRol;
    }

    @Override
    public String toString() {
        return "EntUsuarioRolJPA [numSec=" + numSec + ", nsecEntUsuario=" + nsecEntUsuario + ", RolEnpRol=" + RolEnpRol
                + ", estado=" + estado;
    }

    
}
