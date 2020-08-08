import java.util.Scanner;

class calc{
  public static void main(String[] args) {
    System.out.println("What is your operation upon : 1.rectangle ");
    System.out.println("                              2.circle");
    System.out.println("                              3.cuboid");
    System.out.println("                              4.sphere");
    System.out.println("                              5.cone");
    System.out.println("                              6.cylinder");

    Scanner input = new Scanner(System.in);
    int select = input.nextInt();

    switch (select) {
      case 1 : // rectangle
        rectangle rec = new rectangle();
        System.out.print("what is the length of rectangle : ");
        rec.length = input.nextDouble();

        System.out.print("what is the breadth of rectangle : ");
        rec.breadth = input.nextDouble();

        System.out.println("What do you want to calculate : 1.area");
        System.out.println("                                2.perimeter");
        int selectrec = input.nextInt();


        switch (selectrec) {
          case 1 : // area of rectangle
          System.out.println("Area of the rectangle is : " +(int)rec.area());
          break;

          case 2 : // perimeter of rectangle
          System.out.println("Perimeter of the rectangle is : "+(int)rec.perimeter());
          break;
        }
      break;

      case 2 : // CIRCLE
        circle cir = new circle();
        System.out.print("what is the radius of the circle : ");
        cir.radius = input.nextDouble();

        System.out.println("What do you want to calculate : 1.area");
        System.out.println("                                2.circumference");
        int selectcir = input.nextInt();

        switch (selectcir) {
          case 1 : // area of circle
          System.out.println("Area of the circle is : " +(int)cir.area());
          break;

          case 2 : // perimeter of rectangle
          System.out.println("circumference of the circle is : "+(int)cir.circumference());
          break;
        }
      break;


      case 3 : // CUBOID
        cuboid cub = new cuboid();
        System.out.print("what is the length of cuboid : ");
        cub.length = input.nextDouble();

        System.out.print("what is the breadth of cuboid : ");
        cub.breadth = input.nextDouble();

        System.out.print("what is the height of cuboid :");
        cub.height = input.nextDouble();

        System.out.println("What do you want to calculate : 1.area");
        System.out.println("                                2.volume");
        int selectcub = input.nextInt();

        switch (selectcub) {
          case 1 : // area of cuboid
          System.out.println("Area of the cuboid is : " +(int)cub.area());
          break;

          case 2 : // volume of the cuboid
          System.out.println("volume of the cuboid is : "+(int)cub.volume());
          break;
        }
      break;

      case 4 : // SPHERE
        sphere sep = new sphere();
        System.out.print("what is the radius of sphere : ");
        sep.radius = input.nextDouble();

        System.out.println("What do you want to calculate : 1.TSA");
        System.out.println("                                2.volume");
        int selectsep = input.nextInt();

        switch (selectsep) {
          case 1 : // TSA of sphere
          System.out.println("TSA of the sphere is : " +(int)sep.area());
          break;

          case 2 : // volume of sphere
          System.out.println("Volume of the sphere is : "+(int)sep.volume());
          break;
        }
      break;

      case 5 : // CONE
        cone con = new cone();
        System.out.print("What is the radius of cone : ");
        con.radius = input.nextDouble();

        System.out.print("What is the height of cone : ");
        con.height = input.nextDouble();

        System.out.println("What do you want to calculate : 1.TSA");
        System.out.println("                                2.CSA");
        System.out.println("                                3.Volume");
        int selectcon = input.nextInt();

        switch (selectcon) {
          case 1 : // TSA of cone
          System.out.println("TSA of the cone is : " +(int)con.TSA());
          break;

          case 2 : // CSA of cone
          System.out.println("CSA of the cone is : "+(int)con.CSA());
          break;

          case 3 : // volume of cone
          System.out.println("Volume of the cone is : "+(int)con.volume());
          break;
        }
      break;

      case 6 :
      cylinder cyl = new cylinder();
      System.out.print("What is the radius of the cylinder : ");
      cyl.radius=input.nextDouble();

      System.out.print("What is the height of the cylinder : ");
      cyl.height=input.nextDouble();

      System.out.println("What do you want to calculate : 1.TSA");
      System.out.println("                                2.CSA");
      System.out.println("                                3.Volume");
      int selectcyl = input.nextInt();

      switch (selectcyl) {
        case 1 : // TSA of cylinder
        System.out.println("TSA of the cylinder is : " +(int)cyl.TSA());
        break;

        case 2 : // CSA of cylinder
        System.out.println("CSA of the cylinder is : "+(int)cyl.CSA());
        break;

        case 3 : // volume of cylinder
        System.out.println("Volume of the cylinder is : "+(int)cyl.volume());
        break;
      }
      break;

    }
  }
}
