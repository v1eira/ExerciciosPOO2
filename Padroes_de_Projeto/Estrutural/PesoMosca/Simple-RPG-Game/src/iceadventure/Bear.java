
package iceadventure;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


class Bear extends Animal {    
    Image image;
    public Bear(){        
        super("bear");
       
        try {
            String path = filePath + "\\images\\bear.png";            
            image = new Image(path);
        } catch (SlickException ex) {
            Logger.getLogger(Bear.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage(){        
        return this.image;
    }
    public void render(int x, int y){
        image.draw(x, y);
    }
    

    
  
}
