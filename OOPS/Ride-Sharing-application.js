class Trip {
  constructor(distance) {
    this.distance = distance;
  }

  calculateFare() {
    if (!this.distance || this.distance < 0)
      throw "Invalid distance";
    return this.distance * 10;
  }
}

try {
  let t = new Trip(5);
  console.log(t.calculateFare());
} catch (e) {
  console.log(e);
}
