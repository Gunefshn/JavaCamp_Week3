package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] krediManagers = new BaseCrediManager[]
				{new TeacherKrediManager(),new AgricultureKrediManager(),new StudentKrediManager()};
		
		
		for(BaseCrediManager krediManager: krediManagers) {
			System.out.println(krediManager.Hesapla(1000));;
		}
		
		
	}

}
