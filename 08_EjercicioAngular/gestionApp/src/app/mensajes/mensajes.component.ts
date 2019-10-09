import { Component, OnInit } from '@angular/core';
import { MensajesService } from '../mensajes.service';

@Component({
  selector: 'app-mensajes',
  templateUrl: './mensajes.component.html',
  styleUrls: ['./mensajes.component.css']
})
export class MensajesComponent implements OnInit {

  mensajes: string[];
  constructor(private servicioMensaje: MensajesService) { }

  ngOnInit() {
    this.mensajes=[];
  }

  addM(){
    this.servicioMensaje.add("mensaje de prueba");
  }

}
