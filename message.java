class MessageText{
    String number_call;
    String sender_number;
    String messagetext;
    String getdetails(String number_call, String sender_number){
        return number_call + sender_number;
    }
    
}
class Message {
    String getPhone(String phonenumber){
        String number_call = phonenumber;
        return number_call;
    }
    void printMessage(String message){
        String messageText = message;
        System.out.println(messageText);
    }
    public static void main(String[] args) {
        String number_call = "01111";
        String sender_number = "23242";
        String messagetext = "hello";

        MessageText m1 = new MessageText();
        Message n1 = new Message();
        
        n1.printMessage(messagetext);
        n1.getPhone(number_call);
        m1.getdetails(number_call, sender_number);
    }
}
