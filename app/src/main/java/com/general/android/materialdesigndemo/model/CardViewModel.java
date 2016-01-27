package com.general.android.materialdesigndemo.model;

/**
 * Created by GeneralAndroid on 2016/1/27.
 */
public class CardViewModel extends BaseModel{
    private String imgUrl;
    private String name;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
