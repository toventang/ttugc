package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.e */
public final class C76595e {

    /* renamed from: a */
    public final EnumC76597g f171912a;

    /* renamed from: b */
    public final AbstractC76591a f171913b;

    static {
        Covode.recordClassIndex(89580);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76595e)) {
            return false;
        }
        C76595e eVar = (C76595e) obj;
        return C89219l.m154714a(this.f171912a, eVar.f171912a) && C89219l.m154714a(this.f171913b, eVar.f171913b);
    }

    public final int hashCode() {
        EnumC76597g gVar = this.f171912a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        AbstractC76591a aVar = this.f171913b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StoryEvent(type=" + this.f171912a + ", params=" + this.f171913b + ")";
    }

    public C76595e(EnumC76597g gVar, AbstractC76591a aVar) {
        C89219l.m154721d(gVar, "");
        this.f171912a = gVar;
        this.f171913b = aVar;
    }
}
