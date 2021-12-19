package com.p2082ss.android.ugc.aweme.feed.assem;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.g */
public final class C48707g<T> {

    /* renamed from: a */
    private WeakReference<T> f112572a;

    static {
        Covode.recordClassIndex(57487);
    }

    public C48707g() {
        this(C487081.f112573a);
    }

    /* renamed from: a */
    public final T mo80660a(AbstractC89286i<?> iVar) {
        C89219l.m154721d(iVar, "");
        return this.f112572a.get();
    }

    public C48707g(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f112572a = new WeakReference<>(aVar.invoke());
    }

    /* renamed from: a */
    public final void mo80661a(AbstractC89286i<?> iVar, T t) {
        C89219l.m154721d(iVar, "");
        this.f112572a = new WeakReference<>(t);
    }
}
