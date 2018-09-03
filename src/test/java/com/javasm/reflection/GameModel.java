package com.javasm.reflection;

/**
 * @author Alex
 * @creartTime 2018/8/31 - 23:24
 * @function
 */
public class GameModel {
    private int id;
    protected String name;
    double price;
    public String url;

     GameModel(int id) {
        this.id = id;
    }

    public GameModel(String name) {
        this.name = name;
        System.out.println("String的构造被调用");
    }

    public GameModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected GameModel() {
        System.out.println("无参构造被调用");
    }

    public GameModel(int id, String name, double price, String url) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
    }

    @Override
    public String toString() {
        return "GameModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
