import { Component, OnInit, Input } from '@angular/core';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-eln-freqsimil',
  templateUrl: './eln-freqsimil.component.html',
  styleUrls: ['./eln-freqsimil.component.css']
})
export class ElnFreqsimilComponent implements OnInit {

  @Input() inputData = { entryText:'', keyword: '' };
  outputData:any = [];

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  execute() {
    this.outputData = [];
    this.rest.getFreqSimil(this.inputData).subscribe((data: {}) => {
      this.outputData = data;
    });
  }

}
