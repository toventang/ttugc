package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.C22101w;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.google.gson.internal.C27925b;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.utils.C80400ep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.api.f */
public final class C33627f extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    C33645n f79814a = new C33645n();

    static {
        Covode.recordClassIndex(40520);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.f$a */
    static class C33628a implements AbstractC22019c<AbstractFutureC27655q> {

        /* renamed from: a */
        private final AbstractC22019c<AbstractFutureC27655q<C22099u>> f79815a;

        static {
            Covode.recordClassIndex(40521);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79815a.mo11591a();
        }

        C33628a(AbstractC22019c<AbstractFutureC27655q<C22099u>> cVar) {
            this.f79815a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ AbstractFutureC27655q mo11590a(AbstractC21983b bVar) {
            return new AbstractC27620b<R>(this.f79815a.mo11590a(bVar)) {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33627f.C33628a.C336291 */

                /* renamed from: a */
                final /* synthetic */ AbstractFutureC27655q f79816a;

                static {
                    Covode.recordClassIndex(40522);
                }

                {
                    this.f79816a = r4;
                    C27646l.m55298a(r4, new AbstractC27645k<C22099u>() {
                        /* class com.p2082ss.android.ugc.aweme.app.api.C33627f.C33628a.C336291.C336301 */

                        static {
                            Covode.recordClassIndex(40523);
                        }

                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final void onFailure(Throwable th) {
                            C336291.this.mo46226a(th);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final /* synthetic */ void onSuccess(C22099u uVar) {
                            C22028c cVar;
                            String str;
                            C22099u uVar2 = uVar;
                            if (uVar2.f52261a.mo35845a()) {
                                T t = uVar2.f52262b;
                                if (t instanceof AbstractC33623d) {
                                    T t2 = t;
                                    List<C22027b> list = uVar2.f52261a.f52042d;
                                    if (list != null) {
                                        Iterator<C22027b> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            C22027b next = it.next();
                                            if ("X-TT-LOGID".equalsIgnoreCase(next.f52037a)) {
                                                str = next.f52038b;
                                                break;
                                            }
                                        }
                                    }
                                    str = null;
                                    t2.setRequestId(str);
                                }
                                if ((t instanceof AbstractC33631g) && (cVar = uVar2.f52261a) != null) {
                                    Object obj = cVar.f52044f;
                                    if (obj instanceof C14612a) {
                                        t.setRequestInfo((C14612a) obj);
                                    }
                                }
                                if (t instanceof BaseResponse) {
                                    T t3 = t;
                                    if (uVar2.f52261a != null) {
                                        C80400ep.m139375a(t3.status_code, uVar2.f52261a.f52039a, t3.toString());
                                    }
                                }
                                C336291.this.mo46227b((Object) t);
                                return;
                            }
                            C336291.this.mo46226a((Throwable) new RuntimeException("HttpException"));
                        }
                    }, C27659u.EnumC27662a.INSTANCE);
                }
            };
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != AbstractFutureC27655q.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C22101w.m41536a(0, (ParameterizedType) type);
            Class<?> a2 = C22101w.m41534a(a);
            if (AbstractC33623d.class.isAssignableFrom(a2) || AbstractC33631g.class.isAssignableFrom(a2)) {
                AbstractC22019c<?> a3 = this.f79814a.mo11589a(C27925b.m55977a((Type) null, AbstractFutureC27655q.class, C27925b.m55977a((Type) null, C22099u.class, a)), annotationArr, qVar);
                if (a3 != null) {
                    return new C33628a(a3);
                }
            }
            if (a2 != C22099u.class) {
                return this.f79814a.mo11589a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
