/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class DominioGmail implements Dominios,Serializable {
    private String dominio;
    
    @Override
    public void establecerDominio(String g){
        dominio = g;
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }


}
