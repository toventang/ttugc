package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.g */
public final class C42410g implements AbstractC42409f {
    @AbstractC27891c(mo46611a = "doc_id")

    /* renamed from: a */
    public String f98785a;
    @AbstractC27891c(mo46611a = "ala_src")

    /* renamed from: b */
    public String f98786b;
    @AbstractC27891c(mo46611a = "sounds_list_type")

    /* renamed from: c */
    public int f98787c;

    /* renamed from: d */
    public int f98788d;

    /* renamed from: e */
    public int f98789e;

    /* renamed from: f */
    public int f98790f = -1;

    static {
        Covode.recordClassIndex(50355);
    }

    public final int hashCode() {
        int i;
        String str = this.f98785a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f98786b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.f98788d) * 31) + this.f98789e) * 31) + this.f98790f;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchCardInfo");
        C42410g gVar = (C42410g) obj;
        if (!(!C89219l.m154714a((Object) this.f98785a, (Object) gVar.f98785a)) && !(!C89219l.m154714a((Object) this.f98786b, (Object) gVar.f98786b)) && this.f98788d == gVar.f98788d && this.f98789e == gVar.f98789e && this.f98790f == gVar.f98790f) {
            return true;
        }
        return false;
    }
}
