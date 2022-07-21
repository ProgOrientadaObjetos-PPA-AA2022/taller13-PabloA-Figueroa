/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioMatriculas() {   
        for (int i = 0; i < matriculas.size(); i++) {
            promedioMatriculas += matriculas.get(i).obtenerTarifa();
        }
        promedioMatriculas = promedioMatriculas / matriculas.size();
    }
    
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }
    @Override
    public String toString() {
        String cadena = "REPORTE\n";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s\n%s", cadena,
                  matriculas.get(i));
        }
        cadena = String.format("%s\n\nPromedio de Matriculas: %.2f\n",
                cadena, promedioMatriculas);
        return cadena;
    }
}
