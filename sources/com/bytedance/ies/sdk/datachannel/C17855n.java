package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.sdk.datachannel.n */
public final class C17855n<T> implements AbstractC1214u<T> {

    /* renamed from: a */
    private final int f42565a;

    /* renamed from: b */
    private final AbstractC89172b<T, C89391z> f42566b;

    /* renamed from: c */
    private final boolean f42567c;

    /* renamed from: d */
    private final C17853m<T> f42568d;

    static {
        Covode.recordClassIndex(20423);
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(T t) {
        if (this.f42567c || this.f42565a < this.f42568d.f42563b) {
            this.f42566b.invoke(t);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17855n(AbstractC89172b<? super T, C89391z> bVar, boolean z, C17853m<T> mVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(mVar, "");
        this.f42566b = bVar;
        this.f42567c = z;
        this.f42568d = mVar;
        this.f42565a = mVar.f42563b;
    }
}
