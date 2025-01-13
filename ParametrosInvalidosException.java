// Classe que define a exceção personalizada
public class ParametrosInvalidosException extends Exception {
    // Construtor padrão com mensagem padrão
    public ParametrosInvalidosException() {
        //String do tipo super
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
    //construtor com a mensagem
    public ParametrosInvalidosException(String message){
        super(message);
    }
    

    /*
     * Construtor com mensagem personalizada
     * public ParametrosInvalidosException(String message) {
     * super(message);
     * }
     */
}
