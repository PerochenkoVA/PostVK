package ru.netology.pva;

public class CommentInfoVK {
    private int ownerCom;       // владелец комментария
    private int lakeCom;        // лайк комментарию
    private String comment;     // строка комментария
    private String reComment;   // строка ответа на комментарий
    // тут я бы использовал boolean
    private int canPost;       //  информация о том, может ли текущий пользователь комментировать запись
    // тут я бы использовал boolean
    private int groupsCanPost; //  информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;      // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen;       //может ли текущий пользователь открыть комментарии к записи.



}
