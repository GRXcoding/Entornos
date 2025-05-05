import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class CarritoDeCompras {

    private static final String CABEZERA = "Detalles del carrito de compras:";
    private static final String DOLAR = "$";
    
    private Set<Item> items;

    /**
     * Inicializa la lista de items vacío
     */
    public CarritoDeCompras() {
        this.items = new HashSet<>();
    }

    /**
     * Agrega un item al carrito y si este ya existe, aumenta la cantidad
     * @param item
     */
    public void agregarItem(Item item) {
        for (Item i : items) {
            if (i.getNombre().equals(item.getNombre())) {
                i.setCantidad(i.getCantidad() + item.getCantidad());
                return;
            }
        }
        items.add(item);
    }

    /**
     * Borra un item del carrito y si no existe, salta el error.
     * 
     * @param item
     */
    public void removerItem(Item item) {
        if (!items.contains(item)) {
            throw new NoSuchElementException("El item que desea eliminar no existe.");
        }
        items.remove(item);
    }

    /**
     * Imprime los detalles de cada item y su precio total.
     */
    public void imprimirDetalle() {
        System.out.println(CABEZERA);
        for (Item item : items) {
            System.out.println(item.toString());
        }
        double total = calcularTotal();
        System.out.println("Total: " + DOLAR + total);
    }

    /**
     * Multiplica el precio por su cantidad.
     * @return El total del carrito
     */
    public double calcularTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio() * item.getCantidad();
        }
        return total;
    }
}
