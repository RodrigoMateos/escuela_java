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
  userList: User[];
  constructor(private userService: UserRestService) { }

  ngOnInit() {
    this.newUser = new User();
    this.getUsers();
  }

  getUsers(){
    this.userService.getUser().subscribe((objResp) => {
      this.userList=objResp;
    });
  }

  updateUser(user: User){
    this.userService.updateUser(user).subscribe((nUser)=>{
      this.newUser=nUser;
    });
 //   this.newUser=new User();
  }

  deleteUser(user: User){
    this.userService.deleteUser(user).subscribe();
//    this.newUser= new User();
  }

}
