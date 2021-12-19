package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.VideoTag */
public final class VideoTag implements Serializable {
    @AbstractC27891c(mo46611a = "background_color")
    private String backgroundColor;
    @AbstractC27891c(mo46611a = "en_title")
    private String englishTitle;
    @AbstractC27891c(mo46611a = "font_color")
    private String fontColor;
    @AbstractC27891c(mo46611a = "url")
    private UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private int f99018id;
    @AbstractC27891c(mo46611a = "opacity")
    private int opacity;
    @AbstractC27891c(mo46611a = "left_right_padding")
    private int padding = 4;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(50539);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getEnglishTitle() {
        return this.englishTitle;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f99018id;
    }

    public final int getOpacity() {
        return this.opacity;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setEnglishTitle(String str) {
        this.englishTitle = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(int i) {
        this.f99018id = i;
    }

    public final void setOpacity(int i) {
        this.opacity = i;
    }

    public final void setPadding(int i) {
        this.padding = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
