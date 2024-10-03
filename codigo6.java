import java.util.Scanner; //  se importo scanner

public class codigo6 {
	public static void main (String[] args) { // se agregó esta parte
	
	int[] n = new int[20]; //Se agregó new para completar esta parte

    for (int i = 0; i < 20; i++) { //Se agregó el + faltante
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //Se agregó out, para completar esta parte
    }
    
    System.out.println("\n¿Qué números quiere resaltar? "); //Se agregó la n faltante al print
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
   
    //int opcion = Integer.parseInt(System.console().readLine()); //Se agregó un parentesis
    Scanner scanner = new Scanner(System.in); 
    int opcion = scanner.nextInt(); // se cambio para evitar el error en consola
    
    int multiplo = (opcion == 1) ? 5 : 7; // Se revertio el signo ? y : , para arreglar el error

    for  (int e : n) { // se cambio char a int
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] "); } // se agregó llave faltante
       else {
        System.out.print(e + " "); // se quiti el in y se puso el out
      }
    }
    }
}// class codigo 6
