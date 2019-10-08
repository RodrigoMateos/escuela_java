import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HeroRestService {

  urlApiRest= "http://localhost:8084/CRUD_Vista_JSTL/api/heroes";
  options={headers: new HttpHeaders({'Content-Type': "application/json"})};

  constructor(private httpCli: HttpClient) { }
/*
  getHeroes(): Observable<Hero[]> {
    //return this.arrayHeroes;
    return of(this.arrayHeroes);
  }
*/

  getHeroes(): Observable<Hero[]>{
    return this.httpCli.get<Hero[]>(this.urlApiRest);
  }

  addHeroes(heroe:Hero): Observable<any>{
    //Enviamos el nuevo heroe al servidor para que se dé de alta
    alert("prueba");
    return this.httpCli.post(this.urlApiRest,heroe,this.options); 
  }
}