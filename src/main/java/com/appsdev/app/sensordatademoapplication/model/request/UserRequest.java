package com.appsdev.app.sensordatademoapplication.model.request;

public class UserRequest {

    private int userRegId;
    private String userName;
    private String userPhone;
    private String userCountryCode;
    private int userAge;
    private String userEmail;
    private String userPicRef;
    private int bonusPoints;

    private String userPwd;

    public UserRequest() {
    }

    public UserRequest(int userRegId, String userName, String userPhone, String userCountryCode, int userAge, String userEmail, String userPicRef, int bonusPoints, String userPwd) {
        this.userRegId = userRegId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCountryCode = userCountryCode;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userPicRef = userPicRef;
        this.bonusPoints = bonusPoints;
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserRegId() {
        return userRegId;
    }

    public void setUserRegId(int userRegId) {
        this.userRegId = userRegId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCountryCode() {
        return userCountryCode;
    }

    public void setUserCountryCode(String userCountryCode) {
        this.userCountryCode = userCountryCode;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPicRef() {
        return userPicRef;
    }

    public void setUserPicRef(String userPicRef) {
        this.userPicRef = userPicRef;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
