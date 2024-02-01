public Square(int width) {
    this.width = width;
}

public double getArea() {

    return width * width; // 'this' is removed here
}
