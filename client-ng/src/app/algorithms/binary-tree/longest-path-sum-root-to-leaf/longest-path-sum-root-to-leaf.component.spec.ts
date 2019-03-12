import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LongestPathSumRootToLeafComponent } from './longest-path-sum-root-to-leaf.component';
import { ClarityModule } from "@clr/angular";
import { RouterTestingModule } from "@angular/router/testing";
import { FormsModule } from "@angular/forms";
import { BinaryTreeService } from "../../services/binary-tree.service";
import { HttpClientModule } from "@angular/common/http";

describe('LongestPathSumRootToLeafComponent', () => {
  let component: LongestPathSumRootToLeafComponent;
  let fixture: ComponentFixture<LongestPathSumRootToLeafComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        HttpClientModule,
        ClarityModule,
        FormsModule,
        RouterTestingModule
      ],
      providers: [ BinaryTreeService ],
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
