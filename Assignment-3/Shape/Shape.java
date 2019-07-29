abstract class Shape{
	static final float PI = 3.14f;
	abstract void area();
}

class Circle extends Shape{
	float radius;
	Circle(){
		radius = 1f;
	}
	Circle(int radius){
		this.radius = radius;
	}
	void area(){
		float area = PI * radius * radius;
		System.out.println("Area of circle: " + area);
	}
}

class Rectangle extends Shape{
	float height,width;
	Rectangle(){
		height = 1f; width = 1f;
	}
	Rectangle(float height,float width){
		this.height = height;
		this.width = width;
	}
	void area(){
		float area = height * width;
		System.out.println("Area of rectangle: " + area);
	}
}

class Triangle extends Shape{
	float height,base;
	Triangle(){
		height = 1f;
		base = 1f;
	}
	Triangle(float base,float height){
		this.height = height;
		this.base = base;
	}
	void area(){
		float area = (1f/2f) * height * base;
		System.out.println("Area of triangle: " + area);
	}
}

class shapeImplementation{
	public static void main(String args[]){
		Triangle t = new Triangle();
		t.area();
		Circle c = new Circle();
		c.area();
		Rectangle r = new  Rectangle();
		r.area();
	}
}