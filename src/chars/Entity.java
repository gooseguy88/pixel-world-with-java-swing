package src.chars;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class Entity {
    public int x, y;
    public int speed; // better double type but i can't set it
    public int scale; // to increase the character size if needed

    public BufferedImage up1, up2, up3, up4, up5, up6, down1, down2, down3, down4, down5, down6, left1, left2, left3,
            left4, left5, left6, right1, right2, right3, right4, right5, right6;
    public String direction;
    public int spriteCounter;
    public int spriteNum = 1;
    public Rectangle solidArea; // for collision detection
    public boolean collisionOn = false;
}
