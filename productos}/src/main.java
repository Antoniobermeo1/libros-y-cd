import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;


public class main  {
	private static  double precio;

	public static void cargarlibrosycd(ArrayList Libcd) {
		
		    System.out.println("tenemos los siguientes articulos disponibles: ");
			Libcd.add(new libros("Harry-Potter","03/06/2012",123513,40,0.04,0.20,"mangola","852441145","juan"));
			Libcd.add(new libros("Harry-Potter2","03/06/2013",123514,40,0.4,0.20,"mangolo","852441146","juanchi"));
			Libcd.add(new CD("boring","04/06/2014",2,3,3,precio=10,"marcos")); //añade el ojeto al ArrayList
			
			for(int indice = 0; indice <Libcd.size(); indice++) {
				System.out.println(Libcd.get(indice) + " ");
			}
			
		}		
	
/*----------------------------------------------------------------------------------------------------*/		
	public static void main(String[] args) {
		ArrayList <libros> Libcd = new ArrayList <libros>();
		System.out.println("Bienvenidos a mi tienda");
		cargarlibrosycd(Libcd);

	}
}
