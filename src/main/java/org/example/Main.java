package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        // Köpek havlamıyorsa direkt olarak false dönmeliyiz
        if (!isBarking) {
            return false;
        }
        // Saat geçersiz mi?
        if (clock < 0 || clock > 23) {
            return false;
        }

        // Köpek havlıyor mu ve saat akşam 8 ile sabah 8 arası mı?
        if (isBarking && (clock < 8 || clock > 20)) {
            return true;
        }

        // Diğer durumlar
        return false;



    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // Parametreleri bir diziye yerleştiriyoruz
        int[] numbers = {firstAge, secondAge, thirdAge};

        // Tüm parametreleri kontrol eden for döngüsü
        for (int number : numbers) {
            if (number >= 13 && number <= 19) {
                return true; // Eğer 13-19 arasında bir değer bulursak true döneriz
            }
        }

        // Eğer döngü sonunda hiçbir değer 13-19 aralığında değilse false döneriz
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        // Yaz mevsimi ve sıcaklık 25 ile 45 arasında mı?
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        }
        // Yaz değilse ve sıcaklık 25 ile 35 arasında mı?
        return temp >= 25 && temp <= 35;
    }

    public static double area(double width, double height) {
        // Parametrelerden herhangi biri negatifse, -1 döndür
        if (width < 0 || height < 0) {
            return -1;
        }
        // Alanı hesapla ve geri döndür
        return width * height;
    }


    public static double area(double radius) {
        // Radius negatifse, -1 döndür
        if (radius < 0) {
            return -1;
        }
        // Dairenin alanını hesapla: radius * radius * Math.PI
        return radius * radius * Math.PI;
    }
}
