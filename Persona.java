/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author UPIIZ
 */
public abstract class Persona implements Serializable {

    protected String nombre;
    protected String numtel;

    public Persona(String name, String num) {
        nombre = name;
        numtel = num;
    }

    public abstract String mostrarData();

}
