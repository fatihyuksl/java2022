package day26_constructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model Belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR){
      marka=markaR;
      model=modelR;
      yil=yilR;
     fiyat=fiyatR;

    }
    public Araba(){

    }
    /*
    biz herhangi bir constructor oluşturduğumuzda java
    default constructor ı siler
    eğer biz bir projemizde bir sorun yaşanmasını istemiyorsak
    mutlaka default constructor yerine parametrrsiz bir constructor
    oluşturmalıyız
     */


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}


