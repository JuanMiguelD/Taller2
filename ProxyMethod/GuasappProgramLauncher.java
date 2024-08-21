public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessagingClientProxy proxyClient = new MessagingClientProxy(originalClient);

        // Utilizar la funcionalidad de la clase original
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
    }
}