package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.f */
public final class C68775f {

    /* renamed from: a */
    public final String f153829a;

    /* renamed from: b */
    public final AbstractC28019l f153830b;

    static {
        Covode.recordClassIndex(81052);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68775f)) {
            return false;
        }
        C68775f fVar = (C68775f) obj;
        return C89219l.m154714a(this.f153829a, fVar.f153829a) && C89219l.m154714a(this.f153830b, fVar.f153830b);
    }

    public final int hashCode() {
        String str = this.f153829a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC28019l lVar = this.f153830b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CommonRespWithUrl(url=" + this.f153829a + ", resp=" + this.f153830b + ")";
    }

    public C68775f(String str, AbstractC28019l lVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(lVar, "");
        this.f153829a = str;
        this.f153830b = lVar;
    }
}
