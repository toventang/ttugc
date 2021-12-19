package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.a */
public abstract class AbstractC84484a<DATA, CURSOR, EXTRA> extends AbstractC20191d<C89378p<? extends Integer, ? extends CURSOR>, C89378p<? extends CURSOR, ? extends C89378p<? extends List<? extends DATA>, ? extends EXTRA>>> {

    /* renamed from: a */
    public AtomicReference<CURSOR> f188847a;

    /* renamed from: b */
    public final Object f188848b = new Object();

    static {
        Covode.recordClassIndex(98449);
    }

    /* renamed from: b */
    public abstract boolean mo129459b(CURSOR cursor, CURSOR cursor2);

    public AbstractC84484a(CURSOR cursor) {
        this.f188847a = new AtomicReference<>(cursor);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.a$a */
    static final class C84485a<T, R> implements AbstractC88434g<C89378p<? extends CURSOR, ? extends C89378p<? extends List<? extends DATA>, ? extends EXTRA>>, C89378p<? extends List<? extends DATA>, ? extends EXTRA>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84484a f188849a;

        /* renamed from: b */
        final /* synthetic */ Object f188850b;

        static {
            Covode.recordClassIndex(98450);
        }

        C84485a(AbstractC84484a aVar, Object obj) {
            this.f188849a = aVar;
            this.f188850b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.b.b.a */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.concurrent.atomic.AtomicReference<CURSOR> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89378p<List<DATA>, EXTRA> apply(C89378p<? extends CURSOR, ? extends C89378p<? extends List<? extends DATA>, ? extends EXTRA>> pVar) {
            MethodCollector.m26663i(5098);
            C89219l.m154721d(pVar, "");
            synchronized (this.f188849a.f188848b) {
                try {
                    AbstractC84484a aVar = this.f188849a;
                    if (aVar.mo129459b(this.f188850b, aVar.f188847a.get())) {
                        this.f188849a.f188847a.set(pVar.getFirst());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5098);
                    throw th;
                }
            }
            C89378p<List<DATA>, EXTRA> pVar2 = (C89378p) pVar.getSecond();
            MethodCollector.m26664o(5098);
            return pVar2;
        }
    }

    /* renamed from: a */
    public final AbstractC88403ab<C89378p<List<DATA>, EXTRA>> mo129458a(int i) {
        CURSOR cursor;
        synchronized (this.f188848b) {
            cursor = this.f188847a.get();
        }
        AbstractC88403ab<R> c = mo33481a(C89387v.m154943a(Integer.valueOf(i), cursor)).mo143275b().mo142925c(new C84485a(this, cursor));
        C89219l.m154716b(c, "");
        return c;
    }
}
