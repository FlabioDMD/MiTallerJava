/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * La clase hija ‘Paciente’ tendrá los siguientes datos:
 * médico de cabecera, padecimiento (solo uno) y fecha de próxima cita.
 * @author UPIIZ
 */
public class Paciente extends Persona {

    private String medico;
    private String padecimiento;
    private String cita;

    public Paciente(String name, String numtel, String doctor, String enfermedad, String fecha) {
        super(name, numtel);
        medico = doctor;
        padecimiento = enfermedad;
        cita = fecha;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }
    
    

    @Override
    public String mostrarData() {
        return "Nombre: "+super.nombre+ ", Número de teléfono: " + super.numtel + ", Médico de cabera: " + getMedico() + ", Padecimiento: " + getPadecimiento() + ", Siguiente cita: " + getCita();
    }

    
}
