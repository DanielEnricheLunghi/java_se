package day_10.forma;

public class Cerchio extends Forma {
	public Cerchio() {
		super();
	}
	public Cerchio(double raggioLato) {
		super(raggioLato);
		
	}
	@Override
	public double perimetroCirconferenza () {
		
		return getRaggioLato() * Math.PI;
		
	}
	@Override
	public double area () {
		return Math.pow(getRaggioLato(), 2) * Math.PI;
	}
}
