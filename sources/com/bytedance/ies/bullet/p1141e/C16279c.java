package com.bytedance.ies.bullet.p1141e;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1141e.p1143b.C16276b;
import com.bytedance.ies.bullet.p1141e.p1143b.C16278c;
import com.bytedance.ies.bullet.service.base.AbstractC16598ah;
import com.bytedance.ies.bullet.service.base.AbstractC16648i;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16657r;
import com.bytedance.ies.bullet.service.base.AbstractC16697x;
import com.bytedance.ies.bullet.service.base.C16645f;
import com.bytedance.ies.bullet.service.base.EnumC16605al;
import com.bytedance.ies.bullet.service.base.EnumC16626c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.c */
public final class C16279c implements AbstractC16576j {

    /* renamed from: g */
    public static final C16280a f39097g = new C16280a((byte) 0);

    /* renamed from: a */
    C16276b f39098a;

    /* renamed from: b */
    C16278c f39099b;

    /* renamed from: c */
    public AbstractC16648i f39100c;

    /* renamed from: d */
    final AbstractC89244h f39101d = C89250i.m154773a((AbstractC89171a) C16282c.f39107a);

    /* renamed from: e */
    final AbstractC16657r f39102e;

    /* renamed from: f */
    public final String f39103f;

    /* renamed from: h */
    private AbstractC16598ah f39104h;

    /* renamed from: i */
    private final AbstractC89244h f39105i = C89250i.m154773a((AbstractC89171a) new C16281b(this));

    static {
        Covode.recordClassIndex(18572);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f39105i.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.e.c$a */
    public static final class C16280a {
        static {
            Covode.recordClassIndex(18573);
        }

        private C16280a() {
        }

        public /* synthetic */ C16280a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.c$c */
    static final class C16282c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C16282c f39107a = new C16282c();

        static {
            Covode.recordClassIndex(18575);
        }

        C16282c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.c$b */
    static final class C16281b extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16279c f39106a;

        static {
            Covode.recordClassIndex(18574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16281b(C16279c cVar) {
            super(0);
            this.f39106a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) C16622e.C16623a.m30858a().mo26347a(this.f39106a.f39103f, AbstractC16652m.class), "Pool");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.c$d */
    public static final class C16283d implements AbstractC16697x {

        /* renamed from: a */
        final /* synthetic */ C16279c f39108a;

        /* renamed from: b */
        final /* synthetic */ Uri f39109b;

        /* renamed from: c */
        final /* synthetic */ Uri f39110c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16697x f39111d;

        /* renamed from: e */
        final /* synthetic */ long f39112e;

        static {
            Covode.recordClassIndex(18576);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16697x
        /* renamed from: a */
        public final void mo25870a() {
            AbstractC16648i iVar = this.f39108a.f39100c;
            if (iVar != null) {
                iVar.mo25861a(new C16645f(this.f39109b, this.f39110c, EnumC16626c.PRE_RENDER));
            }
            this.f39111d.mo25870a();
            if (this.f39112e > 0) {
                ((Handler) this.f39108a.f39101d.getValue()).postDelayed(new RunnableC16284a(this), this.f39112e);
            }
        }

        /* renamed from: com.bytedance.ies.bullet.e.c$d$a */
        static final class RunnableC16284a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C16283d f39113a;

            static {
                Covode.recordClassIndex(18577);
            }

            RunnableC16284a(C16283d dVar) {
                this.f39113a = dVar;
            }

            public final void run() {
                C16279c cVar = this.f39113a.f39108a;
                Uri uri = this.f39113a.f39109b;
                Uri a = this.f39113a.f39108a.mo25869a(this.f39113a.f39109b);
                C89219l.m154719c(uri, "");
                C89219l.m154719c(a, "");
                C89219l.m154719c("timeout", "");
                C16276b bVar = cVar.f39098a;
                C89219l.m154719c(a, "");
                boolean b = bVar.f39090a.mo25867b(a);
                C16278c cVar2 = cVar.f39099b;
                C89219l.m154719c(a, "");
                boolean b2 = cVar2.f39095a.mo25867b(a);
                if (b || b2) {
                    AbstractC16648i iVar = cVar.f39100c;
                    C16645f fVar = new C16645f(uri, a, EnumC16626c.NONE);
                    int size = cVar.f39098a.f39090a.f39088a.size();
                    int size2 = cVar.f39099b.f39095a.f39088a.size();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prerender_pool_size", String.valueOf(size));
                    jSONObject.put("prerender_pool_max_size", String.valueOf(cVar.f39102e.mo25857a()));
                    jSONObject.put("reuse_pool_size", String.valueOf(size2));
                    jSONObject.put("reuse_pool_max_size", String.valueOf(cVar.f39102e.mo25858b()));
                    jSONObject.put("reason", "timeout");
                    iVar.mo25862a(fVar, jSONObject);
                }
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16697x
        /* renamed from: a */
        public final void mo25871a(EnumC16605al alVar, String str) {
            C89219l.m154719c(alVar, "");
            this.f39111d.mo25871a(alVar, str);
        }

        C16283d(C16279c cVar, Uri uri, Uri uri2, AbstractC16697x xVar, long j) {
            this.f39108a = cVar;
            this.f39109b = uri;
            this.f39110c = uri2;
            this.f39111d = xVar;
            this.f39112e = j;
        }
    }

    /* renamed from: a */
    public final Uri mo25869a(Uri uri) {
        Uri a = this.f39104h.mo25864a(uri);
        return a == null ? uri : a;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    public C16279c(AbstractC16657r rVar, String str) {
        C89219l.m154719c(rVar, "");
        C89219l.m154719c(str, "");
        this.f39102e = rVar;
        this.f39103f = str;
        this.f39098a = new C16276b(rVar.mo25857a());
        this.f39099b = new C16278c(rVar.mo25858b());
        this.f39104h = rVar.mo25859c();
        this.f39100c = rVar.mo25860d();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }
}
