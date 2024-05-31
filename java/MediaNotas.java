
public class MediaNotas {

    public static void main(String[] args) {
        calcularMedia();
    }

    private static void calcularMedia() {
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 8;
        int meditaTotal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das quatro notas é: " + meditaTotal);
    }
}
