package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.q */
public final class C77232q {

    /* renamed from: a */
    public final String f173253a;

    /* renamed from: b */
    public EnumC77233r f173254b;

    static {
        Covode.recordClassIndex(90244);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77232q)) {
            return false;
        }
        C77232q qVar = (C77232q) obj;
        return C89219l.m154714a(this.f173253a, qVar.f173253a) && C89219l.m154714a(this.f173254b, qVar.f173254b);
    }

    public final int hashCode() {
        String str = this.f173253a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC77233r rVar = this.f173254b;
        if (rVar != null) {
            i = rVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StoryLoadingData(aid=" + this.f173253a + ", status=" + this.f173254b + ")";
    }

    private /* synthetic */ C77232q() {
        this("", EnumC77233r.UNLOADING);
    }

    /* renamed from: a */
    public final void mo120830a(EnumC77233r rVar) {
        C89219l.m154721d(rVar, "");
        this.f173254b = rVar;
    }

    public C77232q(String str, EnumC77233r rVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(rVar, "");
        this.f173253a = str;
        this.f173254b = rVar;
    }
}
