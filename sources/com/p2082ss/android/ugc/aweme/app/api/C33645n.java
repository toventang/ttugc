package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.C22101w;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.n */
public final class C33645n extends AbstractC22019c.AbstractC22020a {
    static {
        Covode.recordClassIndex(40538);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.n$a */
    static final class C33646a implements AbstractC22019c<AbstractFutureC27655q> {

        /* renamed from: a */
        private final Type f79840a;

        static {
            Covode.recordClassIndex(40539);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79840a;
        }

        C33646a(Type type) {
            this.f79840a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ AbstractFutureC27655q mo11590a(AbstractC21983b bVar) {
            return new AbstractC27620b<R>(bVar) {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33645n.C33646a.C336471 */

                /* renamed from: a */
                final /* synthetic */ AbstractC21983b f79841a;

                static {
                    Covode.recordClassIndex(40540);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
                /* renamed from: c */
                public final void mo46228c() {
                    this.f79841a.cancel();
                }

                {
                    this.f79841a = r3;
                    r3.enqueue(new AbstractC22030d<R>() {
                        /* class com.p2082ss.android.ugc.aweme.app.api.C33645n.C33646a.C336471.C336481 */

                        static {
                            Covode.recordClassIndex(40541);
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6818a(AbstractC21983b<R> bVar, Throwable th) {
                            C336471.this.mo46226a(th);
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6817a(AbstractC21983b<R> bVar, C22099u<R> uVar) {
                            if (uVar.f52261a.mo35845a()) {
                                C336471.this.mo46227b((Object) uVar.f52262b);
                            } else {
                                C336471.this.mo46226a((Throwable) new RuntimeException("HttpException"));
                            }
                        }
                    });
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.n$b */
    static final class C33649b implements AbstractC22019c<AbstractFutureC27655q<C22099u>> {

        /* renamed from: a */
        private final Type f79844a;

        static {
            Covode.recordClassIndex(40542);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79844a;
        }

        C33649b(Type type) {
            this.f79844a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ AbstractFutureC27655q<C22099u> mo11590a(AbstractC21983b bVar) {
            return new AbstractC27620b<C22099u>(bVar) {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33645n.C33649b.C336501 */

                /* renamed from: a */
                final /* synthetic */ AbstractC21983b f79845a;

                static {
                    Covode.recordClassIndex(40543);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
                /* renamed from: c */
                public final void mo46228c() {
                    this.f79845a.cancel();
                }

                {
                    this.f79845a = r3;
                    r3.enqueue(new AbstractC22030d<R>() {
                        /* class com.p2082ss.android.ugc.aweme.app.api.C33645n.C33649b.C336501.C336511 */

                        static {
                            Covode.recordClassIndex(40544);
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6817a(AbstractC21983b<R> bVar, C22099u<R> uVar) {
                            C336501.this.mo46227b(uVar);
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6818a(AbstractC21983b<R> bVar, Throwable th) {
                            C336501.this.mo46226a(th);
                        }
                    });
                }
            };
        }
    }

    C33645n() {
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != AbstractFutureC27655q.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C22101w.m41536a(0, (ParameterizedType) type);
            if (C22101w.m41534a(a) != C22099u.class) {
                return new C33646a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C33649b(C22101w.m41536a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
