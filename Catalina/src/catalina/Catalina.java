/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalina;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author perezgus
 */
public class Catalina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner  scan = new Scanner(new File("Input.txt"));
        
        while(scan.hasNext()){
            String temp = scan.nextLine();
            StringBuilder line = new StringBuilder();
            
            for(int i=0; i < temp.length() ; i++) {
                if(Character.isUpperCase(temp.charAt(i))) {
                    line.append(temp.charAt(i));
    }
    
}
