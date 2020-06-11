import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Texture {

    public static BufferedImage ghost;
    public static BufferedImage[] player;
    public BufferedImage spritesheet;

    public Texture() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("figures.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ghost = getSprite(0, 16);
        player = new BufferedImage[2];

        player[0] = getSprite(0, 0);
        player[1] = getSprite(16, 0);
    }

    public BufferedImage getSprite(int xx, int yy) {
        return spritesheet.getSubimage(xx, yy, 16, 16);
    }
}
