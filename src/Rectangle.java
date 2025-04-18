public class Rectangle extends Shape{

     private  int sideA=0,sideB=0;

    public Rectangle(int sideA,int sideB) {
        this.sideA=sideA;
        this.sideB=sideB;




    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public void describe(){
        super.describe();
        System.out.println("sideA"+sideA+"side b"+sideB);

    }
    public boolean equals (object obj ){
        Rectangle rectangle =(Rectangle) obj;
        if (this.sideA==Rectangle.sideA&& this.sideB ==Rectangle.sideB     )
    }

}














public boolean equals(Rectangle r)