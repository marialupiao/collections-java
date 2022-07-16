package set;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores do arco-íris uma abaixo da outra :");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba a ordem inversa que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris3) {
            if(cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris3.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris3);

        System.out.println("Limpe o conjunto:" );
        coresArcoIris2.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris2.isEmpty());







    }
}
