class cuboid{
  double length;
  double breadth;
  double height;

  double area(){
    return 2*(length*breadth + breadth*height + height*length);
  }

  double volume(){
    return length*breadth*height;
  }
}
