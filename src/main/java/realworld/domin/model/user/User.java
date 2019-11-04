package realworld.domin.model.user;

public class User {

    private Long userId;

    private String userName;
    private String email;
    private String token;
    private String bio;
    private String image;
    public User(Long userId, String userName, String email, String token, String bio, String image) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.token = token;
        this.bio = bio;
        this.image = image;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
