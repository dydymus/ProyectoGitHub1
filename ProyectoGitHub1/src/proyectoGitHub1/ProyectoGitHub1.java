package proyectoGitHub1;

public class ProyectoGitHub1 
{

	public static void main(String[] args) 
	{
		int contador=0;
		System.out.println("Proyecto GITHUB 1");
		
		System.out.println("enviado por Nico");
		//Nuevo añadido
		for(int i =0; i <5; i++)
		{
			contador +=(i+1);
			if(contador<5)
			{
				System.out.println("mi valor es menor de cinco");
			}
			else {System.out.println("mi valor es mayor o igual de cinco");}
		}

	}

}
