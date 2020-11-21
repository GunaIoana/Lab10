class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar();
    Sugar aCookie = new Sugar();

    tree.cutOut("tree", 10);
    tree.bakeCookie(350, 12);
    tree.decorateCookie();

    aCookie.decorateCookie();
  }
}