public class Main {
        public static void main(String[] args) {
            double volume;

            Cilindro cilindro = new Cilindro();
            cilindro.setRaio(3);
            cilindro.setAltura(10);

            volume = cilindro.calcularVolume();

            System.out.println("O volume do cilindro é: " + volume);
        }
    }


