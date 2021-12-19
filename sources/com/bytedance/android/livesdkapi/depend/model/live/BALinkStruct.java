package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

public class BALinkStruct implements Serializable {
    @AbstractC27891c(mo46611a = "ba_link_data")
    public String baLinkData;
    @AbstractC27891c(mo46611a = "ba_link_permission")
    public int baLinkPermission;

    static {
        Covode.recordClassIndex(13361);
    }

    public String getBaLinkData() {
        return this.baLinkData;
    }

    public int getBaLinkPermission() {
        return this.baLinkPermission;
    }

    public String toString() {
        return "BALinkStruct{baLinkPermission=" + this.baLinkPermission + ", baLinkData='" + this.baLinkData + '\'' + '}';
    }

    public void setBaLinkData(String str) {
        this.baLinkData = str;
    }

    public void setBaLinkPermission(int i) {
        this.baLinkPermission = i;
    }
}
