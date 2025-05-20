/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercitacion.sobrecargametodos;

/**
 *
 * @author Usuario
 */
public class Robot {
    
    private String nombre;
    
    public Robot (String nombre){
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    public void saludar(String nombrePersona){
        System.out.println("Hola " + nombrePersona + ", soy" + nombre);
    }
    
      
    //SI SE BUSCAR GENERALIZAR AUN MAS LLAMO DESDE EL SIN PARAMETROS AL CON PARAMETROS
    
    public void  saludar(){
        saludar("extraño sobrecargado");
    }
    /*
    Este metodo es igual de util que el anterior saludar pero estamos repitiendo codigo, ya que podemos utilizar la sobrecarga como vimos arriba
    public void saludar(){ // creo este metodo enviar deforma generica los datos y lo sobrecargo
     System.out.println("Hola extraño, soy: " + nombre);
    }
    */
}
