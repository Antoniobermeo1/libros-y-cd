
public class libros extends productos{
    private String editorial,isbn,autor;
	public libros(String titulo, String a�oP, int codigo, double precio,double iva,double descuento, String editorial, String isbn, String autor) {
		super(titulo, a�oP, codigo, precio, iva, descuento);
		this.editorial = editorial;
		this.isbn = isbn;
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void mostrar() {
		System.out.println("DATOS DEL AUTO");
		System.out.println("***********************");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("A�o de publicacion: " + this.getA�oP());
		System.out.println("codigo de identificacion: " + this.getCodigo());
		System.out.println("precio base: " + this.getPrecio());
		System.out.println("iva: " + this.getIva());
		System.out.println("descuento: " + this.getDescuento());
		System.out.println("editorial: " + this.getEditorial());
		System.out.println("ISBN"+this.getIsbn());
		System.out.println("autor"+this.getAutor());
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nTitulo: "+getTitulo());
		sb.append("\nA�o publicado:"+getA�oP());
		sb.append("\nCodigo de ide:"+getCodigo());
		sb.append("\nPrecio:"+getPrecio());
		sb.append("\nIva:"+getIva());
		sb.append("\nDescuento:"+getDescuento());
		sb.append("\nEditorial:"+getEditorial());
		sb.append("\nINBS:"+getIsbn());
		sb.append("\nAutor:"+getAutor());
		
		return sb.toString();
	}


}
