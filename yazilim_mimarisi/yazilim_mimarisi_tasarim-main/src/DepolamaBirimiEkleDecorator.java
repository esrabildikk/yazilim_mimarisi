public class DepolamaBirimiEkleDecorator extends BilgisayarDecorator{

    int depolamaBuyuklugu;
    double fiyat;

    public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar, int depolamaBuyuklugu) {
        super(bilgisayar);
        this.depolamaBuyuklugu = depolamaBuyuklugu;
    }

    @Override
    public double fiyat() {
        if (depolamaBuyuklugu == 500 ){
            //500 GB SSD eklenirse
            fiyat = super.fiyat() + 3500;
        } else if (depolamaBuyuklugu == 1000) {
            //1000 GB SSD eklenirse
            fiyat = super.fiyat() + 5000;
        }else if (depolamaBuyuklugu == 2000){
            //2000 GB SSD eklenirse
            fiyat = super.fiyat() + 8000;
        }else {
            System.out.println("500 - 1000 - 2000 GB depolama dışında SSD seçilmesi yapılamamaktadır");
        }
        return fiyat;
    }

    @Override
    public String aciklama() {
        return super.aciklama() +" " + depolamaBuyuklugu + " GB SSD disk eklendi... \n";
    }
}
