/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Dao;

/**
 *
 * @author Karlin
 */
import Modelo_Vo.VoCuadrado;
public class DaoCuadrado {
    
    
     public String Area(VoCuadrado x) {
        String Res = "";

        double Areas = x.getLado() * x.getLado();

        Res = "El area del cuadrado es de: " + Areas;
        return Res;
    }

    public String Perimetro(VoCuadrado x) {
        String Res = "";

        double Peri = x.getLado() * 4;

        Res = "El Perimetro del cuadrado es de: " + Peri;
        return Res;
    }
}
