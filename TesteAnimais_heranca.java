package Exercicios01;

public class TesteAnimais {

	public static void main(String[] args) {
	
		Cachorro01 ch = new Cachorro01();
		Cavalo01 cv = new Cavalo01();
		Pregui�a01 preg = new Pregui�a01();
		
	    
	   
	       ch.setCorrrer("esta correndo");
	       ch.setIdade(5);
	       ch.setNome("Spack");
	       ch.setSom("auau");
	       
	       System.out.println("O cachorro: \nO est� correndo: " + ch.getCorrrer() + "km/h");
	       System.out.println("A idade do Cachorro: " + ch.getIdade());
	       System.out.println("O nome do Cachorro: " + ch.getNome());
	       System.out.println("O latido: " + ch.getSom() + "\n");
	       
	       cv.setGalopa("p�r�r�");
	       cv.setIdade(3);
	       cv.setNome("batata");
	       cv.setSom("ihiriii");
	       
	       System.out.println("O Cavalo: \nCavalo est� correndo: " + cv.getGalopa() + "km/h");
	       System.out.println("A idade do cavalo: " + cv.getIdade());
	       System.out.println("O nome do cavalo: " + cv.getNome());
	       System.out.println("O relinchar: " + cv.getSom() + "\n");
	       
	    
	       preg.setDorme("Dormindo..");
	       preg.setIdade(3);
	       preg.setNome("noelia");
	       preg.setSom("...");
	       
	       System.out.println("Pregui�a: \nA pregui est� dormindo: " + preg.getDorme() + "km/h");
	       System.out.println("A idade da pregui�a: " + preg.getIdade());
	       System.out.println("O nome da pregui�a: " + preg.getNome());
	       System.out.println("O som da pregui�a: " + preg.getSom());
	       


	}

}
