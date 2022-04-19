import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { find } from 'rxjs';

 


@Component({
  selector: 'app-loanform',
  templateUrl: './loanform.component.html',
  styleUrls: ['./loanform.component.css']
})
export class LoanformComponent implements OnInit {

  SubmitForm: any;

  constructor(private formBuilder: FormBuilder, private http: HttpClient,private router:Router) { }

  ngOnInit(): void {
    this.SubmitForm=this.formBuilder.group({
      name:[''],
      mobileno:[''],
      emailid:[''],
      age:[''],
      city:[''],
      pancard:[''],
      cibilscore:[''],
      loantype:[''],
      loanamount:[''],
      netmonthlyincome:[''],
      occupation:[''],
      companyname:[''],
      currentemi:[''],
      password:[''],
      phone:[''],
      address:[''],
        })
        
      }
    
  //  apply(){
  //   this.http.post<any>("http://localhost:9191/addProduct",this.loanForm.value)
  //   .subscribe((res: any)=>{
      
  //     alert(" submitted successfully...");
  //     this.loanForm.reset();
  //     this.router.navigate(['/login']);
  //   },(err: any)=>{
  //     alert("Somethings went wrong !!!")

  //   })

  // }
  submitform()
  {
  this.http.post<any>("http://localhost:9191/addProduct",this.SubmitForm.value)
  .subscribe(res=>{
    const value=find((a:any)=>
    {
      return a.cibilscore===this.SubmitForm.value.cibilscore
      
    });
    // const value1=find((b:any)=>
    // {
    //   return b.grosssalary===this.SubmitForm.value.grosssalary
      
    // });
    // const value2=find((c:any)=>
    // {
    //   return c.netsalary===this.SubmitForm.value.netsalary
      
    // });
    // const value3=find((d:any)=>
    // {
    //   return d.currentemi===this.SubmitForm.value.currentemi
      
    // });

    if ((this.SubmitForm.value.cibilscore>=700))
        {
          alert("Form is Submitted");
          this.SubmitForm.reset();
          alert("Congratulations..!! Your Loan Is Approved..!!");
          this.router.navigate(['/home']);
        }
      else
      {
        alert("Sorry..!! You Are Not Eligible To Loan");
        this.router.navigate(['/home']);
         
       }
         
      
    },err=>{
    alert("Please fill the data");
    })
  
  }
}
  


