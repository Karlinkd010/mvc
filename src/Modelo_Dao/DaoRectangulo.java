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
import Modelo_Vo.VoRectangulo;
public class DaoRectangulo {
    
     public String Area(VoRectangulo x) {
        String Res = "";

        double Areas = x.getBase() * x.getAltura();

        Res = "El area del rectangulo es de: " + Areas;
        return Res;
    }

    public String Perimetro(VoRectangulo x) {
        String Res = "";

        double Peri = (x.getBase() * 2) + (x.getAltura() * 2);

        Res = "El Perimetro del rectangulo es de: " + Peri;
        return Res;
    }
}
