import { Component, OnInit, Input } from '@angular/core';
import { ListadoComponent } from '../listado/listado.component';
import { User } from '../model/user';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-form-usuario',
  templateUrl: './form-usuario.component.html',
  styleUrls: ['./form-usuario.component.css']
})
export class FormUsuarioComponent implements OnInit {

  @Input() user: User;
  
  constructor() { }

  ngOnInit() {
   // this.user=new User();
  }

}
