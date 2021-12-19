package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22057k;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.C22101w;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89699w;
import kotlinx.coroutines.C89702y;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.api.a */
public final class C33602a extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    public static final C33606b f79781a = new C33606b((byte) 0);

    static {
        Covode.recordClassIndex(40495);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.a$a */
    static final class C33603a implements AbstractC22019c<AbstractC89531av<? extends Object>> {

        /* renamed from: a */
        private final Type f79782a;

        static {
            Covode.recordClassIndex(40496);
        }

        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final Type mo11591a() {
            return this.f79782a;
        }

        /* renamed from: com.ss.android.ugc.aweme.app.api.a$a$b */
        public static final class C33605b implements AbstractC22030d<R> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89699w f79785a;

            static {
                Covode.recordClassIndex(40498);
            }

            C33605b(AbstractC89699w wVar) {
                this.f79785a = wVar;
            }

            @Override // com.bytedance.retrofit2.AbstractC22030d
            /* renamed from: a */
            public final void mo6818a(AbstractC21983b<R> bVar, Throwable th) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(th, "");
                this.f79785a.mo144263a(th);
            }

            @Override // com.bytedance.retrofit2.AbstractC22030d
            /* renamed from: a */
            public final void mo6817a(AbstractC21983b<R> bVar, C22099u<R> uVar) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(uVar, "");
                if (uVar.f52261a.mo35845a()) {
                    AbstractC89699w wVar = this.f79785a;
                    T t = uVar.f52262b;
                    if (t == null) {
                        C89219l.m154715b();
                    }
                    wVar.mo144262a((Object) t);
                    return;
                }
                this.f79785a.mo144263a((Throwable) new C22057k(uVar));
            }
        }

        public C33603a(Type type) {
            C89219l.m154721d(type, "");
            this.f79782a = type;
        }

        /* renamed from: com.ss.android.ugc.aweme.app.api.a$a$a */
        static final class C33604a extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89699w f79783a;

            /* renamed from: b */
            final /* synthetic */ AbstractC21983b f79784b;

            static {
                Covode.recordClassIndex(40497);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33604a(AbstractC89699w wVar, AbstractC21983b bVar) {
                super(1);
                this.f79783a = wVar;
                this.f79784b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Throwable th) {
                AbstractC21983b bVar;
                if (this.f79783a.mo144008l() && (bVar = this.f79784b) != null) {
                    bVar.cancel();
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.AbstractC22019c
        /* renamed from: a */
        public final /* synthetic */ AbstractC89531av<? extends Object> mo11590a(AbstractC21983b bVar) {
            AbstractC89699w a = C89702y.m155736a();
            a.mo143982a((AbstractC89172b<? super Throwable, C89391z>) new C33604a(a, bVar));
            if (bVar != null) {
                bVar.enqueue(new C33605b(a));
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.a$b */
    public static final class C33606b {
        static {
            Covode.recordClassIndex(40499);
        }

        private C33606b() {
        }

        public /* synthetic */ C33606b(byte b) {
            this();
        }
    }

    private C33602a() {
    }

    public /* synthetic */ C33602a(byte b) {
        this();
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        C89219l.m154721d(type, "");
        C89219l.m154721d(annotationArr, "");
        C89219l.m154721d(qVar, "");
        if (!C89219l.m154714a(AbstractC89531av.class, C22101w.m41534a(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C22101w.m41536a(0, (ParameterizedType) type);
            C89219l.m154716b(a, "");
            return new C33603a(a);
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }
}
