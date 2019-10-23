package tutoci;

public class Alimento {

	private String nombre;
	private Integer kiloCalorias;
	private String ingredientes;
	private String codigo;
	private Integer pesoNetoEnGramos;

	public Alimento(String nombre, Integer kiloCalorias, String ingredientes, String codigo, Integer pesoNetoEnGramos) {
		super();
		this.nombre = nombre;
		this.kiloCalorias = kiloCalorias;
		this.ingredientes = ingredientes;
		this.codigo = codigo;
		this.pesoNetoEnGramos = pesoNetoEnGramos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getKiloCalorias() {
		return kiloCalorias;
	}

	public void setKiloCalorias(Integer kiloCalorias) {
		this.kiloCalorias = kiloCalorias;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getPesoNetoEnGramos() {
		return pesoNetoEnGramos;
	}

	public void setPesoNetoEnGramos(Integer pesoNetoEnGramos) {
		this.pesoNetoEnGramos = pesoNetoEnGramos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alimento other = (Alimento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alimento [nombre=");
		builder.append(nombre);
		builder.append(", kiloCalorias=");
		builder.append(kiloCalorias);
		builder.append(", ingredientes=");
		builder.append(ingredientes);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", pesoNetoEnGramos=");
		builder.append(pesoNetoEnGramos);
		builder.append("]");
		return builder.toString();
	}

}
