package me.diego.factory;

import me.diego.domain.Order;

public class ExpressOrderFactory implements OrderFactory {
  private static ExpressOrderFactory instance;

  private ExpressOrderFactory() {}

  public static ExpressOrderFactory getInstance() {
    if (instance == null) {
      instance = new ExpressOrderFactory();
    }

    return instance;
  }

  @Override
  public Order createOrder(String orderId, String restaurantName) {
    var order = new Order(orderId + "-EXPRESS", restaurantName);
    return order;
  }
}
