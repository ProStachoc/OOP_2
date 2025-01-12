public class Main {
    public static void main(String[] args){
        Server serv = Server.getInstance();
        System.out.println(serv);

        User u = new User(new Admin());
        u.checkMsg();
        u.authorization();
        u.getInfo();
        u.checkMsg();

    }
}
