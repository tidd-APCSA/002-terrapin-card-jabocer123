public class CardRunner {
  public static void main(String args[]){
    // ☕
    TerrapinCard cardBilly = new TerrapinCard(20);
    TerrapinCard cardBrian = new TerrapinCard(30);
    cardBilly.payGourmet();
    cardBrian.payEconomical();
    System.out.println("Billy: " + cardBilly);
    System.out.println("Brian: " + cardBrian);
    cardBilly.loadMoney(20);
    cardBrian.payGourmet();
    System.out.println("Billy: " + cardBilly);
    System.out.println("Brian: " + cardBrian);
    cardBilly.payEconomical();
    cardBilly.payEconomical();
    cardBrian.loadMoney(50);
    System.out.println("Billy: " + cardBilly);
    System.out.println("Brian: " + cardBrian);
  }
}
//Billy buys gourmet lunch
//Brian buys economical lunch
//cards are printed (both on their own row, starting with the name of the card owner)
//Billy loads 20 dollars
//Brian buys gourmet lunch
//cards are printed (both on their own row, starting with the name of the card owner)
//Billy buys economical lunch
//Billy buys economical lunch
//Brian loads 50 dollars
//cards are printed (both on their own row, starting with the name of the card owner)