import { Component, OnInit } from '@angular/core';
import { UserRestService } from '../user-rest.service';
import { User } from '../model/user';
import { MensajesService } from '../mensajes.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  constructor(private userService: UserRestService, private mensaje: MensajesService) { }
  newUser: User;

  ngOnInit() {
    this.newUser=new User();
  }

  addUser(user:User){
    this.userService.addUser(user).subscribe();
    this.mensaje.add("Usuario {user.name} añadido correctamente");
    this.newUser= new User();
  }

}
