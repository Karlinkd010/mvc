/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Karlin
 */
import Modelo_Dao.DaoCuadrado;
import Modelo_Dao.DaoRectangulo;
import Modelo_Dao.DaoTriangulo;
import Modelo_Vo.VoCuadrado;
import Modelo_Vo.VoRectangulo;
import Modelo_Vo.VoTriangulo;
import Vista.FrmFigura;

public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FrmFigura frmfiguras = new FrmFigura();
        VoCuadrado vocua = new VoCuadrado();
        VoRectangulo vorect = new VoRectangulo();
        VoTriangulo votri = new VoTriangulo();

        DaoCuadrado daocua = new DaoCuadrado();
        DaoRectangulo daorect = new DaoRectangulo();
        DaoTriangulo daotri = new DaoTriangulo();

        Figuras figuras = new Figuras(frmfiguras, vocua, vorect, votri, daocua, daorect, daotri);
        frmfiguras.setVisible(true);
    }

}
