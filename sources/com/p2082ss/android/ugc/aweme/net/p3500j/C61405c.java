package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.j.c */
public final class C61405c {
    @AbstractC27891c(mo46611a = "default")

    /* renamed from: a */
    public final C61404b f139406a;
    @AbstractC27891c(mo46611a = "custom")

    /* renamed from: b */
    public final List<C61404b> f139407b;

    static {
        Covode.recordClassIndex(72055);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61405c)) {
            return false;
        }
        C61405c cVar = (C61405c) obj;
        return C89219l.m154714a(this.f139406a, cVar.f139406a) && C89219l.m154714a(this.f139407b, cVar.f139407b);
    }

    public final int hashCode() {
        C61404b bVar = this.f139406a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List<C61404b> list = this.f139407b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "HeaderParamConfigSetting(default=" + this.f139406a + ", custom=" + this.f139407b + ")";
    }

    private C61405c() {
        this.f139406a = null;
        this.f139407b = null;
    }

    public /* synthetic */ C61405c(byte b) {
        this();
    }
}
