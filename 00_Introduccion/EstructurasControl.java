class EstructuraControl{
	public static void main (String[] args){
		/*
		for(int i=0; i< args.length;i++)
			System.out.println("Arg "+i+": "+args[i]);
		*/
		
		/*
		int i=0;
		for(; i< args.length;){
			System.out.println("Arg "+i+": "+args[i]);
			i++;
		}
		*/
		
		/*
		//BUCLE INFINITO
		for(;;)
			System.out.println("Arg "+i+": "+args[i]);
		*/
		
		/*
		int i=0;
		while (i<args.length){
			System.out.println("Arg "+i+": "+args[i]);
			i++;
		}
		*/
		
		/*
		do{
			System.out.println("prueba");
		}while(false);
		*/
		
		/*
		boolean siEjecutar = 5<3 && 20==20;

		if(siEjecutar)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");	
		*/
		
		int valor=1;
		switch(valor){
			case 0:
				System.out.println("Valor 0");
				break;
			case 1:
			case 2: //Si es 1, esta instruccion se la salta
				System.out.println("Valor 1 o 2");
				break;
			case 3:
				System.out.println("Valor 3");
				break;	
			default:
				System.out.println("Valor Indeterminado");
				break;				
		}
		
/*	
		if(args.length<1)
			System.out.println("No tiene ningun elemento");
		else if(args.length==1)
			System.out.println("Tiene un elemento");
		else
			System.out.println("Tiene mas de un elemento");
*/

	}
}