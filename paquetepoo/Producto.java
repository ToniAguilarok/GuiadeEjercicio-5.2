package paquetepoo;

public class Producto {
	private int codigo;
	private String nombre;
	private String desc;
	private double precio;
	private int stock;
	private int numProd;
	private static int numProdSig=1;
	//creo el metodo constructor
	public Producto(int cod, String nom, String descripcion, double prec, int stc) {
		codigo = cod;
		nombre = nom;
		desc = descripcion;
		precio = prec;
		stock = stc;	
		numProd = numProdSig;
		numProdSig++;
	}
	// metodos getters para acceder a los valores de los atributos
	public int un_codigo() {
		return codigo;
	}
	public String un_nombre() {
		return nombre;
	}
	public String un_desc() {
		return desc;
	}
	public double un_precio() {
		return precio;
	}
	public int un_stock() {
		return stock;
	}
	public static int un_num() {
		return numProdSig;
	}
	public String mostrarProducto() {
		return "num: "+numProd+"codigo"+codigo+" Nombre: "+nombre+" Precio: "+precio;
	}

}
