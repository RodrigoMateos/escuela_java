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

  user: User;
  userList: Observable<User[]>;
  constructor(private userService: UserRestService) { }

  ngOnInit() {
    this.user = new User();
    this.getUsers();
  }

  getUsers(): Observable<User[]>{
    return this.userList= this.userService.getUser();
  }

  updateUser(user: User){
    this.userService.updateUser(user);
    this.user=new User();
  }

  deleteUser(user: User){
    this.userService.deleteUser(user);
    this.user= new User();
  }

}
