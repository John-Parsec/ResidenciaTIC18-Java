package cliente;

import java.util.*;

public class Usuario {
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens, pontuacao;
	
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public String getNacionalidade() {
			return nacionalidade;
		}
	
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
	
		public ArrayList<String> getPostagens() {
			return postagens;
		}
		
		public int getQuantidadeDePostagens() {
			return quantidadeDePostagens;
		}

		public int getPontuacao() {
			return pontuacao;
		}

		public Usuario() {
			super();
			this.nome = "";
			this.email = "";
			this.nacionalidade = "";
			this.postagens = new ArrayList<String>();
			this.quantidadeDePostagens = 0;
			this.pontuacao = 0;
		}
		
		public Usuario(String nome, String email) {
			super();
			this.nome = nome;
			this.email = email;
			this.nacionalidade = "";
			this.postagens = new ArrayList<String>();
			this.quantidadeDePostagens = 0;
			this.pontuacao = 0;
		}
		
		public void  adicionaPostagem(String post) {
			this.postagens.add(post);
			this.quantidadeDePostagens++;
		}
		
		public void alteraPontuacao(int delta) {
			if(this.pontuacao + delta >=0)
				this.pontuacao += delta;
		}
		
		public static void main(String[] args) {
			Usuario user1 = new Usuario();
			ArrayList<String> posts;
			String post;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Nome de usuario: ");
			user1.setNome(sc.nextLine());
			
			System.out.println("Email: ");
			user1.setEmail(sc.nextLine());
			
			System.out.println("Nacionalidade: ");
			user1.setNacionalidade(sc.nextLine());
			
			System.out.println("Post: ");
			post = sc.nextLine();
			user1.adicionaPostagem(post);
			
			posts = user1.getPostagens();
			
			System.out.println("Post: " + posts.get(0));
			
			
			sc.close();
		}
}