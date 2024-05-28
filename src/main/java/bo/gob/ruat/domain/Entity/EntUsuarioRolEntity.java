package bo.gob.ruat.domain.Entity;

public class EntUsuarioRolEntity {

    private Long numSec;

    private Long nsecEntUsuario;

    private String RolEnpRol;

    private String estado;

	//private EntUsuarioEntity entUsuarioByNumSecEntUsuario;
    
	private EnpRolEntity enpRolByRolEnpRol;


    public EntUsuarioRolEntity() {
    }

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

    /* 
    public EntUsuarioEntity getEntUsuarioByNumSecEntUsuario() {
        return entUsuarioByNumSecEntUsuario;
    }

    public void setEntUsuarioByNumSecEntUsuario(EntUsuarioEntity entUsuarioByNumSecEntUsuario) {
        this.entUsuarioByNumSecEntUsuario = entUsuarioByNumSecEntUsuario;
    }
    */
    public EnpRolEntity getEnpRolByRolEnpRol() {
        return enpRolByRolEnpRol;
    }

    public void setEnpRolByRolEnpRol(EnpRolEntity enpRolByRolEnpRol) {
        this.enpRolByRolEnpRol = enpRolByRolEnpRol;
    }
    
    

}
