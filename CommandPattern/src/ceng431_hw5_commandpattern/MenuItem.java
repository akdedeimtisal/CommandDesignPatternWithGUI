/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw5_commandpattern;

/**
 *
 * @author imtisal
 */
public class MenuItem {

    public ICommand command;

    public MenuItem(ICommand command) {
        this.command = command;
    }

    public String clicked() {

        return command.execute();
    }

    public String unclicked() {
        return command.undo();
    }
}
