import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ElnFreqsimilComponent } from './eln-freqsimil.component';

describe('ElnFreqsimilComponent', () => {
  let component: ElnFreqsimilComponent;
  let fixture: ComponentFixture<ElnFreqsimilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ElnFreqsimilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ElnFreqsimilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
