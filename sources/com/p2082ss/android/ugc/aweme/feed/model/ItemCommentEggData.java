package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ItemCommentEggData */
public class ItemCommentEggData implements Serializable {
    @AbstractC27891c(mo46611a = "egg_id")
    String eggId;
    @AbstractC27891c(mo46611a = "file_type")
    String fileType;
    @AbstractC27891c(mo46611a = "material_url")
    String materialUrl;
    @AbstractC27891c(mo46611a = "open_url")
    String openUrl;
    @AbstractC27891c(mo46611a = "regex")
    String regex;
    @AbstractC27891c(mo46611a = "web_url")
    String webUrl;

    static {
        Covode.recordClassIndex(58717);
    }

    public String getEggId() {
        return this.eggId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getRegex() {
        return this.regex;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String toString() {
        return "ItemCommentEggData{regex='" + this.regex + '\'' + ", fileType='" + this.fileType + '\'' + ", webUrl='" + this.webUrl + '\'' + ", openUrl='" + this.openUrl + '\'' + ", materialUrl='" + this.materialUrl + '\'' + ", eggId='" + this.eggId + '\'' + '}';
    }

    public void setEggId(String str) {
        this.eggId = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
