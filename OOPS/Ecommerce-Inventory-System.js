let products = [
  {id:1,name:"A",category:"Electronics",price:1000,stock:2},
  {id:2,name:"B",category:"Clothing",price:500,stock:10},
  {id:3,name:"C",category:"Electronics",price:2000,stock:1}
];

console.log(products.filter(p=>p.stock<5));

console.log(products.sort((a,b)=>a.price-b.price));

console.log(products.reduce((sum,p)=>sum+p.price*p.stock,0));

let grouped = products.reduce((acc,p)=>{
  acc[p.category] = acc[p.category] || [];
  acc[p.category].push(p);
  return acc;
},{});
console.log(grouped);
