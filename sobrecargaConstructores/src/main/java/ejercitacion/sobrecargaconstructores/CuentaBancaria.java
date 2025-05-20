/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercitacion.sobrecargaconstructores;

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
    
    //ESTOS SON LOS CONSTRUCTOR
    
    public CuentaBancaria(){
        
    }
    //LOS CONSTRUCTORES DEBEN LLAMARSE COMO LA CLASE Y NO PUEDEN SER VOID --> IMPORTANTE

    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU(); //LLAMAMOS A UN METODO DENTRO DEL CONSTRUCTOR
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    
    public CuentaBancaria(String moneda, String tipo) {
        //PARA NO REPETIR CODIGO USAMOS EL THIS
        this("ALIAS.POR.DEFECTO", moneda, tipo); //SI LO DEJO SIN PARAMETROS LLAMO AL CONSTRUCTOR VACIO
    }
    
    
    //FIN CONSTRUCTORES
    
    private String generarCBU(){
        return "CBU GENERADO AUTO";
    } 
    
    
    public void mostrarDatos(){
        System.out.println(this);//Pasamos a si mismo por parametro
                                   // a otro metodo
        System.out.println(CBU + " " + alias + " " + saldo + " " + moneda + " " + tipo );
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
    public void setTipo(String tipo){
        if (tipo != null) {
            this.tipo = tipo;
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
//GETTERS Y SETTERS FALTANTES
    public String getMoneda() {
        return moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCBU(String CBU) {
        this.CBU = CBU;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
