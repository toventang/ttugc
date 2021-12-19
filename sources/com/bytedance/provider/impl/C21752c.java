package com.bytedance.provider.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21735d;
import com.bytedance.provider.C21741g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.provider.impl.c */
public final class C21752c implements AbstractC21735d {

    /* renamed from: b */
    public static final C21752c f51535b = new C21752c();

    /* renamed from: c */
    private static final C21741g f51536c = C21754b.f51538f;

    /* renamed from: d */
    private static final String f51537d = "GScope_Key";

    private C21752c() {
    }

    @Override // com.bytedance.provider.AbstractC21735d
    /* renamed from: a */
    public final C21741g mo35380a() {
        return f51536c;
    }

    /* renamed from: com.bytedance.provider.impl.c$a */
    public static final class C21753a extends RuntimeException {
        static {
            Covode.recordClassIndex(25400);
        }

        public C21753a() {
            super("Don't operate on GScope");
        }
    }

    /* renamed from: com.bytedance.provider.impl.c$b */
    public static final class C21754b extends C21741g {

        /* renamed from: f */
        public static final C21754b f51538f = new C21754b();

        private C21754b() {
            super(C21752c.f51535b);
        }

        @Override // com.bytedance.provider.C21741g
        /* renamed from: a */
        public final AbstractC21735d mo35382a() {
            throw new C21753a();
        }

        @Override // com.bytedance.provider.C21741g
        /* renamed from: b */
        public final void mo35385b() {
            throw new C21753a();
        }

        static {
            Covode.recordClassIndex(25401);
        }

        @Override // com.bytedance.provider.C21741g
        /* renamed from: a */
        public final void mo35383a(AbstractC21735d dVar, AbstractC21735d.C21736a aVar) {
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(aVar, "");
            throw new C21753a();
        }
    }

    static {
        Covode.recordClassIndex(25399);
    }
}
