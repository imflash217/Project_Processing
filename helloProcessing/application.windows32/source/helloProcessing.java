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

public class helloProcessing extends PApplet {

// copyright @ vinaykumar2491
//




//setup() runs only once 
public void setup() { 
            // drawing the Canvas & its size
  background(150, 0, 150);  // draws the background
}



// draw() runs recursively all the time
public void draw() {

  stroke(100, 0, 100);
  fill(0, 0, 0);

  if (mousePressed) {
    //rect(mouseX, mouseY, 10, 10);
  } else {
    ellipse(mouseX, mouseY, 10, 10);
  }
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "helloProcessing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
