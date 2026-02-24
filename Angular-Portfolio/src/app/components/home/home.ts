import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './home.html',
  styleUrls: ['./home.css']
})
export class HomeComponent {
  name = 'Sai Ashritha';
  role = 'Angular Developer';
  summary =
    'I build clean, responsive web applications with Angular and modern frontend tools.';

  highlights = [
    { label: 'Projects Built', value: '2' },
    { label: 'Core Skills', value: '6+' },
    { label: 'Learning Mindset', value: 'Always On' }
  ];
}

export { HomeComponent as Home };
