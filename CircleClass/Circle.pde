class Body
{
    PShape theShape;
    float xpos;
    float ypos;
    float xSpeed;
    float ySpeed;
    float radius = 100; // all elements have same radius
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

    void move()
    {
        this.xpos += this.xSpeed; // add xspeed every frame

        if (this.xpos < 0 || this.xpos > width) // hits left or right edge
        {
            this.xSpeed *= -1;
            this.theShape = createShape(RECT, xpos, ypos, radius, radius);
        }

        this.ypos += this.ySpeed;

        if (this.ypos < 0 || this.ypos > height) // hits top or bottom edge
        {
            this.ySpeed *= -1;
            this.theShape = createShape(ELLIPSE, xpos, ypos, radius, radius);
        }
        
        shape(theShape);
    }

    void display()
    {
      
    }
}
