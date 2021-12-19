package com.p2082ss.android.ugc.aweme.tools.draft.p4103d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.l */
public final class C78241l extends C78230a {

    /* renamed from: c */
    public String f175735c;

    /* renamed from: d */
    public String f175736d;

    /* renamed from: e */
    private final int f175737e;

    static {
        Covode.recordClassIndex(91356);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a
    /* renamed from: a */
    public final int mo122123a() {
        return this.f175737e;
    }

    public /* synthetic */ C78241l() {
        this("", "");
    }

    public final int hashCode() {
        return this.f175736d.hashCode();
    }

    /* renamed from: a */
    public final void mo122137a(String str) {
        C89219l.m154721d(str, "");
        this.f175735c = str;
    }

    /* renamed from: b */
    public final void mo122138b(String str) {
        C89219l.m154721d(str, "");
        this.f175736d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C78241l)) {
            return false;
        }
        C78241l lVar = (C78241l) obj;
        if (lVar.f175737e != this.f175737e || !C89219l.m154714a((Object) lVar.f175735c, (Object) this.f175735c) || !C89219l.m154714a((Object) lVar.f175736d, (Object) this.f175736d)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C78241l(String str, String str2) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f175737e = 103;
        this.f175735c = str;
        this.f175736d = str2;
    }
}
