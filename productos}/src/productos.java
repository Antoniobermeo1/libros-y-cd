
public class productos {
	private String titulo,añoP;
	private double precio;
	protected int codigo;
	
	
	public productos(String titulo, String añoP, int codigo, double precio) {
		super();
		this.titulo = titulo;
		this.añoP = añoP;
		this.codigo = codigo;
		this.precio = precio;
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAñoP() {
		return añoP;
	}
	public void setAñoP(String añoP) {
		this.añoP = añoP;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	

	

}
