public class MessagingClient implements MessageSender {
    
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
