import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-education',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './education.html',
  styleUrls: ['./education.css']
})
export class EducationComponent {
  educationList = [
    {
      degree: 'B.Tech in Computer Science',
      institution: 'Jawaharlal Nehru Technological University',
      year: '2020 - 2024'
    },
    {
      degree: 'Intermediate (MPC)',
      institution: 'Sri Chaitanya Junior College',
      year: '2018 - 2020'
    },
    {
      degree: 'SSC',
      institution: 'Sri Chaitanya Techno School',
      year: '2017 - 2018'
    }
  ];
}
