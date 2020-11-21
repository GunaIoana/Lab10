class Sugar extends Cookie {
  private String shape;
  private boolean isDecorated;

  Sugar() {
    shape = "";
    isDecorated = false;
  }

  Sugar (String aShape) {
    shape = aShape;
    isDecorated = false;
  }

  String getShape() {
    return shape;
  }

  void getShape(String aShape) {
    shape = aShape;
  }

  void cutOut(String shape, int number) {
    System.out.println(+ number + " cookies were cut into " + shape);
  }

  void decorateCookie() {
    if (isReady = getIsReady()) {
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}