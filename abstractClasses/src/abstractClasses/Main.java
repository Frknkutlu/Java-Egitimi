package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		GameCalculator[] gameCalculators = new GameCalculator[] 
				{ new MenGameCalculator(), new WomanGameCalculator(),new KidsGameCalculator() };
		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
			gameCalculator.gameOver();
		}
		
		
	}
}
