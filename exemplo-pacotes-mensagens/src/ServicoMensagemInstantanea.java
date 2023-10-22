//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    // public void enviarMensagem() {
    //     //primeiro confirmar se esta conctado a internet
    //     validarConectadoInternet();
    //     System.out.println("Enviado mesagem");
    //     //depois de enviada, salva o historico da mensagem
    //     salvarHistorioMensagem();
    // }
    // public void receberMensagem() {
    //     System.out.println("Recebendo mensagem");
    // }
    // //métodos privadas, visiveis somente na classe 
    // private void validarConectadoInternet() {
    //     System.out.println("Validando se está conectado a internet");
    // }
    // private void salvarHistorioMensagem() {
    //     System.out.println("Salvando o historico da mensagem");
    // }
}
