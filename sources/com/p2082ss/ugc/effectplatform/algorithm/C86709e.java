package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.AbstractC86713g;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import com.p2082ss.ugc.effectplatform.task.AbstractC86891b;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.e */
public final class C86709e {

    /* renamed from: c */
    public static C86709e f195533c;

    /* renamed from: d */
    public static AbstractC86713g f195534d = AbstractC86713g.C86714a.f195545a;

    /* renamed from: e */
    public static final C86710a f195535e = new C86710a((byte) 0);

    /* renamed from: a */
    public final C86803a f195536a;

    /* renamed from: b */
    public final C86687a f195537b;

    /* renamed from: f */
    private final C86734a f195538f;

    /* renamed from: g */
    private C86712f f195539g;

    /* renamed from: h */
    private AlgorithmModelResourceFinder f195540h;

    /* renamed from: i */
    private C86704a f195541i;

    /* renamed from: a */
    public static final synchronized void m150203a(C86687a aVar) {
        synchronized (C86709e.class) {
            MethodCollector.m26663i(2495);
            f195535e.mo139951a(aVar);
            MethodCollector.m26664o(2495);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.algorithm.e$a */
    public static final class C86710a {
        static {
            Covode.recordClassIndex(102409);
        }

        private C86710a() {
        }

        /* renamed from: b */
        public static boolean m150209b() {
            if (C86709e.f195533c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static C86709e m150208a() {
            C86709e eVar = C86709e.f195533c;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }

        /* renamed from: com.ss.ugc.effectplatform.algorithm.e$a$a */
        public static final class C86711a extends AbstractC86891b {

            /* renamed from: a */
            final /* synthetic */ int f195542a = 0;

            static {
                Covode.recordClassIndex(102410);
            }

            @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
            /* renamed from: b */
            public final void mo139953b() {
            }

            @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
            /* renamed from: a */
            public final void mo139952a() {
                try {
                    C86861aa.C86862a.m150472a(C86710a.m150208a().f195537b).mo140590a(this.f195542a, false);
                } catch (Exception unused) {
                }
            }

            public C86711a(String str) {
                super(str);
            }
        }

        public /* synthetic */ C86710a(byte b) {
            this();
        }

        /* renamed from: a */
        public final synchronized void mo139951a(C86687a aVar) {
            MethodCollector.m26663i(2387);
            C89219l.m154719c(aVar, "");
            if (C86709e.f195533c == null) {
                C86709e.f195533c = new C86709e(aVar, (byte) 0);
                MethodCollector.m26664o(2387);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Duplicate initialization");
                MethodCollector.m26664o(2387);
                throw illegalStateException;
            }
        }
    }

    static {
        Covode.recordClassIndex(102408);
    }

    /* renamed from: b */
    public final C86704a mo139950b() {
        C86704a aVar = this.f195541i;
        if (aVar != null) {
            return aVar;
        }
        C86687a aVar2 = this.f195537b;
        C86704a aVar3 = new C86704a(aVar2, C86861aa.C86862a.m150472a(aVar2), this.f195539g, this.f195538f);
        this.f195541i = aVar3;
        return aVar3;
    }

    /* renamed from: a */
    public final AlgorithmModelResourceFinder mo139947a() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.f195540h;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(this.f195538f, this.f195539g, this.f195537b.f195439G, this.f195537b);
        this.f195540h = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }

    private C86709e(C86687a aVar) {
        int i;
        this.f195537b = aVar;
        this.f195539g = new C86712f(aVar.f195435C, aVar.f195437E);
        AbstractC86755f a = C86751d.m150298a(aVar.f195440H);
        if (a == null || !(a instanceof C86734a)) {
            String str = aVar.f195440H;
            String str2 = aVar.f195447c;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            C86734a aVar2 = new C86734a(str, i, this.f195539g);
            this.f195538f = aVar2;
            C86751d.m150299a(aVar.f195440H, aVar2);
        } else {
            this.f195538f = (C86734a) a;
        }
        if (!C86803a.C86804a.m150367b()) {
            C86803a.C86804a.m150366a(aVar);
        }
        this.f195536a = C86803a.C86804a.m150365a();
    }

    /* renamed from: a */
    public final boolean mo139949a(Effect effect) {
        C89219l.m154719c(effect, "");
        return this.f195536a.mo140041a(effect);
    }

    public /* synthetic */ C86709e(C86687a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final void mo139948a(List<String> list, AbstractC86796e<String[]> eVar) {
        C89219l.m154719c(list, "");
        this.f195536a.mo140040a(list, eVar);
    }
}
