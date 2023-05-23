
public class Main {
	public static void main(String[] args) {
		
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		System.out.println(hole.fits(rpeg)); //verifica se o buraco � maior que o pilar

		SquarePeg small_sqpeg = new SquarePeg(5);
		SquarePeg large_sqpeg = new SquarePeg(10);
		//System.out.println(hole.fits(small_sqpeg)); //verifica se o quadrado � maior que o buraco, porem o metodo nao aceita esse tipo
		
		SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(5, small_sqpeg); //Aqui estamos construindo o objeto adapter que herda o round peg
																					 //Passamos o objeto squarepeg para podermos fazer a compara��o desse objeto no metodo de compara�ao
		
		SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(5, large_sqpeg);
		System.out.println(hole.fits(small_sqpeg_adapter)); //Ao passar o objeto adapter aqui no metodo, estamos utilizando o getRadius reescrito presente nesta classe 
		System.out.println(hole.fits(large_sqpeg_adapter)); //Usamos a heran�a para fazer com que o metodo identifique que o tipo de objeto que iremos passar tamb�m � do tipo RoundPeg
	}
}
