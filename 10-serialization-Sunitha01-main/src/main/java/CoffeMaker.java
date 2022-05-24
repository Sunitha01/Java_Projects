import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CoffeMaker  {
    public int cupsWater;
    @JsonCreator
    public CoffeMaker(@JsonProperty("cups")int cupsWater, @JsonProperty("scoops")int scoopsCoffee,
                      @JsonProperty("cupsCoffee")int cupsCoffee) {

        this.cupsWater = cupsWater;
        this.scoopsCoffee = scoopsCoffee;
        this.cupsCoffee = cupsCoffee;

    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "cupsWater=" + cupsWater +
                ", scoopsCoffee=" + scoopsCoffee +
                ", cupsCoffee=" + cupsCoffee +
                '}';
    }

    public int scoopsCoffee;
    public int cupsCoffee;


}
