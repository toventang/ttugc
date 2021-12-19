package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchEffect */
public class SearchEffect implements Serializable {
    @AbstractC27891c(mo46611a = "children")
    public ArrayList<String> children;
    @AbstractC27891c(mo46611a = "desc")
    public String desc;
    @AbstractC27891c(mo46611a = "effect_type")
    public int effectType;
    @AbstractC27891c(mo46611a = "hint")
    public String hint;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f99016id;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "use_count")
    public int useCount;

    static {
        Covode.recordClassIndex(50478);
    }

    public List<String> children() {
        return this.children;
    }

    public String desc() {
        return this.desc;
    }

    public String hint() {
        return this.hint;
    }

    public UrlModel icon() {
        return this.icon;
    }

    /* renamed from: id */
    public String mo72276id() {
        return this.f99016id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }

    public boolean isCombine() {
        if (this.effectType == 1) {
            return true;
        }
        return false;
    }
}
