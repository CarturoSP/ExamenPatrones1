
package Persistencia;

import java.util.Arrays;

/**
 *
 * @author cartu
 */
public class Persistencia 
{
    public String[ ] preguntas = new String[50];
    public boolean [] estado = new boolean[50];
    int i =0;

    public Persistencia() {
        this.logicaPreg();
        this.logicaRes();
    }
    
    public void logicaPreg (){
        
        preguntas [1] = "Perú tiene capital a cajamarca";
        preguntas [2] = "En la batalla de Árica ganó Perú";
        preguntas [3] = "La primera guerra mundial se dio el 27 de julio de 1914";
        preguntas [4] = "La segunda guerra mundial terminó en 1945";
        preguntas [5] = "la invensión de la escritura se dio a mediados de 2000 a.c";
        preguntas [6] = "El imperio romano cayó en 1453";
        preguntas [7] = "La revolución francesa fue el 5 de mayo de 1789";
        preguntas [8] = "Las guerras napoleonicas se dieron el 18 de mayo de 1803";
        preguntas [9] = "En 1815 se dio la batalla de waterloo";
        preguntas [10] = "En 1761 se dio la revolución industrial";
      }
   
    public void logicaRes (){
        estado[1]=false;
        estado[2]=false;
        estado[3]=true;
        estado[4]=true;
        estado[5]=false;
        estado[6]=true;
        estado[7]=true;
        estado[8]=true;
        estado[9]=true;
        estado[10]=false;
       }
           
}
