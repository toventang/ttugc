package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e */
public abstract class AbstractC55765e<R> {

    /* renamed from: g */
    protected AbstractC55764d<R> f127179g;

    static {
        Covode.recordClassIndex(65551);
    }

    public abstract void bM_();

    public abstract void bN_();

    public abstract boolean bO_();

    /* renamed from: e */
    public abstract boolean mo92627e();

    /* renamed from: b */
    public boolean mo92623b() {
        if (this.f127179g != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92640a(AbstractC55764d<R> dVar) {
        C89219l.m154721d(dVar, "");
        this.f127179g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92641a(Throwable th, boolean z) {
        C89219l.m154721d(th, "");
        if (z) {
            AbstractC55764d<R> dVar = this.f127179g;
            if (dVar == null) {
                C89219l.m154710a("loadSubscriber");
            }
            dVar.mo92517c(th);
            return;
        }
        AbstractC55764d<R> dVar2 = this.f127179g;
        if (dVar2 == null) {
            C89219l.m154710a("loadSubscriber");
        }
        dVar2.mo92510a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92642a(List<R> list, boolean z) {
        C89219l.m154721d(list, "");
        if (z) {
            AbstractC55764d<R> dVar = this.f127179g;
            if (dVar == null) {
                C89219l.m154710a("loadSubscriber");
            }
            dVar.mo92515b(list, mo92627e());
            return;
        }
        AbstractC55764d<R> dVar2 = this.f127179g;
        if (dVar2 == null) {
            C89219l.m154710a("loadSubscriber");
        }
        dVar2.mo92512a(list, mo92627e());
    }
}
