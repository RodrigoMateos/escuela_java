import { Component, OnInit } from '@angular/core';
import { HeroService } from '../hero.service';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  heroes: Hero[];
  constructor(private heroSrv:HeroService) { }

  ngOnInit() {
    //Cogemos los 4 primeros elementos del array
    this.heroes = this.heroSrv.getHeroes().slice(0, 4);
  }

}
