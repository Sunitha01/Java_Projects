int x = 20;
int y = 20;

void setup() {  
  size(200, 200);
  frameRate(30);
}
void draw() {  
  background(204);
  fill(255, 0, 0);
  if (x ==180)
    y = y +1;
  if (x < 180 && y == 20)
     x  = x + 1;
  if ( x <= 180 && y == 180 && x > 0)
     x = x - 1;
  if ( x == 20 && y <= 180)
      y  = y - 1;
   
  circle(x, y, 40);
}
