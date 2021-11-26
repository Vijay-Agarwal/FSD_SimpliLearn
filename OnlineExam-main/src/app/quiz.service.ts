import { Injectable } from '@angular/core';

interface Quiz{
    question: string;
    answer: { option: string, correct: boolean } [];
}

@Injectable({
  providedIn: 'root'
})
export class QuizService {
  quizzes: Quiz[] = [
    {
      question: '1) Which of the following option leads to the portability and security of Java?',
      answer: [
        { option: 'The applet makes the Java code secure and portable', correct: false },
        { option: 'Use of exception handling', correct: false },
        { option: 'Bytecode is executed by JVM', correct: true },
        { option: 'Dynamic binding between objects', correct: false },
      ]
    },
    {
      question: 'AngularJS is perfect for?',
      answer: [
        { option: 'SPAs', correct: true },        
        { option: 'MPAs', correct: false },
        { option: 'DPAs', correct: false },
        { option: 'Object-orientedCPAs', correct: false },
      ]
    },
    {
      question: 'Which of the following is not a Java features?',
      answer: [
        { option: 'Use of pointers', correct: true },
        { option: 'Dynamic', correct: false },
        { option: 'Architecture Neutral', correct: false },
        { option: 'Object-oriented', correct: false }
      ]
    },
    {
      question: 'What is the return type of the hashCode() method in the Object class?',
      answer: [
        { option: 'Object', correct: false },
        { option: 'long', correct: false },
        { option: 'int', correct: true },
        { option: 'void', correct: false }
      ]
    },
    {
      question: 'The \u0021 article referred to as a',
      answer: [
        { option: 'Octal escape', correct: false },
        { option: 'Unicode escape sequence', correct: true },
        { option: 'Hexadecimal', correct: false },
        { option: 'Line Feed', correct: false }
      ]
    },
    {
      question: 'Which of the following is a valid long literal?',
      answer: [
        { option: 'ABH8097', correct: false },
        { option: 'L990023', correct: false },
        { option: '0xnf029L', correct: true },
        { option: '904423', correct: false }
      ]
    },
    {
      question: 'Which of the following is an immediate subclass of the Panel class?',
      answer: [
        { option: 'Window class', correct: false },
        { option: 'frame class', correct: false },
        { option: 'Applet class', correct: true },
        { option: 'Object class', correct: false }
      ]
    },
    {
      question: 'Which option is false about the final keyword?',
      answer: [
        { option: 'A final class cannot be extended.', correct: false },
        { option: 'A final method can be inherited.', correct: false },
        { option: 'A final class cannot extend other classes.', correct: true },
        { option: 'A final method cannot be overridden in its subclasses.', correct: false },
      ]
    },
    {
      question: 'What is the use of the intern() method?',
      answer: [
        { option: 'It creates a new string in the database', correct: false },
        { option: 'It modifies the existing string in the database ', correct: false },
        { option: 'It returns the existing string from memory', correct: true },
        { option: 'None of the above ', correct: false }
      ]
    },
    {
      question: 'What does the expression float a = 35 / 0 return?',
      answer: [
        { option: '0', correct: false },
        { option: 'Not a Number', correct: false },
        { option: 'Infinity', correct: true },
        { option: 'Run time exception', correct: false }
      ]
    }
  ]

  getQuizzes(){
    return this.quizzes;
  }
} 