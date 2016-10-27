abstract class Shape{
	double acreage;
	public abstract double acreage();
}
class Triangle extends Shape{
	double length,height;
	Triangle(double length,double height){
		this.length = length;
		this.height = height;
	}
	public double acreage(){
		acreage = length * height * 0.5;
		this.acreage = acreage;
		return acreage;
	}
}
class Square extends Shape{
	double length,width;
	Square(double length,double width){
		this.length = length;
		this.width = width;
	}
	public double acreage(){
		acreage = length * width;
		this.acreage = acreage;
		return acreage;
	}
}
class Circular extends Shape{
	double radius;
	Circular(double radius){
		this.radius = radius;
	}
	public double acreage(){
		acreage = radius * radius * 3.14;
		this.acreage = acreage;
		return acreage;
	}
}
public class TestShape{
	public static void main(String args []){
		Triangle t = new Triangle(10,10);
		System.out.println("三角形的面积为："+t.acreage());
		Square s = new Square(10,10);
		System.out.println("正方形的面积为："+s.acreage());
		Circular c = new Circular(10);
		System.out.println("圆形的面积为："+c.acreage());
	}
}