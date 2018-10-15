package clases;

public class metodos {
	
	public boolean acreditar(int asistencia, int calificacion)
	{
		
		final int totalAsistencia = 70;
		boolean paso=false;
		if(asistencia>=totalAsistencia*.8 && calificacion>=60)
			paso=true;
		
		return paso;
	}
	public double salario(int horas, float costoHora)
	{
		double totalPagar=0;
		
		if(horas>=1 && horas<=40)
			totalPagar=horas*costoHora;
		else{
			int horasExtras=horas-40;
			double extra= horasExtras*(costoHora*1.5);
			totalPagar=(costoHora*40)+extra;
		}
		
		return totalPagar;
	}
	
	public void medio(int numero1, int numero2, int numero3)
	{
		
		if((numero2>numero1 && numero2<numero3)||(numero2<numero1 && numero2>numero3))
			System.out.println("el numoer de a medias es "+ numero2);
		else if((numero3>numero2 && numero3<numero1)||(numero3<numero2 && numero3>numero1))
			System.out.println("El numero de a medias es "+ numero3);
		else if((numero1>numero3 && numero1<numero2)||numero1<numero3 && numero1>numero2)
			System.out.println("El numero de a media es: "+ numero1);
			
	}
	public void hora(int hora, int minuto, int segundo, int incremento) {

		segundo+=incremento;
		if(segundo>60) {
			
			minuto+=segundo/60;
			segundo=segundo%60;
			if(minuto>=60){
				hora+=minuto/60;
				minuto=minuto%60;
				
				if(hora>=24){
					hora=hora%24;
					System.out.println(""+hora+":"+minuto+":"+segundo);
				}
			}
			else
				System.out.println(""+hora+":"+minuto+":"+segundo);
				
		}
		else
			System.out.println(""+hora+":"+minuto+":"+segundo);
	}	
	public int invertirNumero(int numero) {
		
		int nuevoNumero=0;
		int n=1,n2=1,n3=1,n4=1;
		
		if(numero>1000 && numero<10000) 
			n = numero%10;
			n2 = (numero/10)%10;
			n3 = (numero/100)%10;
			n4 =numero/1000;
			
			nuevoNumero=(n*1000)+(n2*100)+(n3*10)+n4;
		
		return nuevoNumero;
	}
	public String adivinar(int numero, int numero2)
	{
		
		String respuesta="";
		
		if(numero2==numero) respuesta="Adivinaste el numero";
		else if(numero2>numero) respuesta = "El numero que buscas es menor";
		else if(numero2<numero) respuesta = "El numero que buescas es mayor";
		
		return respuesta;
	}
	
	public int potencia(int base, int exponente)
	{
		int res =1;
		for(int i=0; i<exponente; i++) res*=base;
			
		return res;
	}
	
	public String primo(int numero) {
		
		int divisor=2;
		String respuesta="";
		do{
			if((numero/divisor)<numero && numero%divisor!=0) respuesta="Es primo";
			else respuesta="No es primo";
			divisor++;
		}
		while(divisor<numero);
	
		return respuesta;
	}
	
}
