import { Component, OnInit } from '@angular/core';
import { UserRestService } from '../user-rest.service';
import { User } from '../model/user';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {

  newUser: User;
  userList: Observable<User[]>;
  constructor(private userService: UserRestService) { }

  ngOnInit() {
    this.newUser = new User();
    this.getUsers();
  }

  getUsers(): Observable<User[]>{
    return this.userList= this.userService.getUser();
  }

  updateUser(){
    this.userService.updateUser(this.newUser).subscribe();
    this.newUser=new User();
  }

  deleteUser(){
    this.userService.deleteUser(this.newUser).subscribe();
    this.newUser= new User();
  }

}
