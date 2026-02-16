import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) { 
		
		 Scanner sc = new Scanner(System.in);
		 
		 
		 // 1. DECLARACION Y USO DE VARIABLES
		 
		  
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
	       
	        System.out.println("usted tiene " + edadUsuario + "años, se llama " + nombreUsuario + ", mide  " + estaturaUsuario + "m "  );
		       if (estadoLaboral == true) {
		    	   System.out.println("usted actualmente se encuentra laborando");
		    	   
		       }else {
		    	   System.out.println("usted se encuentra sin empleo ");
		       }
		       
		     //2 OPERACIOBES MATEMATICAS
		       
		       System.out.println(" ** operaciones matematicas ** ");
		       System.out.println(" ingresa el primer numero ");
		       int primernumero = sc.nextInt();
		       System.out.println(" ingresa el segundo numero ");
		       int segundonumero = sc.nextInt();
		      
		       System.out.println("la suma de los numeros es "+  (primernumero+segundonumero) );
		       System.out.println("la resta de los numeros es "+  (primernumero-segundonumero) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumero*segundonumero) );
		       System.out.println("la division de los numeros es "+  (primernumero/segundonumero) );
	}
}	
