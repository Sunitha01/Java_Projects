Button[] buttons;
int i;
int j;
int q;
void setup(){
  buttons = new Button[64];
  size(1000,1000);
  // HINT instead of drawing each button one by one, you can
  //      write a loop and do some math to create your chessboard.
  //      A chessboard has 64 squares - 8 rows and 8 columns
  
  for ( i = 0 ; i < 8 ; i ++){
    buttons[q] = new Button( i*125, 0, 125, 125);
    q++;
    for ( j = 1 ; j < 8 ; j ++){
       buttons[q] = new Button( i*125, j*125, 125, 125);
       q++;
      
  }
  }
}

class Button {
  float leftPos;
  float topPos;
  float btnWidth;
  float btnHeight;
  boolean on = false;
  
  Button(float leftPos, float topPos, float btnWidth, float btnHeight){
    this.leftPos = leftPos;
    this.topPos = topPos;
    this.btnWidth = btnWidth;
    this.btnHeight = btnHeight;
  }
  
  boolean isClicked(){
    return (mouseX > leftPos && mouseY > topPos && mouseX < leftPos + btnWidth &&
    mouseY < topPos + btnHeight);
  }
  
  void toggleOnOff(){
    this.on = !this.on;
  }
  
  void draw(){
    // HINT this is how we changed the color of the button.
    //      For the checkers example, you should use this
    //      if statement to draw or not draw a filled in circle
    // HINT think about how to keep track of the alternating colors
    //      of each square. 
    
    if(on){
      if (leftPos% 2 == 0  | leftPos% 2 == 0) {     
         fill(255,255,0);}
      else{
        fill(171,35,40);}
      rect(leftPos, topPos, btnWidth, btnHeight);   
      fill(0,255,255);
      circle(leftPos+62.5,topPos + 62.5,70);
     
      
    } else {
       if (leftPos% 2 == 0  | leftPos% 2 == 0) {     
         fill(255,255,0);}
       else{
        fill(171,35,40);}
       rect(leftPos, topPos, btnWidth, btnHeight);  
    }
     
           
  }
}


void mousePressed(){
  for(int i = 0; i < 64; i++){
    if(buttons[i].isClicked()){
     buttons[i].toggleOnOff();
    }
  }
}

void draw(){
  fill(0);
  background(255);
  for(int i = 0; i < 64; i++){
    buttons[i].draw();
  }
}
