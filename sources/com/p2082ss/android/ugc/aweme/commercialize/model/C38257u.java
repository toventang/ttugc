package com.p2082ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.u */
public class C38257u implements Serializable {
    @AbstractC27891c(mo46611a = "commerce_sticker_id")
    public long commerceStickerId;
    @AbstractC27891c(mo46611a = "icon_url")
    public UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "letters")
    public String letters;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;
    @AbstractC27891c(mo46611a = "web_url_title")
    public String webUrlTitle;

    static {
        Covode.recordClassIndex(45741);
    }

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public boolean enable() {
        if (this.iconUrl == null || TextUtils.isEmpty(this.letters)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.webUrl) || !TextUtils.isEmpty(this.openUrl)) {
            return true;
        }
        return false;
    }

    public void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
