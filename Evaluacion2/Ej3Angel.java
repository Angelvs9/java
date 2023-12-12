import java.util.Random;
public class Ej3Angel {
	
	public static String numNoAparecen(int [] vec,String n){
		String numeros="";
		boolean prueba=false;
		for(int i=1;i<50;i++){
			prueba=false;
			for (int j = 0; j < vec.length; j++){
				if (vec[j]==i)
					prueba=true;	
			}
			
		if (prueba==false)
		{
			numeros=numeros+i+" ";
		}
			
		}
	
		return numeros;
	}

	public static void ordenarVector(int [] vec){
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
	Random rnd=new Random();	
	int [] vec= new int[20];
	String n="";
	
	
	int max,min;
	max=50;
	min=1;
	
	System.out.println("desordenado");
	for (int i = 0; i < vec.length; i++)
		vec[i]=rnd.nextInt(max)+min;
		
	for (int i = 0; i < vec.length; i++)
		System.out.print(vec[i]+" ");
		
	System.out.println("\nordenado");
	ordenarVector(vec);
	
	for (int i = 0; i < vec.length; i++)
		System.out.print(vec[i]+" ");
		System.out.println("\n");
	System.out.println("numeros que no aparecen:\n");
	
		n=numNoAparecen(vec,n);
		System.out.println(n);
	}

	
}

