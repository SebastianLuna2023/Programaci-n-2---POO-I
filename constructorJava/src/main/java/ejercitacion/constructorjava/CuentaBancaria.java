/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercitacion.constructorjava;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    
    //ESTE ES EL CONSTRUCTOR
    
    public CuentaBancaria(){
        System.out.println("Se creó el objeto " + this);// Cuendo se instancia invoco a este constructor y establezco los valores iniciales
    }
    //LOS CONSTRUCTORES DEBEN LLAMARSE COMO LA CLASE Y NO PUEDEN SER VOID --> IMPORTANTE

    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU(); //LLAMAMOS A UN METODO DENTRO DEL CONSTRUCTOR
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }//
    
    
    //FIN CONSTRUCTOR
    
    private String generarCBU(){
        return "CBU GENERADO AUTO";
    } 
    
    
    public void mostrarDatos(){
        System.out.println(this);//Pasamos a si mismo por parametro
                                   // a otro metodo
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    
    public String getCBU(){
        return CBU;
    }
    
    public String getAlias(){
        return alias; // Aqui no existe ambiguedad por lo q no hace falta usar el this
    }
    
    
    public void setAlias(String alias) {
        if (alias != null){
            this.alias = alias;//Existe ambiguedad en las asignacianos
            // doble nombre alias por eso usamos this
        }
    }
    
    public void setMoneda(String moneda){
        if (moneda != null) {
            this.moneda = moneda;
        }
    }
    public void setTipo(String moneda){
        if (moneda != null) {
            this.moneda = moneda;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto){
        if (monto > 0 ){//como no existe variables monto no debemos usar this.monto ya que es para recibir 
            saldo = saldo + monto; // saldo + manto
            
        }
    }
}
