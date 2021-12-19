package com.p2082ss.ugc.effectplatform.p4448e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.e.b */
public final class C86767b extends C88044c {

    /* renamed from: b */
    private final AbstractC86697a f195670b;

    static {
        Covode.recordClassIndex(102466);
    }

    @Override // p4519d.p4520a.p4530d.p4531a.C88044c, p4519d.p4520a.p4530d.p4531a.AbstractC88054k
    /* renamed from: a */
    public final void mo139996a() {
        this.f195670b.close();
    }

    public C86767b(AbstractC86697a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195670b = aVar;
    }

    @Override // p4519d.p4520a.p4530d.p4531a.C88044c
    /* renamed from: a */
    public final int mo140022a(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        return this.f195670b.read(bArr, 0, i);
    }
}
