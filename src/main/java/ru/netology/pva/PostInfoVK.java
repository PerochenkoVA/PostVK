package ru.netology.pva;

public class PostInfoVK {


    private boolean avatar;         // аватар владельца поста
    private  int owner;             // наименование владельца поста
    private  int date;              // дата размещения поста
    private String postDescription; // текст поста
    private boolean imageVideo;     // наличие видео или фото к посту
    private int likePost;           // количество лайков
    private int repost;             // количество репостов
    private int lookedPost;         // количество просмотров поста
    private int replyOwnerId;     //идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;      //идентификатор записи, в ответ на которую была оставлена текущая

    // наверное я бы тут установил boolean так как понятие или для друзей или для всех
    // boolean принимает значение: 0- доступно друзьям , 1 - доступно всем
    private int friendsOnly;       //запись была создана с опцией «Только для друзей».

    private CommentInfoVK commentInfoVK;
    private CopyringInfoVK copyringInfoVK;

    public boolean isAvatar() {
        return avatar;
    }

    public void setAvatar(boolean avatar) {
        this.avatar = avatar;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public boolean isImageVideo() {
        return imageVideo;
    }

    public void setImageVideo(boolean imageVideo) {
        this.imageVideo = imageVideo;
    }

    public int getLikePost() {
        return likePost;
    }

    public void setLikePost(int likePost) {
        this.likePost = likePost;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public int getLookedPost() {
        return lookedPost;
    }

    public void setLookedPost(int lookedPost) {
        this.lookedPost = lookedPost;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentInfoVK getCommentInfoVK() {
        return commentInfoVK;
    }

    public void setCommentInfoVK(CommentInfoVK commentInfoVK) {
        this.commentInfoVK = commentInfoVK;
    }

    public CopyringInfoVK getCopyringInfoVK() {
        return copyringInfoVK;
    }

    public void setCopyringInfoVK(CopyringInfoVK copyringInfoVK) {
        this.copyringInfoVK = copyringInfoVK;
    }

}
