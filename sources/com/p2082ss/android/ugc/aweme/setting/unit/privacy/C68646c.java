package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.c */
public final class C68646c {

    /* renamed from: a */
    public final C79546d f153613a;

    /* renamed from: b */
    public final String f153614b;

    static {
        Covode.recordClassIndex(80906);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68646c)) {
            return false;
        }
        C68646c cVar = (C68646c) obj;
        return C89219l.m154714a(this.f153613a, cVar.f153613a) && C89219l.m154714a(this.f153614b, cVar.f153614b);
    }

    public final int hashCode() {
        C79546d dVar = this.f153613a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        String str = this.f153614b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PlatformResponse(response=" + this.f153613a + ", platform=" + this.f153614b + ")";
    }

    public C68646c(C79546d dVar, String str) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        this.f153613a = dVar;
        this.f153614b = str;
    }
}
