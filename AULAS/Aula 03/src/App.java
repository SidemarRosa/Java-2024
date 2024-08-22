public class App {
    public static void main(String[] args) throws Exception {
        String fabricanteCarro = "Ford";
        String modeloCarro = "Mustang";
        int anoCarro = 2024;

        String carroEscolhido = carroDosSonhos(fabricanteCarro, modeloCarro, anoCarro);

        System.out.println(carroEscolhido);
    }
    public static String carroDosSonhos (String fabricanteCarro, String modeloCarro, Integer anoCarro) {
        return "O carro dos meus sonhos é um " + fabricanteCarro + " " + modeloCarro + " " +anoCarro;
    }
}
