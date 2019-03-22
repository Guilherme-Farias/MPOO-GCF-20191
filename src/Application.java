
public class Application {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorld2 = new HelloWorld();
		HelloWorld helloWorld3 = new HelloWorld();
		HelloWorld helloWorld4 = new HelloWorld();
		helloWorld.setNome("Gabriel");
		helloWorld2.setNome("Ana");
		helloWorld3.setNome("Guilherme");

		helloWorld.imprimir();
		helloWorld2.imprimir();
		helloWorld3.imprimir();
		helloWorld4.imprimir();
	}
}