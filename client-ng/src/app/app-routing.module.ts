import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LongestPathSumRootToLeafComponent} from "./algorithms/binary-tree/longest-path-sum-root-to-leaf/longest-path-sum-root-to-leaf.component";

const routes: Routes = [
  { path: 'algorithms/binary-tree/longest-path-sum-r2l', component: LongestPathSumRootToLeafComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
