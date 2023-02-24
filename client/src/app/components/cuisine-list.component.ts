import { Component } from '@angular/core';
import { Restaurant } from '../models';

@Component({
  selector: 'app-cuisine-list',
  templateUrl: './cuisine-list.component.html',
  styleUrls: ['./cuisine-list.component.css']
})
export class CuisineListComponent {

	// TODO Task 2
	// For View 1
  restaurants: Restaurant[] = []

  async ngOnInit() {
    
  }

}
