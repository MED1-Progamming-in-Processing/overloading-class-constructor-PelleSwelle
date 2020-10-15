ArrayList<Body> bodies = new ArrayList<Body>();

Body circle;
Body square;

void setup()
{
    size(1000, 1000);
    
    circle = new Body(random(width), random(height), random(-10, 10), random(-10, 10));
    
    square = new Body(3, random(width), random(height), random(-10,10), random(-10, 10));
}

void draw()
{
    background(200);
    
    circle.display();
    //circle.move();
    square.move();
}

void mouseClicked()
{
    //square.move();
}
