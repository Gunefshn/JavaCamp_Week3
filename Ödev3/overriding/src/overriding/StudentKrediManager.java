package overriding;

public class StudentKrediManager extends BaseCrediManager{
	
	public double Hesapla(double tutar) {
		return tutar*1.10;
	}
}
