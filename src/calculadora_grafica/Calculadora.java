package calculadora_grafica;

public class Calculadora {
    int operador_1;
    int operador_2;
    String operacao;
    Calculadora calculadora;

    public Calculadora(int operador_1, int operador_2, String operacao) {
        this.operador_1 = operador_1;
        this.operador_2 = operador_2;
        this.operacao = operacao;
    }
    
    public int calcular() throws ArithmeticException{
        int resultado = 0;
        switch(operacao){
            case "+":
                resultado = operador_1+operador_2;
                break;
            case "-":
                resultado = operador_1-operador_2;
                break;
            case "*":
                resultado = operador_1*operador_2;
                break;
            case "/":
                try {
                    resultado = operador_1/operador_2;
                } catch (Exception e) {
                    throw new ArithmeticException();
                }                
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
    
    public void teste(){
        try {
            int resultado = calculadora.calcular();
        } catch (ArithmeticException e) {
            // tratamento da exceção;
        }        
    }
    
    
    
}

