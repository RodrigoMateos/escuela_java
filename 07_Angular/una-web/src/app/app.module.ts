import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { MiControlComponent } from './mi-control/mi-control.component';
import { HerosListComponent } from './heros-list/heros-list.component';

@NgModule({
  declarations: [
    AppComponent,
    MiControlComponent,
    HerosListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
