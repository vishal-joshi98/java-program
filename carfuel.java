/*write an program to define  a class named car with an attribute  fuel and constants mileges and max fuel.provide the following method
public int addfuel(int ltr)throws FuelTankFullException
public void travel(int km) throws NotSuffcientFuelException
such that if the added fuel(ltr) is gretr than max fuel then a user defined exception FuelTankFullException is thrown and when the fuel is not sufficient to travel km distance then NotSufficientFuelException is thrown
in main class create a car object . invoke the addFuel and travel methods. in travel method handle the NotSufficientFuelException such that it asks the user to add the fuel.
*/
import java.util.*;
class car
{
	float fuel=0;
	final int  milege=15;
	int maxfuel=50;
	public int addFuel(float ltr)throws FuelTankFullException
	{
		if(ltr>maxfuel)
		{
			throw new FuelTankFullException("tank is full");
		}
		else
		{
			fuel=ltr;
		}

	}
	public void travel(float km)throws NotSufficientFuelException
	{
             float k=fuel/km;
             if(k<=0)
             {
             	throw new NotSufficientFuelException("fuel is not sufficient");
             }
	}
	void n(float f)throws FuelTankFullException
	{    float ltr=f;
		addFuel( ltr);
	//	travel();
	}
	void m(float fuel)
	{    float f=fuel;
		try{
			n(f);
		}
		catch (Exception e)
		{
			System.out.println("tank is full");
		}
	}
	void p(float k)
	{float km=k;
      travel( km);
	}
	void q(float km)
	{    float k=km;
		try
		{
			p(k);
		}
		catch(Exception e)
		{
         System.out.println("fuel is not sufficient");
		}
	}
		
	
}

class carinformation
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the fuel and distance");
		float fuel=input.nextInt();
		float distance=input.nextInt();
		car obj1=new car();
		obj1.m(fuel);
		obj1.q(distance);

	}
}
