
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author byron
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
        //Pruebas
        enviarDatos("AAA-0009","2018-01-05 23:30");
        enviarDatos("PDB-2012","2018-01-08 08:00"); //Caso que el auto se encuentra en pico y placa día lunes
        enviarDatos("PDB-2012","2018-01-08 09:31"); // Caso que el auto no se encuentra en pico y placa día lunes
        enviarDatos("PDB-2012","2018-01-08 10:31"); // Caso que el auto no se encuentra en pico y placa día lunes
        enviarDatos("PDB-2012","2018-01-08 09:30");
        enviarDatos("PDB-2012","2018-01-07 18:31"); //Caso que es día domingo
        enviarDatos("PDB-2012","2018-01-09 16:31"); //Caso de auto dentro de la hora pero diferente hora
        enviarDatos("AAA-1990","2017-01-09 16:31"); // Casos de Prueba
        enviarDatos("PDB-1216","2016-05-09 16:31"); // Casos de Prueba
        enviarDatos("AAA-0000","2018-01-05 18:00");
        enviarDatos("AAA-0009","2018-01-05 18:00");
        enviarDatos("AAA-0009","2018-01-05 07:30");
        enviarDatos("AAA-0009","2018-01-07 07:30");
        enviarDatos("AAA-0008","2018-01-04 07:30");
        enviarDatos("AAA-0008","2018-01-04 07:30");
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String licencia;
        String fechaTexto;
        
        System.out.println("Pico y Placa Program");
        
        System.out.println("Write the lincese plate number, Ex PPP-0000");
        licencia = read.readLine(); 
                   
        System.out.println("Write the date, Ex: 2017-01-03 08:00");
        fechaTexto = read.readLine(); 
        
        enviarDatos(licencia,fechaTexto);

    }
    public static void enviarDatos(String licencia,String fechaTexto) throws ParseException{
        Date fecha = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try{
        fecha = sdf.parse(fechaTexto);
        }
        catch(NullPointerException e)
        {
            System.out.println("Error");
        }
        picoPlaca prueba = new picoPlaca(fecha,licencia);
        
        try{
        prueba.validarPicoyPlaca(prueba);
        }
               catch(NullPointerException e)
        {
            System.out.println("Error");
        }
    }

}
