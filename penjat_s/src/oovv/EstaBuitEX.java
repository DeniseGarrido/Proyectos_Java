/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class EstaBuitEX extends RuntimeException {

    /**
     * Creates a new instance of <code>EstaBuitEX</code> without detail message.
     */
    public EstaBuitEX() {
        super("Està buit");
    }

    /**
     * Constructs an instance of <code>EstaBuitEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EstaBuitEX(String msg) {
        super(msg);
    }
}
