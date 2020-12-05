package pizzeria;

import java.util.Scanner;

public class Menu 
{
	public void menu()
	{
		/*En esta parte creamos los objetos para cada una de las diferentes pizzas que se manejan para posteriormente llamarlos dentro del c�digo.*/
		Pizza_Chicago chicago = new Pizza_Chicago();
		Pizza_Hawaii hawaii = new Pizza_Hawaii();
		Pizza_Clasica clasica = new Pizza_Clasica();
		Pizza_Mexicana mexicana = new Pizza_Mexicana();
		
		Scanner texto = new Scanner(System.in);
		String nueva_orden, pizza;
		
		do 
		{	
			do
			{
				/*Aqu� tenemos el men� que se le desplegar� al usuario durante la ejecuci�n.*/
				System.out.println("Bienvenido a La Gran Pizza \n");
				System.out.println("�Tenemos una gran selecci�n de pizzas para todos los gustos! \n");
				System.out.println("MEN� \n"
						+ "Pizza Chicago (Carne Molida, Salami y Aceitunas) \n"
						+ "Pizza Hawaii (Pi�a, Jam�n y Cereza) \n"
						+ "Pizza Mexicana (Jalape�os, Chorizo y Tocino) \n"
						+ "Pizza Clasica (Peperonni y Champi�ones) \n"
						);
				
				System.out.println("Ingresa el nombre de la pizza que deseas ordenar \n"
						+ "Nota: solo teclear una de las siguientes palabras: chicago / hawaii / clasica / mexicana.");
				
				/*Usando la clase Scanner en esta parte leemos por medio del teclado la orden que se va a procesar.*/
				pizza = texto.nextLine();
				
				/*Con el siguiente if validamos que el usuario haya ingresado correctamente la orden y en caso de que no sea as� el do-while se encargar� de volver a 
				 * mostrar el men� al usuario para que vuelva a ingresar su orden.*/
				if(! pizza.equalsIgnoreCase("chicago") && ! pizza.equalsIgnoreCase("hawaii") && ! pizza.equalsIgnoreCase("clasica") && ! pizza.equalsIgnoreCase("mexicana") && ! pizza.contains("[0-9]"))
				{
					System.out.println("El texto ingresado no es correcto, por favor int�ntelo nuevamente. \n");
				}
			}
			while(! pizza.equalsIgnoreCase("chicago") && ! pizza.equalsIgnoreCase("hawaii") && ! pizza.equalsIgnoreCase("clasica") && ! pizza.equalsIgnoreCase("mexicana"));
			
			/*En esta parte se va imprimiendo en patalla el estado de la orden con un delay al momento de la ejecuci�n.*/
			System.out.println("En pedido...");
			delay(1000l);
			
			System.out.println("En armado...");
			
			/*Aqu� usamos los objetos creados anteriormente de las clases de pizzas para mandar a llamar el m�todo correspondiente para imprimir en pantalla los ingredientes
			 * de la pizza ordenada por el usuario.*/
			if(pizza.equalsIgnoreCase("chicago"))
			{
				chicago.pizza_chicago();
			}
			else if(pizza.equalsIgnoreCase("hawaii"))
			{
				hawaii.pizza_hawaii();
			}
			else if(pizza.equalsIgnoreCase("clasica"))
			{
				clasica.pizza_clasica();
			}
			else if(pizza.equalsIgnoreCase("mexicana"))
			{
				mexicana.pizza_mexicana();
			}
			
			/*En esta parte se va imprimiendo en patalla el estado de la orden con un delay al momento de la ejecuci�n.*/
			delay(1000l);
			
			System.out.println("En horno...");
			delay(1000l);
			
			System.out.println("En empacado...");
			delay(1000l);
			
			System.out.println("Entregada al cliente...");
			delay(1000l);
			
			/*Con este do-while y el if dentro de el comprobamos que el usuario nos diga de forma precisa si desea realizar otra 
			 *orden o de lo contrario terminar el programa*/
			do
			{
				System.out.println("�Desea realizar otra orden?");
				nueva_orden = texto.nextLine();
				
				if(! nueva_orden.equalsIgnoreCase("si") && ! nueva_orden.equalsIgnoreCase("no") && ! pizza.contains("[0-9]"))
				{
					System.out.println("El texto ingresado no es correcto, por favor solo ingresa un -si- o -no-");
				}
			}
			while(! nueva_orden.equalsIgnoreCase("si") && ! nueva_orden.equalsIgnoreCase("no"));
		}
		while(nueva_orden.equalsIgnoreCase("si"));
		texto.close();
	}
	
	/*Este m�todo nos permite hacer el "delay" que se muestra en tiempo de ejecuci�n al mostrar el estado de la orden*/
	private void delay(long milis)
	{
		try
		{
			Thread.sleep(milis);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
