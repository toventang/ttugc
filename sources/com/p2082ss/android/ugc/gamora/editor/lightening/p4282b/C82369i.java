package com.p2082ss.android.ugc.gamora.editor.lightening.p4282b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.i */
public final class C82369i {

    /* renamed from: a */
    public final C69905c f184257a;

    /* renamed from: b */
    public final boolean f184258b;

    static {
        Covode.recordClassIndex(96203);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82369i)) {
            return false;
        }
        C82369i iVar = (C82369i) obj;
        return C89219l.m154714a(this.f184257a, iVar.f184257a) && this.f184258b == iVar.f184258b;
    }

    public final int hashCode() {
        C69905c cVar = this.f184257a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f184258b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "RecMusicLoadSuccessResult(music=" + this.f184257a + ", isAlreadyChooseMusic=" + this.f184258b + ")";
    }

    public C82369i(C69905c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        this.f184257a = cVar;
        this.f184258b = z;
    }
}
