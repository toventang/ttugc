package com.p2082ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.j */
public class C37499j implements Serializable {
    @AbstractC27891c(mo46611a = "action")
    public String action;
    @AbstractC27891c(mo46611a = "link_type")
    public String linkType;
    @AbstractC27891c(mo46611a = "offline_info_type")
    public int offlineInfoType;
    @AbstractC27891c(mo46611a = "offline_subtype")
    public int offlineSubtype;
    @AbstractC27891c(mo46611a = "text")
    public String text;

    static {
        Covode.recordClassIndex(44886);
    }

    public String getAction() {
        return this.action;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public int getOfflineSubtype() {
        return this.offlineSubtype;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setLinkType(String str) {
        this.linkType = str;
    }

    public void setOfflineInfoType(int i) {
        this.offlineInfoType = i;
    }

    public void setOfflineSubtype(int i) {
        this.offlineSubtype = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
