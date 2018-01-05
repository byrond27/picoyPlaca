

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author byron
 */
public class picoPlaca{
    private Date fechaHora;
    private String licencia;

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public picoPlaca(Date fechaHora, String licencia) {
        this.fechaHora = fechaHora;
        this.licencia = licencia;
    }

    public int devolverDiaSemana(){
        //Día 1 Domingo
        //Día 2 Lunes
        //Día 3 Martes
        //Día 4 Miercoles
        //Día 5 Jueves
        //Día 6 Viernes
        //Día 7 Sabado
        
        GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(fechaHora);
        return cal.get(Calendar.DAY_OF_WEEK);	
    }
    public char ultimoDigito(){
        char c = licencia.charAt(licencia.length()-1);
        return c ;
    }
    public void validarPicoyPlaca(picoPlaca a){

        int inicioPicoManana = 420; // 7:00 de la mañana
        int finPicoManana = 570; // 9:30 de la mañana
        
        int inicioPicoTarde = 960; // 16:00 de la tarde
        int finPicoTarde = 1290; // 19:30
        
        if(a.devolverDiaSemana() == 1 || a.devolverDiaSemana() == 7){
            System.out.println("El auto con Placa: " + a.licencia + " en la fecha: "+ a.fechaHora +". Días sábados y domingos no aplica pico y placa.");
        }
        else if (a.devolverDiaSemana() == 2 && (a.ultimoDigito()== '1' || a.ultimoDigito()=='2')){
            if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoManana && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoManana){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día lunes en la hora: " + a.fechaHora);
                }
            else if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoTarde && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoTarde){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día lunes en la hora: " + a.fechaHora);
                }
            else{
                    System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
                }
            }
        else if (a.devolverDiaSemana() == 3 && (a.ultimoDigito()== '3' || a.ultimoDigito()== '4')){
            if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoManana && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoManana){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día martes en la hora: " + a.fechaHora);
                }
            else if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoTarde && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoTarde){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día martes en la hora: " + a.fechaHora);
                }
            else{
                    System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
                }
            }
       
        else if (a.devolverDiaSemana() == 4 && (a.ultimoDigito()== '5' || a.ultimoDigito()== '6')){
            if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoManana && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoManana){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día miercoles en la hora: " + a.fechaHora);
                }
            else if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoTarde && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoTarde){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día miercoles en la hora: " + a.fechaHora);
                }
            else{
                    System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
                }
            }
        else if (a.devolverDiaSemana() == 5 && (a.ultimoDigito()== '7' || a.ultimoDigito()== '8')){
            if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoManana && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoManana){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día jueves en la hora: " + a.fechaHora);
                }
            else if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoTarde && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoTarde){
                   System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día jueves en la hora: " + a.fechaHora);
                }
            else{
                    System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
                }
            }
        else if (a.devolverDiaSemana() == 6 && (a.ultimoDigito()== '9' || a.ultimoDigito()== '0')){
            if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoManana && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoManana){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día viernes en la hora: " + a.devolverHora()+ ":" + a.fechaHora);
                }
            else if((a.devolverHora() * 60) + a.devolverMinuto() >= inicioPicoTarde && (a.devolverHora() * 60) + a.devolverMinuto()<=finPicoTarde){
                    System.out.println("El auto con placa: " + a.licencia + " NO puede circular el día viernes en la hora: " + a.fechaHora);
                }
            else{
                    System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
                }
            }
        else{
            System.out.println("El auto con placa: " + a.licencia + " SI puede circular en la hora: " + a.fechaHora);
        }
        
    }
    public int devolverHora(){
        GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(fechaHora);
        return cal.get(Calendar.HOUR_OF_DAY);	
    }
    
    public int devolverMinuto(){
        GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(fechaHora);
        return cal.get(Calendar.MINUTE);	
    }
    
}

