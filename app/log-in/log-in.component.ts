import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit {

    public loginForm!: FormGroup
    constructor(private formBuilder: FormBuilder, private http: HttpClient,private router:Router) { }
  
    ngOnInit(): void {
      this.loginForm=this.formBuilder.group({
            email:['',Validators.required],
            password:['',Validators.required],
      })
    }
    Register(){
      this.http.get<any>("http://localhost:9191/customer")
    .subscribe(res=>{
      const user=res.find((a:any)=>{
        return a.email=== this.loginForm.value.email && a.password === this.loginForm.value.password
      });
      if(user){
        alert("login successfull");
        this.loginForm.reset();
        this.router.navigate(['/home'])
      }else{
        alert(" Enter a valid EmailID And Password");
      }
 
    },err=>{
      alert("Somthing went wrong!!!!")
    })
}

  }