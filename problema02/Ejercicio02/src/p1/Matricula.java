/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author SALA I
 */
public abstract class  Matricula {
    private double tarifa; 
    public abstract void establecerTarifa();   
    
    public double obtenerMatricula(){
        return tarifa; 
    }
    
}
