package com.p2082ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.api.d */
public final class C40457d {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    public final int f94681a;
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: b */
    public final String f94682b;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: c */
    public final C40454b f94683c;

    static {
        Covode.recordClassIndex(48261);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40457d)) {
            return false;
        }
        C40457d dVar = (C40457d) obj;
        return this.f94681a == dVar.f94681a && C89219l.m154714a(this.f94682b, dVar.f94682b) && C89219l.m154714a(this.f94683c, dVar.f94683c);
    }

    public final int hashCode() {
        int i = this.f94681a * 31;
        String str = this.f94682b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C40454b bVar = this.f94683c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShowCaseRespModel(code=" + this.f94681a + ", message=" + this.f94682b + ", data=" + this.f94683c + ")";
    }
}
