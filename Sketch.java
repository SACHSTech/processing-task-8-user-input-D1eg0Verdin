import processing.core.PApplet;

public class Sketch extends PApplet {
	
	boolean upPressed = false;
  boolean downPressed = false;


  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135,206,235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // if statement that draws a sun when S is pressed and draws the same sun but bigger if Shift is pressed
    if (upPressed){
      background(255,255,255);
    }
    if (downPressed){
      background(0);
    } 
    
    if (keyPressed){
      if (key == 's'){
        drawSun(mouseX, mouseY, 50);
      }
      else if (keyCode == SHIFT){
        drawSun(mouseX, mouseY, 100);
      }
    }
    if (mousePressed){
      drawGrass(0, 275);
    }
    
    textSize(28);
    text(message, 25, 150);

   
   
  }
  public void keyPressed(){
    if (keyCode == UP){
      upPressed = true;
    }
    else if (keyCode == DOWN){
      downPressed =  true;
    }
  }

  public void keyReleased(){
    if (keyCode == UP){
      upPressed = false;
    }
    else if (keyCode == DOWN){
      downPressed =  false;
    }
  }

  public void mouseWheel(){
    house(mouseX, mouseY);
  }
  String message = "";
  public void keyTyped(){
    message += key;
  }
 
  public void drawGrass(int GrassX, int GrassY){
    fill (0, 255, 30);
    rect(GrassX, GrassY, 400, 125);
  }
  /**
   * Method that draws the sun in an indicated position
   * @param SunX X coordniate of the sun
   * @param SunY Y coordinate of the sun
   */
  public void drawSun(int SunX, int SunY, int size){
    fill(255, 255, 0);
    ellipse(SunX, SunY, size, size);
  }
 
  /**
   * This method draws a house
   * @param intX x coordinate of house
   * @param intY y coordinate of house
   */
  public void house(int intX, int intY){
    //left pillar
    fill(255, 255, 255);
    rect(intX, intY, 75,175);
    
    //roof of left pillar
    fill(0);
    rect(intX - 10, intY - 10,95, 10 );

    //right rectangle
    fill(0);
    rect(intX + 75, intY + 60, 175, 115);

    //roof of white rectangle
    fill(255, 255,255);
    rect(intX + 65, intY + 50, 195, 10);

    //window for left pillar
    fill(0 ,164 ,239);
    ellipse(intX + 37, intY + 75, 50,75);

    //left window details
    stroke(23);
    line(intX + 37, intY + 35, intX + 37, intY + 110);
    line(intX + 12, intY + 75, intX + 62, intY + 75 );
   
    // right window 
    fill(0 ,164 ,239);
    rect(intX + 150, intY + 80, 100, 75);
    
    //right window details
    line(intX + 150, intY + 100, intX + 250, intY + 100);
    line(intX + 150, intY + 125, intX + 250, intY + 125);
    line(intX + 175, intY + 80, intX + 175, intY + 155);
    line(intX + 200, intY + 80, intX + 200, intY + 155);
    line(intX + 225, intY + 80, intX + 225, intY + 155);
 }
}