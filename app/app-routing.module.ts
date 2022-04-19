import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmiComponent } from './emi/emi.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { TermsComponent } from './terms/terms.component';
import { LogInComponent } from './log-in/log-in.component';
import { TableComponent } from './table/table.component';
import { LoanformComponent } from './loanform/loanform.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'privacy', component: PrivacyComponent },
  { path: 'terms', component: TermsComponent },
  { path: 'login', component: LogInComponent },
  { path: 'emi', component: EmiComponent},
  { path: 'table', component: TableComponent},
  { path: 'loanform', component: LoanformComponent},
 {path:'signup',component:SignupComponent},
  { path: '', redirectTo: '/login', pathMatch: 'full' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
