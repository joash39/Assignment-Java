package Assignment;

public class Triangle {

    public Triangle(){}
    public static void main(String[] args) {

        Calculator tri = new Calculator();
        tri.area=0.5 * tri.height * tri.base;
        tri.per=tri.height + tri.base+tri.hypotenus;

        System.out.println("The area is "+tri.area+" and the perimeter is "+tri.per);
    }
}
