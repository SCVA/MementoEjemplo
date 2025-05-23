/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udistrital.mementoejemplo;

import udistrital.mementoejemplo.shapes.Rectangle;
import udistrital.mementoejemplo.shapes.CompoundShape;
import udistrital.mementoejemplo.shapes.Dot;
import udistrital.mementoejemplo.shapes.Circle;
import udistrital.mementoejemplo.editor.Editor;
import java.awt.*;

public class MementoEjemplo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
