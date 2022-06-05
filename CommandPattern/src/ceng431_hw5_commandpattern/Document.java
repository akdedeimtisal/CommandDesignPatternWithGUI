/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw5_commandpattern;

import java.awt.TextField;
import java.io.File;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author imtisal
 */
public class Document {

    private String name;
    private JTextArea textArea;
    File file;
    Scanner sc;

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document(String name) {
        this.name = name;
    }

    public String open() {
        String output = "";
        try {
            file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\CENG431_HW5_CommandPattern\\src\\" + getName() + ".txt");
            sc = new Scanner(file);     //file to be scanned  
            while (sc.hasNextLine()) //returns true if and only if scanner has another token  
            {
                output += sc.nextLine();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }

    public String close() {
        sc.close();
        return getName() + " is close";
    }

    public String cut() {
        textArea.cut();
        return "Cut";
    }

    public String copy() {
        textArea.copy();
        return "Copy";
    }

    public String paste() {
        textArea.paste();
        return "Paste";
    }

}
