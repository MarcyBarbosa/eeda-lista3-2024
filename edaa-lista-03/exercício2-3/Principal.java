import java.util.ArrayList;

public class Principal {
        public static void main(String[] args) {

            ArrayList<String> nomes = new ArrayList<>();
            
            nomes.add("Marcela");
            nomes.add("Vinícius");
            nomes.add("Natasha");
            nomes.add("João");
            nomes.add("Amanda");
    
            Ordenador.insertionSort(nomes);
    
            System.out.println("\nNomes ordenados:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    
}
