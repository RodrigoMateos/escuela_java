import { Component, OnInit } from '@angular/core';
import { UserRestService } from '../user-rest.service';
import { User } from '../model/user';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  constructor(private userService: UserRestService) { }
  newUser: User;

  ngOnInit() {
    this.newUser=new User();
  }

  addUser(user:User){
    this.userService.addUser(this.newUser);
    this.newUser= new User();
  }

}
