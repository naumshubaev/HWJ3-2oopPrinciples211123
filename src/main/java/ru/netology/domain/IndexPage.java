package ru.netology.domain;

class MainBanner {
    private int id;
    private String imageUrl;
    private String bannerName;

    public int getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }
}

class Post {
    private int postId;
    private String postName;
    private String imageUrl;
    private int likesCount;
    private boolean liked;
    private int commentsCount;

    //getters, setters
}

class GoodsAdvertisement {
    private int productId;
    private String productName;
    private int productPrice;

    //getters, setters
}
