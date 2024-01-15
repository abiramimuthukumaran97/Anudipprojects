import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {  HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ContactsComponent } from './contacts/contacts.component';
import { AboutComponent } from './about/about.component';
import { FormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';



@NgModule({
  declarations: [
    AppComponent,  
    
   LoginComponent, HomeComponent, ContactsComponent, AboutComponent, RegisterComponent, 
  ],
  imports: [
    BrowserModule,FormsModule,
    AppRoutingModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
