import { Component } from '@angular/core';
import { User } from '../Entity/user';
import { UserService } from '../Services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  user:User=new User();


  constructor(private userService:UserService){

  }

  ngOnInit():void{

  }
  Login(){
    console.log(this.user)
    this.userService.save(this.user).subscribe(()=>{
      alert("Login Sucessfully")
      
    },()=>alert("Sorry please enter correct Email and Password")
    )
  }
}
