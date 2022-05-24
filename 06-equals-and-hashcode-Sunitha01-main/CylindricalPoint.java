public class CylindricalPoint extends Point3D {
  final double r;
  final double theta;
  final double z;

  public CylindricalPoint(double r, double theta, double z) {
    this.r = r;
    this.theta = theta;
    this.z = z;
  }
  
  @Override
    public boolean equals(Object obj){
        if (obj instanceof CylindricalPoint ){
            CylindricalPoint cylindrical = (CylindricalPoint) obj;
            if (this.r == cylindrical.r && this.theta == cylindrical.theta && this.z == cylindrical.z  ){
                return true;
            }
        }
        if (obj instanceof CartesianPoint ){
            CartesianPoint cart = (CartesianPoint) obj;
            if ((int) ((100) * Math.abs(this.r * (Math.cos(this.theta )))) - (int) ((100) * Math.abs(cart.x)) >= -1 &&
                (int) ((100) * Math.abs(this.r * (Math.cos(this.theta )))) - (int) ((100) * Math.abs(cart.x))  <=1 &&
                (int) ((100) * Math.abs(this.r * (Math.sin(this.theta))))  - (int) ((100) * Math.abs(cart.y))  >= -1 &&
                (int) ((100) * Math.abs(this.r * (Math.sin(this.theta))))  - (int) ((100) * Math.abs(cart.y))  <= 1 &&
                 this.z == cart.z )
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode(){

        return 35;
    }           
            

  @Override
  public String toString() {
    // Note - this is another way to build up complex strings.  You can read more about it
    // here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
    // and here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
    return String.format("<r=%s,theta=%s,z=%s>", r, theta, z);
  }
}
