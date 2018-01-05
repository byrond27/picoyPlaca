
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
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String licencia;
        String fechaTexto;
            
        System.out.println("Pico y Placa Program");
        
        System.out.println("Write the lincese plate number");
        licencia = read.readLine(); 
                   
        System.out.println("Write the date, Ex: 2017-01-03 08:00");
        fechaTexto = read.readLine(); 
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
