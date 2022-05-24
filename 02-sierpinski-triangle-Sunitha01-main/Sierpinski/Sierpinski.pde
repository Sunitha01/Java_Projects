void sierpinski(float x1, float y1, float x2, float y2, float x3, float y3, int iterations){
  // The variable iterations should be used to know when to stop
  
  if(iterations > 0) {
    
    triangle(x1, y1, x2, y2, x3, y3);
    iterations--;
    // HINT how do you calculate the midpoint of a line?
    float l ;
   
    x2 = (x1+x2)/2;
    y2 = (y1+y2)/2;
    x3 = (x1+x3)/2;
      
    
    // HINT for each iteration, you need to draw three smaller triangles
    
    sierpinski(x1, y1, x2, y2, x3, y3,iterations);
    l = (x3 - x1);     
    
    sierpinski(x1 + l , y1, x2 + l , y2, x3+ l, y3,iterations);    
    sierpinski(x1 +  l/2  , y2, x2 + l/2 ,2*y2-y1, x3 + l/2, y2,iterations);
         
   
}
  //
}

void setup(){
  // Do all your drawing here OR if the drawing is complex, in new methods
  // called from here.
  
  size(600,600);
 
  sierpinski(0, 500, 300, 0, 600, 500, 10);
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("sierpinski.png");
}
