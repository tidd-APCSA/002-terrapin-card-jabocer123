public class TerrapinCard{

  private double balance;

  public TerrapinCard(double balance) {
    this.balance = balance;
  }

  public void payEconomical() {
    if(this.balance - 2.50 >= 0){
      this.balance -= 2.50;
    } 
    
  }

  public void payGourmet() {
    if(this.balance - 4.00 >= 0){ 
      this.balance -= 4.00;
    }
  }
  
  public String toString() {
    return "The card has " + this.balance + " dollars.";
  } 

  public void loadMoney(double amount){
    if(amount >= 0){ 
      if(this.balance + amount > 150){
        this.balance = 150;
      } else {
        this.balance += amount;
      }
    }
  }
}