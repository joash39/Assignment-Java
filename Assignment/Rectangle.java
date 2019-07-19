package Assignment;

public class Rectangle {
    int length,width;
    public Rectangle(int leng, int wid){
        length=leng;
        width=wid;
    }
    public int Area(){
        int area;
        area=length*width;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,5);
        Rectangle rect2 = new Rectangle(5,8);

        int area1,area2;
        area1=rect1.Area();
        area2=rect2.Area();

        System.out.println("The area for the first rectangle is "+area1+" and the second is "+area2);
    }
}
