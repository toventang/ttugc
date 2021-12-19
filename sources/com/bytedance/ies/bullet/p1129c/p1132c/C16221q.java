package com.bytedance.ies.bullet.p1129c.p1132c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.q */
public final class C16221q extends Exception {
    static {
        Covode.recordClassIndex(18514);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16221q(AbstractC16208i iVar, Uri uri, Throwable th) {
        super(iVar.getClass().getSimpleName() + " force rejected when processing: " + uri, th);
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(uri, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16221q(AbstractC16208i iVar, Uri uri, Throwable th, int i, C89214g gVar) {
        this(iVar, uri, (i & 4) != 0 ? null : th);
    }
}
