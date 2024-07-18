import java.util.*;

public class Utilizando_Set {
    public static void main(String[] args) {
        // Exemplo de HashSet: Não garante ordem dos elementos
        System.out.println("Exemplo de HashSet:");
        Set<String> hashSet = new HashSet<>();

        // Inserção de elementos
        hashSet.add("Mariana");
        hashSet.add("Camila");
        hashSet.add("Zoraide");
        hashSet.add("Bruno");
        hashSet.add("Gustavo");
        hashSet.add("Mariana"); // Elemento duplicado, não será adicionado

        // Exibir elementos do HashSet
        System.out.println("HashSet: " + hashSet);
        // Verificar se o valor "Camila" existe
        System.out.println("Contém 'Camila'? " + hashSet.contains("Camila"));
        // Remover o elemento "Gustavo"
        hashSet.remove("Gustavo");
        System.out.println("HashSet após remover 'Gustavo': " + hashSet);
        // Exibir o tamanho do HashSet
        System.out.println("Tamanho do HashSet: " + hashSet.size());
        System.out.println();



        // Exemplo de TreeSet: Garante ordem natural dos elementos
        System.out.println("Exemplo de TreeSet:");
        NavigableSet<String> treeSet = new TreeSet<>();

        // Inserção de elementos
        treeSet.add("Mariana");
        treeSet.add("Camila");
        treeSet.add("Zoraide");
        treeSet.add("Bruno");
        treeSet.add("Gustavo");
        treeSet.add("Mariana"); // Elemento duplicado, não será adicionado

        // Exibir elementos do TreeSet
        System.out.println("TreeSet: " + treeSet);
        // Verificar se o valor "Camila" existe
        System.out.println("Contém 'Camila'? " + treeSet.contains("Camila"));
        // Remover o elemento "Gustavo"
        treeSet.remove("Gustavo");
        System.out.println("TreeSet após remover 'Gustavo': " + treeSet);
        // Exibir o primeiro elemento
        System.out.println("Primeiro elemento: " + treeSet.first());
        // Exibir o último elemento
        System.out.println("Último elemento: " + treeSet.last());
        // Exibir o elemento menor que "Camila"
        System.out.println("Menor que 'Camila': " + treeSet.lower("Camila"));
        // Exibir o elemento maior que "Camila"
        System.out.println("Maior que 'Camila': " + treeSet.higher("Camila"));
        // Exibir o tamanho do TreeSet
        System.out.println("Tamanho do TreeSet: " + treeSet.size());
        System.out.println();



        // Exemplo de LinkedHashSet: Garante a ordem de inserção dos elementos
        System.out.println("Exemplo de LinkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Inserção de elementos
        linkedHashSet.add("Mariana");
        linkedHashSet.add("Camila");
        linkedHashSet.add("Zoraide");
        linkedHashSet.add("Bruno");
        linkedHashSet.add("Gustavo");
        linkedHashSet.add("Mariana"); // Elemento duplicado, não será adicionado

        // Exibir elementos do LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
        // Verificar se o valor "Camila" existe
        System.out.println("Contém 'Camila'? " + linkedHashSet.contains("Camila"));
        // Remover o elemento "Gustavo"
        linkedHashSet.remove("Gustavo");
        System.out.println("LinkedHashSet após remover 'Gustavo': " + linkedHashSet);
        // Exibir o tamanho do LinkedHashSet
        System.out.println("Tamanho do LinkedHashSet: " + linkedHashSet.size());
    }
}

/*
HASHSET

Características:
  - Não mantém a ordem dos elementos.
  - Baseado em uma tabela hash.
  - Permite elementos nulos.
  - Alta performance para operações básicas (add, remove, contains) desde que a função hash seja boa.

Casos de Uso:
  - Quando a ordem dos elementos não é importante.
  - Quando se deseja alta performance em operações de busca, inserção e remoção.

TREESET

Características:
  - Mantém os elementos em ordem natural.
  - Baseado em uma árvore binária de busca.
  - Não permite elementos nulos.
  - Suporta operações de navegação como encontrar o menor elemento maior que um dado elemento.

Casos de Uso:
  - Quando se deseja manter os elementos ordenados.
  - Quando operações de navegação são necessárias (por exemplo, encontrar o elemento maior imediatamente abaixo ou acima de um determinado valor).

LINKEDHASHSET

Características:
  - Mantém a ordem de inserção dos elementos.
  - Baseado em uma tabela hash e uma lista duplamente ligada.
  - Permite elementos nulos.
  - Performance ligeiramente inferior ao `HashSet` devido ao custo de manutenção da ordem de inserção.

Casos de Uso:
  - Quando se deseja manter a ordem de inserção dos elementos.
  - Quando a iteração sobre os elementos em ordem de inserção é importante.
*/