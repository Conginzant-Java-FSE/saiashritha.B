import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-projects',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './projects.html',
  styleUrls: ['./projects.css']
})
export class ProjectsComponent {
  projects = [
    {
      name: 'REVPAY',
      skills: [
        { name: 'JDBC', level: 6 },
        { name: 'Java', level: 6 },
        { name: 'Git', level: 6 },
        { name: 'Log4J', level: 6 },
        { name: 'JUnit', level: 6 },
        { name: 'MySQL', level: 6 }
      ]
    },
    {
      name: 'REVCONNECT',
      skills: [
        { name: 'Java', level: 6 },
        { name: 'JUnit4', level: 6 },
        { name: 'Git', level: 6 },
        { name: 'Log4J', level: 6 },
        { name: 'Spring Boot', level: 6 },
        { name: 'SQL', level: 6 },
        { name: 'Maven', level: 3 }
      ]
    }
  ];
}

export { ProjectsComponent as Projects };
