package p4640l;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p4640l.AbstractC89741c;

/* access modifiers changed from: package-private */
/* renamed from: l.g */
public final class C89748g extends AbstractC89741c.AbstractC89742a {

    /* renamed from: a */
    final Executor f203495a;

    static {
        Covode.recordClassIndex(105842);
    }

    /* renamed from: l.g$a */
    static final class C89750a<T> implements AbstractC89716b<T> {

        /* renamed from: a */
        final Executor f203498a;

        /* renamed from: b */
        final AbstractC89716b<T> f203499b;

        static {
            Covode.recordClassIndex(105844);
        }

        @Override // p4640l.AbstractC89716b
        /* renamed from: a */
        public final C89781l<T> mo144267a() {
            return this.f203499b.mo144267a();
        }

        @Override // p4640l.AbstractC89716b
        /* renamed from: b */
        public final boolean mo144269b() {
            return this.f203499b.mo144269b();
        }

        @Override // p4640l.AbstractC89716b
        /* renamed from: d */
        public final Request mo144271d() {
            return this.f203499b.mo144271d();
        }

        @Override // p4640l.AbstractC89716b
        /* renamed from: c */
        public final AbstractC89716b<T> clone() {
            return new C89750a(this.f203498a, this.f203499b.mo144270c());
        }

        @Override // p4640l.AbstractC89716b
        /* renamed from: a */
        public final void mo144268a(final AbstractC89743d<T> dVar) {
            C89787o.m155873a(dVar, "callback == null");
            this.f203499b.mo144268a(new AbstractC89743d<T>() {
                /* class p4640l.C89748g.C89750a.C897511 */

                static {
                    Covode.recordClassIndex(105845);
                }

                @Override // p4640l.AbstractC89743d
                /* renamed from: a */
                public final void mo34286a(AbstractC89716b<T> bVar, final Throwable th) {
                    C89750a.this.f203498a.execute(new Runnable() {
                        /* class p4640l.C89748g.C89750a.C897511.RunnableC897532 */

                        static {
                            Covode.recordClassIndex(105847);
                        }

                        public final void run() {
                            dVar.mo34286a(C89750a.this, th);
                        }
                    });
                }

                @Override // p4640l.AbstractC89743d
                /* renamed from: a */
                public final void mo34287a(AbstractC89716b<T> bVar, final C89781l<T> lVar) {
                    C89750a.this.f203498a.execute(new Runnable() {
                        /* class p4640l.C89748g.C89750a.C897511.RunnableC897521 */

                        static {
                            Covode.recordClassIndex(105846);
                        }

                        public final void run() {
                            if (C89750a.this.f203499b.mo144269b()) {
                                dVar.mo34286a(C89750a.this, new IOException("Canceled"));
                            } else {
                                dVar.mo34287a(C89750a.this, lVar);
                            }
                        }
                    });
                }
            });
        }

        C89750a(Executor executor, AbstractC89716b<T> bVar) {
            this.f203498a = executor;
            this.f203499b = bVar;
        }
    }

    C89748g(Executor executor) {
        this.f203495a = executor;
    }

    @Override // p4640l.AbstractC89741c.AbstractC89742a
    /* renamed from: a */
    public final AbstractC89741c<?, ?> mo144298a(Type type) {
        if (C89787o.m155872a(type) != AbstractC89716b.class) {
            return null;
        }
        final Type e = C89787o.m155884e(type);
        return new AbstractC89741c<Object, AbstractC89716b<?>>() {
            /* class p4640l.C89748g.C897491 */

            static {
                Covode.recordClassIndex(105843);
            }

            @Override // p4640l.AbstractC89741c
            /* renamed from: a */
            public final Type mo144297a() {
                return e;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [l.b] */
            @Override // p4640l.AbstractC89741c
            /* renamed from: a */
            public final /* synthetic */ AbstractC89716b<?> mo144296a(AbstractC89716b<Object> bVar) {
                return new C89750a(C89748g.this.f203495a, bVar);
            }
        };
    }
}
