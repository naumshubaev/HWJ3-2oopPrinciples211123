package ru.netology.domain;

public class Post {
    private int postId;
    private String postName;
    private int pageOwnerId;
    private int creatorId; // == from_id in VK dev docs
    private int adminId; // == created_by in VK dev docs
    private int date;
    private String imageUrl;
    private int replyOwnerId;
    private int replyPostId;
    private String text;
    private boolean friendsOnly;
    private boolean isAdvertisement; // == marked_as_ads in VK dev docs
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isFavorite;
    private boolean postponedId; // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    //getters, setters
}

