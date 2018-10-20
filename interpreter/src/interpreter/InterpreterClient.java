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
public class InterpreterClient {

    /**
     * @param args the command line arguments
     */
    static final TextInterpreterContext CONTEXT = new TextInterpreterContext();

    public static void main(String[] args) {
        String text = "este es el patron interpreter para la asignatura de arquitectura DE SOFTWARE, todo bien profe";
        //String text="Hola men";
        System.out.println("TEXTO A INTERPRETAR: " + text.toUpperCase());
        TextInterpreter interpreter = null;

        interpreter = new AsciiInterpreter();
        interpreter.text = text;
        System.out.print("Ascii\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));
        
        interpreter = new Base64Interpreter();
        interpreter.text = text;
        System.out.print("Base64\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));
        
        interpreter = new BinaryInterpreter();
        interpreter.text = text;
        System.out.print("Binario\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));
        
        interpreter = new HexaInterpreter();
        interpreter.text = text;
        System.out.print("Hexadecimal\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));

    }

}
