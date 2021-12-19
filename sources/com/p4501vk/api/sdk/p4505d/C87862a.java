package com.p4501vk.api.sdk.p4505d;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4507f.AbstractC87888c;
import com.p4501vk.api.sdk.p4507f.C87891e;
import com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.p4652a.C90018a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89350l;

/* renamed from: com.vk.api.sdk.d.a */
public final class C87862a implements AbstractC90202u {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f199570a = {new C89232y(C89204ab.m154669a(C87862a.class), "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;")};

    /* renamed from: b */
    public final boolean f199571b;

    /* renamed from: c */
    public final AbstractC87884c f199572c;

    /* renamed from: d */
    private final AbstractC87888c f199573d = C87891e.m152893a(new C87864b(this));

    /* renamed from: a */
    private final C90018a m152858a() {
        return (C90018a) C87891e.m152894a(this.f199573d, f199570a[0]);
    }

    /* renamed from: com.vk.api.sdk.d.a$a */
    public static final class C87863a {

        /* renamed from: a */
        static final C0484a<AbstractC87884c.EnumC87885a, C90018a.EnumC90019a> f199574a;

        /* renamed from: b */
        public static final C87863a f199575b = new C87863a();

        private C87863a() {
        }

        static {
            Covode.recordClassIndex(103873);
            C0484a<AbstractC87884c.EnumC87885a, C90018a.EnumC90019a> aVar = new C0484a<>();
            f199574a = aVar;
            aVar.put(AbstractC87884c.EnumC87885a.NONE, C90018a.EnumC90019a.NONE);
            aVar.put(AbstractC87884c.EnumC87885a.ERROR, C90018a.EnumC90019a.NONE);
            aVar.put(AbstractC87884c.EnumC87885a.WARNING, C90018a.EnumC90019a.BASIC);
            aVar.put(AbstractC87884c.EnumC87885a.DEBUG, C90018a.EnumC90019a.HEADERS);
            aVar.put(AbstractC87884c.EnumC87885a.VERBOSE, C90018a.EnumC90019a.BODY);
        }
    }

    /* renamed from: com.vk.api.sdk.d.a$b */
    static final class C87864b extends AbstractC89220m implements AbstractC89171a<C90018a> {

        /* renamed from: a */
        final /* synthetic */ C87862a f199576a;

        static {
            Covode.recordClassIndex(103874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C87864b(C87862a aVar) {
            super(0);
            this.f199576a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C90018a invoke() {
            return new C90018a(new C90018a.AbstractC90020b(this) {
                /* class com.p4501vk.api.sdk.p4505d.C87862a.C87864b.C878651 */

                /* renamed from: a */
                final /* synthetic */ C87864b f199577a;

                static {
                    Covode.recordClassIndex(103875);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f199577a = r1;
                }

                @Override // okhttp3.p4652a.C90018a.AbstractC90020b
                /* renamed from: a */
                public final void mo142341a(String str) {
                    C89219l.m154719c(str, "");
                    if (this.f199577a.f199576a.f199571b) {
                        new C89350l("client_secret=[a-zA-Z0-9]+").replace(new C89350l("key=[a-z0-9]+").replace(new C89350l("access_token=[a-z0-9]+").replace(str, "access_token=<HIDE>"), "key=<HIDE>"), "client_secret=<HIDE>");
                    }
                    this.f199577a.f199576a.f199572c.mo142364a(this.f199577a.f199576a.f199572c.mo142363a().getValue());
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(103872);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        long j;
        C90018a.EnumC90019a aVar2;
        C89219l.m154719c(aVar, "");
        AbstractC90025ab body = aVar.mo144856a().body();
        if (body != null) {
            j = body.contentLength();
        } else {
            j = 0;
        }
        C90018a a = m152858a();
        if (j > 1024) {
            aVar2 = C90018a.EnumC90019a.BASIC;
        } else {
            aVar2 = C87863a.f199574a.get(this.f199572c.mo142363a().getValue());
        }
        a.mo144705a(aVar2);
        C90029ac intercept = m152858a().intercept(aVar);
        C89219l.m154709a((Object) intercept, "");
        return intercept;
    }

    public C87862a(boolean z, AbstractC87884c cVar) {
        C89219l.m154719c(cVar, "");
        this.f199571b = z;
        this.f199572c = cVar;
    }
}
