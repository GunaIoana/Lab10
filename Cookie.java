class Cookie {
  private int number;
  private int bakeTemp;
  private int bakeTime;
  boolean isReady;

  Cookie() {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int aNumber, int aBakeTemp, int aBakeTime) {
    number = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  boolean getIsReady() {
    return isReady;
  }

  void setNumber(int aNumber) {
    number = aNumber;
  }

  void bakeCookie(int bakeTemp, int bakeTime) {
    System.out.println("The cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes");
    isReady = true;
  }
}