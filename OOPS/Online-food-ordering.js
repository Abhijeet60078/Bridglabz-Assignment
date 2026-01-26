let menu = {
  burger: 100,
  pizza: 200,
  fries: 50
};

function calculateBill(items) {
  try {
    let prices = items.map(i => {
      if (!menu[i]) throw "Invalid item: " + i;
      return menu[i];
    });
    return prices.reduce((a,b)=>a+b,0);
  } catch (e) {
    return e;
  }
}

console.log(calculateBill(["burger","pizza"]));
console.log(calculateBill(["burger","cola"]));
