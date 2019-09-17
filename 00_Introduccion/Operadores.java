class Operadores{
	
	public static void main(String[] argumentos){
	
		/*
		if(argumentos[0].equals("aa"))
			System.out.println("Quieres dos AA");
		else
			System.out.println("Quieres otra cosa");
		*/
		//Operador Ternario
		System.out.println(5!=5 ? "Son iguales" : "Son distintos");
		
//		System.out.println(argumentos[0].equals("aa") ? "Quieres dos AA" : "Quieres otra cosa");
		
		System.out.println(argumentos[0].equals("aa") ? (5==6?"Si y es 5":"Si y no es 5") : "Quieres otra cosa");


		//OPERADORES BINARIOS
		byte res=113 & 199;
		System.out.println(res);
		
	}
	
}