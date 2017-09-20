import utfpr.ct.dainf.if62c.pratica.fp2pratica3.Matriz;
/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Projeto33 {
    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        
        Matriz adicao = new Matriz(3, 2);
        double[][] adc = adicao.getMatriz();
        adc[0][0] = 1.0;
        adc[0][1] = 1.0;
        adc[1][0] = 1.0;
        adc[1][1] = 1.0;
        adc[2][0] = 1.0;
        adc[2][1] = 1.0;
        
        Matriz prod = new Matriz(2, 3);
        double[][] produ = prod.getMatriz();
        produ[0][0] = 2.0;
        produ[0][1] = 2.0;
        produ[0][2] = 2.0;
        produ[1][0] = 2.0;
        produ[1][1] = 2.0;
        produ[1][2] = 4.0;
        
        Matriz transp = orig.getTransposta();
        Matriz soma = orig.soma(adicao);
        Matriz produto = orig.prod(prod);
        
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        System.out.println("Matriz Soma: " + soma);
        System.out.println("Matriz Produto: " + produto);
    }
}
