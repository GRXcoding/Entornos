package JavaRefactor;

import java.util.ArrayList;
import java.util.List;
public class CarritoDeCompras {
    private List<Item> items;
    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }
    public void agregarItem(Item item) {
        items.add(item);
    }
    public void removerItem(Item item) {
        items.remove(item);
    }

    public void imprimirDetalle() {
        System.out.println("Detalles del carrito de compras:");
        for (Item item : items) {
            System.out.println(item.nombre + " - $" + item.precio);
        }
        double total = 0;
        for (Item item : items) {
            total += item.precio;
        }
        System.out.println("Total: €" + total);
    }
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        Item item1 = new Item("Camiseta", 20.99);
        Item item2 = new Item("Pantalones", 34.99);
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);
        carrito.imprimirDetalle();
    }
}