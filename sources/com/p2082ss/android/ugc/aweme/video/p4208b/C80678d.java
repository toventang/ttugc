package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.b.d */
public final class C80678d {
    @AbstractC27891c(mo46611a = "libra_key")

    /* renamed from: a */
    public String f180375a = null;
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: b */
    public int f180376b = 0;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: c */
    public int f180377c = 0;
    @AbstractC27891c(mo46611a = "scene")

    /* renamed from: d */
    public int f180378d = 0;

    static {
        Covode.recordClassIndex(93959);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80678d)) {
            return false;
        }
        C80678d dVar = (C80678d) obj;
        return C89219l.m154714a(this.f180375a, dVar.f180375a) && this.f180376b == dVar.f180376b && this.f180377c == dVar.f180377c && this.f180378d == dVar.f180378d;
    }

    public final int hashCode() {
        String str = this.f180375a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.f180376b) * 31) + this.f180377c) * 31) + this.f180378d;
    }

    public final String toString() {
        return "DynamicOptionModel(libraKey=" + this.f180375a + ", key=" + this.f180376b + ", type=" + this.f180377c + ", scene=" + this.f180378d + ")";
    }

    private C80678d() {
    }

    /* renamed from: a */
    public final C84202f mo123851a() {
        C84202f fVar = new C84202f();
        fVar.f188008a = this.f180376b;
        fVar.f188010c = this.f180377c;
        fVar.f188011d = this.f180378d;
        return fVar;
    }
}
