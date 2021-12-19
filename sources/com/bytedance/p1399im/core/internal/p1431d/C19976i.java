package com.bytedance.p1399im.core.internal.p1431d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.im.core.internal.d.i */
public class C19976i extends AbstractC19948a {
    static {
        Covode.recordClassIndex(22820);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: b */
    public String mo31823b() {
        return "ParallelRequestManager";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: c */
    public String mo31825c() {
        return "IM-REQUEST-QUEUE-P";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: d */
    public final void mo31828d(C19978k kVar) {
        super.mo31828d(kVar);
        mo31832g(kVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: c */
    public final void mo31826c(C19978k kVar) {
        if (this.f47444d.contains(kVar)) {
            mo31819a(kVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: b */
    public final void mo31824b(C19978k kVar) {
        if (!this.f47444d.contains(kVar)) {
            this.f47444d.add(kVar);
        }
        mo31819a(kVar);
    }
}
