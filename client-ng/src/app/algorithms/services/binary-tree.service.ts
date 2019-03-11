import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BinaryTreeService {

  constructor(private http: HttpClient) { }

  getLongestPathSumRootToLeaf(arr: number[]) {
    const endpoint = '/api/binary-tree/longest-path-sum-root-to-leaf';
    return this.http.post<number>(endpoint, {intData: arr})
  }
}
