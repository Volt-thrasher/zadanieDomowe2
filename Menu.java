public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.nazwa = "Screwdriver";
        Skladnik skladnik1 = new Skladnik();
        skladnik1.nazwa = "Vodka";
        skladnik1.ilosc = 50;
        Skladnik skladnik2 = new Skladnik();
        skladnik2.nazwa = "Juice";
        skladnik2.ilosc = 100;
        Skladnik skladnik3 = new Skladnik();
        skladnik3.nazwa = "Ice";
        skladnik3.ilosc = 5;
        drink1.alkoholowy = true;
        drink1.cena = 16;



        System.out.println("Nazwa: "+drink1.nazwa);
        System.out.println("Skladniki: "+skladnik1.nazwa+" - "+skladnik1.ilosc+"ml"
                +"\n"+skladnik2.nazwa+" - "+skladnik2.ilosc+"ml"+"\n"+skladnik3.nazwa+" - "+skladnik3.ilosc+"pcs");
        System.out.println("Alkohol: "+drink1.alkoholowy);
        System.out.println("Cena: "+drink1.cena);

        Drink drink2 = new Drink();
        drink2.nazwa = "Mojito N/A";
        Skladnik skladnik11 = new Skladnik();
        skladnik11.nazwa = "Sprite";
        skladnik11.ilosc = 50;
        Skladnik skladnik21 = new Skladnik();
        skladnik21.nazwa = "Lemon Juice";
        skladnik21.ilosc = 100;
        Skladnik skladnik31 = new Skladnik();
        skladnik31.nazwa = "Ice";
        skladnik31.ilosc = 5;
        drink2.alkoholowy = false;
        drink2.cena = 10;

        System.out.println("Nazwa: "+drink2.nazwa);
        System.out.println("Skladniki: "+skladnik11.nazwa+" - "+skladnik11.ilosc+"ml"
                +"\n"+skladnik21.nazwa+" - "+skladnik21.ilosc+"ml"+"\n"+skladnik31.nazwa+" - "+skladnik31.ilosc+"pcs");
        System.out.println("Alkohol: "+drink2.alkoholowy);;
        System.out.println("Cena: "+drink2.cena);
    }
}
