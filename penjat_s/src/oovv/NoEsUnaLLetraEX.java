/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class NoEsUnaLLetraEX extends RuntimeException {

    /**
     * Creates a new instance of <code>NoEsUnaLLetraEX</code> without detail message.
     */
    public NoEsUnaLLetraEX() {
        super("No és una lletra");
    }

    /**
     * Constructs an instance of <code>NoEsUnaLLetraEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoEsUnaLLetraEX(String msg) {
        super(msg);
    }
}
