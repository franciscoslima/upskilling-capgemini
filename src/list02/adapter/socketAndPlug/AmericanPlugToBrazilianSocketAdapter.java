package list02.adapter.socketAndPlug;

public class AmericanPlugToBrazilianSocketAdapter implements BrazilianSocket {

    private AmericanHairDryer americanHairDryer;

    public AmericanPlugToBrazilianSocketAdapter(AmericanHairDryer americanHairDryer) {
        this.americanHairDryer = americanHairDryer;
    }

    @Override
    public void connectOnPlug() {
        System.out.println("Using American Plug To Brazilian Socket Adapter");
        americanHairDryer.plugInFlatPlug();
    }

}
