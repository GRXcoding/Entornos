public class Main {
    /**
     * MÃ©todo principal.
     * 
     */
    public static void main(String[] args) {
        // Crea el carrito de compra.
        CarritoDeCompras carrito = new CarritoDeCompras();

        // Creamos dos objetos con sus atributos.
        Item item1 = new Item("Camiseta", 20.99, 4);
        Item item2 = new Item("Pantalones", 34.99, 6);

        // Agregamos los items
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);

        // Imprime los detalles de cada item del carrito y el precio total
        carrito.imprimirDetalle();


    }
}
