import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GestorDespesas gestor = new GestorDespesas();

        gestor.adicionar(new Despesa("Almoço", 15.0, "Alimentação", LocalDate.of(2026, 11, 25)));
        gestor.adicionar(new Despesa("Táxi", 10.0, "Transporte", LocalDate.of(2026, 11, 25)));
        gestor.adicionar(new Despesa("Ginásio", 10, "Saúde", LocalDate.of(2026, 11, 20)));
        gestor.adicionar(new Despesa("Unhas", 10.0, "Beleza", LocalDate.of(2026, 11,25) ));
        gestor.adicionar(new Despesa("Tranças", 22.0, "Beleza", LocalDate.of(2026, 11,25) ));
        gestor.adicionar(new Despesa("Lanche", 15.0, "Alimentação", LocalDate.of(2026, 11, 20)));

        gestor.listar();
        System.out.println("Total: " + gestor.calcularTotal());

        System.out.println("Alimentação: " + gestor.calcularTotalPorCategoria("Alimentação"));
        System.out.println("Beleza: " + gestor.calcularTotalPorCategoria("Beleza"));

        System.out.println("Nº de despesas em Alimentação: " + gestor.contarPorCategoria("Alimentação"));
        System.out.println("Nº de despesas em Beleza: " + gestor.contarPorCategoria("Beleza"));
        System.out.println("Nº de despesas em Transporte: " + gestor.contarPorCategoria("Transporte"));
    }
}