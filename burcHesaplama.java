import java.util.Scanner;

public class burcHesaplama {
    public static void main(String[] args) {


        int month,day;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dogdunuz ay : ");
        month = inp.nextInt();

        System.out.print("Dogdunuz gun : ");
        day = inp.nextInt();

        if (month == 1){
            if ( day > 0 && day <= 21){
                System.out.print("Burcunuz oglak");}
            else if (day > 21 && day <= 31){
                System.out.print("Burcunuz Kova");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 2){
            if ( day > 0 && day <= 19){
                System.out.print("Burcunuz kova");}
            else if (day > 19 && day <= 29){
                System.out.print("Burcunuz balik ");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month == 3){
            if ( day > 0 && day <= 20){
                System.out.print("Burcunuz balik");}
            else if (day > 20 && day <= 31){
                System.out.print("Burcunuz koc");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 4){
            if ( day > 0 && day <= 20){
                System.out.print("Burcunuz koc");}
            else if (day > 20 && day <= 30){
                System.out.print("Burcunuz boga");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 5){
            if ( day > 0 && day <= 21){
                System.out.print("Burcunuz boga");}
            else if (day > 21 && day <= 31){
                System.out.print("Burcunuz ikizler");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month == 6){
            if ( day > 0 && day <= 22){
                System.out.print("Burcunuz ikizler");}
            else if (day > 22 && day <= 30){
                System.out.print("Burcunuz yengec");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 7){
            if ( day > 0 && day <= 22){
                System.out.print("Burcunuz yengec");}
            else if (day > 22 && day <= 31){
                System.out.print("Burcunuz aslan");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month == 8){
            if ( day > 0 && day <= 22){
                System.out.print("Burcunuz aslan");}
            else if (day > 22 && day <= 30){
                System.out.print("Burcunuz basak");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 9){
            if ( day > 0 && day <= 22){
                System.out.print("Burcunuz basak");}
            else if (day > 22 && day <= 31){
                System.out.print("Burcunuz terazi");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month == 10){
            if ( day > 0 && day <= 22){
                System.out.print("Burcunuz terazi");}
            else if (day > 21 && day <= 30){
                System.out.print("Burcunuz akrep");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month == 11){
            if ( day > 0 && day <= 21){
                System.out.print("Burcunuz akrep");}
            else if (day > 21 && day <= 31){
                System.out.print("Burcunuz yay");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}

        if (month == 12){
            if ( day > 0 && day <= 21){
                System.out.print("Burcunuz yay");}
            else if (day > 21 && day <= 31){
                System.out.print("Burcunuz oğlak");}
            else {
                System.out.print("Eksik yada yanlıs bilgi girdiniz.Tekrar deneyiniz.!!!   ");}}


        if (month < 0 || month >= 12){
            System.out.println("Yanlis bilgi girdiniz.Lutfen tekrar deneyiniz.  ");}

    }
}

