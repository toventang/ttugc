package com.bytedance.ies.ugc.aweme.rich.p1270b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.b.a */
public class C18141a implements Serializable {
    @AbstractC27891c(mo46611a = "creative_id")
    Long creativeId;
    @AbstractC27891c(mo46611a = "group_id")
    Long groupId;
    @AbstractC27891c(mo46611a = "log_extra")
    String logExtra;

    static {
        Covode.recordClassIndex(20782);
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getCreativeIdStr() {
        Long l = this.creativeId;
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }
}
