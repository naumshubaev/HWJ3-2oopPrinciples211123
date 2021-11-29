package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private Place place;

    // getters, setters

    public class Place { // an inner class: logic - OuterClass.InnerClass myInner = myOuter.new InnerClass(); docs - https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
        private int id; // идентификатор места.
        private String title; //название места.
        private int latitude; // географическая широта, заданная в градусах (от -90 до 90).
        private int longitude; // географическая долгота*, заданная в градусах (от -90 до 90). *в доке ВК опечатка "широта"
        private int created; // дата создания места в Unixtime.
        private String icon; // иконка места, URL изображения.
        private int checkins; // число отметок в этом месте.
        private int updated; // дата обновления места в Unixtime.
        private int type; // тип места.
        private int country; //идентификатор страны.
        private int city; // идентификатор города.
        private int address; // адрес места.

        // getters, setter
    }
}
