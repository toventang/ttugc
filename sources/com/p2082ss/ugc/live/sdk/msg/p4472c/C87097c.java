package com.p2082ss.ugc.live.sdk.msg.p4472c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.c.c */
public final class C87097c extends RuntimeException {

    /* renamed from: a */
    private final int f196351a;

    static {
        Covode.recordClassIndex(102893);
    }

    public final int getStatusCode() {
        return this.f196351a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87097c(int i, String str, Exception exc) {
        super(str, exc);
        C89219l.m154719c(str, "");
        this.f196351a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C87097c(int i, String str, Exception exc, int i2, C89214g gVar) {
        this(i, str, (i2 & 4) != 0 ? null : exc);
    }
}
