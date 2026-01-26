class Library {
  constructor() {
    this.books = [];
  }

  addBook(book) {
    this.books.push(book);
  }

  getAvailableBooks() {
    return this.books.filter(b => b.available);
  }

  searchByAuthor(author) {
    return this.books.find(b => b.author === author);
  }
}

let lib = new Library();

lib.addBook({ title: "Book1", author: "A", available: true });
lib.addBook({ title: "Book2", author: "B", available: false });
lib.addBook({ title: "Book3", author: "C", available: true });

console.log(lib.getAvailableBooks());
console.log(lib.searchByAuthor("B"));
