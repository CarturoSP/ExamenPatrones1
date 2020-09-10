/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Logica {
       
    public String resultadosExamenCuantitativo(double resultado)
    {        
        double Resul = resultado/10;
        String califi= "";
        if (Resul == 0.1 || Resul == 0.2 )
            califi="Su calificación es C";
        if (Resul == 0.3 || Resul == 0.4 || Resul == 0.5)
            califi="Su calificación es B";
        if (Resul == 0.6 || Resul == 0.7 )
            califi="Su calificación es A";
        if (Resul == 0.8 || Resul == 0.9 ||  Resul == 1)
            califi="Su calificación es A+";
        return califi ;
    }
    
    public String resultadosExamenCualitativo(double resultado )
    {        
        double Resul = resultado/10;
        return (Resul<0.5)?"Es una pena":"Felicidades";
    }
}
