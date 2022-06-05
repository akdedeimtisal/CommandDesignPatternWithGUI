/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw5_commandpattern;

import java.util.ArrayList;

/**
 *
 * @author imtisal
 */
public class MacroCommand implements ICommand{
     public Document document;
    
    ArrayList<ICommand> macroCommandList = new ArrayList<>();
    
    public MacroCommand(ArrayList<ICommand> list) {
        macroCommandList = list;
    }
    
    
    @Override
    public String execute() {
        String output = " ";
        for(int i = 0; i < macroCommandList.size(); i++) {
           output = macroCommandList.get(i).execute();
        }
        return output;

    }

    @Override
    public String undo() {
        return document.paste();
    }
}
