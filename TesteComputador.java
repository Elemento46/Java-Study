import java.util.Scanner;

public class TesteComputador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        
        System.out.println("Informe a marca do computador 1:");
        computador1.setMarca(scanner.nextLine());
        System.out.println("Informe o modelo do computador 1:");
        computador1.setModelo(scanner.nextLine());
        System.out.println("Informe o processador do computador 1:");
        computador1.setProcessador(scanner.nextLine());
        System.out.println("Informe a memória RAM do computador 1 (em GB):");
        computador1.setMemoriaRAM(scanner.nextInt());
        System.out.println("Informe o armazenamento do computador 1 (em GB):");
        computador1.setArmazenamento(scanner.nextInt());
        scanner.nextLine(); // Consumir a linha extra
        
        System.out.println("Informe a marca do computador 2:");
        computador2.setMarca(scanner.nextLine());
        System.out.println("Informe o modelo do computador 2:");
        computador2.setModelo(scanner.nextLine());
        System.out.println("Informe o processador do computador 2:");
        computador2.setProcessador(scanner.nextLine());
        System.out.println("Informe a memória RAM do computador 2 (em GB):");
        computador2.setMemoriaRAM(scanner.nextInt());
        System.out.println("Informe o armazenamento do computador 2 (em GB):");
        computador2.setArmazenamento(scanner.nextInt());
        scanner.nextLine(); // Consumir a linha extra
        
        System.out.println("Informe a marca do computador 3:");
        String marca3 = scanner.nextLine();
        System.out.println("Informe o modelo do computador 3:");
        String modelo3 = scanner.nextLine();
        System.out.println("Informe o processador do computador 3:");
        String processador3 = scanner.nextLine();
        System.out.println("Informe a memória RAM do computador 3 (em GB):");
        int memoriaRAM3 = scanner.nextInt();
        System.out.println("Informe o armazenamento do computador 3 (em GB):");
        int armazenamento3 = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha extra
        
        Computador computador3 = new Computador(marca3, modelo3, processador3, memoriaRAM3, armazenamento3);

        System.out.println("Informe a marca do computador 4:");
        String marca4 = scanner.nextLine();
        System.out.println("Informe o modelo do computador 4:");
        String modelo4 = scanner.nextLine();
        System.out.println("Informe o processador do computador 4:");
        String processador4 = scanner.nextLine();
        System.out.println("Informe a memória RAM do computador 4 (em GB):");
        int memoriaRAM4 = scanner.nextInt();
        System.out.println("Informe o armazenamento do computador 4 (em GB):");
        int armazenamento4 = scanner.nextInt();

        Computador computador4 = new Computador(marca4, modelo4, processador4, memoriaRAM4, armazenamento4);

        System.out.println("\nDados dos computadores criados:");
        computador1.imprimir();
        System.out.println();
        computador2.imprimir();
        System.out.println();
        computador3.imprimir();
        System.out.println();
        computador4.imprimir();

        scanner.close();
    }
}
