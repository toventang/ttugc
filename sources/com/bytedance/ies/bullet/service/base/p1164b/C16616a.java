package com.bytedance.ies.bullet.service.base.p1164b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.b.a */
public class C16616a implements AbstractC16568c, AbstractC16576j {

    /* renamed from: e */
    public static final C16617a f39772e = new C16617a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f39773a = C89250i.m154773a((AbstractC89171a) new C16618b(this));

    /* renamed from: d */
    public String f39774d = "default_bid";

    static {
        Covode.recordClassIndex(19053);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c
    /* renamed from: a */
    public void mo25929a() {
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return (C16587q) this.f39773a.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.b.a$a */
    public static final class C16617a {
        static {
            Covode.recordClassIndex(19054);
        }

        private C16617a() {
        }

        public /* synthetic */ C16617a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c
    /* renamed from: c */
    public final String mo26329c() {
        return this.f39774d;
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.b.a$b */
    static final class C16618b extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16616a f39775a;

        static {
            Covode.recordClassIndex(19055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16618b(C16616a aVar) {
            super(0);
            this.f39775a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) C16622e.C16623a.m30858a().mo26347a(this.f39775a.f39774d, AbstractC16652m.class), "Service");
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c
    /* renamed from: b */
    public void mo26322b(String str) {
        C89219l.m154719c(str, "");
        this.f39774d = str;
    }

    /* renamed from: a */
    public final <T extends AbstractC16568c> T mo26380a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) C16622e.C16623a.m30858a().mo26347a(this.f39774d, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }
}
