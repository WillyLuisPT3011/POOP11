package Serializar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DesSerializador{
    public DesSerializador(){
        Date d = null;
        try{
            FileInputStream fis = new FileInputStream("objetoDate.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Date) ois.readObject();
            ois.close();
        }catch(IOException ioe){
        }catch(ClassNotFoundException e){}
        System.out.println("Objecto Deserializado");
        System.out.println(d);
        d = new Date();
        System.out.println("La Fecha Actual es: "+d);
    }
}
