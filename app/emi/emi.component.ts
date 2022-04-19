import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-emi',
  templateUrl: './emi.component.html',
  styleUrls: ['./emi.component.css']
})
export class EmiComponent implements OnInit {
  title = 'impal';
  LoanAmount:number|null=null;
  InterestPer:number|null=null;
  Duration:number|null=null;
  resultCalulation:number|null=null;
  totalamount:number|null=null;
  monthlyamount:number|null=null;


  CalculateInterestAmout(){
    if (this.LoanAmount != null && this.InterestPer != null && this.Duration != null){
      this.resultCalulation = (this.LoanAmount * this.InterestPer * this.Duration) / 100;
      this.totalamount = (this.LoanAmount +this.resultCalulation );
      this.monthlyamount = (this.totalamount)/(this.Duration);
    }
}  Reset(){
  this.LoanAmount=null;
  this.InterestPer=null;
  this.Duration=null;
  this.resultCalulation=null;
  this.totalamount=null;
  this.monthlyamount=null;
}
  constructor() { }
  ngOnInit(): void {
  }
  
 
}

export class InputErrorsExample {
  emailFormControl = new FormControl('', [Validators.required, Validators.email]);
}