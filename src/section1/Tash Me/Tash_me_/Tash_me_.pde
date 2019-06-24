PImage mustache;
PImage friend;
void setup() {
  friend = loadImage("Friend.jpg");
  size(800, 600);
  mustache = loadImage("Tash.png");
  friend.resize(width, height);
}

void draw() {
  background(friend);
  image(mustache, 500, 400);
  if (mousePressed) mustache moves with mouse
}
