class sphere{
  double radius;

  double area(){
    return 4*Math.PI*Math.pow(radius,2);
  }

  double volume(){
    return 4/3*Math.PI*Math.pow(radius,3);
  }
}
