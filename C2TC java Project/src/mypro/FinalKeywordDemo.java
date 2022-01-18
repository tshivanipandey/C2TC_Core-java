package mypro;
class car
{
 final int max_speed=120; // add final keyword 
void controlSpeed()
{
//max_Speed=180; //final variable can be changed . will give comiiple time error 

System.out.println("Max speed of the car is " + max_speed);
}
}


public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car obj=new car();
obj.controlSpeed();
	}

}
