package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.e */
public final class C61553e extends C61550b implements Serializable {
    @AbstractC27891c(mo46611a = "open_url")

    /* renamed from: a */
    private String f139707a = "";
    @AbstractC27891c(mo46611a = "image_url")

    /* renamed from: b */
    private String f139708b = "";
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: c */
    private long f139709c;
    @AbstractC27891c(mo46611a = "group_id")

    /* renamed from: d */
    private long f139710d;
    @AbstractC27891c(mo46611a = "extra_str")

    /* renamed from: e */
    private String f139711e = "";
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: f */
    private String f139712f = "";
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: g */
    private String f139713g = "";
    @AbstractC27891c(mo46611a = "push_show_type")

    /* renamed from: h */
    private int f139714h;

    static {
        Covode.recordClassIndex(72228);
    }

    public final String getContent() {
        return this.f139713g;
    }

    public final String getExtraStr() {
        return this.f139711e;
    }

    public final long getGid() {
        return this.f139710d;
    }

    public final String getImageUrl() {
        return this.f139708b;
    }

    public final String getOpenUrl() {
        return this.f139707a;
    }

    public final int getPushShowType() {
        return this.f139714h;
    }

    public final long getRid() {
        return this.f139709c;
    }

    public final String getTitle() {
        return this.f139712f;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b
    public final EnumC61554f getType() {
        return EnumC61554f.LIVE;
    }

    public final void setExtraStr(String str) {
        this.f139711e = str;
    }

    public final void setGid(long j) {
        this.f139710d = j;
    }

    public final void setPushShowType(int i) {
        this.f139714h = i;
    }

    public final void setRid(long j) {
        this.f139709c = j;
    }

    public final void setContent(String str) {
        C89219l.m154721d(str, "");
        this.f139713g = str;
    }

    public final void setImageUrl(String str) {
        C89219l.m154721d(str, "");
        this.f139708b = str;
    }

    public final void setOpenUrl(String str) {
        C89219l.m154721d(str, "");
        this.f139707a = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.f139712f = str;
    }
}
