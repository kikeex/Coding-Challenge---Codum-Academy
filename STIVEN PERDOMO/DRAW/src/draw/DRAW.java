/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

/**
 *
 * @author jojstepersan
 */
public class DRAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CanvasDraw canvas = new CanvasDraw(20, 4);
        canvas.draw();
        canvas.drawLine(1, 1, 1, 5);
        canvas.draw();
        canvas.drawLine(1, 5, 4, 5);
        canvas.draw();
        canvas.drawRectangule(1, 16, 3, 20);
        canvas.draw();
    }

}
