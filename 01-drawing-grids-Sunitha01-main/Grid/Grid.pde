
int n = 7; // Changing this number should upadate the grid
int x1 = 0;
int y1 = 0;
int x2 = 0;
int y2 = 0;

void setup(){
  size(600, 400);
    background(0);
    stroke(255);
    x1 = x1 + 600/n;
    
    while (x1 < 600 ){
      x2 = x1;
      y1 = 0;
      y2 = 400;
      line(x1, y1, x2, y2);
      x1 = x1 + 600/n;
    }  
    y1 = y1 + 400/n;
    while (y1 < 600 ){
      x1 = 0;
      x2 = 600;
      y2 = y1;
      line(x1, y1, x2, y2);
      y1 = y1 + 400/n;
      save("grid-"+n+".png");
    }
}
