package clases;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		metodos obj=new metodos();
		arreglos arre = new arreglos();
		ArrayList numeros = new ArrayList();

		int opc=0;
		int entrada, entrada2, entrada3, entrada4;
		
		do {
			System.out.println("1.-Verificar Acreditación  7.-Potencia");
			System.out.println("2.-Verificar Salario	   8.-Numero Primo");
			System.out.println("3.-Numero medio            9.-Arreglos");
			System.out.println("4.-Horas");
			System.out.println("5.-Invertir Numero");
			System.out.println("6.-Adivinar");
			System.out.print("-> ");
			opc=leer.nextInt();
			
			switch(opc) {
				case 1:
					System.out.print("Ingresa tu calificación: ");
					entrada=leer.nextInt();
					System.out.print("Ingresa tu total de asistencias: ");
					entrada2=leer.nextInt();
					System.out.println("Pasaste: "+obj.acreditar(entrada, entrada2));
				break;
				case 2:
					System.out.println("Horas Trabjadas: ");
					entrada=leer.nextInt();
					System.out.println("Pagor por hora: ");
					entrada2=leer.nextInt();
					
					if(entrada<40)
						System.out.println("Total a pagar: "+ obj.salario(entrada, entrada2));
					else
						System.out.println("Tienes un bono por horas extras: "+ obj.salario(entrada, entrada2));
				break;
				case 3:
					System.out.print("Primer numero: ");
					entrada=leer.nextInt();
					System.out.print("Segundo numero: ");
					entrada2=leer.nextInt();
					System.out.print("Tercer numero: ");
					entrada3=leer.nextInt();
					obj.medio(entrada, entrada2, entrada3);
				break;
				case 4:
					System.out.println("Ingrese horas, minutos y segundos");
					entrada=leer.nextInt();
					entrada2=leer.nextInt();
					entrada3=leer.nextInt();
					System.out.println("Incresa el incremento: ");
					entrada4=leer.nextInt();
					obj.hora(entrada, entrada2, entrada3, entrada4);
				break;
				case 5:
					System.out.print("Ingrese un numero de 4 digitos: ");
					entrada=leer.nextInt();
					if(entrada>4) System.out.println(""+obj.invertirNumero(entrada));
					else System.out.println("Tu entrada debe de ser de 4 digitos");
				break;
				case 6:
					System.out.print("Ingresa un numero:");
					entrada=leer.nextInt();
				
					do {
						
						System.out.print("Adivina el numero: ");
						entrada2=leer.nextInt();
						System.out.println(""+obj.adivinar(entrada, entrada2));
						
					}while(obj.adivinar(entrada, entrada2) != "Adivinaste el numero");
				break;
				case 7:
					System.out.print("Ingrese una base: ");
					entrada=leer.nextInt();
					System.out.print("Ingrese un exponente: ");
					entrada2=leer.nextInt();
					System.out.println("El resultado es: "+ obj.potencia(entrada, entrada2));
				break;
				case 8:
					System.out.print("Ingresa un numero: ");
					entrada=leer.nextInt();
					System.out.println(""+obj.primo(entrada));
				break;
				case 9:
					
					do
					{
						System.out.println("1.-Sumar arreglos");
						System.out.println("2.-Media de un arreglo");
						System.out.println("3.-Meses");
						System.out.println("4.-Fibonacci");
						System.out.println("5.-Recorrer Arrego");
						System.out.println("0.-Salir");
						opc=leer.nextInt();
						
						switch(opc) {
							case 1:
								System.out.print("Tamaño de los arreglos");
								entrada=leer.nextInt();
								int[] random = new int[entrada];
								int[] random2 = new int[entrada];
								int[] resp = new int[entrada];
								
								for(int i=0; i<random.length; i++){
									random[i] = arre.generar();
									random2[i] = arre.generar();
								}
								
								resp = arre.sumaArreglo(random, random2);
								for(int i=0; i<random.length; i++)
								System.out.print("["+random[i]+"]");
								System.out.println();
								for(int i=0; i<random.length; i++)
								System.out.print("["+random2[i]+"]");
								System.out.println();
								for(int i=0; i<random.length; i++)
								System.out.print("["+resp[i]+"]");
								System.out.println("");
							break;
							case 2:
								do{
									System.out.print("Ingrese un numero a la lista: ");
									entrada=leer.nextInt();
									if(entrada>0)numeros.add(entrada);
								}while(entrada>0);
								Iterator it = numeros.iterator();
								while(it.hasNext()) {
									System.out.println(it.next());
								}
								 double media=arre.media(numeros);
								System.out.println("La media del arreglo es: "+media);
							break;
							case 3:
								int[] aleatorios = new int[12];
								String[] meses = new String[12];
								
								for(int i=0; i<aleatorios.length; i++)  aleatorios[i]=arre.generar();
								
								meses= arre.mes(aleatorios);
								for(int i=0; i<aleatorios.length; i++) {
									System.out.println(""+aleatorios[i]+"->"+""+meses[i]);
								}
							break;
							case 4:
								System.out.print("Tamaño de la serie: ");
								entrada=leer.nextInt();
								long[] array = new long[entrada];
								array=arre.fibo(entrada);
								
								for(long _num: array) System.out.print(" "+_num);
								System.out.println();
							break;
							case 5:
								int[] arreglo = new int[10];
								int[] arreglo2 = new int[10];
								
								for(int i=0; i<10; i++) arreglo[i]=i;
								
								for(int i=0; i<10; i++)System.out.print(" "+ arreglo[i]);
								System.out.println("");
								arreglo2=arre.recorrer(arreglo);
								for(int i=0; i<10; i++) System.out.print(" "+arreglo2[i]);
							break;
							}

					}while(opc!=0);		
				break;
			}
		}while(opc!=0);
		

	}

}
	