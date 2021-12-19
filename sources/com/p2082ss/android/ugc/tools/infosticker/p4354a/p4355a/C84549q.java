package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.q */
public final class C84549q {

    /* renamed from: a */
    public final EnumC84544l f188959a;

    static {
        Covode.recordClassIndex(98514);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C84549q) && C89219l.m154714a(this.f188959a, ((C84549q) obj).f188959a);
        }
        return true;
    }

    public final int hashCode() {
        EnumC84544l lVar = this.f188959a;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StickerInfo(state=" + this.f188959a + ")";
    }

    public C84549q(EnumC84544l lVar) {
        C89219l.m154721d(lVar, "");
        this.f188959a = lVar;
    }
}
