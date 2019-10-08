import { Injectable } from '@angular/core';
import {User} from './model/user';
import { MensajesService } from './mensajes.service';
import { USERS } from './model/array-users';

@Injectable({
  providedIn: 'root'
})
export class userService {

  constructor(private messageService: MensajesService) { }

  getUSERS(): User[] {
    this.messageService.add("userService: capturando USERS");
    return USERS;
  }

  getUser(id:number): User{
    let user = USERS.find((user) => {return user.id === id})
    return user;
  }

  addUSERS(user:User): User[]{
    user.id=USERS.length+1;
    USERS.push(user);
    this.messageService.add("{{user.name}} creado correctamente");
    return USERS;
  }
}