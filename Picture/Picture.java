    
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall1;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square window;
    private Circle windowArch;
    private Square hedge;
    private Square creek;
    private Triangle roof1;
    private Triangle roof2;
    private Triangle roof3;
    private Circle sun1;
    private Circle sun2;
    private Circle sun3;
    private Circle lake;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw(); 
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sun1 = new Circle();
        sun1.changeColor("yellow");
        sun1.moveVertical(-30);
        sun1.changeSize(60);
        sun1.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("magenta");
        sun2.moveHorizontal(-15);
        sun2.moveVertical(-50);
        sun2.changeSize(60);
        sun2.makeVisible();
        
        sun3 = new Circle();
        sun3.changeColor("red");
        sun3.moveHorizontal(-30);
        sun3.moveVertical(-70);
        sun3.changeSize(60);
        sun3.makeVisible();

        hedge = new Square();
        hedge.changeColor("green");
        hedge.changeSize(300);
        hedge.moveHorizontal(-30);
        hedge.moveVertical(40);
        hedge.makeVisible();
        
        creek = new Square();
        creek.changeColor("blue");
        creek.changeSize(300);
        creek.moveHorizontal(-30);
        creek.moveVertical(130);
        creek.makeVisible();
        
        lake = new Circle();
        lake.changeColor("blue");
        lake.changeSize(250);
        lake.moveHorizontal(-105);
        lake.moveVertical(140);
        lake.makeVisible();
        
        wall1 = new Square();
        wall1.changeSize(60);
        wall1.makeVisible();
        
        
        wall2 = new Square();
        wall2.changeSize(60);
        wall2.moveHorizontal(40);
        wall2.makeVisible();
        
        wall3 = new Square();
        wall3.changeSize(60);
        wall3.moveHorizontal(200);
        wall3.makeVisible();

        wall4 = new Square();
        wall4.changeSize(100);
        wall4.moveHorizontal(100);
        wall4.moveUp();
        wall4.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeSize(30, 60);
        roof1.moveHorizontal(60);
        roof1.moveVertical(90);
        roof1.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(60, 120);
        roof2.moveHorizontal(230);
        roof2.moveVertical(60);
        roof2.makeVisible();

        roof3 = new Triangle();
        roof3.changeSize(100, 130);
        roof3.moveHorizontal(140);
        roof3.moveVertical(30);
        roof3.makeVisible();   
        
        window = new Square();
        window.changeColor("white");
        window.changeSize(30);
        window.moveHorizontal(95);
        window.moveVertical(-30);
        window.makeVisible();
        
        windowArch = new Circle();
        windowArch.changeColor("white");
        windowArch.changeSize(30);
        windowArch.moveHorizontal(105);
        windowArch.moveVertical(15);
        windowArch.makeVisible();
        
        
    }



}
