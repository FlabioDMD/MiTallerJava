/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


/**
 *
 * @author UPIIZ
 */
public class Medico extends Persona{
    
    private String especialidad;
    private String cedula;
    
    public Medico (String name, String num, String esp, String ced) {
        super(name, num);
        especialidad=esp;
        cedula=ced;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
        
    @Override
    public String mostrarData() {
        return "Nombre: "+super.nombre+ ", Número de teléfono: " + super.numtel + ", Especialidad: " + getEspecialidad() + ", Cédula: " + getCedula();
    }
}
