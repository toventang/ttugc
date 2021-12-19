package com.p2082ss.android.ugc.aweme.p2727db;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.db.a */
public abstract class AbstractC40931a<T extends AbstractC34793a> implements AbstractC40940e {

    /* renamed from: a */
    private final AbstractC89244h f95761a = C89250i.m154773a((AbstractC89171a) C40932a.f95764a);

    /* renamed from: k */
    public T f95762k;

    /* renamed from: l */
    public C17656f<AbstractC17641a> f95763l;

    static {
        Covode.recordClassIndex(48783);
    }

    /* renamed from: a */
    private final ReentrantLock mo70133a() {
        return (ReentrantLock) this.f95761a.getValue();
    }

    /* renamed from: a */
    public void mo70127a(boolean z) {
    }

    /* renamed from: b */
    public abstract T mo70128b();

    /* renamed from: c */
    public void mo70129c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40940e
    public void cl_() {
    }

    /* renamed from: com.ss.android.ugc.aweme.db.a$a */
    static final class C40932a extends AbstractC89220m implements AbstractC89171a<ReentrantLock> {

        /* renamed from: a */
        public static final C40932a f95764a = new C40932a();

        static {
            Covode.recordClassIndex(48784);
        }

        C40932a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    /* renamed from: l */
    public final T mo70132l() {
        T t = this.f95762k;
        if (t == null) {
            C89219l.m154710a("item");
        }
        return t;
    }

    /* renamed from: d */
    public T mo70131d() {
        T b = mo70128b();
        this.f95762k = b;
        if (b == null) {
            C89219l.m154710a("item");
        }
        b.f82131a = this;
        T t = this.f95762k;
        if (t == null) {
            C89219l.m154710a("item");
        }
        return t;
    }

    /* renamed from: a */
    public final void mo70125a(C17656f<AbstractC17641a> fVar) {
        C89219l.m154721d(fVar, "");
        this.f95763l = fVar;
    }

    /* renamed from: a */
    public final void mo70126a(AbstractC89172b<? super T, ? extends T> bVar) {
        C89219l.m154721d(bVar, "");
        ReentrantLock a = mo70133a();
        a.lock();
        try {
            C17656f<AbstractC17641a> fVar = this.f95763l;
            if (fVar == null) {
                C89219l.m154710a("state");
            }
            T t = this.f95762k;
            if (t == null) {
                C89219l.m154710a("item");
            }
            int c = fVar.mo28139c(t);
            if (c == -1) {
                if (this.f95762k == null) {
                    C89219l.m154710a("item");
                }
                return;
            }
            T t2 = this.f95762k;
            if (t2 == null) {
                C89219l.m154710a("item");
            }
            String str = t2.f82132b;
            T t3 = this.f95762k;
            if (t3 == null) {
                C89219l.m154710a("item");
            }
            T t4 = (T) ((AbstractC34793a) bVar.invoke(t3));
            this.f95762k = t4;
            if (t4 == null) {
                C89219l.m154710a("item");
            }
            t4.mo61499a(str);
            T t5 = this.f95762k;
            if (t5 == null) {
                C89219l.m154710a("item");
            }
            C89219l.m154721d(t5, "");
            this.f95762k = t5;
            if (t5 == null) {
                C89219l.m154710a("item");
            }
            t5.f82131a = this;
            C17656f<AbstractC17641a> fVar2 = this.f95763l;
            if (fVar2 == null) {
                C89219l.m154710a("state");
            }
            T t6 = this.f95762k;
            if (t6 == null) {
                C89219l.m154710a("item");
            }
            fVar2.mo28136b(c, t6);
            a.unlock();
        } finally {
            a.unlock();
        }
    }
}
