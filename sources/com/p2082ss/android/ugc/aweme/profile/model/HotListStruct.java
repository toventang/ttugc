package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotListStruct */
public class HotListStruct implements Serializable {
    @AbstractC27891c(mo46611a = "footer")
    public String footer;
    @AbstractC27891c(mo46611a = "header")
    public String header;
    @AbstractC27891c(mo46611a = "image_url")
    public String imageUrl;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "title")
    public String titile;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(75178);
    }

    public String getFooter() {
        return this.footer;
    }

    public String getHeader() {
        return this.header;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public boolean isLocalHot() {
        if (this.type == 9) {
            return true;
        }
        return false;
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
