package com.p2082ss.android.ugc.aweme.filter.repository.internal.p2988a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50719b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.EnumC50720c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import java.util.concurrent.Future;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.c */
final class RunnableC50717c implements Comparable<Object>, Runnable {

    /* renamed from: a */
    public final C50698f f117075a;

    /* renamed from: b */
    public final int f117076b;

    /* renamed from: c */
    public final C88958b<C50719b> f117077c;

    /* renamed from: d */
    public volatile boolean f117078d;

    /* renamed from: e */
    public volatile Future<?> f117079e;

    /* renamed from: f */
    private final AbstractC88434g<C50698f, C50721d> f117080f;

    static {
        Covode.recordClassIndex(59879);
    }

    public final void run() {
        this.f117077c.onNext(new C50719b(EnumC50720c.START, this.f117075a, null, null));
        try {
            this.f117077c.onNext(new C50719b(EnumC50720c.SUCCESS, this.f117075a, this.f117080f.apply(this.f117075a), null));
        } catch (Exception e) {
            this.f117077c.onNext(new C50719b(EnumC50720c.FAILED, this.f117075a, null, e));
        } catch (Throwable th) {
            this.f117077c.onComplete();
            throw th;
        }
        this.f117077c.onComplete();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C89219l.m154721d(obj, "");
        if (!(obj instanceof RunnableC50717c)) {
            return 0;
        }
        boolean z = this.f117078d;
        RunnableC50717c cVar = (RunnableC50717c) obj;
        boolean z2 = cVar.f117078d;
        int i = this.f117076b;
        int i2 = cVar.f117076b;
        if (z == z2) {
            return C89219l.m154703a(i, i2);
        }
        if (z) {
            return -1;
        }
        return 1;
    }

    private RunnableC50717c(C50698f fVar, int i, AbstractC88434g<C50698f, C50721d> gVar, C88958b<C50719b> bVar, boolean z) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        this.f117075a = fVar;
        this.f117076b = i;
        this.f117080f = gVar;
        this.f117077c = bVar;
        this.f117078d = z;
        this.f117079e = null;
    }

    public /* synthetic */ RunnableC50717c(C50698f fVar, int i, AbstractC88434g gVar, C88958b bVar, boolean z, byte b) {
        this(fVar, i, gVar, bVar, z);
    }
}
