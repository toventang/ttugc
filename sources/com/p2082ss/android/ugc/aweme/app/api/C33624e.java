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
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.utils.C80400ep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.app.api.e */
public final class C33624e extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    C33640m f79811a = new C33640m();

    static {
        Covode.recordClassIndex(40517);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.e$a */
    static class C33625a implements AbstractC22019c<C1731i> {

        /* renamed from: a */
        private final AbstractC22019c<C1731i<C22099u>> f79812a;

        static {
            Covode.recordClassIndex(40518);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79812a.mo11591a();
        }

        C33625a(AbstractC22019c<C1731i<C22099u>> cVar) {
            this.f79812a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ C1731i mo11590a(AbstractC21983b bVar) {
            return this.f79812a.mo11590a(bVar).mo5532a(new AbstractC1729g<C22099u, R>() {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33624e.C33625a.C336261 */

                static {
                    Covode.recordClassIndex(40519);
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [R, T] */
                @Override // p077b.AbstractC1729g
                public final R then(C1731i<C22099u> iVar) {
                    C22028c cVar;
                    if (iVar.mo5539b()) {
                        throw new CancellationException();
                    } else if (!iVar.mo5544c()) {
                        C22099u d = iVar.mo5545d();
                        T t = iVar.mo5545d().f52262b;
                        if (t instanceof BaseResponse) {
                            T t2 = t;
                            if (d.f52261a != null) {
                                C80400ep.m139375a(t2.status_code, d.f52261a.f52039a, t2.toString());
                            }
                        }
                        if ((t instanceof AbstractC33631g) && (cVar = d.f52261a) != null) {
                            Object obj = cVar.f52044f;
                            if (obj instanceof C14612a) {
                                t.setRequestInfo((C14612a) obj);
                            }
                        }
                        if (t instanceof AbstractC33623d) {
                            t.setRequestId(C33625a.m68856a(d.f52261a.f52042d));
                        }
                        return t;
                    } else {
                        throw iVar.mo5546e();
                    }
                }
            });
        }

        /* renamed from: a */
        static String m68856a(List<C22027b> list) {
            if (list == null) {
                return null;
            }
            for (C22027b bVar : list) {
                if ("X-TT-LOGID".equalsIgnoreCase(bVar.f52037a)) {
                    return bVar.f52038b;
                }
            }
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != C1731i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C22101w.m41536a(0, (ParameterizedType) type);
            Class<?> a2 = C22101w.m41534a(a);
            if (AbstractC33623d.class.isAssignableFrom(a2)) {
                AbstractC22019c<?> a3 = this.f79811a.mo11589a(C27925b.m55977a((Type) null, C1731i.class, C27925b.m55977a((Type) null, C22099u.class, a)), annotationArr, qVar);
                if (a3 != null) {
                    return new C33625a(a3);
                }
            }
            if (a2 != C22099u.class) {
                return this.f79811a.mo11589a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is " + type.getTypeName());
    }
}
