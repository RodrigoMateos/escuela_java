import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  template: `<li>
                <a routerLink="/">Registro</a><br/>
                <a routerLink="/">Editar o Eliminar</a><br/>
              </li>`
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
