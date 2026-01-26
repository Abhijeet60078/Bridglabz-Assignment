function Product(name, price) {
  this.name = name;
  this.price = price;
}

Product.prototype.applyDiscount = function(percent) {
  return this.price - (this.price * percent / 100);
};

let p1 = new Product("A", 1000);
let p2 = new Product("B", 2000);
let p3 = new Product("C", 3000);

console.log(p1.applyDiscount(10));
console.log(p2.applyDiscount(20));
console.log(p3.applyDiscount(30));
