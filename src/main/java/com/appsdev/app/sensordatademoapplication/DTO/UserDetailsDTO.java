package com.appsdev.app.sensordatademoapplication.DTO;

public class UserDetailsDTO {


    private int userRegId;
    private String userName;
    private String userPhone;
    private String userCountryCode;
    private int userAge;
    private String userEmail;
    private String userPicRef;
    private int bonusPoints;

    private String userPwd;

    public int getUserRegId() {
        return userRegId;
    }

    public void setUserRegId(int userRegId) {
        this.userRegId = userRegId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    private int registrationStatus;
    private String description;
    private int authStatus;

    private int profileUpdateStatus;
    private int passResetStatus;
    private int userVerifiedStatus;

    public int getRegistrationStatus() {
        return registrationStatus;
    }

    public UserDetailsDTO() {
    }

    public UserDetailsDTO(int registrationStatus, String description, int authStatus, int profileUpdateStatus, int passResetStatus, int userVerifiedStatus) {
        this.registrationStatus = registrationStatus;
        this.description = description;
        this.authStatus = authStatus;
        this.profileUpdateStatus = profileUpdateStatus;
        this.passResetStatus = passResetStatus;
        this.userVerifiedStatus = userVerifiedStatus;
    }

    public void setRegistrationStatus(int registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }

    public int getPassResetStatus() {
        return passResetStatus;
    }

    public void setPassResetStatus(int passResetStatus) {
        this.passResetStatus = passResetStatus;
    }

    public int getProfileUpdateStatus() {
        return profileUpdateStatus;
    }

    public void setProfileUpdateStatus(int profileUpdateStatus) {
        this.profileUpdateStatus = profileUpdateStatus;
    }

    public int getUserVerifiedStatus() {
        return userVerifiedStatus;
    }

    public void setUserVerifiedStatus(int userVerifiedStatus) {
        this.userVerifiedStatus = userVerifiedStatus;
    }
}
