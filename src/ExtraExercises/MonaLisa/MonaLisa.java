package ExtraExercises.MonaLisa;

import javax.swing.*;
import java.awt.*;
// IKKE FÆRDIG!
public class MonaLisa extends JPanel {
    // Dark Brown, Cream, Light Brown, Black
    Color dBr = new Color(138, 57, 0);
    Color cr = new Color(204, 153, 102);
    Color lBr = new Color(209, 105, 4);
    Color bl = new Color(0, 0, 0);


    // En simpel 2D-array af farver for at simulere pixelering (meget forenklet)
    Color[][] pixelColors = {
            /* 5 x of the color in every color.
            lBr,lBr,lBr,lBr,lBr,
            cr,cr,cr,cr,cr,
            dBr,dBr,dBr,dBr,dBr,
            bl,bl,bl,bl,bl,
             */
            {lBr,lBr, cr, lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr, cr,cr,cr,cr,cr,cr,cr, lBr,lBr,lBr,lBr, cr,cr,cr,cr,cr,cr,cr, lBr,lBr, cr,cr,cr,cr, lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr, cr, lBr,lBr,lBr,lBr,lBr, bl,bl,bl,bl,bl, dBr,dBr,dBr,dBr, bl,bl,bl,bl, dBr,dBr, bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl, dBr, bl,bl, cr,cr,cr,cr, dBr, bl, cr, bl, cr, bl,bl, dBr, bl,bl,bl, dBr, bl, cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr,cr},
            {lBr,lBr,lBr,lBr,lBr,lBr, cr,cr,cr,cr, lBr,lBr, dBr, lBr, dBr, cr,cr,cr,cr,cr,cr, dBr, lBr,lBr,lBr, cr,cr,cr,cr,cr,cr, lBr,lBr,lBr, cr, dBr,dBr,dBr, lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr,lBr, bl,bl,bl, lBr, bl, lBr, bl,bl,bl,bl,bl,bl, dBr,dBr,dBr, bl,bl,bl,bl, dBr,dBr, bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl,bl, lBr,lBr, dBr, bl,bl,bl,bl,bl, cr, dBr, bl, cr, bl, lBr, bl,bl, dBr, bl,bl,bl, dBr, bl, cr,cr, bl,bl,bl, cr,cr,cr,cr,cr, lBr, cr, bl, lBr, cr,cr, bl},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {}
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int pixelSize = 3; // Størrelsen af hver pixel (rektangel)

        // Loop gennem 2D-arrayen og tegn hver "pixel" som et rektangel
        for (int i = 0; i < pixelColors.length; i++) {
            for (int j = 0; j < pixelColors[i].length; j++) {
                g.setColor(pixelColors[i][j]);
                g.fillRect(j * pixelSize, i * pixelSize, pixelSize, pixelSize);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pixel Mona Lisa");
        MonaLisa panel = new MonaLisa();

        frame.add(panel);
        frame.setSize(410, 410);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}