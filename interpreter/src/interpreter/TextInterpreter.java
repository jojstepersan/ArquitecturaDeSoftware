/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author jojstepersan
 */
public abstract class TextInterpreter {

    public String text;

    abstract String interpreter(TextInterpreterContext tic);
}
