package com.p2082ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.PhotoTemplate */
public class PhotoTemplate implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    public String desc;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f150897id;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "use_count")
    public int useCount;

    static {
        Covode.recordClassIndex(78961);
    }

    public List<String> children() {
        return null;
    }

    public boolean isCombine() {
        return false;
    }

    public String desc() {
        return this.desc;
    }

    public UrlModel icon() {
        return this.icon;
    }

    /* renamed from: id */
    public String mo106234id() {
        return this.f150897id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }
}
