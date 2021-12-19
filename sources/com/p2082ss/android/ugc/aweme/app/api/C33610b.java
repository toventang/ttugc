package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22101w;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.utils.C80360dv;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.app.api.b */
public final class C33610b extends AbstractC22019c.AbstractC22020a {
    static {
        Covode.recordClassIndex(40503);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$a */
    static class C33611a implements AbstractC22019c {

        /* renamed from: a */
        AbstractC22019c<?> f79794a;

        static {
            Covode.recordClassIndex(40504);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79794a.mo11591a();
        }

        C33611a(AbstractC22019c<?> cVar) {
            this.f79794a = cVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Object mo11590a(final AbstractC21983b bVar) {
            return ((C1731i) this.f79794a.mo11590a(bVar)).mo5532a((AbstractC1729g) new AbstractC1729g() {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33610b.C33611a.C336121 */

                static {
                    Covode.recordClassIndex(40505);
                }

                @Override // p077b.AbstractC1729g
                public final Object then(C1731i iVar) {
                    if (iVar.mo5544c()) {
                        Exception e = iVar.mo5546e();
                        C80360dv.m139331a(e, bVar.request().getUrl(), "");
                        if (e instanceof C34485a) {
                            bVar.request().getUrl();
                        }
                        throw e;
                    } else if (!iVar.mo5539b()) {
                        return iVar.mo5545d();
                    } else {
                        throw new CancellationException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$b */
    static class C33613b implements AbstractC22019c {

        /* renamed from: a */
        AbstractC22019c<?> f79797a;

        static {
            Covode.recordClassIndex(40506);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79797a.mo11591a();
        }

        C33613b(AbstractC22019c<?> cVar) {
            this.f79797a = cVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Object mo11590a(final AbstractC21983b bVar) {
            AbstractFutureC27655q qVar = (AbstractFutureC27655q) this.f79797a.mo11590a(bVar);
            C27646l.m55298a(qVar, new AbstractC27645k() {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33610b.C33613b.C336141 */

                static {
                    Covode.recordClassIndex(40507);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onSuccess(Object obj) {
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    C80360dv.m139331a(th, bVar.request().getUrl(), "");
                    if (th instanceof C34485a) {
                        bVar.request().getUrl();
                    }
                }
            }, C27659u.EnumC27662a.INSTANCE);
            return qVar;
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        Class<?> a = C22101w.m41534a(type);
        if (a != AbstractFutureC27655q.class && a != C1731i.class) {
            return null;
        }
        AbstractC22019c<?> a2 = qVar.mo35880a(this, type, annotationArr);
        if (a == AbstractFutureC27655q.class) {
            return new C33613b(a2);
        }
        if (a == C1731i.class) {
            return new C33611a(a2);
        }
        throw new AssertionError();
    }
}
