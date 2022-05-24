
PShape globe;

Planets1 mercury = new Planets1(1407.6,0.03,"mercurymap.jpg",60,60);
Planets1 venus = new Planets1(-5832.6,2.64,"venusmap.jpg",180,60);

Planets1 earth = new Planets1(23.93,23.44,"earthmap1k.jpg",300,60);

Planets1 moon = new Planets1(655.73,6.68,"Moon.jpg",420,60);

Planets1 mars = new Planets1(24.62,25.19,"mars_1k_color.jpg",540,60);

Planets1 jupiter = new Planets1(9.93,3.13,"jupitermap.jpg",60,180);

Planets1 saturn = new Planets1(10.66,26.73,"saturnmap.jpg",180,180);
Planets1 uranus = new Planets1(-17.24,82.23,"uranusmap.jpg",300,180);

Planets1 neptune = new Planets1(16.11,28.32,"neptunemap.jpg",420,180);

Planets1 pluto = new Planets1(-153.29,57.47,"plutomap1k.jpg",540,180);

void setup() {    
   earth.setup();   
   mars.setup();   
   jupiter.setup();   
   mercury.setup();   
   neptune. setup();
   pluto.setup();
   saturn.setup();
   moon.setup();
   uranus.setup();
   venus.setup();
            
}


void draw() {
  moon.draw();   
  earth.draw();
   
  mars.draw();   
  jupiter.draw(); 
   
  mercury.draw();
  neptune. draw();
  pluto.draw();
  saturn.draw();
  uranus.draw();
  venus.draw();
  save("planets.png");
   
}  
