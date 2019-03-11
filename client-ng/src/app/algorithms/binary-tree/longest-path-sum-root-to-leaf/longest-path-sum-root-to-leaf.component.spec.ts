import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LongestPathSumRootToLeafComponent } from './longest-path-sum-root-to-leaf.component';

describe('LongestPathSumRootToLeafComponent', () => {
  let component: LongestPathSumRootToLeafComponent;
  let fixture: ComponentFixture<LongestPathSumRootToLeafComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LongestPathSumRootToLeafComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LongestPathSumRootToLeafComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
