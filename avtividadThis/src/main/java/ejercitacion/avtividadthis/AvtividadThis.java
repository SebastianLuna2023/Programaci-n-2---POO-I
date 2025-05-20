/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercitacion.avtividadthis;

/**
 *
 * @author Usuario
 */
public class AvtividadThis {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();///Nota 1: Aqui podemos ver las referencias
        cb.setAlias("miAlias");
        System.out.println(cb);
        
    }
}
