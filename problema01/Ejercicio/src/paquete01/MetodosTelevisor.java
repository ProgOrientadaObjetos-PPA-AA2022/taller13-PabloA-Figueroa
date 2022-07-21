/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class MetodosTelevisor {

    private ArrayList<Televisor> televisores;
    private double totalprecio;
    private double televisormasCaro;
    private String listaMarcas;

    public void establecerTelevisores(ArrayList<Televisor> estds) {
        televisores = estds;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecertotalPrecioTvs() {
        for (int i = 0; i < televisores.size(); i++) {
            totalprecio = totalprecio + televisores.get(i).obtenerPrecio();
        }
    }

    public double obtenerTotalPrecioTvs() {
        return totalprecio;
    }

    public void estaclecertelevisorMasCaro() {
        double carito = 0;
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > carito) {
                carito = televisores.get(i).obtenerPrecio();
            }
        }
        televisormasCaro = carito;
    }

    public double obtenerTelevisormasCaro() {
        return televisormasCaro;
    }

    public void establecerlistaMarcasVendidas() {
        listaMarcas = "";
        for (int i = 0; i < televisores.size(); i++) {
            listaMarcas = String.format("%s%s\n", listaMarcas, 
                    televisores.get(i).obtenerMarca());
        }

    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcas;
    }
}
