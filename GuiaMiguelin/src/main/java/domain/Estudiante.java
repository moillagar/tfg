package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Access(AccessType.PROPERTY)
public class Estudiante extends Clientes{
	
	
	public Estudiante(){
		super();
	}
	
	private String titulacion;
	private Date fechaNacimiento;

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	@SafeHtml(whitelistType = WhiteListType.NONE)
	@NotBlank
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	
	//Relaciones----------------------
	private Collection<Photo> photos;
	private Collection<CalificacionOferta>calificacionOfertas;
	private Collection<Incidencia>incidencias;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Collection<Photo> photos) {
		this.photos = photos;
	}

		
		@javax.persistence.Transient
		public Photo getAvatar() {
			Photo result = null;
			for (Photo p : photos) {
				if (p.getAvatar()) {
					result = p;
					break;
				}
			}

			return result;
		}

		@OneToMany(mappedBy="estudiante")
		public Collection<CalificacionOferta> getCalificacionOfertas() {
			return calificacionOfertas;
		}

		public void setCalificacionOfertas(
				Collection<CalificacionOferta> calificacionOfertas) {
			this.calificacionOfertas = calificacionOfertas;
		}
		@OneToMany(mappedBy="estudiante")
		public Collection<Incidencia> getIncidencias() {
			return incidencias;
		}

		public void setIncidencias(Collection<Incidencia> incidencias) {
			this.incidencias = incidencias;
		}


}
