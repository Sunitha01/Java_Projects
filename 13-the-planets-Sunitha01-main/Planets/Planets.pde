class Planets1{
  
  float  rotation = 0;
  float tilt = 0;
  String s;
  PImage img;
  float x;
  float y;
  
  
  
  Planets1(float rotation, float tilt, String s, float x, float y)
  {
    this.rotation = rotation;
    this.tilt = tilt;
    this.s = s;
    this.x = x;
    this.y = y;  
  }
  void setup() {
    
    size(600, 600, P3D);
    img = loadImage(s);
    globe = createShape(SPHERE, 50);     
   }
  
  
 void draw() {
   
   globe.setTexture(img); 
   pushMatrix();
   translate(x, y);  
   rotate(radians(tilt));
   rotateY(rotation*10000);    
   rotation = rotation + 0.01;  
   shape(globe);
   popMatrix();
   
  }
  
}
