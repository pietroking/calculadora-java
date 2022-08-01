public class Calculadora {

    public double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public double raizQuadrada(double valor1) {
        return Math.sqrt(valor1);
    }

    public double exponenciacao(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }

    public double bhaskara(double valor1, double valor2, double valor3) {
        double delta = Math.pow(valor2, 2.0) - 4 * valor1 * valor3;
        double x1 = (-valor2 + Math.sqrt(delta)) / (2.0 * valor1);
        double x2 = (-valor2 - Math.sqrt(delta)) / (2.0 * valor1);
        return x1 + x2;
    }

}
