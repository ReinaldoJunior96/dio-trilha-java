
public class App {

    public static void main(String[] args) throws Exception {
        String nomeCompleto = nomeCompletoFunction("rei", "junior");
        System.out.println(nomeCompleto);

    }

    public static String nomeCompletoFunction(String primeiro, String segundo) {
        return primeiro.concat(" ").concat(segundo);
    }
}
