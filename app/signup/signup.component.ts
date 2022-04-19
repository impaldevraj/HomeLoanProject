import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  public signupForm!: FormGroup
  constructor(private formBuilder: FormBuilder, private http: HttpClient,private router:Router) { }

  ngOnInit(): void {
    this.signupForm=this.formBuilder.group({
      fullname:[''],
      email:[''],
      password:[''],
          phone:[''],
          address:[''],
          
         
    })
  }
   Register(){
    this.http.post<any>("http://localhost:9191/customer",this.signupForm.value)
    .subscribe(res=>{
      alert("Signup Successfull...");
      this.signupForm.reset();
      this.router.navigate(['/login']);
    },err=>{
      alert("Somethings went wrong !!!")

    })

  }

}

