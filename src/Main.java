import main.Identifier;

public class Main {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Uso: Main <string>");
        } else {
            Identifier id = new Identifier();
            if(id.validateIdentifier(args[0])){
                System.out.print("Valido");
            } else {
                System.out.print("Invalido");
            }
        }

    }
}