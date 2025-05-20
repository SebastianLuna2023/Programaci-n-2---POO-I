/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercitacion.sobrecargaconstructores;

/**
 *
 * @author Usuario
 */
public class SobrecargaConstructores {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("miAlias","Precios","Caja de ahorros");// BUSCA EL CONSTRUCTOR DE 3 PARAMETROS
        CuentaBancaria cb2 = new CuentaBancaria();//BUSCA EL CONSTRUCTOR POR DEFECTO O VACIO
        CuentaBancaria cb3 = new CuentaBancaria("DOLARES", "CAJA DE AHORROS");//VA A BUSCAR EL CONSTRUCTOR CON 2 PARAMETROS
        
        
        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
        
        
    }
}
