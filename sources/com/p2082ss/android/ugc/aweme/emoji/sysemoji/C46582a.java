package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.a */
public final class C46582a implements Serializable {
    @AbstractC27891c(mo46611a = "business")

    /* renamed from: a */
    private int f108607a;
    @AbstractC27891c(mo46611a = "emoji")

    /* renamed from: b */
    private List<String> f108608b;
    @AbstractC27891c(mo46611a = "ios")

    /* renamed from: c */
    private String f108609c = "";
    @AbstractC27891c(mo46611a = "and")

    /* renamed from: d */
    private String f108610d = "";

    static {
        Covode.recordClassIndex(55172);
    }

    public final String getAnd() {
        return this.f108610d;
    }

    public final int getBusiness() {
        return this.f108607a;
    }

    public final List<String> getEmoji() {
        return this.f108608b;
    }

    public final String getIos() {
        return this.f108609c;
    }

    public final void setBusiness(int i) {
        this.f108607a = i;
    }

    public final void setEmoji(List<String> list) {
        this.f108608b = list;
    }

    public final void setAnd(String str) {
        C89219l.m154721d(str, "");
        this.f108610d = str;
    }

    public final void setIos(String str) {
        C89219l.m154721d(str, "");
        this.f108609c = str;
    }
}
