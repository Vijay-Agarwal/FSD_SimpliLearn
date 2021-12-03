import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'myindex',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

  testImageUrlItem1:String="https://raw.githubusercontent.com/Bharath7353/staticfilesforangular/master/item1.jpg";

  constructor() { 
    
  }

  ngOnInit(): void {
  }

}
