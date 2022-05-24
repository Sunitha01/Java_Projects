public class Point3D implements Comparable<Point3D> {
  final float x;
  final float y;
  final float z;

  public Point3D(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public int compareTo(Point3D o) {
    // TODO implement this method
    float d1 = this.x * this.x + this.y * this.y +this.z * this.z;
        float d2 = o.x * o.x + o.y * o.y +o.z * o.z;
        if ( d1 > d2){
            return 1;
        }
    return -1;
  }
}
