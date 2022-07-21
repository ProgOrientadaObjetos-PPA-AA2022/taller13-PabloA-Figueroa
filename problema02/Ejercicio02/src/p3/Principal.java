/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        ArrayList<Matricula> matcls = new ArrayList<Matricula>();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        matcls.add(mcamp);
        matcls.add(mcolegio);
        matcls.add(mescuela);
        matcls.add(mjardin);
        matcls.add(mmaternal);
        matcls.add(mmaternal2);

        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
