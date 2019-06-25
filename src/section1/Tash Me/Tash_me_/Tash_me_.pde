PImage mustache;
PImage friend;
int x;
int y;
void setup() {
  friend = loadImage("Friend.jpg");
  size(800, 600);
  mustache = loadImage("Tash.png");
  friend.resize(width, height);
}

void draw() {
  background(friend);
  image(mustache, x, y);
  if(mousePressed){
    image(mustache, mouseX, mouseY);
    x = mouseX;
    y =  mouseY;
  }
}
