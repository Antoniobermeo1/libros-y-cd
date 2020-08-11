
public class CD extends productos{
    private String interprete;
	public CD(String titulo, String añoP, int codigo, double precio,double iva,double descuento, String interprete) {
		super(titulo, añoP, codigo, precio, iva, descuento);
		this.interprete = interprete;
	}

	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public void mostrar() {
		System.out.println("DATOS DEL AUTO");
		System.out.println("***********************");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Año de publicacion: " + this.getAñoP());
		System.out.println("codigo de identificacion: " + this.getCodigo());
		System.out.println("precio: " + this.getPrecio());
		System.out.println("interprete:"+this.getInterprete());
		
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nTitulo: "+getTitulo());
		sb.append("\nAño publicado:"+getAñoP());
		sb.append("\nCodigo de ide:"+getCodigo());
		sb.append("\nPrecio:"+getPrecio());
		sb.append("\nInterprete:"+getInterprete());
		
		return sb.toString();
	}
}
