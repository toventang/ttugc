package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.e */
public final class C68774e {

    /* renamed from: a */
    public final String f153827a;

    /* renamed from: b */
    public final C28022o f153828b;

    static {
        Covode.recordClassIndex(81051);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68774e)) {
            return false;
        }
        C68774e eVar = (C68774e) obj;
        return C89219l.m154714a(this.f153827a, eVar.f153827a) && C89219l.m154714a(this.f153828b, eVar.f153828b);
    }

    public final int hashCode() {
        String str = this.f153827a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C28022o oVar = this.f153828b;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CommonJsonRespWithUrl(url=" + this.f153827a + ", resp=" + this.f153828b + ")";
    }

    public C68774e(String str, C28022o oVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(oVar, "");
        this.f153827a = str;
        this.f153828b = oVar;
    }
}
