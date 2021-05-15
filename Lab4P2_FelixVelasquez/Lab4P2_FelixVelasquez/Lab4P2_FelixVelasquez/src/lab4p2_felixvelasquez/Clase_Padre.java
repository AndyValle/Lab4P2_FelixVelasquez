/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixvelasquez;

/**
 *
 * @author PERSONAL
 */
public class Clase_Padre {
    
    String nombre;
    String empresa;
    String estado;
    String descri;
    int duracion;

    public Clase_Padre(String nombre, String empresa, String estado,String descri, int duracion) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.estado = estado;
        this.descri = descri;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //////////////////////////////////////////////////
    
    
}
