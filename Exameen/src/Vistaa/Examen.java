
package Vistaa;

import Persistencia.Persistencia;
import java.util.Arrays;
import modelo.Logica;
import java.util.Scanner;

public class Examen {

    
    public static void main(String[] args) 
    {
        Scanner respuesta = new Scanner(System.in);
        Persistencia Persistencia = new Persistencia();
        Logica logic = new Logica ();
        String argumento = "";
        int j= 0;
        int Resp;
        boolean respuestaBoolean;
        System.out.println("A continuación se mostrará cada pregunta");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(Persistencia.preguntas[i]);
            System.out.println("Ingrese su respuesta (1 = verdadero, 2= falso)");
            Resp = respuesta.nextInt();
            respuestaBoolean=(Resp==1);            
            if(Persistencia.estado[i] == respuestaBoolean)
            {
                System.out.println("Respuesta Correcta");
                j++;
            }else
                System.out.println("Respuesta incorrecta");            
        }        
        //RESULTADO DEL EXAMEN        
        System.out.println("A continuación se mostrará su puntaje");
        System.out.println(logic.resultadosExamenCualitativo(j) + " usted a obtenido " + j + "/10 " + logic.resultadosExamenCuantitativo(j));
    }
    
}
