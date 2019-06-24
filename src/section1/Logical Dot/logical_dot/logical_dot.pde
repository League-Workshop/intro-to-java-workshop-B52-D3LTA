void setup() {
  size(800, 800);
} 
void draw () {
  fill(#2924D1); 
  if(mousePressed){
    fill(#D1C324);
  }
  ellipse(200, 200, mouseX, mouseY);
}
