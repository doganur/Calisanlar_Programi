package ÇalışanlarProgramı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("hoşgeldiniz.......");

            String işlemler = "işlemler....\n "
                            + "1. yazılımcı işlemleri  \n"
                            + "2. yonetici işlemleri   \n"
                            +"çıkış için q ya basın";
            System.out.println(".....................");
            System.out.println(işlemler);
            System.out.println("......................");

            while(true) {
                System.out.println("işlemi seçiniz : ");
                String islem = scanner.nextLine();

                if(islem.equals("q")) {
                    System.out.println("programdan çıkılıyor.....");
                    break;
                }
                else if(islem.equals("1")) {
                    Yazılımcı yazılımcı = new Yazılımcı("doğanur","çamdereli", 001, "java");
                    String yazılımcı_işlem = "1. format at   \n"
                                             + "2.bilgileri göster \n"
                                             +"çıkış için q ya basın" ;
                    System.out.println(yazılımcı_işlem);
                    while(true){
                        System.out.println("işlemi seçiniz.....");
                        String y_islem = scanner.nextLine();

                        if(y_islem.equals("q")) {
                            System.out.println("çıkılıyor.");
                            break;
                        }
                        else if(y_islem.equals("1")) {
                            System.out.println("işletim sistemi : ");
                            String işletim_sistemi = scanner.nextLine();
                            yazılımcı.formatAt(işletim_sistemi);

                    }
                        else if(y_islem.equals("2")) {
                            yazılımcı.bilgileriGoster();

                    }
                    else {
                        System.out.println("işlem geçersiz.");
                    }

                }
                }
                else if(islem.equals("2")) {
                    Yonetici yonetici = new Yonetici("fatih", "saraç", 002, 10);

                    String yonetici_islem = "yönetici işlemleri :  \n"
                                           + "1.zam yap \n"
                                           +"2. bilgileri göster \n"
                                           +"çıkış için q ya basın";
                    System.out.println(yonetici_islem);
                    while(true) {
                        System.out.println("işlem seçiniz........ ");
                        String y_islem =scanner.nextLine();

                        if(y_islem.equals("q")) {
                            System.out.println("çıkış yapılıyor....");
                            break;
                        }
                        else if(y_islem.equals("1")) {
                            System.out.println("ne kadar zam istiyorunuz..");
                            int zamMiktarı = scanner.nextInt();
                            //scanner.nextLine;
                            yonetici.zamYap(zamMiktarı);
                        }
                        else if(y_islem.equals("2")) {
                            yonetici.bilgileriGoster(); }
                        else {
                            System.out.println("geçersiz işlem.....");
                        }
                    

                    }

                    
                }
                else {
                    System.out.println("geçersiz işlem...");
                }
            }
        }
                        
        
    }
}




