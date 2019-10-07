import { Component, OnInit } from '@angular/core';
import { Hero } from '../model/hero';
import {HeroService} from '../hero.service';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-new-hero',
  templateUrl: './new-hero.component.html',
  styleUrls: ['./new-hero.component.css']
})
export class NewHeroComponent implements OnInit {
  hero:Hero;
  constructor(private heroServices: HeroService) { }
  
  ngOnInit() {
    this.hero = new Hero()
  }
  
  addHero(): void{
    this.heroServices.addHeroes(this.hero);
    this.hero=new Hero();
  }
  
}