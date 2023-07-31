package com.example.demofirstsession;

public class Post {
    int id,imageId;
    String LikeButton,commentButton;
    String postText,nameText,dateText;


    public Post(int id, int imageId, String likeButton, String commentButton, String postText, String nameText, String dateText) {
        this.id = id;
        this.imageId = imageId;
        LikeButton = likeButton;
        this.commentButton = commentButton;
        this.postText = postText;
        this.nameText = nameText;
        this.dateText = dateText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getLikeButton() {
        return LikeButton;
    }

    public void setLikeButton(String likeButton) {
        LikeButton = likeButton;
    }

    public String getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(String commentButton) {
        this.commentButton = commentButton;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getDateText() {
        return dateText;
    }

    public void setDateText(String dateText) {
        this.dateText = dateText;
    }
}
