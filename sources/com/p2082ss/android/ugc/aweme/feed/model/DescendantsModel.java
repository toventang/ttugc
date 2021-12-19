package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.DescendantsModel */
public class DescendantsModel implements Serializable {
    @AbstractC27891c(mo46611a = "notify_msg")
    public String notifyMsg;
    @AbstractC27891c(mo46611a = "platforms")
    public List<String> platforms;

    static {
        Covode.recordClassIndex(58672);
    }

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
