package application;

import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order pedido01 = new Order();

        pedido01.setId(0001);
        pedido01.setMoment(new Date());
        pedido01.setStatus(OrderStatus.PENDENTE);

        System.out.println(pedido01);

        OrderStatus os1 = OrderStatus.PENDENTE;
        OrderStatus os2 = OrderStatus.valueOf("PENDENTE");

        System.out.println(os1);
        System.out.println(os2);

    }
}
