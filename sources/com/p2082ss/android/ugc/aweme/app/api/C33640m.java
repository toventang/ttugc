package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.C22101w;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.app.api.m */
public final class C33640m extends AbstractC22019c.AbstractC22020a {
    static {
        Covode.recordClassIndex(40533);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$a */
    static final class C33641a implements AbstractC22019c<C1731i> {

        /* renamed from: a */
        private final Type f79834a;

        static {
            Covode.recordClassIndex(40534);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79834a;
        }

        C33641a(Type type) {
            this.f79834a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ C1731i mo11590a(AbstractC21983b bVar) {
            final C1743j jVar = new C1743j();
            bVar.enqueue(new AbstractC22030d<R>() {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33640m.C33641a.C336421 */

                static {
                    Covode.recordClassIndex(40535);
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6817a(AbstractC21983b<R> bVar, C22099u<R> uVar) {
                    if (uVar.f52261a.mo35845a()) {
                        jVar.mo5557b((Object) uVar.f52262b);
                    } else {
                        jVar.mo5556b((Exception) new RuntimeException("HttpException"));
                    }
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6818a(AbstractC21983b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.mo5556b((Exception) th);
                    } else {
                        jVar.mo5556b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f5610a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$b */
    static final class C33643b implements AbstractC22019c<C1731i<C22099u>> {

        /* renamed from: a */
        private final Type f79837a;

        static {
            Covode.recordClassIndex(40536);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79837a;
        }

        C33643b(Type type) {
            this.f79837a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ C1731i<C22099u> mo11590a(AbstractC21983b bVar) {
            final C1743j jVar = new C1743j();
            bVar.enqueue(new AbstractC22030d<R>() {
                /* class com.p2082ss.android.ugc.aweme.app.api.C33640m.C33643b.C336441 */

                static {
                    Covode.recordClassIndex(40537);
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6817a(AbstractC21983b<R> bVar, C22099u<R> uVar) {
                    if (uVar.f52261a.mo35845a()) {
                        jVar.mo5557b(uVar);
                    } else {
                        jVar.mo5556b((Exception) new RuntimeException("HttpException"));
                    }
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6818a(AbstractC21983b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.mo5556b((Exception) th);
                    } else {
                        jVar.mo5556b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f5610a;
        }
    }

    C33640m() {
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != C1731i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C22101w.m41536a(0, (ParameterizedType) type);
            if (C22101w.m41534a(a) != C22099u.class) {
                return new C33641a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C33643b(C22101w.m41536a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}
