import { Injectable } from '@angular/core';
import {Hero} from './model/hero';
import {HEROES} from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  constructor(private messageService: MessageService) { }
  hero2:Hero=new Hero();

  getHeroes(): Hero[] {
    this.messageService.add("HeroService: capturando heroes");
    return HEROES;
  }
  addHeroes(heroe:Hero): Hero[]{
    heroe.id=HEROES.length+1;
    HEROES.push(heroe);
    // this.hero2=new Hero();
    this.messageService.add("{{heroe.name}} creado correctamente");
    return HEROES;
  }
}