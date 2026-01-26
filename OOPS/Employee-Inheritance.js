class Employee {
  constructor(name, dept) {
    this.name = name;
    this.dept = dept;
  }
  work() {
    console.log("Employee working");
  }
}

class Manager extends Employee {
  work() {
    console.log("Manager managing");
  }
}

let e = new Employee("A","IT");
let m = new Manager("B","HR");

e.work();
m.work();
