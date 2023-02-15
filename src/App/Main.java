package App;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

	/*
	 * Existem 3 tipos de lista SET<T>, são elas: 
	 * HashSet - mais rápido - Não mantem a ordem dos elementos.
	 * TreeSet - mais lento - organiza de acordo com o comparator.
	 * LinkedHashSet - velocidade intermediária - mantem a ordem original da lista.
	 * */	
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		// verifica se contem o elemento 'notebook' na lista
		System.out.println(set.contains("Notebook"));
		System.out.println();
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// união
		Set<Integer> c = new TreeSet<>(a);
		// une na lista c tudo que contem na lista a e b.
		c.addAll(b);
		System.out.println(c);
		
		//intersecção
		Set<Integer> d = new TreeSet<>(a);
		// adiciona na lista 'd' a penas os valores iguais da lista a e b.
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		// remove os valores de 'b' da lista 'a'.
		e.removeAll(b);
		System.out.println(e);

	}

}
