import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Utilizando_Map {
    public static void main(String[] args) {
        // Declaração de um HashMap e TreeMap
        Map<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserção de elementos no HashMap
        hashMap.put(5, "Camila");
        hashMap.put(7, "João");
        hashMap.put(1, "Pedro");
        hashMap.put(3, "Marina");

        // Inserção de elementos no TreeMap
        treeMap.put(5, "Camila");
        treeMap.put(7, "João");
        treeMap.put(1, "Pedro");
        treeMap.put(3, "Marina");

        // Exibir os mapas criados
        System.out.println("HashMap: " + hashMap); // A ordem dos elementos pode ser aleatória
        System.out.println("TreeMap: " + treeMap); // Os elementos são ordenados pelas chaves

        // Exibir apenas as chaves do HashMap
        System.out.println("Chaves do HashMap: " + hashMap.keySet());

        // Exibir apenas os valores do HashMap
        System.out.println("Valores do HashMap: " + hashMap.values());

        // Verificar se uma chave ou valor existe no HashMap
        System.out.println("HashMap contém a chave 5? " + hashMap.containsKey(5));
        System.out.println("HashMap contém o valor 'Marina'? " + hashMap.containsValue("Marina"));

        // Remover um elemento do HashMap
        hashMap.remove(7);
        System.out.println("HashMap após remover a chave 7: " + hashMap);

        // Obter um valor específico a partir de uma chave no HashMap
        String valor = hashMap.get(3);
        System.out.println("Valor associado à chave 3 no HashMap: " + valor);

        // Iterar sobre as entradas do HashMap
        System.out.println("Iterando sobre as entradas do HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Exemplo de TreeMap
        // Inserir mais elementos para demonstrar a ordenação
        treeMap.put(8, "Lucas");
        treeMap.put(2, "Ana");

        // Exibir o TreeMap atualizado
        System.out.println("TreeMap atualizado: " + treeMap);

        // Obter a primeira e a última chave no TreeMap
        System.out.println("Primeira chave no TreeMap: " + treeMap.firstKey());
        System.out.println("Última chave no TreeMap: " + treeMap.lastKey());

        // Submapa de um intervalo de chaves
        Map<Integer, String> subMap = treeMap.subMap(2, 7);
        System.out.println("Submapa de 2 a 7 no TreeMap: " + subMap);

        // Exibir tamanho dos mapas
        System.out.println("Tamanho do HashMap: " + hashMap.size());
        System.out.println("Tamanho do TreeMap: " + treeMap.size());

        System.out.println("\n-----FIM-----");
    }
}



 /*
Declaração de Mapas: Utilizamos HashMap e TreeMap para mostrar diferentes implementações da interface Map.

Inserção de Elementos: Adicionamos elementos usando o método put, que associa uma chave a um valor.

Exibição de Mapas: Imprimimos o conteúdo dos mapas. HashMap não garante ordem dos elementos, enquanto TreeMap mantém os elementos ordenados pela chave.

Chaves e Valores: Usamos keySet() para obter apenas as chaves e values() para obter apenas os valores dos mapas.

Verificação de Chave/Valor: Demonstramos como verificar a presença de uma chave ou valor específico com containsKey() e containsValue().

Remoção de Elemento: Removemos um elemento do HashMap usando remove().

Obtenção de Valor: Obtemos um valor específico a partir de uma chave com get().

Iteração sobre Entradas: Iteramos sobre as entradas do HashMap usando entrySet() para demonstrar como percorrer os elementos.

TreeMap: Adicionamos mais elementos ao TreeMap para mostrar a ordenação natural das chaves.

Primeira e Última Chave: Demonstramos como obter a primeira e a última chave no TreeMap com firstKey() e lastKey().

Submapa: Criamos um submapa para mostrar um intervalo específico de chaves.

Tamanho dos Mapas: Exibimos o tamanho dos mapas usando size().
 */