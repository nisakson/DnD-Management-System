import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CsHeaderComponent } from './cs-header.component';

describe('CsHeaderComponent', () => {
  let component: CsHeaderComponent;
  let fixture: ComponentFixture<CsHeaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CsHeaderComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CsHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
