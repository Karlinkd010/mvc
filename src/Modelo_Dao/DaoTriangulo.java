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
import Modelo_Vo.VoTriangulo;
public class DaoTriangulo {
    
     public String Area(VoTriangulo x) {

        String Res = "";
        System.out.print(x.getAltura());
        double Areas = x.getLadob() * x.getAltura()/2;

        Res = "El area del triangulo es de: " + Areas;
        return Res;
    }

    public String Perimetro(VoTriangulo x) {
        String Res = "";

        double Peri = x.getLadoa() + x.getLadob() + x.getLadoc();
        Res = "El Perimetro del triangulo es de: " + Peri;
        return Res;
    }
}
