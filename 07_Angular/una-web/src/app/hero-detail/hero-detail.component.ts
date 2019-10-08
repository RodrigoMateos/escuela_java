import { Component, OnInit, Input } from '@angular/core';
import { Hero } from '../model/hero';
//import para que coja la ruta
import {Location} from '@angular/common';
import {ActivatedRoute} from '@angular/router';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css']
})
export class HeroDetailComponent implements OnInit {

  // Esta propiedad viene de algun componente externo
  @Input() hero: Hero;
  constructor(private route: ActivatedRoute,
              private heroSrv: HeroService,
              private location: Location) { }

  ngOnInit() {
    this.getHero();
  }

  getHero():void{
    //Cogemos el ide del parametros de la ruta /detail/:id
    const id = this.route.snapshot.paramMap.get('id');
    this.hero=this.heroSrv.getHero(parseInt(id));
  }
}