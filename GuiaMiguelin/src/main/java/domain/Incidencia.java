package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;


@Entity
@Access(AccessType.PROPERTY)
public class Incidencia extends DomainEntity{
	
	public Incidencia(){
		super();
	}
	
	private String titulo, descripcion, estado;

	
	@SafeHtml(whitelistType = WhiteListType.NONE)
	@NotBlank
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@SafeHtml(whitelistType = WhiteListType.NONE)
	@NotBlank
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@NotBlank
	@Pattern(regexp = "^PENDIENTE|RECHAZADA|ACEPTADA$")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	//Relaciones-----------------------
	private Oferta oferta;
	private Estudiante estudiante;
	private Administrator administrator;
	

	@OneToOne
	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	@ManyToOne(optional=false)
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	@ManyToOne(optional=true)
	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	

}
