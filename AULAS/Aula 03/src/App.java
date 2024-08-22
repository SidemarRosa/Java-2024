public class App {
    public static void main(String[] args) throws Exception {
        String modelo = "Gol quadrado";
        String cor = "Azul";
        String ano = "2015";
        String marca = "Volkswagen";
        String placa = "ABC1234";

        String meuCarro = " Meu " + modelo + " Cor " + cor +" ano "+ ano +" da fabricante "  + marca + "  placa " + placa;

        System.out.println( "O" + meuCarro + " " + freiarCarro(meuCarro));
    }
    public static String acelerarCarro( String acelerar ) {
        return "acelerou";
    }
    public static String freiarCarro( String freiar ) {
        return "freou";
    }
}
