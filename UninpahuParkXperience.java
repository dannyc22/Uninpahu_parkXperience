/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uninpahuparkxperience;

/**
 *
 * @author danny
 */
public class UninpahuParkXperience {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Register usuario1 = new Register("Daniel Santiago", "Chacon Olaya", "20032243", "CC", "1000149621", 
                                           "dchaconol@uninpahu.edu.co", "dannyo.0200322@gmail.com", "Poseidon", 
                                           "Todo Copas", "clave12345");
        
                                           
        System.out.println(usuario1.getContrasena());
        Login login_usuario1 = new Login(usuario1);
        
        System.out.println(        );
        if (login_usuario1.autenticar("dchaconol@uninpahu.edu.co", "123d2")){
            System.out.println("Ingreso al sistema realizado con exito");
        }
        else{
            System.out.println("No ha podido acceder al sistema intente de nuevo");
            
        }
    }
}
