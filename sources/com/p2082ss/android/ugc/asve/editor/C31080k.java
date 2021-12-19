package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.k */
public final class C31080k extends AbstractC31077h {

    /* renamed from: a */
    public final String[] f74449a;

    /* renamed from: b */
    public final C85581w.EnumC85613l f74450b;

    static {
        Covode.recordClassIndex(37710);
    }

    public C31080k(String[] strArr, C85581w.EnumC85613l lVar) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(lVar, "");
        this.f74449a = strArr;
        this.f74450b = lVar;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        return wVar.mo131622a(this.f74449a, this.f74450b);
    }
}
