package list02.adapter.socketAndPlug;

public class App {
    public static void main(String[] args) {

        BrazilianSocket brazilianSocketAdapter = new AmericanPlugToBrazilianSocketAdapter(new AmericanHairDryer());
        brazilianSocketAdapter.connectOnPlug();
    }
}
