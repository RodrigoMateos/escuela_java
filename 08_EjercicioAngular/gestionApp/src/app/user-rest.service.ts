import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './model/user';
import { MensajesService } from './mensajes.service';

@Injectable({
  providedIn: 'root'
})
export class UserRestService {

  urlApiRest= "http://localhost:8084/CRUD_Vista_JSTL/api/users";
  options={headers: new HttpHeaders({'Content-Type': "application/json"})};


  constructor(private httpCli: HttpClient, private mensaje: MensajesService) { }

  getUser(): Observable<User[]>{
    return this.httpCli.get<User[]>(this.urlApiRest);
  }

  addUser(user:User): Observable<any>{
    return this.httpCli.post(this.urlApiRest,user,this.options); 
  }

  updateUser(user:User): Observable<any>{
    return this.httpCli.put(this.urlApiRest,user,this.options); 
  }

  deleteUser(user:User): Observable<any>{
    let optionsDelete={headers: new HttpHeaders({'Content-Type': "application/json"}),body: user};
   return this.httpCli.delete(this.urlApiRest,optionsDelete);
  }
}