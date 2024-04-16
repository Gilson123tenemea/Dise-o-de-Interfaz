/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author GIGABYTE
 */
public class institucion {
    
    private String id_insti,descrip_insti,nombre_insti;

    public institucion() {
    }

    public institucion(String id_insti, String descrip_insti, String nombre_insti) {
        this.id_insti = id_insti;
        this.descrip_insti = descrip_insti;
        this.nombre_insti = nombre_insti;
    }

    public String getId_insti() {
        return id_insti;
    }

    public void setId_insti(String id_insti) {
        this.id_insti = id_insti;
    }

    public String getDescrip_insti() {
        return descrip_insti;
    }

    public void setDescrip_insti(String descrip_insti) {
        this.descrip_insti = descrip_insti;
    }

    public String getNombre_insti() {
        return nombre_insti;
    }

    public void setNombre_insti(String nombre_insti) {
        this.nombre_insti = nombre_insti;
    }
    
    
    
     
    
}
