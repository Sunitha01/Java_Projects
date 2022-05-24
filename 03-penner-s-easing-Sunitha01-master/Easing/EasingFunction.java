class EasingFunction {
  float start1;
  float stop1;

  float start2;
  float stop2;

  EasingFunction(float start1, float stop1, float start2, float stop2) {
    this.start1 = start1;
    this.start2 = start2;

    this.stop1 = stop1;
    this.stop2 = stop2;
  }

  public float tween(float value) {
    float b = start2;
    float c = stop2 - start2;
    float t = value - start1;
    float d = stop1 - start1;
    return tween(b, c, t, d);
  }

  float tween(float begin, float change, float time, float duration) {
    return 0;
  }
}


class LinearEasing extends EasingFunction {
  LinearEasing(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
   return change * time / duration + begin;
  }
}

class QuadraticEaseIn extends EasingFunction {
  QuadraticEaseIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration;
    return change * time * time + begin;
  }
}

class QuadraticEaseInOut extends EasingFunction {
  QuadraticEaseInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration / 2;
    if (time < 1) return change / 2 * time * time + begin;
    time--;
    return -change / 2 * (time * (time - 2) - 1) + begin;
  }
}

class CubicEasingIn extends EasingFunction {
  CubicEasingIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
    time /= duration;
    return change * time * time * time + begin;
  }
  
};

class CubicEasingOut extends EasingFunction {
  CubicEasingOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
    time /= duration;
    time--;
    return change * (time * time * time +1) + begin;
  }
  
};

class CubicEasingInOut extends EasingFunction {
  CubicEasingInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
    time /= duration/2;
    if (time < 1) 
        return change/2*(time * time * time) + begin;
    time -=2;
    return change/2 * (time * time * time + 2) + begin;
  }
  
};

class CircularEasingIn extends EasingFunction {
  CircularEasingIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
        return -change * ((float)Math.sqrt(1 - (time/=duration)*time) - 1) + begin;
  }
  
}; 

class QuinticEasingInOut extends EasingFunction {
  QuinticEasingInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
        if ((time/=duration/2) < 1) return change/2*time*time*time*time*time + begin;
            return change/2*((time-=2)*time*time*time*time + 2) + begin;
  }
};


class ExponentialEasingIn extends EasingFunction {     
  ExponentialEasingIn(float start1, float stop1, float start2, float stop2) {
     super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
       return (time==0) ? begin : change * (float)Math.pow(2, 10 * (time/duration - 1)) + begin;
  }
    
    };
    
class ExponentialEasingOut extends EasingFunction {     
  ExponentialEasingOut(float start1, float stop1, float start2, float stop2) {
     super(start1, stop1, start2, stop2);
    }
    
    float tween(float begin, float change, float time, float duration) {
       return (time==duration) ? begin+change : change * (-(float)Math.pow(2, -10 * time/duration) + 1) + begin;
  }
    
    };
