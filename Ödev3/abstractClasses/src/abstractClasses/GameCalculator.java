package abstractClasses;

public abstract class GameCalculator {
	//miras alanlar hesapla fonk. içermek ve ovverrid etmek zorunda 
	public abstract void hesapla();
	
	//gameOver fonksiyonu olduğu şekilde kullanılmak zorunda
	public final void gameOver() {
		System.out.println("Oyun bitti...");
	}
}
