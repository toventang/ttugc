package com.p2082ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.b */
public class C59314b implements Serializable {
    @AbstractC27891c(mo46611a = "app_id")
    public String appId;
    @AbstractC27891c(mo46611a = "description")
    public String desc;
    @AbstractC27891c(mo46611a = "icon")
    public String icon;
    @AbstractC27891c(mo46611a = "card")
    public C59317c miniAppCard;
    @AbstractC27891c(mo46611a = "app_name")
    public String name;
    @AbstractC27891c(mo46611a = "orientation")
    public int orientation;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "state")
    public int state;
    @AbstractC27891c(mo46611a = "summary")
    public String summary;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(69692);
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public C59317c getMiniAppCard() {
        return this.miniAppCard;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isApp() {
        int i = this.type;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMiniAppCard(C59317c cVar) {
        this.miniAppCard = cVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
