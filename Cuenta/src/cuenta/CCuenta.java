package cuenta;

/**
 * Esta clase almacena los datos de una cuenta bancaria
 * 
 * @author Manuel Nicolas Castineira
 * 
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/** Metodo constructor
 * 
 */
    public CCuenta()
    {
    }
/** Metodo constructor con parametros
 * 
 * @param nom nombre titular de la cuenta
 * @param cue numero de la cuenta
 * @param sal saldo de la cuenta
 * @param tipo tipo interes de a cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/** Metodo que devuelve el saldo
 * 
 * @return saldo
 */
    public double estado()
    {
        return saldo;
    }
/** Metodo que permite ingresar una cantidad
 *  @param cantidad a ingresar en cuenta 
 *  @throws Exception Error al ingresar una cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/** Metodo que permite retirar una cantidad
 *  @param cantidad  cantidad a retirar en cuenta 
 *  @throws Exception Error al retirar una cantidad negativa o cantidad que no existe
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/** Metodo que devuelve el nombre
 *  @return nombre */
    public String getNombre() {
        return nombre;
    }
/** Metodo para indicar el nombre
 *  @param nombre nombre del titular
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** Metodo que devuelve el numero de la cuenta
 *  @return cuenta
 */
    public String getCuenta() {
        return cuenta;
    }
/** Metodo para indicar el numero de la cuenta
 *  @param cuenta numero de cuenta
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/** Metodo que devuelve el saldo de la cuenta
 *  @return saldo
 */
    public double getSaldo() {
        return saldo;
    }
/** Metodo para indicar el saldo de la cuenta
 * @param saldo saldo de la cuenta
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/** Metodo que devuelve el tipo de interes
 * @return tipo de interes
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/** Metodo para indicar el tipo de interes
 * @param tipoInterés tipo de interes de la cuenta
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
