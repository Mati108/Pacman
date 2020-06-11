import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageViewer {

    public ImageViewer(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Image Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BufferedImage img = null;

                try{
                    img = ImageIO.read(getClass().getResource("map.png"));
                } catch(IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
                ImageIcon imgIcon = new ImageIcon(img);
                JLabel lbl = new JLabel();
                lbl.setIcon(imgIcon);
                frame.getContentPane().add(lbl, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
