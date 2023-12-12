/*
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class utilidades {
	
	public static boolean esPositivo(int numero){
		boolean positivo=false;
		if (numero>0)
		{
			positivo=true;
		}else
			positivo=false;
			
		return positivo;
	}
	
	public static String rangoNumeros(int x,int y){
		
		int rango1=x;
		int rango2=y;
		String resultado="";
		for (int i = rango1; i < rango2; i++)
		{
			resultado=resultado+i+" ";
		}
		return resultado;
		
	}
	
	public static boolean esPrimo(int x){
		//el primer numero que pones por escaner en la longitud del array
		boolean primo=true;

		for (int i = 2; i < x; i++)
		{
			if(x%i==0)
				primo=false;
		}
	
		return primo;

	}
	public static void ordenarVector(int [] vec){
		//de menor a mayor
		int z=1;
		boolean cambio=true;
		int aux;
		while(z<vec.length && cambio){
			cambio=false;
			for(int j=0;j<vec.length-z;j++){
				if (vec[j]> vec[j+1])
				{
					aux=vec[j];
					vec[j]=vec[j+1];
					vec[j+1]=aux;
					cambio=true;
				}
			}
			z++;
		}

	}
	
	

	public static void main (String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		x=sc.nextInt();
		System.out.println("Introduce otro numero");
		y=sc.nextInt();
		System.out.println("primer numero: "+ esPositivo(x));
		System.out.println("segundo numero: "+ esPositivo(y));
		System.out.println("los numeros entre esos 2 son: "+rangoNumeros(x,y));
		System.out.println();
		System.out.println();
		
		System.out.println("es primo: "+ esPrimo(x));
		
	}
}

