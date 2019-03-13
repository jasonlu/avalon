import { Component, OnInit } from '@angular/core';
import { BinaryTreeService } from "../../services/binary-tree.service";

@Component({
  selector: 'app-longest-path-sum-root-to-leaf',
  templateUrl: './longest-path-sum-root-to-leaf.component.html',
  styleUrls: ['./longest-path-sum-root-to-leaf.component.scss']
})
export class LongestPathSumRootToLeafComponent implements OnInit {

  constructor(private binaryTreeService: BinaryTreeService) { }

  inputArray: number[] = [];
  inputString: string = "0, 1, 2, 3, 4";
  result: number = undefined;

  ngOnInit() {

  }

  calculate() {
    this.inputArray = this.inputString
      .split(',')
      .map((value) => {
        let val = parseInt(value, 10);
        if ( isNaN(val)) {
          return null;
        }
        return val;
      });
    this.binaryTreeService.getLongestPathSumRootToLeaf(this.inputArray).subscribe((result) => { this.result = result.sumOfLongestPathRootToLeafOfInteger });
  }
}
