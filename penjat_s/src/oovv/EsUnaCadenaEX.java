/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class EsUnaCadenaEX extends RuntimeException {

    /**
     * Creates a new instance of <code>EsUnaCadenaEX</code> without detail message.
     */
    public EsUnaCadenaEX() {
        super("És una cadena");
    }

    /**
     * Constructs an instance of <code>EsUnaCadenaEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EsUnaCadenaEX(String msg) {
        super(msg);
    }
}
