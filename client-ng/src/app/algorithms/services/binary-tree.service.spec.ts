import { TestBed } from '@angular/core/testing';

import { BinaryTreeService } from './binary-tree.service';

describe('BinaryTreeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BinaryTreeService = TestBed.get(BinaryTreeService);
    expect(service).toBeTruthy();
  });
});
