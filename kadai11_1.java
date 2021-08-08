public class Client {
  public static void main(String[] args) {
    Koujyou koujyou1 = new TvKoujyou();
    Koujyou koujyou2 = new RadioKoujyou();
    Seihin[] array = new Seihin[3];
    array[0] = koujyou1.create();
    array[1] = koujyou2.create();
    array[2] = koujyou1.create();
    for (int i = 0; i < array.length; ++i) {
      array[i].print();
      }
    }
  }
