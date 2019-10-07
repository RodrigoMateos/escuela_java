import { Component, OnInit } from '@angular/core';
import { HEROES } from '../model/array-heros';
import { Hero } from '../model/hero';

@Component({ 
  selector: 'app-heros-list',
  templateUrl: './heros-list.component.html',
  styleUrls: ['./heros-list.component.css']
})
export class HerosListComponent implements OnInit {
  heroes: Hero[];
  constructor() { }

  ngOnInit() {
    this.heroes = HEROES;
  }

}
