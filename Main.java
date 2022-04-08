package com.company;

import java.util.Scanner;

interface Product{
    void ProductName();
    void ProductFix();
    void ProductRating();
    void ProductInfo();
}
interface User{
    void Login();
    void Password();
    void UserInfo();
}
public class Main {
    static class ProductOne implements Product{
        String title;
        int fix;
        int reit;
        ProductOne(String title, int fix, int reit){
            this.title = title;
            this.fix = fix;
            this.reit = reit;
        }
        public void ProductName(){
            System.out.printf("\nНазвание товара: %s \n", title);
        }

        public void ProductFix(){
            System.out.printf("Цена товара: %s ® \n", fix);
        }
        public void ProductRating(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }

        public void ProductInfo() {
            ProductName();
            ProductFix();
            ProductRating();
        }
    }
    static class ProductTwo implements Product{
        String title;
        int fix;
        int reit;
        ProductTwo(String name, int fix, int reit){
            this.title = name;
            this.fix = fix;
            this.reit = reit;
        }
        public void ProductName(){
            System.out.printf("\nНазвание товара: %s\n", title);
        }

        public void ProductFix(){
            System.out.printf("Цена товар: %s ®\n", fix);
        }
        public void ProductRating(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void ProductInfo() {
            ProductName();
            ProductFix();
            ProductRating();
        }
    }
    static class ProductThree implements Product{
        String title;
        int fix;
        int reit;
        ProductThree(String title, int fix, int reit){
            this.title = title;
            this.fix = fix;
            this.reit = reit;
        }
        public void ProductName(){
            System.out.printf("\nНазвание товара: %s\n", title);
        }

        public void ProductFix(){
            System.out.printf("Цена товара: %s ®\n", fix);
        }
        public void ProductRating(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void ProductInfo() {
            ProductName();
            ProductFix();
            ProductRating();
        }
    }
    static class User1 implements User{
        String login;
        String password;
        User1(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("\nЛогин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User2 implements User{
        String login;
        String password;
        User2(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("\nЛогин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User3 implements User{
        String login;
        String password;
        User3(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("\nЛогин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class Buy implements User, Product{
        String login;
        String password;
        String title;
        int fix;
        int reit;
        Buy(String login, String password,String title, int fix, int reit){
            this.login = login;
            this.password = password;
            this.title = title;
            this.fix = fix;
            this.reit = reit;
        }
        public void Login(){
            System.out.printf("\nЛогин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
        public void ProductName(){
            System.out.printf("\nНазвание товара: %s\n", title);
        }

        public void ProductFix(){
            System.out.printf("Цена товара: %s руб\n", fix);
        }
        public void ProductRating(){
            System.out.printf("Рейтинг товара: %s\n", reit);

        }
        public void ProductInfo() {
            ProductName();
            ProductFix();
            ProductRating();
        }
        public void PrintBuy(){
            System.out.printf("Пользователь %s приобрёл товар %s", login, title);
        }
    }
    public static void main(String[] args) {
        Product chocolate = new ProductOne("Ручка синяя шариковая",12, 9);
        chocolate.ProductInfo();
        Product cheese = new ProductTwo("Пенал жёлтый", 299,6);
        cheese.ProductInfo();
        Product tomato = new ProductThree("Шоппер чёрный", 499, 8);
        tomato.ProductInfo();
        User peron1 = new User1("Zero_V", "Ld34dk4tsfG8");
        peron1.UserInfo();
        User peron2 = new User2("Unity","2d01FEV31e4");
        peron2.UserInfo();
        User peron3 = new User3("Miss_Katty","4ee39vbrb775e9");
        peron3.UserInfo();
        Scanner in = new Scanner(System.in);
        System.out.println("\n    ◂ ВЫПОЛНЯЕТСЯ ВХОД В АККАУНТ ▸ \n►Введите логин");
        String log = in.nextLine();
        System.out.println("►Введите пароль");
        String pas = in.nextLine();
        System.out.println("►Введите название приобретаемого товара");
        String tov = in.nextLine();
        Buy Buy = new Buy(log,pas,tov,54, 10);
        Buy.PrintBuy();
    }
}