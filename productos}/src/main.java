
import java.util.ArrayList;
import java.util.Scanner;


public class main  {
	private static  double precio;
	 static Scanner leer = new Scanner(System.in);

	public static void cargarlibrosycd(ArrayList Libcd) {
		
		    System.out.println("tenemos los siguientes articulos disponibles: ");
			Libcd.add(new libros("Harry-Potter","03/06/2012",1040,40,"mangola","852441145","juan"));
			Libcd.add(new libros("Harry-Potter2","03/06/2013",1042,40,"mangolo","852441146","juanchi"));
			Libcd.add(new CD("boring","04/06/2014",2013,precio=10,"marcos")); //añade el ojeto al ArrayList
			
			for(int indice = 0; indice <Libcd.size(); indice++) {
				System.out.println(Libcd.get(indice) + " ");
			}
			
		}		
	
/*----------------------------------------------------------------------------------------------------*/		
	public static void consultar(ArrayList Libcd) {
		 int codigo;
		 double iva;
		 double descuento;
	        System.out.println("\nintrodusca el codigo del producto que desea consultar");
	        codigo = leer.nextInt();
	        
	        for(int i = 0; i < Libcd.size(); i++){
	            if(((productos) Libcd.get(i)).getCodigo()== codigo){
	                System.out.println(Libcd.get(i));
	                if(((productos) Libcd.get(i)).getCodigo()>=1000 && ((productos) Libcd.get(i)).getCodigo()<=2000 ){
	                	
	                	 iva=((productos) Libcd.get(i)).getPrecio()*0.04;
	                	 descuento=((productos) Libcd.get(i)).getPrecio()*0.20;
	                	 double total = (((productos) Libcd.get(i)).getPrecio()+iva+descuento);
	                	 System.out.println("el iva es:"+iva);
	                	 System.out.println("su descuento es:"+descuento);
	                	 System.out.println("su total es:"+total);
	                	
	                	}
	                else if(((productos) Libcd.get(i)).getCodigo()>2000 && ((productos) Libcd.get(i)).getCodigo()<=3000 ) {
	                	iva=((productos) Libcd.get(i)).getPrecio()*0.09;
	                	 descuento=((productos) Libcd.get(i)).getPrecio()*0.10;
	                	 double total =(((productos) Libcd.get(i)).getPrecio()+iva+descuento);
	                	 System.out.println("el iva es:"+iva);
	                	 System.out.println("su descuento es:"+descuento);
	                	 System.out.println("su total es:"+total);
	                	
	                }
	                } 
	            }
		
	}
	public static void main(String[] args) {
		ArrayList <libros> Libcd = new ArrayList <libros>();
		System.out.println("Bienvenidos a mi tienda");
		cargarlibrosycd(Libcd);
		consultar(Libcd);

	}
}
