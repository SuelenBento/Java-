package Exercicios01;

public class TesteAnimais {

	public static void main(String[] args) {
	
		Cachorro01 ch = new Cachorro01();
		Cavalo01 cv = new Cavalo01();
		Preguiça01 preg = new Preguiça01();
		
	    
	   
	       ch.setCorrrer("esta correndo");
	       ch.setIdade(5);
	       ch.setNome("Spack");
	       ch.setSom("auau");
	       
	       System.out.println("O cachorro: \nO está correndo: " + ch.getCorrrer() + "km/h");
	       System.out.println("A idade do Cachorro: " + ch.getIdade());
	       System.out.println("O nome do Cachorro: " + ch.getNome());
	       System.out.println("O latido: " + ch.getSom() + "\n");
	       
	       cv.setGalopa("párárá");
	       cv.setIdade(3);
	       cv.setNome("batata");
	       cv.setSom("ihiriii");
	       
	       System.out.println("O Cavalo: \nCavalo está correndo: " + cv.getGalopa() + "km/h");
	       System.out.println("A idade do cavalo: " + cv.getIdade());
	       System.out.println("O nome do cavalo: " + cv.getNome());
	       System.out.println("O relinchar: " + cv.getSom() + "\n");
	       
	    
	       preg.setDorme("Dormindo..");
	       preg.setIdade(3);
	       preg.setNome("noelia");
	       preg.setSom("...");
	       
	       System.out.println("Preguiça: \nA pregui está dormindo: " + preg.getDorme() + "km/h");
	       System.out.println("A idade da preguiça: " + preg.getIdade());
	       System.out.println("O nome da preguiça: " + preg.getNome());
	       System.out.println("O som da preguiça: " + preg.getSom());
	       


	}

}
