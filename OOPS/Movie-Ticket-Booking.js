class MovieTicket {
  constructor(name, seat, price) {
    this.movieName = name;
    this.seatNo = seat;
    this.price = price;
  }
}

MovieTicket.prototype.printTicket = function() {
  console.log(this.movieName, this.seatNo, this.price);
};

class OnlineTicket extends MovieTicket {
  constructor(name, seat, price, fee) {
    super(name, seat, price);
    this.convenienceFee = fee;
  }

  getTotalAmount() {
    return this.price + this.convenienceFee;
  }
}

let t = new OnlineTicket("Avengers","A1",200,30);
t.printTicket();
console.log(t.getTotalAmount());
