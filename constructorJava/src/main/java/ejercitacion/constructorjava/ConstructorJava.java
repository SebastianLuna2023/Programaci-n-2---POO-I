/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercitacion.constructorjava;

/**
 *
 * @author Usuario
 */
public class ConstructorJava {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("miAlias","Precios","Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria();
        
        
        cb.mostrarDatos();
        cb2.mostrarDatos();//Muestra el constructor vacio (sin parametros)
        
        
        
    }
}
