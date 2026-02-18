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
		       
		       
		       //operaciones con int
		       System.out.println(" ** operaciones con int** ");
		       System.out.println(" ingresa el primer numero ");
		       int primernumeroentero = sc.nextInt();
		       System.out.println(" ingresa el segundo numero ");
		       int segundonumeroentero = sc.nextInt();
		      
		       System.out.println("la suma de los numeros es "+  (primernumeroentero+segundonumeroentero) ); 
		       System.out.println("la resta de los numeros es "+  (primernumeroentero-segundonumeroentero) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumeroentero*segundonumeroentero) );
		       if (segundonumeroentero != 0) {
		    	    System.out.println("la division los numeros es " + (primernumeroentero/segundonumeroentero));
		    	} else {
		    	    System.out.println("No se puede dividir entre 0");
		    	}
		       
		       //operaciones con float
		       System.out.println(" ** operaciones con float ** ");
		       System.out.println(" ingresa el primer numero ");
		       float primernumerofloat = sc.nextFloat();
		       System.out.println(" ingresa el segundo numero ");
		       float segundonumerofloat = sc.nextFloat();
		      
		       System.out.println("la suma de los numeros es "+  (primernumerofloat+segundonumerofloat) ); 
		       System.out.println("la resta de los numeros es "+  (primernumerofloat-segundonumerofloat) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumerofloat*segundonumerofloat) );
		       if (segundonumerofloat != 0) {
		    	    System.out.println("la division los numeros es " + (primernumerofloat/segundonumerofloat));
		    	} else {
		    	    System.out.println("No se puede dividir entre 0");
		    	}
		        
		      
		      //operaciones con double 
		       System.out.println(" ** operaciones con Double ** ");
		       System.out.println(" ingresa el primer numero ");
		       double  primernumerodouble = sc.nextDouble();
		       System.out.println(" ingresa el segundo numero ");
		       double segundonumerodouble = sc.nextDouble();
		      
		       System.out.println("la suma de los numeros es "+  (primernumerodouble+segundonumerodouble) ); 
		       System.out.println("la resta de los numeros es "+  (primernumerodouble-segundonumerodouble) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumerodouble*segundonumerodouble) );
		       if (segundonumerodouble != 0) {
		    	    System.out.println("la division los numeros es " + (primernumerodouble/segundonumerodouble));
		    	} else {
		    	    System.out.println("No se puede dividir entre 0");
		    	}
		       
		     //operaciones con byte
		       System.out.println(" ** operaciones con byte ** ");
		       System.out.println(" ingresa el primer numero ");
		       short  primernumeroshort = sc.nextByte();
		       System.out.println(" ingresa el segundo numero ");
		       short segundonumeroshort = sc.nextByte();
		      
		       System.out.println("la suma de los numeros es "+  (primernumeroshort+segundonumeroshort) ); 
		       System.out.println("la resta de los numeros es "+  (primernumeroshort-segundonumeroshort) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumeroshort*segundonumeroshort) );
		       if (segundonumeroshort != 0) {
		    	    System.out.println("la division los numeros es " + (primernumeroshort/segundonumeroshort));
		    	} else {
		    	    System.out.println("No se puede dividir entre 0");
		    	}
		       
		       
		       //operaciones con byte
		       System.out.println(" ** operaciones con byte ** ");
		       System.out.println(" ingresa el primer numero ");
		       byte  primernumerobyte = sc.nextByte();
		       System.out.println(" ingresa el segundo numero ");
		       byte segundonumerobyte = sc.nextByte();
		      
		       System.out.println("la suma de los numeros es "+  (primernumerobyte+segundonumerobyte) ); 
		       System.out.println("la resta de los numeros es "+  (primernumerobyte-segundonumerobyte) );
		       System.out.println("la multiplicacion de los numeros es "+  (primernumerobyte*segundonumerobyte) );
		       if (segundonumerobyte != 0) {
		    	    System.out.println("la division los numeros es " + (primernumerobyte/segundonumerobyte));
		    	} else {
		    	    System.out.println("No se puede dividir entre 0");
		    	}
		       
		       
		       //Analisis de division de enteros, la division de enteros muestra un resultado entero no redondea el numero solo quita los decimales y muestra el numero entero 
		       
		       // 3 OPERACIONES LOGICAS
		       
		       System.out.println(" ** Comparacion de numeros** ");
		       
		       
		       System.out.println("Ingrese el primer número:");
		        int numero1 = sc.nextInt();

		        System.out.println("Ingrese el segundo número:");
		        int numero2 = sc.nextInt();

		        // Comparaciones básicas
		        System.out.println("\n--- Comparaciones ---");

		        System.out.println("¿El primer número es mayor que el segundo? " 
		                + (numero1 > numero2));
		        
		        
		        System.out.println("¿El primer número es menor que el segundo? " 
		                + (numero1 < numero2));
		        
		        
		        System.out.println("¿Ambos números son iguales? " 
		                + (numero1 == numero2));
		      
		        
		        // Operadores lógicos
		        System.out.println(" ** Operadores Lógicos **");

		        System.out.println("¿El primer número es mayor que 0 Y el segundo es mayor que 0? "
		                + ((numero1 > 0) && (numero2 > 0)));

		        System.out.println("¿Al menos uno de los números es mayor que 100? "
		                + ((numero1 > 100) || (numero2 > 100)));
		       
		       
		       
		       
		       
		       
		       
		       
		       
	}
}	
