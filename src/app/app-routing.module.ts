import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ContactsComponent } from './contacts/contacts.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {path:"",pathMatch:'full',redirectTo:'home'},

  {path:'login',component:LoginComponent},
  
  {path:'register',component:RegisterComponent},
  {path:'home',component:HomeComponent},
  
  {path:'contacts',component:ContactsComponent},
  {path:'about',component:AboutComponent},
  
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
