package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.CommerceStruct */
public class CommerceStruct implements Serializable {
    @AbstractC27891c(mo46611a = "commerce_permission")
    public int commercePermission;
    @AbstractC27891c(mo46611a = "oec_live_enter_room_init_data")
    public String oecInitDataString;

    static {
        Covode.recordClassIndex(58787);
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public String toString() {
        return "CommerceStruct{commercePermission=" + this.commercePermission + ", commercePack=" + this.oecInitDataString + '}';
    }

    public void setCommercePermission(int i) {
        this.commercePermission = i;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
