import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) { 
		
		 Scanner sc = new Scanner(System.in);
		 
		 int edadUsuario;
		 String nombreUsuario;
		 double estaturaUsuario;
		 boolean estadoLaboral;
		 
		
	
	        System.out.println("ingrese su nombre ");
	        nombreUsuario = sc.nextLine();
	        System.out.println("ingrese su edad ");
	        edadUsuario = sc.nextInt();
	        System.out.println("ingrese su estatura ejem.(1.78)");
	        estaturaUsuario = sc.nextDouble();
	        System.out.println("trabaja actualmente (true/false)");
	        estadoLaboral = sc.nextBoolean();
	       
	}
}	
