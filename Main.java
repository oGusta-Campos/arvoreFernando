package arvore;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        Random rand = new Random();

        Set<Integer> conjunto = new LinkedHashSet<>();

        while (conjunto.size() < 20) {
            conjunto.add(rand.nextInt(101));
        }

        List<Integer> numeros = new ArrayList<>(conjunto);

        for (int num : numeros) {
            arvore.inserir(num);
        }

        System.out.println("Números inseridos:");
        System.out.println(numeros);

        System.out.println("\n-Árvore Original-");

        System.out.print("\nPré-ordem: ");
        arvore.preOrdem(arvore.raiz);

        System.out.print("\nIn-ordem: ");
        arvore.inOrdem(arvore.raiz);

        System.out.print("\nPós-ordem: ");
        arvore.posOrdem(arvore.raiz);

        System.out.print("\nEm nível: ");
        arvore.emNivel();

        System.out.println("\n\nRemovendo 5 números:");

        for (int i = 0; i < 5; i++) {
            int indice = rand.nextInt(numeros.size());
            int num = numeros.remove(indice);
            System.out.print(num + " ");
            arvore.remover(num);
        }

        System.out.println("\n\n-Árvore Após Remoção-");

        System.out.print("\nPré-ordem: ");
        arvore.preOrdem(arvore.raiz);

        System.out.print("\nIn-ordem: ");
        arvore.inOrdem(arvore.raiz);

        System.out.print("\nPós-ordem: ");
        arvore.posOrdem(arvore.raiz);

        System.out.print("\nEm nível: ");
        arvore.emNivel();
    }
}