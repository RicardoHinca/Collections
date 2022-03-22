package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessa pelo indice diferente do Set q nao consegue
		
		System.out.println(">>>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem 1 ? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem 2 ? " + lista.contains(u1));
		
		for(Usuario u : lista){
			System.out.println(u.nome);
		}
		
		
	}
}
