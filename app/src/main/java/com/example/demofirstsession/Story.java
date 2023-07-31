package com.example.demofirstsession;

public class Story {
    String name;
    int profileImageid,storyImageId;

    public Story(String name, int profileImageid, int storyImageId) {
        this.name = name;
        this.profileImageid = profileImageid;
        this.storyImageId = storyImageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileImageid() {
        return profileImageid;
    }

    public void setProfileImageid(int profileImageid) {
        this.profileImageid = profileImageid;
    }

    public int getStoryImageId() {
        return storyImageId;
    }

    public void setStoryImageId(int storyImageId) {
        this.storyImageId = storyImageId;
    }
}
