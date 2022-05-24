import processing.sound.*;


Button1 button;
Button1 button1;
Button1 button2;
Button1 button3;
Button1 button4;
Button1 button5;
Button1 button6;
Button1 button7;
Button1 button8;
Button1 button9;
Button1 button10;

SoundFile [] file;
int numsounds = 10;

void setup(){
  file = new SoundFile[numsounds];
 file[0] = new SoundFile(this, "augustine-singh.aiff"); 
 file[1] = new SoundFile(this, "blackberry-creek.aiff"); 
 file[2] = new SoundFile(this, "cascading-stream.aiff"); 
 file[3] = new SoundFile(this, "clock-ticking.aiff"); 
 file[4] = new SoundFile(this, "errorcell.aiff"); 
 file[5] = new SoundFile(this, "mantra.aiff"); 
 file[6] = new SoundFile(this, "moog-saw.aiff"); 
 file[7] = new SoundFile(this, "Ocean.aiff"); 
 file[8] = new SoundFile(this, "rusty-voice.aiff"); 
 file[9] = new SoundFile(this, "se-refresh.aiff"); 


  size(500,100);
    button = new Button1 (0,0,100,50,"augustine-singh",0,200,200);
    button1 = new Button1 (100,0,100,50,"blackberry-creek",0,200,200);
    button2 = new Button1 (200,0,100,50,"cascading-stream",0,200,200);
    button3 = new Button1 (300,0,100,50,"clock-ticking",0,200,200);
    button4 = new Button1 (400,0,100,50,"errorcell",0,200,200);
    button5 = new Button1 (0,50,100,50,"mantra",0,200,200);
    button6 = new Button1 (100,50,100,50,"moog-saw",0,200,200);
    button7 = new Button1 (200,50,100,50,"Ocean",0,200,200);
    button8 = new Button1 (300,50,100,50,"rusty-voice",0,200,200);
    button9 = new Button1 (400,50,100,50,"se-refresh",0,200,200);
    

    
  }


void draw(){
    background(255);
    fill(0);
    button.update();
  button.render();
   
     if (button.isClicked()){
      file[0].play(4.0,1.0);
    
     
    }
    
  button1.update();
  button1.render();
  if (button1.isClicked()){
      file[1].play(4.0,1.0);
    }
    
    button2.update();
  button2.render();
  
  if (button2.isClicked()){
      file[2].play(4.0,1.0);
    }
  
  button3.update();
  button3.render();
  
  if (button3.isClicked()){
      file[3].play(4.0,1.0);
    }
  
  button4.update();
  button4.render();
  
  if (button4.isClicked()){
      file[4].play(4.0,1.0);
    }
  
  button5.update();
  button5.render();
  
  if (button5.isClicked()){
      file[5].play(4.0,1.0);
    }
  
  button6.update();
  button6.render();
  
  if (button6.isClicked()){
      file[6].play(4.0,1.0);
    }
  
  button7.update();
  button7.render();
  
  if (button7.isClicked()){
      file[7].play(4.0,1.0);
    }
  
  button8.update();
  button8.render();
  
  if (button8.isClicked()){
      file[8].play(4.0,1.0);
    }
  
  button9.update();
  button9.render();
  
  if (button9.isClicked()){
      file[9].play(4.0,1.0);
    }
  
}
