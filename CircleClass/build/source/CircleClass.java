import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class CircleClass extends PApplet {

Body circle;
Body square;

public void setup()
{
    
    circle = new Body(random(width), random(height), random(-3, 3), random(-3, 3));
    square = new Body(2, random(width), random(height), random(-3,3), random(-3, 3));
}

public void draw()
{


    circle.move();
    circle.display();
    background(200);
}

public void mouseClicked()
{
    square.display();
}
class Body
{
    PShape theShape;
    float xpos;
    float ypos;
    float xSpeed;
    float ySpeed;
    float radius = 20;
    int num;

    Body(float _xpos, float _ypos, float _xSpeed, float _ySpeed)
    {
        this.xpos = _xpos;
        this.ypos = _ypos;
        this.xSpeed = _xSpeed;
        this.ySpeed = _ySpeed;
        this.theShape = createShape(ELLIPSE, xpos, ypos, radius, radius);
    }
    Body(int _num, float _xpos, float _ypos, float _xSpeed, float _ySpeed)
    {
        this.num = _num;
        this.xpos = _xpos;
        this.ypos = _ypos;
        this.xSpeed = _xSpeed;
        this.ySpeed = _ySpeed;
        this.theShape = createShape(RECT, xpos, ypos, radius, radius);
    }

    public void move()
    {
        this.xpos += this.xSpeed;

        if (this.xpos < 0 || this.xpos > width)
        {
            this.xSpeed *= -1;
        }

        this.ypos += this.ySpeed;

        if (this.ypos < 0 || this.ypos > height)
        {
            this.ySpeed *= -1;
        }
        shape(theShape);
    }

    public void display()
    {
        shape(theShape); // this does not move the shape.
    }
}
  public void settings() {  size(300, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "CircleClass" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
