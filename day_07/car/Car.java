package day_07.car;

public class Car {
private String targa;
private String marca;
private String modello;
private double fuel;
private double consumoMedio;

public Car() {
	super();
} //Costruttore di default

public Car(String targa, String marca, String modello, double fuel, double consumoMedio) {
	super();
	this.targa = targa;
	this.marca = marca;
	this.modello = modello;
	this.fuel = fuel;
	this.consumoMedio = consumoMedio;
	//Costruttore parametrico
}

public String getTarga() {
	return this.targa;
}

public void setTarga(String targa) {
	this.targa = targa;
}

public String getMarca() {
	return this.marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModello() {
	return this.modello;
}

public void setModello(String modello) {
	this.modello = modello;
}

public void setFuel(double fuel) {
	this.fuel = fuel;
}

public double getFuel() {
	return this.fuel;
}

public Double getConsumoMedio() {
	return this.consumoMedio;
}

public void setConsumoMedio(double consumoMedio) {
	this.consumoMedio = consumoMedio;
}



} 


