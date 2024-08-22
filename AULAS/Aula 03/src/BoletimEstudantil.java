import static org.junit.Assert.fail;

/**
 * BoletimEstudantil
 */
public class BoletimEstudantil {

    public static void main(String[] args) {
        int notaProva = 5;
        String resultadoFinal = obterResultadoFinal(notaProva);
        System.out.println(resultadoFinal);
    }
    
       
    public static String obterResultadoFinal(int notaProva) {
             String resultado;
            if (notaProva < 6) {
                resultado = "Reprovado";
            } else if (notaProva == 6) {
                resultado = "Recuperação";
            } else {
                resultado = "Aprovado";
            }
            return resultado;
    }
}
