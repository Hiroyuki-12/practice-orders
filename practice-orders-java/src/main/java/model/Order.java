package model;
import java.time.LocalDate;

public class Order {
  private int id;
  private LocalDate orderDate;
  private String customerName;
  private int amount;
  private String status;


  public Order(int id, LocalDate orderDate, String customerName, int amount, String status) {
  this.id = id;
  this.orderDate = orderDate;
  this.customerName = customerName;
  this.amount = amount;
  this.status = status;
  }

  public int getId() {
  return id;
  }

  public LocalDate getOrderDate() {
  return orderDate;
  }

  public String getCustomerName() {
  return customerName;
  }

  public int getAmount() {
  return amount;
  }

  public String getStatus() {
  return status;
  }

  public void setStatus(String status) {
  this.status = status;
  }


}
