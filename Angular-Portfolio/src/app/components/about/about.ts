import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-about',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './about.html',
  styleUrls: ['./about.css']
})
export class AboutComponent {
  title = 'About Me';
  description =
    'I am deeply committed to continuous learning and self-improvement, with a strong focus on enhancing my problem-solving abilities and professional skill set. I enjoy embracing challenges that push me to grow both technically and personally. I am self-driven, disciplined, and dedicated to building a solid foundation through consistent practice and hands-on, real-world experience. I work well in collaborative environments, where I actively learn from others while contributing positively to team goals. Adaptable and open-minded, I am always eager to explore new ideas and expand my knowledge and expertise.';

  activities = [
    'Reading books and articles to gain new knowledge.',
    'Solving puzzles and brain teasers.',
    'Exploring new places and cultures.',
    'Listening to music and watching movies.',
    'Learning new skills and self-improvement.'
  ];
}

export { AboutComponent as About };
