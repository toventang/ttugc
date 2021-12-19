package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AvatarDecoration */
public class AvatarDecoration implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public long f144668id;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "source_url")
    public UrlModel sourceUrl;

    static {
        Covode.recordClassIndex(75152);
    }

    public long getId() {
        return this.f144668id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
