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
public class Base64Interpreter extends  TextInterpreter {

    @Override
    public String interpreter(TextInterpreterContext tic) {
        return tic.textToBase64(text);
    }

}
