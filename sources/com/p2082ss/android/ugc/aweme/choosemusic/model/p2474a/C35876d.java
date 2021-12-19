package com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35888ah;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.d */
public final class C35876d {

    /* renamed from: a */
    public final C35877e f84667a;

    /* renamed from: b */
    public final C35888ah f84668b;

    static {
        Covode.recordClassIndex(43116);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35876d)) {
            return false;
        }
        C35876d dVar = (C35876d) obj;
        return C89219l.m154714a(this.f84667a, dVar.f84667a) && C89219l.m154714a(this.f84668b, dVar.f84668b);
    }

    public final int hashCode() {
        C35877e eVar = this.f84667a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C35888ah ahVar = this.f84668b;
        if (ahVar != null) {
            i = ahVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MusicListRequestData(musicListRequestParam=" + this.f84667a + ", musicPickResponse=" + this.f84668b + ")";
    }

    public C35876d(C35877e eVar, C35888ah ahVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(ahVar, "");
        this.f84667a = eVar;
        this.f84668b = ahVar;
    }
}
