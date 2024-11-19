package classe;

public class Equals {
  public static void main(String[] args) {
    Usuario u1 = new Usuario();
    u1.nome = "John";
    u1.email = "john@email.com";

    Usuario u2 = new Usuario();
    u2.nome = "John";
    u2.email = "john@email.com";

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
  }
}
