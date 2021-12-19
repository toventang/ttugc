package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.p */
public final class C5603p {

    /* renamed from: a */
    public final EnumC4422k f14246a;

    static {
        Covode.recordClassIndex(6200);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5603p) && C89219l.m154714a(this.f14246a, ((C5603p) obj).f14246a);
        }
        return true;
    }

    public final int hashCode() {
        EnumC4422k kVar = this.f14246a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiLiveSetting(layoutType=" + this.f14246a + ")";
    }

    public C5603p(EnumC4422k kVar) {
        C89219l.m154721d(kVar, "");
        this.f14246a = kVar;
    }
}
