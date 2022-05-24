public class CartesianPoint extends Point3D {
  final double x;
  final double y;
  final double z;

  public CartesianPoint(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  @Override
  public boolean equals(Object obj){
        if (obj instanceof CartesianPoint ){
            CartesianPoint cart = (CartesianPoint) obj;
            if (this.x == cart.x && this.y == cart.y && this.z == cart.z  ){
                return true;
            }
        }
        if (obj instanceof CylindricalPoint ){
            CylindricalPoint cylindrical = (CylindricalPoint) obj;
            if ((int) ((100) * Math.abs(this.x)) - (int) ((100) * Math.abs(cylindrical.r * (Math.cos(cylindrical.theta )))) >= -1 &&
               (int) ((100) * Math.abs(this.x)) - (int) ((100) * Math.abs(cylindrical.r * (Math.cos(cylindrical.theta )))) <=1 &&
                (int) ((100) * Math.abs(this.y)) - (int) ((100) * Math.abs(cylindrical.r * (Math.sin(cylindrical.theta)) )) >= -1 &&
                (int) ((100) * Math.abs(this.y)) - (int) ((100) * Math.abs(cylindrical.r * (Math.sin(cylindrical.theta)) )) <= 1 &&
                    this.z == cylindrical.z)
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
  public String toString(){
    // Note - this is another way to build up complex strings.  You can read more about it
    // here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
    // and here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
    return String.format("<x=%s,y=%s,z=%s>", x, y, z);
  }
}
