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
  user: User;
  ngOnInit() {
    this.user=new User();
  }

  addUser(){
    this.userService.addUser(this.user);
    this.user= new User();
  }

}
