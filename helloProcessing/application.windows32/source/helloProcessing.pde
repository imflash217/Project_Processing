// copyright @ vinaykumar2491
//




//setup() runs only once 
void setup() { 
  size(500, 500);          // drawing the Canvas & its size
  background(150, 0, 150);  // draws the background
}



// draw() runs recursively all the time
void draw() {

  stroke(100, 0, 100);
  fill(0, 0, 0);

  if (mousePressed) {
    //rect(mouseX, mouseY, 10, 10);
  } else {
    ellipse(mouseX, mouseY, 10, 10);
  }
}