
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.exibirPagina("https://www.google.com/");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("By By");
		iphone.ligar("34 9652323");
		iphone.atender();
		iphone.iniciarCorreioVoz();
	
	}

	
public void espera() {
		
		System.out.println("Loading...............");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exibirPagina(String url) {
		espera();
		System.out.println("Exibindo pagina: " + url);
		
	}

	
	public void adicionarNovaAba() {
		espera();
		System.out.println("Adicionando Nova Aba");
		
	}

	
	public void atualizarPagina() {
		espera();
		System.out.println("Atualizando Pagina");
		
	}

	
	public void tocar() {
		espera();
		System.out.println("Tocando Musica");
		
	}

	
	public void pausar() {
		espera();
		System.out.println("Pausando Musica	");
		
	}

	
	public void selecionarMusica(String musica) {
		espera();
		System.out.println("Selecionando Musica	" + musica);
		
	}


	
	public void ligar(String numero) {
		espera();
		System.out.println("Ligando para numero	" + numero);
		
	}


	
	public void atender() {
		espera();
		System.out.println("Atendendo chamanda");
		
	}


	
	public void iniciarCorreioVoz() {
		espera();
		System.out.println("Iniciando correio Voz");
		
	}
	

}
