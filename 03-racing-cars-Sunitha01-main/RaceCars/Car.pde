class Car {
 private float x;
 private float y;
 private float speed;
 private int r;
 private int g;
 private int b;
  
 private float length;
 
 Car(float x, float y, float speed, int r,int g, int b, float length){
   this.x = x;
   this.y = y;
   this.speed = speed;
   this.r = r;
   this.g = g;
   this.b = b;
   this.length = length;
 }
  
 void move(){
   x = x + speed;
   
   // HINT 1 - you should check whether the car has reached the edge of the screen in this method
   // HINT 2 - when the car does reach the end, call the save function and then call exit() to end the program
   //          otherwise, each car will overwrite the image when it reaches the end of the screen
   if (x == 600 - length){
     save("Racing.png");
     exit();
     
   }

 }
 
 void drawCar(){
    fill(0);
    rect(x + 5, y + 0,15,10);
    rect(x + 45, y+ 0,15,10);
    rect(x + 5, y+ 30,15,10);
    rect(x + 45,y + 30,15,10);

    fill(r,g,b);
    rect(x+0,y+5, length, 30);

    fill(216, 216, 243);
    rect(x+50, y+7, 10, 26);
 }
}
