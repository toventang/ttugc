package com.bytedance.android.livesdk.utils.p654b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90213b;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88579x;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.utils.b.a */
public final class C11230a<T> {

    /* renamed from: a */
    private AbstractC88924h<T> f26876a;

    static {
        Covode.recordClassIndex(12858);
    }

    private C11230a(AbstractC88924h<T> hVar) {
        this.f26876a = hVar;
    }

    /* renamed from: a */
    public static <T> C11230a<T> m19892a(AbstractC88924h<T> hVar) {
        return new C11230a<>(hVar);
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo17978a(AbstractC88434g<? super AbstractC88924h<Throwable>, ? extends AbstractC90213b<?>> gVar) {
        C88466b.m153697a((Object) gVar, "handler is null");
        return C88925a.m154168a(new C88579x(this.f26876a, gVar));
    }
}
