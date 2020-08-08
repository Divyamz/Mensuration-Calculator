class cylinder{
  double radius;
  double height;

  double CSA(){
    return 2*Math.PI*radius*height;
  }

  double TSA(){
    return 2*Math.PI*radius*(radius + height);
  }

  double volume(){
    return Math.PI*Math.pow(radius,2)*height;
  }
}
