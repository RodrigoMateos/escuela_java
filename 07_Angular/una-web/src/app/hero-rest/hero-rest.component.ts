import { Component, OnInit } from '@angular/core';
import { HeroRestService } from '../hero-rest.service';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-hero-rest',
  template: `<h2>LISTADO HEROES REST</h2>
  <ul class="ul-heroes">
    <li *ngFor="let hero of heroesRecibidos"> {{hero.id}} - {{hero.name}} </li>
  </ul>
  <div><input [(ngModel)]="id" placeholder="Id"/>
  <input [(ngModel)]="nombre" placeholder="Nombre"/>
  <input type="button" (click)="enviar()" value="ENVIAR"/></div>
  `
})
export class HeroRestComponent implements OnInit {
  heroesRecibidos: Hero[];
  id: string; nombre:string;

  constructor(private heroRestService: HeroRestService) { }
  enviar(){
    let nuevoHeroe = new Hero();
    nuevoHeroe.id = parseInt(this.id);
    nuevoHeroe.name=this.nombre;
    this.heroRestService.addHeroes(nuevoHeroe).subscribe((obj) =>{
      this.ngOnInit();
    });
  }
  ngOnInit() { 
    let observableArrayHeroes = this.heroRestService.getHeroes();

    // La ejecucion continua hasta que el array es recibido.
    // Para recibirlo asincronamente nos subscribimos al Observable
    observableArrayHeroes.subscribe( heroesRec => this.heroesRecibidos = heroesRec );
/*
    //OTRA FORMA DE HACER LA FUNCION FLECHA
    let functionObservableArrayHeroes = (heroesRec) => {
      this.heroesRecibidos = heroesRec
    };
    observableArrayHeroes.subscribe( functionObservableArrayHeroes );
*/
  }

}
