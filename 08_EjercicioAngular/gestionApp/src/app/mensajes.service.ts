import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MensajesService {

  mensajes: String[] = [];

  add(message: string): void{
    this.mensajes.push(message);
  } 

  clear(): void{
    this.mensajes=[];
  }
}
