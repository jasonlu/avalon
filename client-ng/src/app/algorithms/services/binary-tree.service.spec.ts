import { TestBed } from '@angular/core/testing';

import { BinaryTreeService } from './binary-tree.service';
import { HttpClient, HttpClientModule } from "@angular/common/http";

describe('BinaryTreeService', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [
      HttpClientModule
    ],
    providers: [ HttpClient ],
  }));

  it('should be created', () => {
    const service: BinaryTreeService = TestBed.get(BinaryTreeService);
    expect(service).toBeTruthy();
  });
});
