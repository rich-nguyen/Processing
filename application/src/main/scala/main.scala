package processingApp

import processing.core.PApplet

object Main {

  def main(args: Array[String]) {

    PApplet.main(Array("--present", "processingApp.Main"));
  }
}

class Main extends PApplet {

  override def setup() {
    size(200,200);
    background(0);
  }

  override def draw() {
    stroke(255);
    if (mousePressed) {
      line(mouseX,mouseY,pmouseX,pmouseY);
    }
  }
}