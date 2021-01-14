package EjConsole;

import java.io.Console;

public class EjConsole {
    public static void main(String[] args){
        Console console = System.console();
        System.out.println("Usuario:");
        String usuario = console.readLine();
        System.out.println(usuario);
        
    }
}
