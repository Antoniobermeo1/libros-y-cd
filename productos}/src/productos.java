
public class productos {
	private String titulo,a�oP;
	private double precio,iva,descuento;
	protected int codigo;
	
	
	public productos(String titulo, String a�oP, int codigo, double precio,double iva,double descuento) {
		super();
		this.titulo = titulo;
		this.a�oP = a�oP;
		this.codigo = codigo;
		this.precio = precio;
		this.iva=iva;
		this.descuento=descuento;
	}
	
	
	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
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
