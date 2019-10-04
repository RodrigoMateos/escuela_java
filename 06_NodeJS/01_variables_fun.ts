var hola = "Hola";
console.log(hola+hola);
function holaFuncrion(hola){
	console.log(hola+" hulio");
}
holaFuncrion("adios");

let variableNum:number;
variableNum=100;
//variableNum="jjj";
console.log(variableNum);

let miUnion: number | boolean | string;
miUnion=true;
miUnion=3;
miUnion="Soy un string campeon";

interface Tiempo{
	dia:number;
	mes:number;
	anio:number;
};

let miCumple : Tiempo={dia:7, mes:7, anio:1993};
console.log("Cumple el "+miCumple.dia+" del "+miCumple.mes);

//any es un tipo que indica que puede ser de cualquier tipo
function concatenar(texto:String, texto2:any){
	console.log("Concatenando: "+texto+texto2);
}

concatenar("Total, ","que recibe una cosa ");
concatenar("u otra como: ",200);