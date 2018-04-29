public class Transaction {
  private double adult = 0;
  private double child = 0;
  private double senior = 0;
  private double student = 0;
  private double total = 0;
  private double cashGiven = 0;

  public Transaction(double adult, double child, double senior,
                     double student, double cashGiven) {
    this.adult = adult;
    this.child = child;
    this.senior = senior;
    this.student = student;
    this.cashGiven = cashGiven;
  }

  public double getAdult() {
    return adult;
  }

  public void setAdult(double adult) {
      this.adult = adult;
  }

  public double getChild() {
    return child;
  }

  public void setChild(double child) {
    this.child = child;
  }

  public double getSenior() {
    return senior;
  }

  public void setSenior(double senior) {
    this.senior = senior;
  }

  public double getStudent() {
    return student;
  }

  public void setStudent(double student) {
    this.student = student;
  }

  public double getTotal() {
    double total = ((adult * 10) + (child * 6) + (senior * 6) +
                   (student * 7.5));
    return total;
  }

  public double getCashGiven() {
    return cashGiven;
  }

  public void setCashGiven(double cashGiven) {
    this.cashGiven = cashGiven;
  }

  public double getChangeGiven() {
    double changeGiven = cashGiven - getTotal();
    return changeGiven;
  }
}
