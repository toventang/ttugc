package com.p2082ss.ugc.aweme.performance.core.monitor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86662a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86663b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.a */
public final class C86659a {

    /* renamed from: e */
    public static final AbstractC89244h f195325e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C86661b.f195332a);

    /* renamed from: f */
    public static final C86660a f195326f = new C86660a((byte) 0);

    /* renamed from: a */
    public boolean f195327a;

    /* renamed from: b */
    public AbstractC86662a f195328b;

    /* renamed from: c */
    public boolean f195329c;

    /* renamed from: d */
    public AbstractC86663b f195330d;

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.a$a */
    public static final class C86660a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f195331a = {new C89232y(C89204ab.m154669a(C86660a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/core/monitor/JankKillerImpl;")};

        /* renamed from: a */
        public static C86659a m150136a() {
            return (C86659a) C86659a.f195325e.getValue();
        }

        private C86660a() {
        }

        static {
            Covode.recordClassIndex(101888);
        }

        public /* synthetic */ C86660a(byte b) {
            this();
        }
    }

    private C86659a() {
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.a$b */
    static final class C86661b extends AbstractC89220m implements AbstractC89171a<C86659a> {

        /* renamed from: a */
        public static final C86661b f195332a = new C86661b();

        static {
            Covode.recordClassIndex(101889);
        }

        C86661b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86659a invoke() {
            return new C86659a((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(101887);
    }

    public /* synthetic */ C86659a(byte b) {
        this();
    }
}
