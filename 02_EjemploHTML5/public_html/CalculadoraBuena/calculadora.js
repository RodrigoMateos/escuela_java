class Calculadora {
    constructor() {
        //this.result = document.getElementById("resultado");
        this.result = $("#resultado");
        //this.anterior = document.getElementById("anterior");
        this.anterior = $("#anterior");
        this.mem = 0;
        this.operador = "";
        this.nuevoNum = false;
    }
    numeroPulsado(eventObj) {
        if (this.nuevoNum) {
            //this.result.value = "0";
            this.result.val("0");
            this.nuevoNum = false;
        }
        let valor = eventObj.currentTarget.innerHTML;
        // alert("Pulsado " + valor);
        if (valor ==="+/-") {
            this.result.val("" + (- (parseFloat(calculadora.result.val()))));
        } else if (valor === "." ) {
            if ( ! this.result.val().includes(".")) 
                this.result.val(this.result.val() + valor);
        } else {
            this.result.val(this.result.val() + valor);
            this.result.val(parseFloat(this.result.val()));
        }
    }
    operadorPulsado(evObj) {
        let operadorActual = evObj.currentTarget.innerHTML;        
        
        if (this.operador !== "" || operadorActual === "=") {
            this.calcular();
        }
        this.mem = parseFloat(this.result.val());
        // Subir a caja texto valor anterior y operador
        
        if (this.operador !== "=" && operadorActual !== "=") {
            this.anterior.val(`${this.mem} ${operadorActual}`);
            this.result.val("0");
            this.operador = operadorActual;
        } else {
            this.operador = "";
            // this.result.anterior.value = this.result.value
        }
        this.nuevoNum = true;
    }
    calcular() {        
        if ( this.operador !== "" && this.operador !== "=") {
            let valActual = parseFloat(this.result.val());
            let resultado = eval(this.mem.toString() + this.operador + valActual);
            this.result.val(resultado);
            $("#anterior").css("backgound-color", "green");
        }
    }
};
let calculadora = null;


let inizializacion = function() {
    calculadora = new Calculadora();
    /*
    let botones = document.getElementsByClassName("num"); // array de botones
    for (let boton of botones) {
        boton.addEventListener("click", (evtObj) => { 
            calculadora.numeroPulsado(evtObj); 
        });
    }
    */
   
    //Todos los elementos de la clase .num
    $(".num").click((evtObj) => { 
            calculadora.numeroPulsado(evtObj)});
    /*        
    let botonesOp = document.getElementsByClassName("oper"); // array de botones
    for (let btnOp of botonesOp) {
        btnOp.onclick = (evObj) => {
            calculadora.operadorPulsado(evObj);
        };
    }
    */
    $(".oper").click((evObj) => {
            calculadora.operadorPulsado(evObj);
        });
};

//jQuery(document).ready(inizializacion); //Tambien podemos poner como parametro la funcion call back
$(document).ready(inizializacion); //Tambien podemos poner como parametro la funcion call back
