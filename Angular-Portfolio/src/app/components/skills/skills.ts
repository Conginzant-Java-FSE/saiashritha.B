import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-skills',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './skills.html',
  styleUrls: ['./skills.css']
})
export class SkillsComponent {
  skills = [
    { name: 'JavaScript', level: 'Advanced' },
    { name: 'Java', level: 'Intermediate' },
    { name: 'SQL', level: 'Intermediate' },
    { name: 'HTML', level: 'Advanced' },
    { name: 'CSS', level: 'Advanced' },
    { name: 'Angular', level: 'Advanced' },
    { name: 'Spring', level: 'Intermediate' },
    { name: 'Spring Boot', level: 'Intermediate' }
  ];
}

export { SkillsComponent as Skills };
