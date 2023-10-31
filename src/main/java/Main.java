import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true){
            System.out.println("Merhaba");
            Thread.sleep(300);
            System.out.println("FİFAGOKSAL'A Hoşgeldiniz!");
            Thread.sleep(300);
            System.out.print("Takımınızın ismini giriniz:");
            Scanner sc=new Scanner(System.in);
            String takimAdi=sc.nextLine();

            Random rd=new Random();
            List<String> takimlar=new ArrayList<>();
            takimlar.add("Fenerbahçe");
            takimlar.add("Galatasaray");
            takimlar.add("Trabzonspor");
            takimlar.add("Beşiktaş");
            takimlar.add("KayseriSpor");
            takimlar.add("AdanaDemirSpor");
            takimlar.add("Barcelona");
            takimlar.add("Real Madrid");

            System.out.println(takimAdi + " Mücadeleniz başlamak üzere...");
            System.out.println("eşleşme yapılıyor...");
            Thread.sleep(2000);
            int rakipTakimRd=rd.nextInt(0,8);
            String rakipTakimAdi="";
            int rakipTakimId=8;
            switch (rakipTakimRd){
                case 0:
                    rakipTakimAdi=takimlar.get(0);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 1:
                    rakipTakimAdi=takimlar.get(1);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 2:
                    rakipTakimAdi=takimlar.get(2);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 3:
                    rakipTakimAdi=takimlar.get(3);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 4:
                    rakipTakimAdi=takimlar.get(4);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 5:
                    rakipTakimAdi=takimlar.get(5);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 6:
                    rakipTakimAdi=takimlar.get(6);
                    rakipTakimId=rakipTakimRd;
                    break;
                case 7:
                    rakipTakimAdi=takimlar.get(7);
                    rakipTakimId=rakipTakimRd;
                    break;
            }
            if (rakipTakimId==8){
                System.out.println("Eşleşme başarısız");
            }
            else System.out.println("Rakibiniz " + rakipTakimAdi);
            System.out.println("Maç Başlasın mı?");
            System.out.println("1. Başla");
            System.out.println("2. Tekrar başla");
            System.out.println("3. çıkış");
            int startPage=sc.nextInt();
            if (startPage==2){
                System.out.println("...");
                continue;
            }
            if (startPage==3){
                System.out.println("Çıkış yapılıyor");
                return;
            }


            System.out.println("Maç başlıyor");
            Thread.sleep(500);
            System.out.println("3");
            Thread.sleep(500);
            System.out.println("2");
            Thread.sleep(500);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("Maç Başladı hamlenizi girin");

            int extraLuckGivewey=0;

            int takim1Score=0;
            int takim2Score=0;
            int time=0;
            for (int i = 0; i <= 10; i++) {
                String userInput=sc.nextLine();
                System.out.println("Süre " + time + "'");
                time=time+9;

                int luckyPoint=extraLuckGivewey+rd.nextInt(0,11);
                switch (userInput){
                    case "şut":
                    if (luckyPoint>8){
                        System.out.println("Goooooooooool!");
                        Thread.sleep(400);
                        System.out.println("Tam 90a Müthiş bir gol");
                        takim1Score=takim1Score+1;
                        System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                        break;
                    } else if (luckyPoint>=7){
                        System.out.println("Gooool!");
                        Thread.sleep(400);
                        takim1Score=takim1Score+1;
                        System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                        break;
                    }
                    else if (luckyPoint>=5){
                        System.out.println("Direkten döndü");
                        Thread.sleep(400);
                        System.out.println("seyircilerden yükselen ses: O topa öyle mi vurulur kaçırdığın pozisyona bak...");
                        System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                        break;
                    }else {
                        System.out.println("Gol atmaya çalışırken gol yedin");
                        Thread.sleep(400);
                        System.out.println(rakipTakimAdi+" Bir skor kazandı");
                        takim2Score=takim2Score+1;
                        System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                        break;
                    }
                    case"pas":
                        if (luckyPoint>8){
                            System.out.println("Pas Başarılı!");
                            Thread.sleep(400);
                            System.out.println("Bu avantajına olacak!");
                            extraLuckGivewey=extraLuckGivewey+1;
                            System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                            break;
                        } else if (luckyPoint>4){
                            System.out.println("Pas başarısız!");
                            Thread.sleep(400);
                            System.out.println("Maç kıran kırana devam ediyor");
                            System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                            break;
                        }
                        else if (luckyPoint>2){
                            System.out.println("Pas Verirken topu kaptırdın!");
                            Thread.sleep(400);
                            System.out.println("Avantajını kaybettin!");
                            extraLuckGivewey=0;
                            System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                            System.out.println("Maç kıran kırana devam ediyor");
                            break;
                        } else{
                        System.out.println("Pas Verirken Topu kaptırdın..");
                        Thread.sleep(400);
                        System.out.println("Gol yedin!");
                        extraLuckGivewey=0;
                        takim2Score=takim2Score+1;
                        System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);
                        break;
                    }

                    case"defans":
                        if (luckyPoint>5){
                            System.out.println("defans başarılı");
                            Thread.sleep(800);
                            System.out.println("Avantaj sahibisin artık");
                            extraLuckGivewey=extraLuckGivewey+1;
                        }else if (luckyPoint>0){
                            System.out.println("defans yapmaya vakit harcıyorsun");
                            Thread.sleep(400);
                            System.out.println("zaman kaybı...");
                            System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);

                        }else if (luckyPoint==0){
                            System.out.println("defans başarısız gol yedin");
                            Thread.sleep(400);
                            takim2Score=takim2Score+1;
                            System.out.println("Gol yedin!!!");
                            System.out.println("Maç skoru " + takim1Score + " - " + takim2Score);

                        }
                        break;
                    /*    return;
                    case"karşı takıma söv":

                        return;*/
                }







            }


        if (takim1Score>takim2Score){
            System.out.println("Maç sona erdi...");
            System.out.println("Kazanan " + takimAdi + " Tebrikler!!!");
            System.out.println("Kazanadın!!!!!!!!");
        }else if (takim2Score>takim1Score){
            System.out.println("Maç sona erdi");
            System.out.println("Kazanan takım " + rakipTakimAdi);
            System.out.println("Kaybettin! :(");
        }else {
            System.out.println("Maç Berabere Bitti");
        }










        }

    }
}
