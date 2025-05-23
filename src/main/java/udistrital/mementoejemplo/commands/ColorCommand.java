package udistrital.mementoejemplo.commands;

import java.awt.*;
import udistrital.mementoejemplo.editor.Editor;
import udistrital.mementoejemplo.shapes.Shape;

public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
