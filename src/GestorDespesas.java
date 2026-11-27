import java.util.ArrayList;
import java.util.List;


public class GestorDespesas {

    private List<Despesa> despesas = new ArrayList<>();

    public void adicionar(Despesa d) {
        despesas.add(d);
    }

    public void listar() {
        for (Despesa d : despesas) {
            System.out.println(d);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (Despesa d : despesas) {
            total += d.getValor();
        }
        //percorrer a lista e somar
        return total;

    }

    public double calcularTotalPorCategoria(String categoria) {
        double total = 0;                                  // 1. caixinha a zero

        for (Despesa d : despesas) {                       // 2. percorre a lista
            if (d.getCategoria().equals(categoria)) {      // 3. só se for a categoria certa
                total += d.getValor();                     // 4. soma o valor
            }
        }

        return total;                                      // 5. devolve o resultado
    }


    public int contarPorCategoria(String categoria) {
        int contador = 0;

        for (Despesa d : despesas) {
            if (d.getCategoria().equals(categoria)) {

                contador++;

            }

        }

        return contador;
    }

}
