import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // ADD "Marco" na posição 2 da lista

        System.out.println(list.size());  // imprime o tamanho da lista

        list.remove("Anna");  // DELETA A Anna

        list.remove(1); // DELETA O ITE 01

        list.removeIf(x -> x.charAt(0) == 'M');  // DELETA TODOS OS ITEMS EM QUE O  1º CARACTERE É 'M'

        list.indexOf("Bob"); // Encontra o "Bob"

//      Filtrar uma Lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);

//      Filtrar o primeiro item que começa com a letra 'A'
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


        //imprimir toda a lista
        for(String x : list){
            System.out.println(x);
        }


    }
}
