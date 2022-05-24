Car car1;
Car car2;
Car car3;
float x=20;
  float y = 20;
void setup() {
  size(600, 600);
  car1 = new Car(0, 50, 1.0,255,0,0, 70);
  car2 = new Car(0, 150, 2.0,0,255,0, 90);
  car3 = new Car(0, 300, 0.5,0,0,255, 100);
}

void draw() {
  background(255);
  car1.drawCar();
  car2.drawCar();
  car3.drawCar();
  
  
  

  car1.move();
  car2.move();
  car3.move();
}

 
