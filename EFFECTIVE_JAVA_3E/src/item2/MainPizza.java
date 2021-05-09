package item2;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import item2.NyPizza.Size;
import item2.Pizza.Topping;

public class MainPizza
{
	public static void main(String[] args)
	{
		NyPizza pizza = 
				new NyPizza.Builder(Size.SMALL)
				.addTopping(Topping.SAUSAGE).addTopping(Topping.ONION)
				.build();
		
		System.out.println(
				ReflectionToStringBuilder.toString(pizza)
				);
	}
}
