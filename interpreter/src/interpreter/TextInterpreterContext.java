/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author jojstepersan
 */
public class TextInterpreterContext {

    public String textToASCII(String text) {
        String ans = "";
        for (int i = 0; i < text.length(); i++) {
            ans += (int) text.charAt(i) + "";
        }
        return ans;
    }

    public String textToBase64(String text) {
        return DatatypeConverter.printBase64Binary(text.getBytes());
    }

    public String textToHexa(String text) {
        String ans = "";
        for (int i = 0; i < text.length(); i++) {
            ans += Integer.toHexString((int) text.charAt(i));
        }
        return ans;
    }

    public String textToBinary(String text) {
        String ans = "";
        for (int i = 0; i < text.length(); i++) {
            ans += Integer.toBinaryString((int) text.charAt(i));
        }
        return ans;
    }

}
