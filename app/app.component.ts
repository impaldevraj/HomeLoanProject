import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
 

export interface Dessert {
  calories: number;
  carbs: number;
  fat: number;
  name: string;
  protein: number;
}
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title(title: any) {
    throw new Error('Method not implemented.');
  }
} 
export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

 