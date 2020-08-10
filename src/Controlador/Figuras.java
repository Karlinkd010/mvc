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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Figuras implements ActionListener {

    FrmFigura Figura;
    VoCuadrado vocua;
    VoRectangulo vorec;
    VoTriangulo votri;

    DaoCuadrado daocua;
    DaoRectangulo daorec;
    DaoTriangulo daotri;

    public Figuras(FrmFigura Figura, VoCuadrado vocua, VoRectangulo vorec, VoTriangulo votri, DaoCuadrado daocua, DaoRectangulo daorec, DaoTriangulo daotri) {
        this.Figura = Figura;
        this.vocua = vocua;
        this.vorec = vorec;
        this.votri = votri;
        this.daocua = daocua;
        this.daorec = daorec;
        this.daotri = daotri;

        this.Figura.btnCalcular.addActionListener(this);

        this.Figura.cmbFigura.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if ("Cuadrado".equals(Figura.cmbFigura.getSelectedItem().toString())) {

                    Figura.lblladoa.setVisible(true);
                    Figura.lblladob.setVisible(false);
                    Figura.lblladoc.setVisible(false);
                    Figura.lblancho.setVisible(false);
                    Figura.lbllargo.setVisible(false);

                    Figura.txtladoa.setVisible(true);
                    Figura.txtladob.setVisible(false);
                    Figura.txtladoc.setVisible(false);
                    Figura.txtancho.setVisible(false);
                    Figura.txtlargo.setVisible(false);
            
                    

                } else {
                    if ("Triangulo".equals(Figura.cmbFigura.getSelectedItem().toString())) {

                        Figura.lblladoa.setVisible(true);
                        Figura.lblladob.setVisible(true);
                        Figura.lblladoc.setVisible(true);
                        Figura.lblancho.setVisible(false);
                        Figura.lbllargo.setVisible(false);

                        Figura.txtladoa.setVisible(true);
                        Figura.txtladob.setVisible(true);
                        Figura.txtladoc.setVisible(true);
                        Figura.txtancho.setVisible(false);
                        Figura.txtlargo.setVisible(false);

                    } else {
                        if ("Rectangulo".equals(Figura.cmbFigura.getSelectedItem().toString())) {

                            Figura.lblladoa.setVisible(false);
                            Figura.lblladob.setVisible(false);
                            Figura.lblladoc.setVisible(false);
                            Figura.lblancho.setVisible(true);
                            Figura.lbllargo.setVisible(true);

                            Figura.txtladoa.setVisible(false);
                            Figura.txtladob.setVisible(false);
                            Figura.txtladoc.setVisible(false);
                            Figura.txtancho.setVisible(true);
                            Figura.txtlargo.setVisible(true);

                        }
                    }
                }
            }
        });

    }

    public void CalcularCuadrado() {

        this.vocua.setLado(Double.parseDouble(this.Figura.txtladoa.getText()));

        this.Figura.txtRespuesta.setText(this.daocua.Area(vocua) + " \n " + this.daocua.Perimetro(vocua));

    }

    public void CalcularRectangulo() {

        this.vorec.setBase(Double.parseDouble(this.Figura.txtancho.getText()));
        this.vorec.setAltura(Double.parseDouble(this.Figura.txtlargo.getText()));

        this.Figura.txtRespuesta.setText(this.daorec.Area(vorec) + " \n " + this.daorec.Perimetro(vorec));

    }

    public void CalcularTriangulo() {

        this.votri.setLadoa(Double.parseDouble(this.Figura.txtladoa.getText()));
        this.votri.setLadob(Double.parseDouble(this.Figura.txtladob.getText()));
        this.votri.setLadoc(Double.parseDouble(this.Figura.txtladoc.getText()));
      

        this.votri.setAltura(Math.sqrt((Math.pow(this.votri.getLadoc(), 2))));

        this.Figura.txtRespuesta.setText(this.daotri.Area(votri) + " \n " + this.daotri.Perimetro(votri));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Figura.btnCalcular) {
            if ("Cuadrado".equals(Figura.cmbFigura.getSelectedItem().toString())) {
                CalcularCuadrado();
            }
            if ("Triangulo".equals(Figura.cmbFigura.getSelectedItem().toString())) {
                CalcularTriangulo();
            }
            if ("Rectangulo".equals(Figura.cmbFigura.getSelectedItem().toString())) {
                CalcularRectangulo();
            }
        }

    }

}
