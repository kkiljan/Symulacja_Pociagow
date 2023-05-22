import java.util.List;
import java.util.Objects;

public class Main extends Thread{
    public static void main(String[] args) {

        Wagon wagon1 = new WagonBagażowoPocztowy(15.0);
        Wagon wagon2 = new WagonBagażowoPocztowy(10.0);
        Wagon wagon3 = new WagonBagażowoPocztowy(20.0);
        Wagon wagon4 = new WagonBagażowoPocztowy(12.5);
        Wagon wagon5 = new WagonBagażowoPocztowy(18.0);
        Wagon wagon6 = new WagonBagażowoPocztowy(14.0);
        Wagon wagon7 = new WagonBagażowoPocztowy(13.5);
        Wagon wagon8 = new WagonBagażowoPocztowy(16.0);
        Wagon wagon9 = new WagonBagażowoPocztowy(17.5);
        Wagon wagon10 = new WagonBagażowoPocztowy(9.0);
        Wagon wagon11 = new WagonChłodniczy(40.0);
        Wagon wagon12 = new WagonChłodniczy(35.0);
        Wagon wagon13 = new WagonChłodniczy(42.0);
        Wagon wagon14 = new WagonChłodniczy(38.5);
        Wagon wagon15 = new WagonChłodniczy(45.0);
        Wagon wagon16 = new WagonChłodniczy(39.0);
        Wagon wagon17 = new WagonChłodniczy(37.5);
        Wagon wagon18 = new WagonChłodniczy(41.0);
        Wagon wagon19 = new WagonChłodniczy(43.5);
        Wagon wagon20 = new WagonChłodniczy(36.0);
        Wagon wagon21 = new WagonNaCiekłeMateriałyToksyczne(30.0);
        Wagon wagon22 = new WagonNaCiekłeMateriałyToksyczne(27.0);
        Wagon wagon23 = new WagonNaCiekłeMateriałyToksyczne(35.0);
        Wagon wagon24 = new WagonNaCiekłeMateriałyToksyczne(31.5);
        Wagon wagon25 = new WagonNaCiekłeMateriałyToksyczne(38.0);
        Wagon wagon26 = new WagonNaCiekłeMateriałyToksyczne(32.0);
        Wagon wagon27 = new WagonNaCiekłeMateriałyToksyczne(30.5);
        Wagon wagon28 = new WagonNaCiekłeMateriałyToksyczne(34.0);
        Wagon wagon29 = new WagonNaCiekłeMateriałyToksyczne(36.5);
        Wagon wagon30 = new WagonNaCiekłeMateriałyToksyczne(29.0);
        Wagon wagon31 = new WagonNaMateriałyCiekłe(17.0);
        Wagon wagon32 = new WagonNaMateriałyCiekłe(15.0);
        Wagon wagon33 = new WagonNaMateriałyCiekłe(19.0);
        Wagon wagon34 = new WagonNaMateriałyCiekłe(16.5);
        Wagon wagon35 = new WagonNaMateriałyCiekłe(20.0);
        Wagon wagon36 = new WagonNaMateriałyCiekłe(16.0);
        Wagon wagon37 = new WagonNaMateriałyCiekłe(14.5);
        Wagon wagon38 = new WagonNaMateriałyCiekłe(18.0);
        Wagon wagon39 = new WagonNaMateriałyCiekłe(21.5);
        Wagon wagon40 = new WagonNaMateriałyCiekłe(13.0);
        Wagon wagon41 = new WagonNaMateriałyGazowe(33.0);
        Wagon wagon42 = new WagonNaMateriałyGazowe(30.0);
        Wagon wagon43 = new WagonNaMateriałyGazowe(36.0);
        Wagon wagon44 = new WagonNaMateriałyGazowe(31.5);
        Wagon wagon45 = new WagonNaMateriałyGazowe(38.0);
        Wagon wagon46 = new WagonNaMateriałyGazowe(32.0);
        Wagon wagon47 = new WagonNaMateriałyGazowe(29.5);
        Wagon wagon48 = new WagonNaMateriałyGazowe(34.0);
        Wagon wagon49 = new WagonNaMateriałyGazowe(35.5);
        Wagon wagon50 = new WagonNaMateriałyGazowe(28.0);
        Wagon wagon51 = new WagonNaMateriałyToksyczne(11.0);
        Wagon wagon52 = new WagonNaMateriałyToksyczne(10.0);
        Wagon wagon53 = new WagonNaMateriałyToksyczne(12.0);
        Wagon wagon54 = new WagonNaMateriałyToksyczne(11.5);
        Wagon wagon55 = new WagonNaMateriałyToksyczne(13.0);
        Wagon wagon56 = new WagonNaMateriałyToksyczne(10.5);
        Wagon wagon57 = new WagonNaMateriałyToksyczne(9.5);
        Wagon wagon58 = new WagonNaMateriałyToksyczne(12.5);
        Wagon wagon59 = new WagonNaMateriałyToksyczne(14.0);
        Wagon wagon60 = new WagonNaMateriałyToksyczne(9.0);
        Wagon wagon61 = new WagonNaMateriałyWybuchowe(50.0);
        Wagon wagon62 = new WagonNaMateriałyWybuchowe(30.0);
        Wagon wagon63 = new WagonNaMateriałyWybuchowe(10.0);
        Wagon wagon64 = new WagonNaMateriałyWybuchowe(40.0);
        Wagon wagon65 = new WagonNaMateriałyWybuchowe(15.0);
        Wagon wagon66 = new WagonNaMateriałyWybuchowe(25.0);
        Wagon wagon67 = new WagonNaMateriałyWybuchowe(35.0);
        Wagon wagon68 = new WagonNaMateriałyWybuchowe(45.0);
        Wagon wagon69 = new WagonNaMateriałyWybuchowe(5.0);
        Wagon wagon70 = new WagonPasażerski(40.0);
        Wagon wagon71 = new WagonPasażerski(40.0);
        Wagon wagon72 = new WagonPasażerski(35.0);
        Wagon wagon73 = new WagonPasażerski(42.0);
        Wagon wagon74 = new WagonPasażerski(39.5);
        Wagon wagon75 = new WagonPasażerski(44.0);
        Wagon wagon76 = new WagonPasażerski(37.5);
        Wagon wagon77 = new WagonPasażerski(33.0);
        Wagon wagon78 = new WagonPasażerski(45.5);
        Wagon wagon79 = new WagonPasażerski(47.0);
        Wagon wagon80 = new WagonPasażerski(34.0);
        Wagon wagon81 = new WagonPocztowy(37.0);
        Wagon wagon82 = new WagonPocztowy(40.0);
        Wagon wagon83 = new WagonPocztowy(36.5);
        Wagon wagon84 = new WagonPocztowy(39.0);
        Wagon wagon85 = new WagonPocztowy(42.0);
        Wagon wagon86 = new WagonPocztowy(35.0);
        Wagon wagon87 = new WagonPocztowy(38.5);
        Wagon wagon88 = new WagonPocztowy(41.0);
        Wagon wagon89 = new WagonPocztowy(34.0);
        Wagon wagon90 = new WagonPocztowy(37.5);
        Wagon wagon91 = new WagonRestautacyjny(44.0);
        Wagon wagon92 = new WagonRestautacyjny(44.5);
        Wagon wagon93 = new WagonRestautacyjny(43.0);
        Wagon wagon94 = new WagonRestautacyjny(42.0);
        Wagon wagon95 = new WagonRestautacyjny(43.5);
        Wagon wagon96 = new WagonRestautacyjny(45.0);
        Wagon wagon97 = new WagonRestautacyjny(44.5);
        Wagon wagon98 = new WagonRestautacyjny(45.5);
        Wagon wagon99 = new WagonRestautacyjny(43.5);
        Wagon wagon100 = new WagonTowarowyCiężki(66.0);
        Wagon wagon101 = new WagonTowarowyCiężki(66.0);
        Wagon wagon102 = new WagonTowarowyCiężki(70.0);
        Wagon wagon103 = new WagonTowarowyCiężki(65.0);
        Wagon wagon104 = new WagonTowarowyCiężki(68.0);
        Wagon wagon105 = new WagonTowarowyCiężki(72.0);
        Wagon wagon106 = new WagonTowarowyCiężki(71.0);
        Wagon wagon107 = new WagonTowarowyCiężki(64.0);
        Wagon wagon108 = new WagonTowarowyCiężki(69.0);
        Wagon wagon109 = new WagonTowarowyCiężki(73.0);
        Wagon wagon110 = new WagonTowarowyCiężki(67.0);
        Wagon wagon111 = new WagonTowarowyPodstawowy(33.0);
        Wagon wagon112 = new WagonTowarowyPodstawowy(38.0);
        Wagon wagon113 = new WagonTowarowyPodstawowy(40.0);
        Wagon wagon114 = new WagonTowarowyPodstawowy(30.0);
        Wagon wagon115 = new WagonTowarowyPodstawowy(32.0);
        Wagon wagon116 = new WagonTowarowyPodstawowy(35.0);
        Wagon wagon117 = new WagonTowarowyPodstawowy(42.0);
        Wagon wagon118 = new WagonTowarowyPodstawowy(37.0);
        Wagon wagon119 = new WagonTowarowyPodstawowy(28.0);
        Wagon wagon120 = new WagonTowarowyPodstawowy(25.0);









        Lokomotywa lokomotywa1 = new Lokomotywa(12, 1300.0, 11,"Lokomotywa1",null, 111);
        Lokomotywa lokomotywa2 = new Lokomotywa(15, 1150.0, 4,"Lokomotywa2",null, 100);
        Lokomotywa lokomotywa3 = new Lokomotywa(17, 5315.0, 6,"Lokomotywa3",null, 150);
        Lokomotywa lokomotywa4 = new Lokomotywa(19, 9170.0, 5,"Lokomotywa4",null, 60);
        Lokomotywa lokomotywa5 = new Lokomotywa(18, 1180.0, 13, "Lokomotywa5", null, 90);
        Lokomotywa lokomotywa6 = new Lokomotywa(12, 1120.0, 12, "Lokomotywa6", null, 130);
        Lokomotywa lokomotywa7 = new Lokomotywa(15, 1150.0, 14, "Lokomotywa7", null, 70);
        Lokomotywa lokomotywa8 = new Lokomotywa(20, 1200.0, 11, "Lokomotywa8", null, 180);
        Lokomotywa lokomotywa9 = new Lokomotywa(16, 1160.0, 13, "Lokomotywa9", null, 80);
        Lokomotywa lokomotywa10 = new Lokomotywa(19, 1190.0, 12, "Lokomotywa10", null, 110);
        Lokomotywa lokomotywa11 = new Lokomotywa(14, 4340.0, 11, "Lokomotywa11", null, 50);
        Lokomotywa lokomotywa12 = new Lokomotywa(18, 4180.0, 11, "Lokomotywa12", null, 160);
        Lokomotywa lokomotywa13 = new Lokomotywa(15, 4110.0, 9, "Lokomotywa13", null, 120);
        Lokomotywa lokomotywa14 = new Lokomotywa(14, 5140.0, 12, "Lokomotywa14", null, 100);
        Lokomotywa lokomotywa15 = new Lokomotywa(18, 6680.0, 14, "Lokomotywa15", null, 90);
        Lokomotywa lokomotywa16 = new Lokomotywa(16, 7160.0, 11, "Lokomotywa16", null, 150);
        Lokomotywa lokomotywa17 = new Lokomotywa(15, 8370.0, 13, "Lokomotywa17", null, 100);
        Lokomotywa lokomotywa18 = new Lokomotywa(13, 1130.0, 12, "Lokomotywa18", null, 150);
        Lokomotywa lokomotywa19 = new Lokomotywa(17, 4490.0, 14, "Lokomotywa19", null, 120);
        Lokomotywa lokomotywa20 = new Lokomotywa(20, 5200.0, 11, "Lokomotywa20", null, 150);
        Lokomotywa lokomotywa21 = new Lokomotywa(19, 6680.0, 13, "Lokomotywa21", null, 110);
        Lokomotywa lokomotywa22 = new Lokomotywa(12, 7150.0, 12, "Lokomotywa22", null, 170);
        Lokomotywa lokomotywa23 = new Lokomotywa(16, 2260.0, 14, "Lokomotywa23", null, 80);
        Lokomotywa lokomotywa24 = new Lokomotywa(18, 3180.0, 11, "Lokomotywa24", null, 90);
        Lokomotywa lokomotywa25 = new Lokomotywa(11, 3100.0, 9, "Lokomotywa25", null, 130);
        Lokomotywa lokomotywa26 = new Lokomotywa(14, 3120.0, 12, "Lokomotywa26", null, 180);
        Lokomotywa lokomotywa27 = new Lokomotywa(18, 3370.0, 14, "Lokomotywa27", null, 100);
        Lokomotywa lokomotywa28 = new Lokomotywa(16, 3170.0, 11, "Lokomotywa28", null, 180);

        Thread lokomotywa1Wątek = new Thread(lokomotywa1);
        lokomotywa1Wątek.start();

        Thread lokomotywa2Wątek = new Thread(lokomotywa2);
        lokomotywa2Wątek.start();

        Thread lokomotywa3Wątek = new Thread(lokomotywa3);
        lokomotywa3Wątek.start();

        Thread lokomotywa4Wątek = new Thread(lokomotywa4);
        lokomotywa4Wątek.start();

        Thread lokomotywa13Wątek = new Thread(lokomotywa13);
        lokomotywa13Wątek.start();

        Thread lokomotywa14Wątek = new Thread(lokomotywa14);
        lokomotywa14Wątek.start();

        Thread lokomotywa15Wątek = new Thread(lokomotywa15);
        lokomotywa15Wątek.start();

        Thread lokomotywa16Wątek = new Thread(lokomotywa16);
        lokomotywa16Wątek.start();

        Thread lokomotywa17Wątek = new Thread(lokomotywa17);
        lokomotywa17Wątek.start();

        Thread lokomotywa18Wątek = new Thread(lokomotywa18);
        lokomotywa18Wątek.start();

        Thread lokomotywa19Wątek = new Thread(lokomotywa19);
        lokomotywa19Wątek.start();

        Thread lokomotywa20Wątek = new Thread(lokomotywa20);
        lokomotywa20Wątek.start();

        Thread lokomotywa21Wątek = new Thread(lokomotywa21);
        lokomotywa21Wątek.start();

        Thread lokomotywa22Wątek = new Thread(lokomotywa22);
        lokomotywa22Wątek.start();

        Thread lokomotywa23Wątek = new Thread(lokomotywa23);
        lokomotywa23Wątek.start();

        Thread lokomotywa24Wątek = new Thread(lokomotywa24);
        lokomotywa24Wątek.start();

        Thread lokomotywa25Wątek = new Thread(lokomotywa25);
        lokomotywa25Wątek.start();

        Thread lokomotywa26Wątek = new Thread(lokomotywa26);
        lokomotywa26Wątek.start();

        Thread lokomotywa27Wątek = new Thread(lokomotywa27);
        lokomotywa27Wątek.start();

        Thread lokomotywa28Wątek = new Thread(lokomotywa28);
        lokomotywa28Wątek.start();







        System.out.println();

        StacjaKolejowa stacjaKolejowa1 = new StacjaKolejowa("stacjaKolejowa1" , 80);
        StacjaKolejowa stacjaKolejowa2 = new StacjaKolejowa("stacjaKolejowa2" , 90);
        StacjaKolejowa stacjaKolejowa3 = new StacjaKolejowa("stacjaKolejowa3" , 200);
        StacjaKolejowa stacjaKolejowa4 = new StacjaKolejowa("stacjaKolejowa4" , 120);
        StacjaKolejowa stacjaKolejowa5 = new StacjaKolejowa("stacjaKolejowa5" , 90);
        StacjaKolejowa stacjaKolejowa6 = new StacjaKolejowa("stacjaKolejowa6" , 75);
        StacjaKolejowa stacjaKolejowa7 = new StacjaKolejowa("stacjaKolejowa7" , 95);
        StacjaKolejowa stacjaKolejowa8 = new StacjaKolejowa("stacjaKolejowa8" , 130);
        StacjaKolejowa stacjaKolejowa9 = new StacjaKolejowa("stacjaKolejowa9" , 85);
        StacjaKolejowa stacjaKolejowa10 = new StacjaKolejowa("stacjaKolejowa10" , 70);
        StacjaKolejowa stacjaKolejowa11 = new StacjaKolejowa("stacjaKolejowa11" , 180);
        StacjaKolejowa stacjaKolejowa12 = new StacjaKolejowa("stacjaKolejowa12" , 210);
        StacjaKolejowa stacjaKolejowa13 = new StacjaKolejowa("stacjaKolejowa13" , 110);
        StacjaKolejowa stacjaKolejowa14 = new StacjaKolejowa("stacjaKolejowa14" , 100);
        StacjaKolejowa stacjaKolejowa15 = new StacjaKolejowa("stacjaKolejowa15" , 75);
        StacjaKolejowa stacjaKolejowa16 = new StacjaKolejowa("stacjaKolejowa16" , 95);
        StacjaKolejowa stacjaKolejowa17 = new StacjaKolejowa("stacjaKolejowa17" , 135);
        StacjaKolejowa stacjaKolejowa18 = new StacjaKolejowa("stacjaKolejowa18" , 105);
        StacjaKolejowa stacjaKolejowa19 = new StacjaKolejowa("stacjaKolejowa19" , 200);
        StacjaKolejowa stacjaKolejowa20 = new StacjaKolejowa("stacjaKolejowa20" , 85);
        StacjaKolejowa stacjaKolejowa21 = new StacjaKolejowa("stacjaKolejowa21" , 90);
        StacjaKolejowa stacjaKolejowa22 = new StacjaKolejowa("stacjaKolejowa22" , 55);
        StacjaKolejowa stacjaKolejowa23 = new StacjaKolejowa("stacjaKolejowa23" , 125);
        StacjaKolejowa stacjaKolejowa24 = new StacjaKolejowa("stacjaKolejowa24" , 180);
        StacjaKolejowa stacjaKolejowa25 = new StacjaKolejowa("stacjaKolejowa25" , 150);
        StacjaKolejowa stacjaKolejowa26 = new StacjaKolejowa("stacjaKolejowa26" , 95);
        StacjaKolejowa stacjaKolejowa27 = new StacjaKolejowa("stacjaKolejowa27" , 70);
        StacjaKolejowa stacjaKolejowa28 = new StacjaKolejowa("stacjaKolejowa28" , 120);
        StacjaKolejowa stacjaKolejowa29 = new StacjaKolejowa("stacjaKolejowa29" , 140);
        StacjaKolejowa stacjaKolejowa30 = new StacjaKolejowa("stacjaKolejowa30" , 80);
        StacjaKolejowa stacjaKolejowa31 = new StacjaKolejowa("stacjaKolejowa31" , 90);
        StacjaKolejowa stacjaKolejowa32 = new StacjaKolejowa("stacjaKolejowa32" , 200);
        StacjaKolejowa stacjaKolejowa33 = new StacjaKolejowa("stacjaKolejowa33" , 95);
        StacjaKolejowa stacjaKolejowa34 = new StacjaKolejowa("stacjaKolejowa34" , 100);
        StacjaKolejowa stacjaKolejowa35 = new StacjaKolejowa("stacjaKolejowa35" , 110);
        StacjaKolejowa stacjaKolejowa36 = new StacjaKolejowa("stacjaKolejowa36" , 130);
        StacjaKolejowa stacjaKolejowa37 = new StacjaKolejowa("stacjaKolejowa37" , 180);
        StacjaKolejowa stacjaKolejowa38 = new StacjaKolejowa("stacjaKolejowa38" , 75);
        StacjaKolejowa stacjaKolejowa39 = new StacjaKolejowa("stacjaKolejowa39" , 150);
        StacjaKolejowa stacjaKolejowa40 = new StacjaKolejowa("stacjaKolejowa40" , 200);
        StacjaKolejowa stacjaKolejowa41 = new StacjaKolejowa("stacjaKolejowa41" , 85);
        StacjaKolejowa stacjaKolejowa42 = new StacjaKolejowa("stacjaKolejowa42" , 120);
        StacjaKolejowa stacjaKolejowa43 = new StacjaKolejowa("stacjaKolejowa43" , 90);
        StacjaKolejowa stacjaKolejowa44 = new StacjaKolejowa("stacjaKolejowa44" , 175);
        StacjaKolejowa stacjaKolejowa45 = new StacjaKolejowa("stacjaKolejowa45" , 80);
        StacjaKolejowa stacjaKolejowa46 = new StacjaKolejowa("stacjaKolejowa46" , 130);
        StacjaKolejowa stacjaKolejowa47 = new StacjaKolejowa("stacjaKolejowa47" , 150);
        StacjaKolejowa stacjaKolejowa48 = new StacjaKolejowa("stacjaKolejowa48" , 100);
        StacjaKolejowa stacjaKolejowa49 = new StacjaKolejowa("stacjaKolejowa49" , 110);
        StacjaKolejowa stacjaKolejowa50 = new StacjaKolejowa("stacjaKolejowa50" , 200);
        StacjaKolejowa stacjaKolejowa51 = new StacjaKolejowa("stacjaKolejowa51" , 85);
        StacjaKolejowa stacjaKolejowa52 = new StacjaKolejowa("stacjaKolejowa52" , 115);
        StacjaKolejowa stacjaKolejowa53 = new StacjaKolejowa("stacjaKolejowa53" , 140);
        StacjaKolejowa stacjaKolejowa54 = new StacjaKolejowa("stacjaKolejowa54" , 75);
        StacjaKolejowa stacjaKolejowa55 = new StacjaKolejowa("stacjaKolejowa55" , 90);
        StacjaKolejowa stacjaKolejowa56 = new StacjaKolejowa("stacjaKolejowa56" , 120);
        StacjaKolejowa stacjaKolejowa57 = new StacjaKolejowa("stacjaKolejowa57" , 130);
        StacjaKolejowa stacjaKolejowa58 = new StacjaKolejowa("stacjaKolejowa58" , 105);
        StacjaKolejowa stacjaKolejowa59 = new StacjaKolejowa("stacjaKolejowa59" , 95);
        StacjaKolejowa stacjaKolejowa60 = new StacjaKolejowa("stacjaKolejowa60" , 180);
        StacjaKolejowa stacjaKolejowa61 = new StacjaKolejowa("stacjaKolejowa61" , 140);
        StacjaKolejowa stacjaKolejowa62 = new StacjaKolejowa("stacjaKolejowa62" , 200);
        StacjaKolejowa stacjaKolejowa63 = new StacjaKolejowa("stacjaKolejowa63" , 95);
        StacjaKolejowa stacjaKolejowa64 = new StacjaKolejowa("stacjaKolejowa64" , 105);
        StacjaKolejowa stacjaKolejowa65 = new StacjaKolejowa("stacjaKolejowa65" , 150);
        StacjaKolejowa stacjaKolejowa66 = new StacjaKolejowa("stacjaKolejowa66" , 120);
        StacjaKolejowa stacjaKolejowa67 = new StacjaKolejowa("stacjaKolejowa67" , 180);
        StacjaKolejowa stacjaKolejowa68 = new StacjaKolejowa("stacjaKolejowa68" , 200);
        StacjaKolejowa stacjaKolejowa69 = new StacjaKolejowa("stacjaKolejowa69" , 85);
        StacjaKolejowa stacjaKolejowa70 = new StacjaKolejowa("stacjaKolejowa70" , 130);
        StacjaKolejowa stacjaKolejowa71 = new StacjaKolejowa("stacjaKolejowa71" , 140);
        StacjaKolejowa stacjaKolejowa72 = new StacjaKolejowa("stacjaKolejowa72" , 100);
        StacjaKolejowa stacjaKolejowa73 = new StacjaKolejowa("stacjaKolejowa73" , 175);
        StacjaKolejowa stacjaKolejowa74 = new StacjaKolejowa("stacjaKolejowa74" , 90);
        StacjaKolejowa stacjaKolejowa75 = new StacjaKolejowa("stacjaKolejowa75" , 110);
        StacjaKolejowa stacjaKolejowa76 = new StacjaKolejowa("stacjaKolejowa76" , 150);
        StacjaKolejowa stacjaKolejowa77 = new StacjaKolejowa("stacjaKolejowa77" , 80);
        StacjaKolejowa stacjaKolejowa78 = new StacjaKolejowa("stacjaKolejowa78" , 200);
        StacjaKolejowa stacjaKolejowa79 = new StacjaKolejowa("stacjaKolejowa79" , 95);
        StacjaKolejowa stacjaKolejowa80 = new StacjaKolejowa("stacjaKolejowa80" , 120);
        StacjaKolejowa stacjaKolejowa81 = new StacjaKolejowa("stacjaKolejowa81" , 105);
        StacjaKolejowa stacjaKolejowa82 = new StacjaKolejowa("stacjaKolejowa82" , 140);
        StacjaKolejowa stacjaKolejowa83 = new StacjaKolejowa("stacjaKolejowa83" , 130);
        StacjaKolejowa stacjaKolejowa84 = new StacjaKolejowa("stacjaKolejowa51" , 85);
        StacjaKolejowa stacjaKolejowa85 = new StacjaKolejowa("stacjaKolejowa85" , 180);
        StacjaKolejowa stacjaKolejowa86 = new StacjaKolejowa("stacjaKolejowa86" , 150);
        StacjaKolejowa stacjaKolejowa87 = new StacjaKolejowa("stacjaKolejowa87" , 90);
        StacjaKolejowa stacjaKolejowa88 = new StacjaKolejowa("stacjaKolejowa88" , 200);
        StacjaKolejowa stacjaKolejowa89 = new StacjaKolejowa("stacjaKolejowa89" , 95);
        StacjaKolejowa stacjaKolejowa90 = new StacjaKolejowa("stacjaKolejowa90" , 120);
        StacjaKolejowa stacjaKolejowa91 = new StacjaKolejowa("stacjaKolejowa91" , 105);
        StacjaKolejowa stacjaKolejowa92 = new StacjaKolejowa("stacjaKolejowa92" , 140);
        StacjaKolejowa stacjaKolejowa93 = new StacjaKolejowa("stacjaKolejowa93" , 130);
        StacjaKolejowa stacjaKolejowa94 = new StacjaKolejowa("stacjaKolejowa94" , 180);
        StacjaKolejowa stacjaKolejowa95 = new StacjaKolejowa("stacjaKolejowa95" , 150);
        StacjaKolejowa stacjaKolejowa96 = new StacjaKolejowa("stacjaKolejowa96" , 90);
        StacjaKolejowa stacjaKolejowa97 = new StacjaKolejowa("stacjaKolejowa97" , 200);
        StacjaKolejowa stacjaKolejowa98 = new StacjaKolejowa("stacjaKolejowa98" , 95);
        StacjaKolejowa stacjaKolejowa99 = new StacjaKolejowa("stacjaKolejowa99" , 120);
        StacjaKolejowa stacjaKolejowa100 = new StacjaKolejowa("stacjaKolejowa100" , 105);





        GrafPołączeń grafPołączeń = new GrafPołączeń();




        grafPołączeń.dodajStacje(stacjaKolejowa1);
        grafPołączeń.dodajStacje(stacjaKolejowa2);
        grafPołączeń.dodajStacje(stacjaKolejowa3);
        grafPołączeń.dodajStacje(stacjaKolejowa4);
        grafPołączeń.dodajStacje(stacjaKolejowa5);
        grafPołączeń.dodajStacje(stacjaKolejowa6);
        grafPołączeń.dodajStacje(stacjaKolejowa7);
        grafPołączeń.dodajStacje(stacjaKolejowa8);
        grafPołączeń.dodajStacje(stacjaKolejowa9);
        grafPołączeń.dodajStacje(stacjaKolejowa10);
        grafPołączeń.dodajStacje(stacjaKolejowa11);
        grafPołączeń.dodajStacje(stacjaKolejowa12);
        grafPołączeń.dodajStacje(stacjaKolejowa13);
        grafPołączeń.dodajStacje(stacjaKolejowa14);
        grafPołączeń.dodajStacje(stacjaKolejowa15);
        grafPołączeń.dodajStacje(stacjaKolejowa16);
        grafPołączeń.dodajStacje(stacjaKolejowa17);
        grafPołączeń.dodajStacje(stacjaKolejowa18);
        grafPołączeń.dodajStacje(stacjaKolejowa19);
        grafPołączeń.dodajStacje(stacjaKolejowa20);
        grafPołączeń.dodajStacje(stacjaKolejowa21);
        grafPołączeń.dodajStacje(stacjaKolejowa22);
        grafPołączeń.dodajStacje(stacjaKolejowa23);
        grafPołączeń.dodajStacje(stacjaKolejowa24);
        grafPołączeń.dodajStacje(stacjaKolejowa25);
        grafPołączeń.dodajStacje(stacjaKolejowa26);
        grafPołączeń.dodajStacje(stacjaKolejowa27);
        grafPołączeń.dodajStacje(stacjaKolejowa28);
        grafPołączeń.dodajStacje(stacjaKolejowa29);
        grafPołączeń.dodajStacje(stacjaKolejowa30);
        grafPołączeń.dodajStacje(stacjaKolejowa31);
        grafPołączeń.dodajStacje(stacjaKolejowa32);
        grafPołączeń.dodajStacje(stacjaKolejowa33);
        grafPołączeń.dodajStacje(stacjaKolejowa34);
        grafPołączeń.dodajStacje(stacjaKolejowa35);
        grafPołączeń.dodajStacje(stacjaKolejowa36);
        grafPołączeń.dodajStacje(stacjaKolejowa37);
        grafPołączeń.dodajStacje(stacjaKolejowa38);
        grafPołączeń.dodajStacje(stacjaKolejowa39);
        grafPołączeń.dodajStacje(stacjaKolejowa40);
        grafPołączeń.dodajStacje(stacjaKolejowa41);
        grafPołączeń.dodajStacje(stacjaKolejowa42);
        grafPołączeń.dodajStacje(stacjaKolejowa43);
        grafPołączeń.dodajStacje(stacjaKolejowa44);
        grafPołączeń.dodajStacje(stacjaKolejowa45);
        grafPołączeń.dodajStacje(stacjaKolejowa46);
        grafPołączeń.dodajStacje(stacjaKolejowa47);
        grafPołączeń.dodajStacje(stacjaKolejowa48);
        grafPołączeń.dodajStacje(stacjaKolejowa49);
        grafPołączeń.dodajStacje(stacjaKolejowa50);
        grafPołączeń.dodajStacje(stacjaKolejowa51);
        grafPołączeń.dodajStacje(stacjaKolejowa52);
        grafPołączeń.dodajStacje(stacjaKolejowa53);
        grafPołączeń.dodajStacje(stacjaKolejowa54);
        grafPołączeń.dodajStacje(stacjaKolejowa55);
        grafPołączeń.dodajStacje(stacjaKolejowa56);
        grafPołączeń.dodajStacje(stacjaKolejowa57);
        grafPołączeń.dodajStacje(stacjaKolejowa58);
        grafPołączeń.dodajStacje(stacjaKolejowa59);
        grafPołączeń.dodajStacje(stacjaKolejowa60);
        grafPołączeń.dodajStacje(stacjaKolejowa61);
        grafPołączeń.dodajStacje(stacjaKolejowa62);
        grafPołączeń.dodajStacje(stacjaKolejowa63);
        grafPołączeń.dodajStacje(stacjaKolejowa64);
        grafPołączeń.dodajStacje(stacjaKolejowa65);
        grafPołączeń.dodajStacje(stacjaKolejowa66);
        grafPołączeń.dodajStacje(stacjaKolejowa67);
        grafPołączeń.dodajStacje(stacjaKolejowa68);
        grafPołączeń.dodajStacje(stacjaKolejowa69);
        grafPołączeń.dodajStacje(stacjaKolejowa70);
        grafPołączeń.dodajStacje(stacjaKolejowa71);
        grafPołączeń.dodajStacje(stacjaKolejowa72);
        grafPołączeń.dodajStacje(stacjaKolejowa73);
        grafPołączeń.dodajStacje(stacjaKolejowa74);
        grafPołączeń.dodajStacje(stacjaKolejowa75);
        grafPołączeń.dodajStacje(stacjaKolejowa76);
        grafPołączeń.dodajStacje(stacjaKolejowa77);
        grafPołączeń.dodajStacje(stacjaKolejowa78);
        grafPołączeń.dodajStacje(stacjaKolejowa79);
        grafPołączeń.dodajStacje(stacjaKolejowa80);
        grafPołączeń.dodajStacje(stacjaKolejowa81);
        grafPołączeń.dodajStacje(stacjaKolejowa82);
        grafPołączeń.dodajStacje(stacjaKolejowa83);
        grafPołączeń.dodajStacje(stacjaKolejowa84);
        grafPołączeń.dodajStacje(stacjaKolejowa85);
        grafPołączeń.dodajStacje(stacjaKolejowa86);
        grafPołączeń.dodajStacje(stacjaKolejowa87);
        grafPołączeń.dodajStacje(stacjaKolejowa88);
        grafPołączeń.dodajStacje(stacjaKolejowa89);
        grafPołączeń.dodajStacje(stacjaKolejowa90);
        grafPołączeń.dodajStacje(stacjaKolejowa91);
        grafPołączeń.dodajStacje(stacjaKolejowa92);
        grafPołączeń.dodajStacje(stacjaKolejowa93);
        grafPołączeń.dodajStacje(stacjaKolejowa94);
        grafPołączeń.dodajStacje(stacjaKolejowa95);
        grafPołączeń.dodajStacje(stacjaKolejowa96);
        grafPołączeń.dodajStacje(stacjaKolejowa97);
        grafPołączeń.dodajStacje(stacjaKolejowa98);
        grafPołączeń.dodajStacje(stacjaKolejowa99);
        grafPołączeń.dodajStacje(stacjaKolejowa100);


















        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa1, stacjaKolejowa2, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa2, stacjaKolejowa3, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa3, stacjaKolejowa1, 3);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa1, stacjaKolejowa4, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa2, stacjaKolejowa5, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa3, stacjaKolejowa6, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa4, stacjaKolejowa5, 2);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa5, stacjaKolejowa6, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa6, stacjaKolejowa4, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa7, stacjaKolejowa8, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa8, stacjaKolejowa9, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa9, stacjaKolejowa7, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa7, stacjaKolejowa10, 1);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa8, stacjaKolejowa11, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa9, stacjaKolejowa12, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa10, stacjaKolejowa11, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa11, stacjaKolejowa12, 3);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa12, stacjaKolejowa10, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa13, stacjaKolejowa14, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa14, stacjaKolejowa15, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa15, stacjaKolejowa16, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa16, stacjaKolejowa17, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa17, stacjaKolejowa18, 2);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa18, stacjaKolejowa19, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa19, stacjaKolejowa20, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa10, stacjaKolejowa20, 15);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa11, stacjaKolejowa19, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa12, stacjaKolejowa18, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa13, stacjaKolejowa17, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa14, stacjaKolejowa16, 3);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa15, stacjaKolejowa20, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa11, stacjaKolejowa15, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa14, stacjaKolejowa18, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa13, stacjaKolejowa16, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa10, stacjaKolejowa14, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa17, stacjaKolejowa19, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa20, stacjaKolejowa34, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa21, stacjaKolejowa17, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa22, stacjaKolejowa21, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa23, stacjaKolejowa24, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa24, stacjaKolejowa14, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa25, stacjaKolejowa24, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa32, stacjaKolejowa33, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa36, stacjaKolejowa35, 13);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa30, stacjaKolejowa29, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa27, stacjaKolejowa26, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa31, stacjaKolejowa28, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa33, stacjaKolejowa37, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa26, stacjaKolejowa27, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa28, stacjaKolejowa16, 13);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa29, stacjaKolejowa23, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa30, stacjaKolejowa31, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa32, stacjaKolejowa33, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa33, stacjaKolejowa11, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa34, stacjaKolejowa35, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa36, stacjaKolejowa37, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa38, stacjaKolejowa20, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa39, stacjaKolejowa26, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa40, stacjaKolejowa18, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa41, stacjaKolejowa19, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa42, stacjaKolejowa17, 14);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa43, stacjaKolejowa44, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa45, stacjaKolejowa15, 13);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa46, stacjaKolejowa47, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa48, stacjaKolejowa49, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa50, stacjaKolejowa51, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa52, stacjaKolejowa53, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa54, stacjaKolejowa55, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa56, stacjaKolejowa25, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa57, stacjaKolejowa58, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa59, stacjaKolejowa60, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa61, stacjaKolejowa62, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa63, stacjaKolejowa44, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa64, stacjaKolejowa65, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa66, stacjaKolejowa40, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa67, stacjaKolejowa41, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa68, stacjaKolejowa69, 14);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa70, stacjaKolejowa71, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa72, stacjaKolejowa73, 13);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa74, stacjaKolejowa75, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa76, stacjaKolejowa77, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa78, stacjaKolejowa79, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa80, stacjaKolejowa81, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa82, stacjaKolejowa83, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa56, stacjaKolejowa57, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa58, stacjaKolejowa59, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa60, stacjaKolejowa61, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa62, stacjaKolejowa63, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa64, stacjaKolejowa65, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa66, stacjaKolejowa67, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa68, stacjaKolejowa69, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa70, stacjaKolejowa71, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa72, stacjaKolejowa73, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa76, stacjaKolejowa77, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa78, stacjaKolejowa79, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa80, stacjaKolejowa81, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa82, stacjaKolejowa83, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa84, stacjaKolejowa85, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa86, stacjaKolejowa87, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa88, stacjaKolejowa89, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa90, stacjaKolejowa91, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa92, stacjaKolejowa93, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa94, stacjaKolejowa95, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa96, stacjaKolejowa97, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa98, stacjaKolejowa99, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa100, stacjaKolejowa99, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa95, stacjaKolejowa29, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa79, stacjaKolejowa26, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa83, stacjaKolejowa28, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa99, stacjaKolejowa37, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa97, stacjaKolejowa27, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa73, stacjaKolejowa16, 13);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa71, stacjaKolejowa23, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa55, stacjaKolejowa31, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa51, stacjaKolejowa33, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa93, stacjaKolejowa11, 10);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa35, stacjaKolejowa35, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa87, stacjaKolejowa37, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa69, stacjaKolejowa12, 3);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa77, stacjaKolejowa10, 7);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa47, stacjaKolejowa14, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa85, stacjaKolejowa15, 11);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa75, stacjaKolejowa16, 4);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa49, stacjaKolejowa17, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa87, stacjaKolejowa18, 2);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa91, stacjaKolejowa19, 8);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa65, stacjaKolejowa20, 5);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa37, stacjaKolejowa20, 15);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa44, stacjaKolejowa19, 12);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa53, stacjaKolejowa18, 9);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa89, stacjaKolejowa17, 6);
        grafPołączeń.dodajPołączenieMiędzyStacjami(stacjaKolejowa81, stacjaKolejowa79, 5);


        Skład skład1 = new Skład(stacjaKolejowa22, stacjaKolejowa60);
        Skład skład2 = new Skład(stacjaKolejowa7, stacjaKolejowa12);
        Skład skład3 = new Skład(stacjaKolejowa33, stacjaKolejowa10);
        Skład skład4 = new Skład(stacjaKolejowa15, stacjaKolejowa52);
        Skład skład5 = new Skład(stacjaKolejowa2, stacjaKolejowa41);
        Skład skład6 = new Skład(stacjaKolejowa9, stacjaKolejowa19);
        Skład skład7 = new Skład(stacjaKolejowa27, stacjaKolejowa8);
        Skład skład8 = new Skład(stacjaKolejowa35, stacjaKolejowa46);
        Skład skład9 = new Skład(stacjaKolejowa16, stacjaKolejowa29);
        Skład skład10 = new Skład(stacjaKolejowa11, stacjaKolejowa50);
        Skład skład11 = new Skład(stacjaKolejowa21, stacjaKolejowa38);
        Skład skład12 = new Skład(stacjaKolejowa6, stacjaKolejowa26);
        Skład skład13 = new Skład(stacjaKolejowa14, stacjaKolejowa49);
        Skład skład14 = new Skład(stacjaKolejowa24, stacjaKolejowa40);
        Skład skład15 = new Skład(stacjaKolejowa1, stacjaKolejowa17);
        Skład skład16 = new Skład(stacjaKolejowa25, stacjaKolejowa47);
        Skład skład17 = new Skład(stacjaKolejowa31, stacjaKolejowa36);
        Skład skład18 = new Skład(stacjaKolejowa4, stacjaKolejowa23);
        Skład skład19 = new Skład(stacjaKolejowa18, stacjaKolejowa43);
        Skład skład20 = new Skład(stacjaKolejowa30, stacjaKolejowa39);
        Skład skład21 = new Skład(stacjaKolejowa5, stacjaKolejowa42);
        Skład skład22 = new Skład(stacjaKolejowa20, stacjaKolejowa28);
        Skład skład23 = new Skład(stacjaKolejowa34, stacjaKolejowa44);
        Skład skład24 = new Skład(stacjaKolejowa3, stacjaKolejowa32);
        Skład skład25 = new Skład(stacjaKolejowa13, stacjaKolejowa48);

        skład1.dodajLokomotywe(lokomotywa1);
        skład2.dodajLokomotywe(lokomotywa2);
        skład3.dodajLokomotywe(lokomotywa3);
        skład4.dodajLokomotywe(lokomotywa4);
        skład5.dodajLokomotywe(lokomotywa5);
        skład6.dodajLokomotywe(lokomotywa6);
        skład7.dodajLokomotywe(lokomotywa7);
        skład8.dodajLokomotywe(lokomotywa8);
        skład9.dodajLokomotywe(lokomotywa9);
        skład10.dodajLokomotywe(lokomotywa10);
        skład11.dodajLokomotywe(lokomotywa11);
        skład12.dodajLokomotywe(lokomotywa12);
        skład13.dodajLokomotywe(lokomotywa13);
        skład14.dodajLokomotywe(lokomotywa14);
        skład15.dodajLokomotywe(lokomotywa15);
        skład16.dodajLokomotywe(lokomotywa16);
        skład17.dodajLokomotywe(lokomotywa17);
        skład18.dodajLokomotywe(lokomotywa18);
        skład19.dodajLokomotywe(lokomotywa19);
        skład20.dodajLokomotywe(lokomotywa20);
        skład21.dodajLokomotywe(lokomotywa21);
        skład22.dodajLokomotywe(lokomotywa22);
        skład23.dodajLokomotywe(lokomotywa23);
        skład24.dodajLokomotywe(lokomotywa24);
        skład25.dodajLokomotywe(lokomotywa25);











        try {
            skład1.dołączWagon(wagon1);
            skład1.dołączWagon(wagon2);
            skład1.dołączWagon(wagon17);
            skład1.dołączWagon(wagon33);
            skład1.dołączWagon(wagon44);
            skład1.dołączWagon(wagon31);
            skład1.dołączWagon(wagon17);
            skład1.dołączWagon(wagon73);
            skład1.dołączWagon(wagon95);
            skład1.dołączWagon(wagon8);
            skład1.dołączWagon(wagon13);
            skład1.dołączWagon(wagon46);
            skład2.dołączWagon(wagon3);
            skład2.dołączWagon(wagon4);
            skład2.dołączWagon(wagon27);
            skład2.dołączWagon(wagon52);
            skład2.dołączWagon(wagon69);
            skład2.dołączWagon(wagon24);
            skład2.dołączWagon(wagon36);
            skład2.dołączWagon(wagon88);
            skład2.dołączWagon(wagon91);
            skład2.dołączWagon(wagon6);
            skład2.dołączWagon(wagon11);
            skład2.dołączWagon(wagon53);

            skład3.dołączWagon(wagon7);
            skład3.dołączWagon(wagon8);
            skład3.dołączWagon(wagon21);
            skład3.dołączWagon(wagon38);
            skład3.dołączWagon(wagon40);
            skład3.dołączWagon(wagon29);
            skład3.dołączWagon(wagon42);
            skład3.dołączWagon(wagon61);
            skład3.dołączWagon(wagon74);
            skład3.dołączWagon(wagon17);
            skład3.dołączWagon(wagon25);
            skład3.dołączWagon(wagon67);

            skład4.dołączWagon(wagon9);
            skład4.dołączWagon(wagon10);
            skład4.dołączWagon(wagon13);
            skład4.dołączWagon(wagon47);
            skład4.dołączWagon(wagon55);
            skład4.dołączWagon(wagon22);
            skład4.dołączWagon(wagon34);
            skład4.dołączWagon(wagon81);
            skład4.dołączWagon(wagon96);
            skład4.dołączWagon(wagon11);
            skład4.dołączWagon(wagon19);
            skład4.dołączWagon(wagon58);

            skład5.dołączWagon(wagon12);
            skład5.dołączWagon(wagon14);
            skład5.dołączWagon(wagon18);
            skład5.dołączWagon(wagon56);
            skład5.dołączWagon(wagon62);
            skład5.dołączWagon(wagon28);
            skład5.dołączWagon(wagon39);
            skład5.dołączWagon(wagon89);
            skład5.dołączWagon(wagon94);
            skład5.dołączWagon(wagon5);
            skład5.dołączWagon(wagon23);
            skład5.dołączWagon(wagon63);

            skład6.dołączWagon(wagon15);
            skład6.dołączWagon(wagon16);
            skład6.dołączWagon(wagon26);
            skład6.dołączWagon(wagon48);
            skład6.dołączWagon(wagon59);
            skład6.dołączWagon(wagon35);
            skład6.dołączWagon(wagon41);
            skład6.dołączWagon(wagon85);
            skład6.dołączWagon(wagon97);
            skład6.dołączWagon(wagon9);
            skład6.dołączWagon(wagon20);
            skład6.dołączWagon(wagon49);

            skład7.dołączWagon(wagon3);
            skład7.dołączWagon(wagon4);
            skład7.dołączWagon(wagon25);
            skład7.dołączWagon(wagon37);
            skład7.dołączWagon(wagon56);
            skład7.dołączWagon(wagon30);
            skład7.dołączWagon(wagon42);
            skład7.dołączWagon(wagon78);
            skład7.dołączWagon(wagon92);
            skład7.dołączWagon(wagon11);
            skład7.dołączWagon(wagon21);
            skład7.dołączWagon(wagon50);

            skład8.dołączWagon(wagon12);
            skład8.dołączWagon(wagon19);
            skład8.dołączWagon(wagon28);
            skład8.dołączWagon(wagon39);
            skład8.dołączWagon(wagon51);
            skład8.dołączWagon(wagon64);
            skład8.dołączWagon(wagon75);
            skład8.dołączWagon(wagon86);
            skład8.dołączWagon(wagon94);
            skład8.dołączWagon(wagon10);
            skład8.dołączWagon(wagon22);
            skład8.dołączWagon(wagon55);

            skład9.dołączWagon(wagon7);
            skład9.dołączWagon(wagon18);
            skład9.dołączWagon(wagon29);
            skład9.dołączWagon(wagon40);
            skład9.dołączWagon(wagon52);
            skład9.dołączWagon(wagon63);
            skład9.dołączWagon(wagon74);
            skład9.dołączWagon(wagon88);
            skład9.dołączWagon(wagon96);
            skład9.dołączWagon(wagon14);
            skład9.dołączWagon(wagon24);
            skład9.dołączWagon(wagon58);

            skład10.dołączWagon(wagon5);
            skład10.dołączWagon(wagon27);
            skład10.dołączWagon(wagon38);
            skład10.dołączWagon(wagon45);
            skład10.dołączWagon(wagon57);
            skład10.dołączWagon(wagon66);
            skład10.dołączWagon(wagon77);
            skład10.dołączWagon(wagon89);
            skład10.dołączWagon(wagon91);
            skład10.dołączWagon(wagon23);
            skład10.dołączWagon(wagon34);
            skład10.dołączWagon(wagon60);


            skład11.dołączWagon(wagon22);
            skład11.dołączWagon(wagon28);
            skład11.dołączWagon(wagon39);
            skład11.dołączWagon(wagon47);
            skład11.dołączWagon(wagon58);
            skład11.dołączWagon(wagon67);
            skład11.dołączWagon(wagon79);
            skład11.dołączWagon(wagon88);
            skład11.dołączWagon(wagon93);
            skład11.dołączWagon(wagon24);
            skład11.dołączWagon(wagon36);
            skład11.dołączWagon(wagon61);

            skład12.dołączWagon(wagon6);
            skład12.dołączWagon(wagon29);
            skład12.dołączWagon(wagon40);
            skład12.dołączWagon(wagon51);
            skład12.dołączWagon(wagon63);
            skład12.dołączWagon(wagon68);
            skład12.dołączWagon(wagon80);
            skład12.dołączWagon(wagon87);
            skład12.dołączWagon(wagon96);
            skład12.dołączWagon(wagon18);
            skład12.dołączWagon(wagon32);
            skład12.dołączWagon(wagon69);



            skład13.dołączWagon(wagon81);
            skład13.dołączWagon(wagon57);
            skład13.dołączWagon(wagon24);
            skład13.dołączWagon(wagon62);
            skład13.dołączWagon(wagon38);
            skład13.dołączWagon(wagon9);
            skład13.dołączWagon(wagon76);
            skład13.dołączWagon(wagon50);
            skład13.dołączWagon(wagon91);
            skład13.dołączWagon(wagon68);
            skład13.dołączWagon(wagon39);
            skład13.dołączWagon(wagon22);
            skład14.dołączWagon(wagon11);
            skład14.dołączWagon(wagon43);
            skład14.dołączWagon(wagon97);
            skład14.dołączWagon(wagon65);
            skład14.dołączWagon(wagon20);
            skład14.dołączWagon(wagon72);
            skład14.dołączWagon(wagon29);
            skład14.dołączWagon(wagon58);
            skład14.dołączWagon(wagon90);
            skład14.dołączWagon(wagon49);
            skład14.dołączWagon(wagon85);
            skład14.dołączWagon(wagon77);
            skład15.dołączWagon(wagon75);
            skład15.dołączWagon(wagon16);
            skład15.dołączWagon(wagon53);
            skład15.dołączWagon(wagon23);
            skład15.dołączWagon(wagon47);
            skład15.dołączWagon(wagon71);
            skład15.dołączWagon(wagon36);
            skład15.dołączWagon(wagon52);
            skład15.dołączWagon(wagon5);
            skład15.dołączWagon(wagon30);
            skład15.dołączWagon(wagon59);
            skład15.dołączWagon(wagon80);
            skład16.dołączWagon(wagon40);
            skład16.dołączWagon(wagon60);
            skład16.dołączWagon(wagon25);
            skład16.dołączWagon(wagon66);
            skład16.dołączWagon(wagon93);
            skład16.dołączWagon(wagon19);
            skład16.dołączWagon(wagon42);
            skład16.dołączWagon(wagon26);
            skład16.dołączWagon(wagon89);
            skład16.dołączWagon(wagon12);
            skład16.dołączWagon(wagon35);
            skład16.dołączWagon(wagon51);
            skład17.dołączWagon(wagon14);
            skład17.dołączWagon(wagon69);
            skład17.dołączWagon(wagon82);
            skład17.dołączWagon(wagon92);
            skład17.dołączWagon(wagon54);
            skład17.dołączWagon(wagon28);
            skład17.dołączWagon(wagon3);
            skład17.dołączWagon(wagon55);
            skład17.dołączWagon(wagon94);
            skład17.dołączWagon(wagon27);
            skład17.dołączWagon(wagon45);

            skład18.dołączWagon(wagon18);
            skład18.dołączWagon(wagon26);
            skład18.dołączWagon(wagon41);
            skład18.dołączWagon(wagon67);
            skład18.dołączWagon(wagon72);
            skład18.dołączWagon(wagon81);
            skład18.dołączWagon(wagon83);
            skład18.dołączWagon(wagon90);
            skład18.dołączWagon(wagon24);
            skład18.dołączWagon(wagon39);
            skład18.dołączWagon(wagon53);

            skład19.dołączWagon(wagon22);
            skład19.dołączWagon(wagon33);
            skład19.dołączWagon(wagon46);
            skład19.dołączWagon(wagon58);
            skład19.dołączWagon(wagon62);
            skład19.dołączWagon(wagon74);
            skład19.dołączWagon(wagon80);

            skład20.dołączWagon(wagon7);
            skład20.dołączWagon(wagon10);
            skład20.dołączWagon(wagon19);
            skład20.dołączWagon(wagon32);
            skład20.dołączWagon(wagon48);
            skład20.dołączWagon(wagon63);
            skład20.dołączWagon(wagon70);
            skład20.dołączWagon(wagon73);

            skład21.dołączWagon(wagon1);
            skład21.dołączWagon(wagon16);
            skład21.dołączWagon(wagon30);
            skład21.dołączWagon(wagon44);
            skład21.dołączWagon(wagon52);
            skład21.dołączWagon(wagon61);
            skład21.dołączWagon(wagon68);

            skład22.dołączWagon(wagon8);
            skład22.dołączWagon(wagon23);
            skład22.dołączWagon(wagon37);
            skład22.dołączWagon(wagon49);
            skład22.dołączWagon(wagon55);
            skład22.dołączWagon(wagon62);
            skład22.dołączWagon(wagon71);

            skład23.dołączWagon(wagon3);
            skład23.dołączWagon(wagon17);
            skład23.dołączWagon(wagon28);
            skład23.dołączWagon(wagon40);
            skład23.dołączWagon(wagon57);
            skład23.dołączWagon(wagon66);
            skład23.dołączWagon(wagon75);

            skład24.dołączWagon(wagon2);
            skład24.dołączWagon(wagon13);
            skład24.dołączWagon(wagon22);
            skład24.dołączWagon(wagon36);
            skład24.dołączWagon(wagon46);
            skład24.dołączWagon(wagon58);
            skład24.dołączWagon(wagon69);

            skład25.dołączWagon(wagon9);
            skład25.dołączWagon(wagon14);
            skład25.dołączWagon(wagon26);
            skład25.dołączWagon(wagon38);
            skład25.dołączWagon(wagon50);
            skład25.dołączWagon(wagon64);
            skład25.dołączWagon(wagon74);

        } catch (Exception e) {
            System.out.println(e.toString() );
        }




        Thread skład1Wątek = new Thread(skład1);
        skład1Wątek.start();

        Thread skład2Wątek = new Thread(skład2);
        skład2Wątek.start();

        Thread skład3Wątek = new Thread(skład3);
        skład3Wątek.start();

        Thread skład4Wątek = new Thread(skład4);
        skład4Wątek.start();

        Thread skład5Wątek = new Thread(skład5);
        skład5Wątek.start();

        Thread skład6Wątek = new Thread(skład6);
        skład6Wątek.start();

        Thread skład7Wątek = new Thread(skład7);
        skład7Wątek.start();

        Thread skład8Wątek = new Thread(skład8);
        skład8Wątek.start();

        Thread skład9Wątek = new Thread(skład9);
        skład9Wątek.start();

        Thread skład10Wątek = new Thread(skład10);
        skład10Wątek.start();

        Thread skład11Wątek = new Thread(skład11);
        skład11Wątek.start();

        Thread skład12Wątek = new Thread(skład12);
        skład12Wątek.start();

        Thread skład13Wątek = new Thread(skład13);
        skład13Wątek.start();

        Thread skład14Wątek = new Thread(skład14);
        skład14Wątek.start();

        Thread skład15Wątek = new Thread(skład15);
        skład15Wątek.start();

        Thread skład16Wątek = new Thread(skład16);
        skład16Wątek.start();

        Thread skład17Wątek = new Thread(skład17);
        skład17Wątek.start();

        Thread skład18Wątek = new Thread(skład18);
        skład18Wątek.start();

        Thread skład19Wątek = new Thread(skład19);
        skład19Wątek.start();

        Thread skład20Wątek = new Thread(skład20);
        skład20Wątek.start();

        Thread skład21Wątek = new Thread(skład21);
        skład21Wątek.start();

        Thread skład22Wątek = new Thread(skład22);
        skład22Wątek.start();

        Thread skład23Wątek = new Thread(skład23);
        skład23Wątek.start();

        Thread skład24Wątek = new Thread(skład24);
        skład24Wątek.start();

        Thread skład25Wątek = new Thread(skład25);
        skład25Wątek.start();



        Skład.listaSkładów.add(skład1);
        Skład.listaSkładów.add(skład2);
        Skład.listaSkładów.add(skład3);
        Skład.listaSkładów.add(skład4);
        Skład.listaSkładów.add(skład5);
        Skład.listaSkładów.add(skład6);
        Skład.listaSkładów.add(skład7);
        Skład.listaSkładów.add(skład8);
        Skład.listaSkładów.add(skład9);
        Skład.listaSkładów.add(skład10);
        Skład.listaSkładów.add(skład11);
        Skład.listaSkładów.add(skład12);
        Skład.listaSkładów.add(skład13);
        Skład.listaSkładów.add(skład14);
        Skład.listaSkładów.add(skład15);
        Skład.listaSkładów.add(skład16);
        Skład.listaSkładów.add(skład17);
        Skład.listaSkładów.add(skład18);
        Skład.listaSkładów.add(skład19);
        Skład.listaSkładów.add(skład20);
        Skład.listaSkładów.add(skład21);
        Skład.listaSkładów.add(skład22);
        Skład.listaSkładów.add(skład23);
        Skład.listaSkładów.add(skład24);
        Skład.listaSkładów.add(skład25);


        ZapisujSkładyDoPliku zapisujSkładyDoPliku = new ZapisujSkładyDoPliku();
        Thread zapisujSkładyThread = new Thread(zapisujSkładyDoPliku);
        zapisujSkładyThread.start();





    }
}