package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.u */
public final class C46113u {
    @AbstractC27891c(mo46611a = "keyword")

    /* renamed from: a */
    public final String f107371a;
    @AbstractC27891c(mo46611a = "lang")

    /* renamed from: b */
    public final String f107372b;

    static {
        Covode.recordClassIndex(54671);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46113u)) {
            return false;
        }
        C46113u uVar = (C46113u) obj;
        return C89219l.m154714a(this.f107371a, uVar.f107371a) && C89219l.m154714a(this.f107372b, uVar.f107372b);
    }

    public final int hashCode() {
        String str = this.f107371a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f107372b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TextWikiAnchor(keyword=" + this.f107371a + ", lang=" + this.f107372b + ")";
    }

    private /* synthetic */ C46113u() {
        this("", "");
    }

    public C46113u(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f107371a = str;
        this.f107372b = str2;
    }
}
