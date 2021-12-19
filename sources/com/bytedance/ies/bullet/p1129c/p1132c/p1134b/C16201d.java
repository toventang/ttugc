package com.bytedance.ies.bullet.p1129c.p1132c.p1134b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.b.d */
public final class C16201d<T> implements AbstractC16199b<T> {

    /* renamed from: a */
    private boolean f38973a;

    /* renamed from: b */
    private T f38974b;

    static {
        Covode.recordClassIndex(18494);
    }

    public C16201d() {
        this(null, false, 3);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16199b
    /* renamed from: a */
    public final boolean mo25756a() {
        return this.f38973a;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16199b
    /* renamed from: b */
    public final T mo25757b() {
        return this.f38974b;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16199b
    /* renamed from: a */
    public final void mo25755a(AbstractC16199b<T> bVar) {
        C89219l.m154719c(bVar, "");
        if (this.f38973a) {
            if (!bVar.mo25756a()) {
            }
        } else if (bVar.mo25756a()) {
            T b = bVar.mo25757b();
            this.f38973a = true;
            this.f38974b = b;
        }
    }

    private C16201d(T t, boolean z) {
        boolean z2;
        if (!z || t != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f38973a = z2;
        this.f38974b = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16201d(Object obj, boolean z, int i) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? true : z);
    }
}
