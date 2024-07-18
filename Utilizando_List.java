import java.util.*;

public class Utilizando_List {
    public static void main(String[] args) {

        // Declaração do ArrayList
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Inserção de elementos
        numeros.add(256);
        numeros.add(114);
        numeros.add(35);
        numeros.add(7);
        numeros.add(64);
        numeros.add(89);
        numeros.add(24);

        // Exibição dos elementos
        System.out.println("Elementos adicionados:");
        System.out.println(numeros);

        // Removendo um número pelo índice
        numeros.remove(2);  // Remove o elemento no índice 2 (valor 35)

        // Removendo um número pelo valor
        numeros.remove(Integer.valueOf(7));  // Remove o valor 7

        // Ordenação dos elementos
        Collections.sort(numeros);

        // Exibição dos elementos ordenados
        System.out.println("Elementos ordenados:");
        System.out.println(numeros);

        // Busca por um elemento
        boolean contem64 = numeros.contains(64);
        System.out.println("Contém 64? " + contem64);

        // Verificação do tamanho da lista
        int tamanho = numeros.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Acessando um elemento pelo índice
        int elementoNoIndice2 = numeros.get(2);
        System.out.println("Elemento no índice 2: " + elementoNoIndice2);

        // Modificando um elemento pelo índice
        numeros.set(2, 100);  // Modifica o elemento no índice 2 para 100

        // Exibição dos elementos modificados
        System.out.println("Elementos após modificação:");
        System.out.println(numeros);

        // Iterando sobre a lista com um loop for-each
        System.out.println("Iterando com loop for-each:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Iterando sobre a lista com um iterator
        System.out.println("Iterando com iterator:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Criando uma sublista
        List<Integer> sublista = numeros.subList(1, 4);
        System.out.println("Sublista (índices de 1 a 3):");
        System.out.println(sublista);

        // Limpeza da lista
        numeros.clear();
        System.out.println("Lista após limpeza:");
        System.out.println(numeros.isEmpty() ? "Lista está vazia" : numeros);
    }
}

/*
1. Adição de Elementos (`add`):
   - `numeros.add(256);`
   - Adiciona elementos ao final da lista.

2. Remoção de Elementos (`remove`):
   - `numeros.remove(2);` Remove o elemento no índice 2.
   - `numeros.remove(Integer.valueOf(7));` Remove o elemento cujo valor é 7.

3. Ordenação (`Collections.sort`):
   - `Collections.sort(numeros);`
   - Ordena os elementos da lista em ordem natural (crescente).

4. Busca (`contains`):
   - `boolean contem64 = numeros.contains(64);`
   - Verifica se a lista contém o valor 64.

5. Verificação do Tamanho (`size`):
   - `int tamanho = numeros.size();`
   - Retorna o número de elementos na lista.

6. Acesso e Modificação de Elementos (`get`, `set`):
   - `int elementoNoIndice2 = numeros.get(2);` Acessa o elemento no índice 2.
   - `numeros.set(2, 100);` Modifica o elemento no índice 2 para 100.

7. Iteração:
   - Loop for-each: `for (int num : numeros) { System.out.println(num); }`
   - Iterator: `Iterator<Integer> iterator = numeros.iterator();`

8. Sublista (`subList`):
   - `List<Integer> sublista = numeros.subList(1, 4);`
   - Cria uma sublista dos elementos entre os índices 1 e 3 (inclusive).

9. Limpeza da Lista (`clear`):
   - `numeros.clear();`
   - Remove todos os elementos da lista.

Aplicações Comuns

- Gerenciamento de listas de dados: ArrayList é amplamente utilizado para armazenar e manipular listas de dados que podem crescer e encolher dinamicamente.
- Ordenação e Pesquisa: Útil para ordenar elementos e realizar buscas eficientes.
- Sublistas e Particionamento: Criar sublistas para processamento específico ou para dividir listas maiores em partes menores.
- Iteração e Processamento: Iterar sobre os elementos para realizar operações de processamento, como filtragem e transformação.
*/