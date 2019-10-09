import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegistroComponent} from './registro/registro.component';
import {ListadoComponent} from './listado/listado.component';
import {MenuComponent} from './menu/menu.component';


const routes: Routes = [
//  {path: '', redirectTo:'/new', pathMatch: 'full'},
  {path: 'new', component: RegistroComponent},
  {path: 'updateAndRemove', component: ListadoComponent},
  {path: 'menu', component: MenuComponent}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
