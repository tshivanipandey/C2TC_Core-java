package mypro;

class Box
{
	float width;
	float height;
	float depth;
	
	float calcvol()
	{
		return width*height*depth;
	}
	
}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box box1=new Box();
box1.width=4.2f;
box1.height=7.1f;
box1.depth=2.4f;
float vol=box1.calcvol();

System.out.println("volume of Box1 is " + vol);

Box box2=new Box();
box2.width=1.2f;
box2.height=2.1f;
box2.depth=2.2f;
float vol1=box2.calcvol();

System.out.println("volume of Box2 is " + vol1);

	}

}
