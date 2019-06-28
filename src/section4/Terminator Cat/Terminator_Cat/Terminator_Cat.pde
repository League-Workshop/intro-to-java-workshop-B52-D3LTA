PImage catPic;
int x;
int y;
int acceleration=1;
void keyPressed() {
  x++;
  y++;
  y+=acceleration;
  x+=acceleration;
}

void draw() {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
    keyPressed();
  }
  fill(mouseX%255,mouseY%255,100);
  noStroke();
  ellipse(324+x, 318+y, 45, 50);
  ellipse(142+x,321+y, 45, 50);
}

void setup() {
  size(500, 700);
  catPic = loadImage ("cat.jpg");
  catPic.resize(500, 700);
  background(catPic);
}
