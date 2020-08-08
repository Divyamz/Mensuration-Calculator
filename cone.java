class cone{
  double radius;
  double height;

  double slantheight = Math.sqrt(radius*radius + height*height);

  double CSA(){
    return 2*Math.PI*radius*slantheight;
  }

  double volume(){
    return Math.PI*Math.pow(radius,2)*height;
  }

  double TSA(){
    return CSA() + Math.PI * Math.pow(radius,2);
  }
}
