public class Item {

    private static final double PRECIO_MINIMO = 0;
    private static final double PRECIO_MAXIMO = 1000;
    private static final String DOLAR = "$";

    private String nombre;
    private double precio;
    private int cantidad;

    /**
     * Constructor para crear un nuevo objeto "Item".
     * @param nombre
     * @param precio
     * @param cantidad
     */
    public Item(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
    }

    /**
     * @return El nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setea el nombre del item.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio.
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setea el precio del item y valida que estÃ© dentro de los valores permitidos.
     * @param precio
     */
    public void setPrecio(double precio) {
        if (precio < PRECIO_MINIMO) {
            throw new IllegalArgumentException("ERROR. No se admiten precios negativos.");
        }
        if (precio > PRECIO_MAXIMO) {
            throw new IllegalArgumentException("ERROR. No se admiten precios tan elevados.");
        }
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad del item
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Setea la cantidad del item y valida que sea mayor que cero.
     * @param cantidad
     * 
     */
    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("ERROR. La cantidad debe ser mayor que 0.");
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + DOLAR + precio + " x " + cantidad;
    }

}