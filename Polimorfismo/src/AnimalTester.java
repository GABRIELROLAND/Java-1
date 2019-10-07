
public class AnimalTester {

	public static void main(String[] args) {
		// Instanciando Classes
		Ave a1 = new Ave();
		Mamifero m1 = new Mamifero();
		Peixe p1 = new Peixe();
		Reptil r1 = new Reptil();
		
		
		// Metodos
		System.out.println("=-=-=-=-=-=-=-=-=-=--=");
		a1.setCorPena("Rosa");
		a1.setIdade(24);
		a1.setMembros(4);
		a1.setPeso(6);
		
		a1.fazerNinho();
		
		a1.alimentar();
		a1.emitirSom();
		a1.locomover();
		System.out.println("=-=-=-=-=-=-=-=-=-=--=");
		m1.setCorPelo("verde");
		m1.alimentar();
		m1.emitirSom();
		m1.locomover();
		System.out.println("=-=-=-=-=-=-=-=-=-=--=");
		p1.setCorEscama("Azul");
		p1.soltarBolha();
		p1.alimentar();
		p1.emitirSom();
		p1.locomover();
		System.out.println("=-=-=-=-=-=-=-=-=-=--=");
		r1.setCorEscama("Marrom");
		r1.alimentar();
		r1.emitirSom();
		r1.locomover();
		System.out.println("=-=-=-=-=-=-=-=-=-=--=");
		
		
		
		

	}

}
