class BankAccount {
  #balance = 0;

  deposit(a) { this.#balance += a; }

  withdraw(a) {
    if (a > this.#balance) throw "Insufficient balance";
    this.#balance -= a;
  }

  getBalance() { return this.#balance; }
}

let acc = new BankAccount();
acc.deposit(1000);

try {
  acc.withdraw(1500);
} catch(e) {
  console.log(e);
}

console.log(acc.getBalance());
