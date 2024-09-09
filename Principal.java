import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Computador computador1 = new Computador();
            Computador computador2 = new Computador("Dell", "Inspiron", "i7", 16, 512);
            Computador computador3 = new Computador();
            Computador computador4 = new Computador("Apple", "MacBook Pro", "M1", 8, 256);

            System.out.println("Informe os dados do primeiro computador:");
            System.out.print("Marca: ");
            computador1.setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            computador1.setModelo(scanner.nextLine());
            System.out.print("Processador: ");
            computador1.setProcessador(scanner.nextLine());
            System.out.print("Memória RAM (GB): ");
            computador1.setMemoriaRAM(scanner.nextInt());
            scanner.nextLine(); // Consumir o \n restante
            System.out.print("Armazenamento (GB): ");
            computador1.setArmazenamento(scanner.nextInt());

            System.out.println("Informe os dados do terceiro computador:");
            System.out.print("Marca: ");
            computador3.setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            computador3.setModelo(scanner.nextLine());
            System.out.print("Processador: ");
            computador3.setProcessador(scanner.nextLine());
            System.out.print("Memória RAM (GB): ");
            computador3.setMemoriaRAM(scanner.nextInt());
            scanner.nextLine(); // Consumir o \n restante
            System.out.print("Armazenamento (GB): ");
            computador3.setArmazenamento(scanner.nextInt());

            computador1.imprimir();
            computador2.imprimir();
            computador3.imprimir();
            computador4.imprimir();
        }
    }
}