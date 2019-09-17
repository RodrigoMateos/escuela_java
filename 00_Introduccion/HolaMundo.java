class HolaMundo{
	public static void main (String[] args){
		
		String nombre="Rodrigo";
		Byte unByte = 127;
		int numeroEntero=2000000000;
		Long enteroGrande = 12345256654789L;
		float decimal=1.22615563F;
		double doble=1.22615563546541989;
		char caracter = 65;	//A en codigo ASCII
		char caracter2='z';
		char[] texto = {'a','b','c','d','e','f','g','h'};
		
		{ //BLOQUES
		
			int i=3;
			System.out.println(i*9);
		
		}
		
//		System.out.println("Byte: Es un tipo que va de -"+unByte+" a "+unByte);
//		System.out.println("Enetero: Es un tipo que adminte numeros de -"+numeroEntero+" a "+numeroEntero);
//		System.out.println("Long: Igual que entero pero mucho mas largo, Ejemplo: "+enteroGrande);
//		System.out.println("Float: Como el entero, pero admite los decimales hace truncamiento si se supera el limite de bytes, Ejemplo: "+decimal);
//		System.out.println("Double: Como el float, pero es mas grande (16 numeros), Ejemplo: "+doble);
//		System.out.println("Char: Caracter unico: ["+caracter+"-Z] [a-"+caracter2+"]");
		
		int i=0;
		for(char c:texto){
				System.out.print(texto[i++]);
		}


	}
}