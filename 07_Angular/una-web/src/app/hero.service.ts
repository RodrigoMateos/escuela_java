import { Injectable } from '@angular/core';
import {Hero} from './model/hero';
import {HEROES} from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  constructor(private messageService: MessageService) { }

  getHeroes(): Hero[] {
    this.messageService.add("HeroService: capturando heroes");
    return HEROES.slice();
  }

  getHero(id:number): Hero{
    let hero = HEROES.find((hero) => {return hero.id === id})
    return hero;
  }

  addHeroes(heroe:Hero): Hero[]{
    heroe.id=HEROES.length+1;
    HEROES.push(heroe);
    this.messageService.add("{{heroe.name}} creado correctamente");
    return HEROES;
  }
}