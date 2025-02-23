package exercicio2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome (String nome){
        return nome;

    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public int getIdade (String nome){

        return idade;
    }
    public void setIdade(int idade){

        this.idade = idade;
    }
    public double getAltura (){

        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;

    }
    public double getPeso () {
        return peso;

    }

    public void setPeso (double peso){

        this.peso = peso;
    }

    public double calcularIMC(){

        return this.peso/(this.altura*this.altura);
    }
    public String classificarIMC(){
        double imc = this.calcularIMC();
        if(imc< 18.5){
            return "Abaixo do Peso";
        } else if(imc< 25){
            return "Peso normal";
        } else if(imc<30){
            return "Sobrepeso";
        }else if(imc<35){
            return "Obesidade grau 1";
        }else if(imc<40){
            return "Obesidade grau 2";
        }else {
            return "Obesidade grau 3";
        }

    }
    public String toString () {
        return "nome: " + this.nome + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura" + this.altura + "\n" +
                "Idade" + this.idade + "\n" +
                "IMC" + this.calcularIMC() + "\n" +
                "Classificação" + this.classificarIMC();
    }
}


