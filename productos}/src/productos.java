
public class productos {
	private String titulo,a�oP;
	private double precio;
	protected int codigo;
	
	
	public productos(String titulo, String a�oP, int codigo, double precio) {
		super();
		this.titulo = titulo;
		this.a�oP = a�oP;
		this.codigo = codigo;
		this.precio = precio;
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getA�oP() {
		return a�oP;
	}
	public void setA�oP(String a�oP) {
		this.a�oP = a�oP;
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
