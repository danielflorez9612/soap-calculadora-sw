package proyectoCalculadora;

import javax.jws.WebService;

@WebService
public class Calculadora {
    public Calculadora() {
            super();
        }
        public double sumar(double a, double b){
            return a+b;
        }
        public double restar(double a, double b){
            return a-b;
        }
        public double sqrt(double a){
            return Math.sqrt(a);
        }
        public double dividir(double a, double b){
            return a/b;
        }
        public double multiplicar(double a, double b){
            return a*b;
        }
        public double fraccionUno(double a){
            return 1/a;
        }
        public double cuadrado(double a){
            return Math.pow(a, 2);
        }        
        public double pow(double a,double b){
            return Math.pow(a, b);
        }
}
