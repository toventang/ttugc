package com.p2082ss.android.ugc.aweme.deeplink.p2734c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41063s;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.c.b */
public abstract class AbstractC41025b implements AbstractC41028d {

    /* renamed from: b */
    public boolean f95909b;

    static {
        Covode.recordClassIndex(48895);
    }

    /* renamed from: a */
    public abstract boolean mo70238a(C41035d dVar);

    /* renamed from: b */
    public boolean mo70240b(C41035d dVar) {
        C89219l.m154721d(dVar, "");
        return true;
    }

    public /* synthetic */ AbstractC41025b() {
        this(false);
    }

    public AbstractC41025b(boolean z) {
        this.f95909b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41028d
    /* renamed from: a */
    public final void mo70239a(C41035d dVar, C41063s sVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(sVar, "");
        if (mo70240b(dVar)) {
            mo70238a(dVar);
            if (this.f95909b) {
                return;
            }
        }
        sVar.mo70275a(dVar, sVar);
    }
}
