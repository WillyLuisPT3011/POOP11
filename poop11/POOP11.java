package poop11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class POOP11 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("1***************************************************");
        System.out.println("FILE:");
        try{
            File archivo = new File("miArchivo.txt");
            System.out.println(archivo.exists());
            boolean seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        }catch(IOException e){}
        
        System.out.println("2***************************************************");
        System.out.println("FileOutputStream:");
        FileOutputStream fos = null;
        byte[] buffer = new byte[500];
        int nBytes;
        try{
            System.out.println("Escribe el texto a guardar en el archivo:");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer,0,nBytes);
        }catch(IOException ioe){}
        finally{
            try{
                if(fos != null)
                    fos.close();
            }catch(IOException ioe){}
        }
        
        System.out.println("3***************************************************");
        System.out.println("FileInputStream:");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("fos.txt");
            nBytes = fis.read(buffer, 0, 500);
            String textoLeido = new String(buffer,0,nBytes);
            System.out.println(textoLeido);
        }catch(IOException ioe){}
        finally{
            if(fis != null)
                fis.close();
        }
    }
}
