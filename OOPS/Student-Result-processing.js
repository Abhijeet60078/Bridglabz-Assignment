class Student {
  constructor(name, marks) {
    this.name = name;
    this.marks = marks;
  }

  calculateAverage() {
    let avg = this.marks.reduce((a,b)=>a+b,0)/this.marks.length;
    if (avg >= 80) return "A";
    if (avg >= 60) return "B";
    if (avg >= 40) return "C";
    return "F";
  }
}

let s1 = new Student("A", [80,90,85]);
let s2 = new Student("B", [60,65,70]);
let s3 = new Student("C", [30,35,40]);

console.log(s1.calculateAverage());
console.log(s2.calculateAverage());
console.log(s3.calculateAverage());
