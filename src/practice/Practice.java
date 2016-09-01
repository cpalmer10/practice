/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Chris
 */
public class Practice {
    public static void main(String[] args) {
        String s1 = "Hello " + "Java " + "Class ";
        StringBuffer sb =  new StringBuffer();
        sb.append("Hello ").append("Java ").append("Class");
        
        s1 = sb.toString();
    }
    
}
