
package trabajoextraclase;
import java.util.Scanner;
public class Trabajoextraclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double iva=0;
        int numero_mensajes;
        int tarifa = 3;
        double tarifa_final=0;
        double costo_final;
        System.out.println("Ingrese el número de mensajes que desea");
        numero_mensajes = entrada.nextInt();
        if(numero_mensajes <= 40){
            tarifa_final = 3;
        iva= (tarifa_final *12)/100;
        costo_final = tarifa_final + iva;
        System.out.println("El valor es :" +costo_final);   
     
        }else{
        if(numero_mensajes>40 || numero_mensajes<=200){
            tarifa_final=(numero_mensajes *0.075)+ 0.05;
        
        iva= (tarifa_final *12)/100;
        costo_final = tarifa_final + iva;
        System.out.println("El valor es :" +costo_final);
        
        }else{
        if(numero_mensajes>200){
           tarifa_final=(numero_mensajes *0.075)+ 0.10;  
        iva= (tarifa_final *12)/100;
        costo_final = tarifa_final + iva;
        System.out.println("El valor es :" +costo_final);
        }
        }
        }
    }
    
}
