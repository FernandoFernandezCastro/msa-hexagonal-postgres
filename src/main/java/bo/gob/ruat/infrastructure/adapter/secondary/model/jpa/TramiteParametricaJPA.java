package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.time.LocalDate;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hep_tramites", schema = "hexagonal_schema", catalog = "hexagonal")
public class TramiteParametricaJPA {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "codigo", nullable = false, length = 6)
	private String codigo; 
    
	@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;    


	@Column(name = "estado", nullable = false, length = 2)
	private String estado;    
    
	@OneToMany(mappedBy = "hepTramiteByCodigo")
	private Collection<TramiteJPA> tramiteByNumSec;	


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

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Collection<TramiteJPA> getTramiteByNumSec() {
		return this.tramiteByNumSec;
	}

	public void setTramiteByNumSec(Collection<TramiteJPA> tramiteByNumSec) {
		this.tramiteByNumSec = tramiteByNumSec;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TramiteParametricaJPA)) {
			return false;
		}
		TramiteParametricaJPA tramiteParametricaJPA = (TramiteParametricaJPA) o;
		return Objects.equals(codigo, tramiteParametricaJPA.codigo) && Objects.equals(descripcion, tramiteParametricaJPA.descripcion) && Objects.equals(fecha, tramiteParametricaJPA.fecha) && Objects.equals(estado, tramiteParametricaJPA.estado) && Objects.equals(tramiteByNumSec, tramiteParametricaJPA.tramiteByNumSec);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, fecha, estado, tramiteByNumSec);
	}


}
