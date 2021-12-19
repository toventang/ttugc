package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct */
public final class ProfileBadgeStruct implements Serializable {
    @AbstractC27891c(mo46611a = "description")
    public String description = "";
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public long f144672id;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name = "";
    @AbstractC27891c(mo46611a = "should_show")
    public boolean shouldShow;
    @AbstractC27891c(mo46611a = "url")
    public String url = "";

    static {
        Covode.recordClassIndex(75198);
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.f144672id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setId(long j) {
        this.f144672id = j;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setDescription(String str) {
        C89219l.m154721d(str, "");
        this.description = str;
    }

    public final void setName(String str) {
        C89219l.m154721d(str, "");
        this.name = str;
    }

    public final void setUrl(String str) {
        C89219l.m154721d(str, "");
        this.url = str;
    }
}
