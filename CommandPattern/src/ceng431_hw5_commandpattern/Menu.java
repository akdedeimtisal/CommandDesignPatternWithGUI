/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw5_commandpattern;

import java.util.Stack;

/**
 *
 * @author imtisal
 */
public class Menu {

    Stack<MenuItem> menuItems = new Stack<>();

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

   

    public void add(MenuItem m) {
        menuItems.add(m);
    }
    
    public void undo(MenuItem m) {
        menuItems.pop();
    }
}
