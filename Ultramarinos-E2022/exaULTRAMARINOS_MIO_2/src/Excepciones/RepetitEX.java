/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Excepciones;

/**
 *
 * @author DeniseGT
 */
public class RepetitEX extends Exception {

    /**
     * Creates a new instance of <code>RepetitEX</code> without detail message.
     */
    public RepetitEX() {
    }

    /**
     * Constructs an instance of <code>RepetitEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public RepetitEX(String msg) {
        super(msg);
    }
}
