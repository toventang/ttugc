package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.i */
public final class C22050i extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    final Executor f52076a;

    static {
        Covode.recordClassIndex(25740);
    }

    /* renamed from: com.bytedance.retrofit2.i$a */
    static final class C22052a<T> implements AbstractC21983b<T>, AbstractC22058l {

        /* renamed from: a */
        final Executor f52079a;

        /* renamed from: b */
        final AbstractC21983b<T> f52080b;

        static {
            Covode.recordClassIndex(25742);
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b
        public final void cancel() {
            this.f52080b.cancel();
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b
        public final C22099u execute() {
            return this.f52080b.execute();
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b
        public final boolean isCanceled() {
            return this.f52080b.isCanceled();
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b
        public final Request request() {
            return this.f52080b.request();
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b, java.lang.Object
        public final AbstractC21983b<T> clone() {
            return new C22052a(this.f52079a, this.f52080b.clone());
        }

        @Override // com.bytedance.retrofit2.AbstractC22058l
        public final void doCollect() {
            AbstractC21983b<T> bVar = this.f52080b;
            if (bVar instanceof AbstractC22058l) {
                ((AbstractC22058l) bVar).doCollect();
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC21983b
        public final void enqueue(final AbstractC22030d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f52080b.enqueue(new AbstractC22056j<T>() {
                /* class com.bytedance.retrofit2.C22050i.C22052a.C220531 */

                static {
                    Covode.recordClassIndex(25743);
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6817a(AbstractC21983b<T> bVar, final C22099u<T> uVar) {
                    C22052a.this.f52079a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.C22050i.C22052a.C220531.RunnableC220541 */

                        static {
                            Covode.recordClassIndex(25744);
                        }

                        public final void run() {
                            if (C22052a.this.f52080b.isCanceled()) {
                                dVar.mo6818a(C22052a.this, new IOException("Canceled"));
                            } else {
                                dVar.mo6817a(C22052a.this, uVar);
                            }
                        }
                    });
                }

                @Override // com.bytedance.retrofit2.AbstractC22056j
                /* renamed from: b */
                public final void mo35850b(AbstractC21983b<T> bVar, C22099u<T> uVar) {
                    AbstractC22030d dVar = dVar;
                    if (dVar instanceof AbstractC22056j) {
                        ((AbstractC22056j) dVar).mo35850b(bVar, uVar);
                    }
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6818a(AbstractC21983b<T> bVar, final Throwable th) {
                    C22052a.this.f52079a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.C22050i.C22052a.C220531.RunnableC220552 */

                        static {
                            Covode.recordClassIndex(25745);
                        }

                        public final void run() {
                            dVar.mo6818a(C22052a.this, th);
                        }
                    });
                }
            });
        }

        C22052a(Executor executor, AbstractC21983b<T> bVar) {
            this.f52079a = executor;
            this.f52080b = bVar;
        }
    }

    C22050i(Executor executor) {
        this.f52076a = executor;
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<AbstractC21983b<?>> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != AbstractC21983b.class) {
            return null;
        }
        final Type e = C22101w.m41547e(type);
        return new AbstractC22019c<AbstractC21983b<?>>() {
            /* class com.bytedance.retrofit2.C22050i.C220511 */

            static {
                Covode.recordClassIndex(25741);
            }

            @Override // com.bytedance.retrofit2.AbstractC22019c
            /* renamed from: a */
            public final Type mo11591a() {
                return e;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.retrofit2.AbstractC22019c
            /* renamed from: a */
            public final /* synthetic */ AbstractC21983b<?> mo11590a(AbstractC21983b bVar) {
                return new C22052a(C22050i.this.f52076a, bVar);
            }
        };
    }
}
