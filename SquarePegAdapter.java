
public class SquarePegAdapter extends RoundPeg{ //SquareAdapter � um RoundPeg
	private SquarePeg peg;

	public SquarePegAdapter(double radius, SquarePeg peg) {
		super(radius);
		this.peg = peg;
	}

	public double getRadius() {
		return peg.getWidth() * Math.sqrt(2) / 2;
	}
}
