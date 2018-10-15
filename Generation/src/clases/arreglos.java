package clases;

import java.util.ArrayList;
import java.util.Random;

public class arreglos {
	
public int generar(){
		
		Random semilla = new Random(System.nanoTime());
		int numero= (int)(Math.random()*12+1);		
		return numero;
	}
	

	
	public int[] sumaArreglo(int[] n1, int[] n2) {
		
		int[] n3 = new int[n1.length];
		for(int i=0; i<n3.length; i++)
			n3[i]=n1[i]+n2[i];
		
		return n3;
	}
	
	public double media(ArrayList arreglo){
		 
		double  media=0;
		int suma=0;
		
		for(int i=0; i<arreglo.size(); i++){
			suma+=(int)arreglo.get(i);
			media=suma/arreglo.size();
		}
			
		return media;
	}

	
	public String[] mes(int[] numero) {
		
		String[] meses = {"Nada", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
		"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};	
		String[] muestra = new String[numero.length];
		int aux=0;
		
		for(int i=0; i<numero.length; i++){
			
			aux = numero[i];
			muestra[i]=meses[aux];
		}
		
		return muestra;
	}
	
	public long[] fibo(int numero) {
		
		long[] arreglo = new long[numero];
		
		if(numero>1){
			arreglo[0]=0;
			arreglo[1]=1;
			
			for(int i=2; i<numero; i++) arreglo[i] = arreglo[i-1]+arreglo[i-2];
		}
		else if(numero==1) arreglo[0]=0;
		
		return arreglo;

	}
	
	public int[] recorrer(int[] arreglo) {
		
		int[] recorrido = new int[arreglo.length];
		int aux=0;
		int posFinal;
		int posIn;
		
		posFinal=arreglo[9];
		posIn=arreglo[0];
		
		for(int i=1; i<arreglo.length; i++) recorrido[i]=arreglo[i-1];
				
	
		recorrido[0]=arreglo[arreglo.length-1];
		
		return recorrido;
		
	}

}
