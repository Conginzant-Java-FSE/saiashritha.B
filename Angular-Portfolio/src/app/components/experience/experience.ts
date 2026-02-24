import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-experience',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './experience.html',
  styleUrls: ['./experience.css']
})
export class ExperienceComponent {
  experienceList = [
    {
      role: 'FullStack Developer Intern',
      company: 'Revature',
      duration: 'Jan 2026- Present',
      details: 'Built reusable Angular components and improved page performance along with the backend.'
    }
  ];
}
