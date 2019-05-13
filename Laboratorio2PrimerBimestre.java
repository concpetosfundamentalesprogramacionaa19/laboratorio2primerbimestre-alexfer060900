/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2primerbimestre;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Laboratorio2PrimerBimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos variables y las inicializamos.
        Scanner entrada = new Scanner (System.in);
        String nombres;
        String apellidos;
        int sueldosem;
        int numhijos;
        double gastopasajes;
        double aux1 = 0;
        double gastobar;
        double aux2 = 0;
        double gastosalidas;
        double aux3 = 0;
        double auxtot;
        String reportefinal = "";
        boolean bandera = true;
        int opcion;
        int i = 1;
        
        // Ciclo repetitivo para añadir los datos de los padres. 
        while (bandera==true){
        System.out.println("Ingrese el nombre.");
        nombres = entrada.next();
        System.out.println("Ingrese el apellido.");
        apellidos = entrada.next();
        System.out.println("Ingrese el sueldo semanal.");
        sueldosem = entrada.nextInt();
        System.out.println("Ingrese el numero de hijos.");
        numhijos = entrada.nextInt();
       // Primer reporte final con los datos de los padres.
        reportefinal = String.format("%sReporte de Gastos de Padres "
        + "de Familia\n\nReporte 00%d\n\nNombre de Padre de "
        + "Familia: %s %s\nSueldo Semanal: $%d\nNumero de Hijos: "
        + "%d\n\nReporte de Gastos\nPersona\tPasaje\tBar\t"
        + "Salidas\n", reportefinal, i, nombres, apellidos, sueldosem,
        numhijos);
        // Ciclo repetitivo para añadir los datos de los hijos.
        for (int contador = 1; contador <= numhijos; contador++){
            
            System.out.printf("Hijo %d\n" ,contador);
            System.out.println("Ingrese el gasto semanal en pasajes.");
            gastopasajes = entrada.nextDouble();
            aux1 = aux1 + gastopasajes;
            System.out.println("Ingrese el gasto semanal en bar.");
            gastobar = entrada.nextDouble();
            aux2 = aux2 + gastobar;
            System.out.println("Ingrese el gasto semanal en salidas");
            gastosalidas = entrada.nextDouble();
            aux3 = aux3 + gastosalidas;
        //Segundo reporte final para añadir y acumular los datos de los hijos.    
            reportefinal = String.format("%sHijo %d\t%.1f\t%.1f\t%.1f\n",
                    reportefinal, contador, gastopasajes, gastobar, 
                    gastosalidas);
            
           
        }
        //Definimos si el dinero le alcanza o no al padre.
            auxtot = aux1+ aux2 + aux3;
            String resultado = sueldosem > auxtot ? "alcanza" : "falta";
            //Mensajes finales con todos los datos.
            reportefinal = String.format("%sTotales\t%.1f\t%.1f\t%.1f", 
                    reportefinal, aux1, aux2, aux3);
            reportefinal = String.format("%s\nAl padre de familia %s %s "
                    + "le %s el"
                    + " dinero semanal para sus gastos.\n", reportefinal,
                    nombres, apellidos, resultado);
            //Definimos si el usuario quiere seguir ingresando datos o no.
            System.out.println("Digite 1 para continuar o 2 para salir.");
            opcion = entrada.nextInt();
            i = i +1;
            if (opcion == 2){
                bandera = false;
            }
        }
        //Mensaje final. 
        System.out.printf("%s", reportefinal);
        
    }   
}