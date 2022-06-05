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
public class OpenCommand implements ICommand {

    public Document document;

    public OpenCommand(Document document) {
        this.document = document;

    }

    public void askUser(String name) {
        document = new Document(name);
        Application.addDocument(document);
    }

    @Override
    public String execute() {
        return document.open();
    }

    @Override
    public String undo() {
        return document.close();
    }
}
