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
    //Enviamos el nuevo usuario al servidor para que se dé de alta
    //this.mensaje.add("Usuario {user.name} añadido correctamente");
    return this.httpCli.post(this.urlApiRest,user,this.options); 
  }

  updateUser(user:User): Observable<any>{
    this.mensaje.add("Usuario {{user.name}} modificado correctamente");
    return this.httpCli.put(this.urlApiRest,user,this.options); 
  }

  deleteUser(user:User): Observable<any>{
    this.mensaje.add("Usuario {{user.name}} eliminado correctamente");
    this.options['body'] = {
      nUser: user
    };
   return this.httpCli.delete(this.urlApiRest,this.options);
  }
}