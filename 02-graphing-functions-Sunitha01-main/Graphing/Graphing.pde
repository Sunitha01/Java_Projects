void beginGraph(){
  
  pushMatrix();
  background(255);
  stroke(150);
  line(0,height/2, width, height/2);
  line(width/2,0, width/2, height);
  stroke(0);
  translate(width/2, height/2);
  scale(1.0,-1.0);
}

void endGraph(){
  popMatrix();
}


// TODO Declare your functions here - try to give them meaningful names.  They should take a float
// as input and return a float.

float sine(float X){
    return (100 * sin(X/10));
}

float parabola(float X){
    return pow(X,2);
}

float line(float X){
   return (X/2 + 40);
   
}

float mine(float X){
   return (pow(X,4) + pow(X,3)+ 20);
   
}


  
void setup() {
  size(400, 400);
  beginGraph();
  float prevY = 0; // HINT to draw the lines to make your graph
                   // you will need to keep track of the previous
                   // point coordinates and the next ones. You should
                   // set this based the functions you declare
  float prevX = -width  ;
  prevY= sine(prevX);
  float currY = 0; 
  float currX = 0;
    
  for (float x = -width + 1  ; x < width; x++) {
       currX = x; 
       currY=  sine(currX);       
       line(prevX,prevY, currX, currY);
       prevX = currX;
       prevY = currY;    
      
      
     // Graph the sin function here. HINT sin is a
     // built in function in Processing
  }


 translate(-width/2, -height/2);
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("sin.png");
  endGraph();
  
  
  beginGraph();
  
  prevX = -width  ;
  prevY= parabola(prevX);
  
  
  for (float x = -width + 1 ; x < width; x++) {
    currX = x;
    currY = parabola(currX) ;
    line(prevX,prevY, currX, currY);
    prevX = currX;
    prevY = currY; 
  }
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("parabola.png");
  endGraph();
  
  beginGraph();
  
  prevX = -width  ;
  prevY= line(prevX);
 
  for (float x = -width + 1 ; x < width; x++) {
  //  // Graph y = (1/2) x + 40 here
     currX = x;
     currY =  line(currX) ;
     line(prevX,prevY, currX, currY);
     prevX = currX;
     prevY = currY; 
  }
  //// This line will save your drawing to a file.  Please include the file with
  //// your submission.
  save("line.png");
  endGraph();
  
  
  // x^4 + x^3 + 20
  
  beginGraph();
  prevX = -width  ;
  prevY= mine(prevX);
  for (float x = -width + 1; x < width; x++) {
  //  // Graph whatever you want here
  
     currX = x;
     currY =  mine(currX) ; 
     line(prevX,prevY, currX, currY);
     prevX = currX;
     prevY = currY; 
  
  }
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("mine.png");
  endGraph();
   
  
}
