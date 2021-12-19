package com.bytedance.lynx.hybrid.service.p1537b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a;
import com.bytedance.lynx.hybrid.service.p1537b.C21358e;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.lynx.hybrid.service.b.c */
public final class C21353c {

    /* renamed from: a */
    public static final AbstractC89244h f50703a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C21355b.f50707a);

    /* renamed from: b */
    public static final C21354a f50704b = new C21354a((byte) 0);

    /* renamed from: c */
    private final ConcurrentHashMap<String, C21358e> f50705c;

    /* renamed from: com.bytedance.lynx.hybrid.service.b.c$a */
    public static final class C21354a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f50706a = {new C89232y(C89204ab.m154669a(C21354a.class), "service", "getService()Lcom/bytedance/lynx/hybrid/service/impl/HybridService;")};

        /* renamed from: a */
        public static C21353c m40102a() {
            return (C21353c) C21353c.f50703a.getValue();
        }

        private C21354a() {
        }

        static {
            Covode.recordClassIndex(24973);
        }

        public /* synthetic */ C21354a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C21358e m40103a(String str, ConcurrentHashMap<String, C21358e> concurrentHashMap) {
            C21358e eVar = concurrentHashMap.get(str);
            if (eVar != null) {
                return eVar;
            }
            C21358e a = new C21358e.C21359a().mo34960a(str).mo34961a();
            concurrentHashMap.put(str, a);
            return a;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.service.b.c$b */
    static final class C21355b extends AbstractC89220m implements AbstractC89171a<C21353c> {

        /* renamed from: a */
        public static final C21355b f50707a = new C21355b();

        static {
            Covode.recordClassIndex(24974);
        }

        C21355b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21353c invoke() {
            return new C21353c((byte) 0);
        }
    }

    private C21353c() {
        this.f50705c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(24972);
    }

    public /* synthetic */ C21353c(byte b) {
        this();
    }

    /* renamed from: a */
    public final <T extends AbstractC21348a> T mo34954a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) mo34955a("default_bid", cls);
    }

    /* renamed from: a */
    public final <T extends AbstractC21348a> T mo34955a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C21358e a = C21354a.m40103a(str, this.f50705c);
        String name = cls.getName();
        C89219l.m154709a((Object) name, "");
        T t = (T) a.mo34958a(name);
        if (t != null) {
            return t;
        }
        C21358e a2 = C21354a.m40103a("default_bid", this.f50705c);
        String name2 = cls.getName();
        C89219l.m154709a((Object) name2, "");
        T t2 = (T) a2.mo34958a(name2);
        if (!(t2 instanceof AbstractC21348a)) {
            return null;
        }
        return t2;
    }

    /* renamed from: a */
    public final <T extends AbstractC21348a> C21353c mo34956a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(t, "");
        return m40098a("default_bid", cls, t);
    }

    /* renamed from: a */
    private <T extends AbstractC21348a> C21353c m40098a(String str, Class<T> cls, T t) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(t, "");
        C21358e a = C21354a.m40103a(str, this.f50705c);
        String name = cls.getName();
        C89219l.m154709a((Object) name, "");
        a.mo34959a(name, t);
        return this;
    }
}
