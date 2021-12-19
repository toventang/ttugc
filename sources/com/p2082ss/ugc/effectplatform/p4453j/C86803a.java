package com.p2082ss.ugc.effectplatform.p4453j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86704a;
import com.p2082ss.ugc.effectplatform.algorithm.C86706c;
import com.p2082ss.ugc.effectplatform.algorithm.C86707d;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.AbstractC86891b;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86859c;
import com.p2082ss.ugc.effectplatform.util.C86980a;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4519d.p4520a.p4534g.C88073f;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.j.a */
public final class C86803a {

    /* renamed from: e */
    public static C86803a f195698e;

    /* renamed from: f */
    public static final C86804a f195699f = new C86804a((byte) 0);

    /* renamed from: a */
    public C86861aa f195700a;

    /* renamed from: b */
    public final C86734a f195701b;

    /* renamed from: c */
    public C86712f f195702c;

    /* renamed from: d */
    public final C86687a f195703d;

    /* renamed from: g */
    private C86704a f195704g;

    /* renamed from: h */
    private C86707d f195705h;

    static {
        Covode.recordClassIndex(102502);
    }

    /* renamed from: com.ss.ugc.effectplatform.j.a$a */
    public static final class C86804a {
        static {
            Covode.recordClassIndex(102503);
        }

        private C86804a() {
        }

        /* renamed from: b */
        public static boolean m150367b() {
            if (C86803a.f195698e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static C86803a m150365a() {
            if (C86803a.f195698e != null) {
                C86803a aVar = C86803a.f195698e;
                if (aVar == null) {
                    C89219l.m154707a();
                }
                return aVar;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        public /* synthetic */ C86804a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m150366a(C86687a aVar) {
            C89219l.m154719c(aVar, "");
            C86803a.f195698e = new C86803a(aVar, (byte) 0);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.j.a$d */
    public static final class C86807d implements AbstractC88065d {

        /* renamed from: a */
        final /* synthetic */ C86859c f195713a;

        /* renamed from: b */
        final /* synthetic */ AbstractC86796e f195714b;

        /* renamed from: c */
        final /* synthetic */ String[] f195715c;

        static {
            Covode.recordClassIndex(102506);
        }

        @Override // p4519d.p4520a.p4533f.AbstractC88065d
        public final void cancel() {
        }

        @Override // p4519d.p4520a.p4533f.AbstractC88065d
        public final String getId() {
            return "";
        }

        /* renamed from: com.ss.ugc.effectplatform.j.a$d$c */
        public static final class RunnableC86810c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AbstractC89171a f195719a;

            static {
                Covode.recordClassIndex(102509);
            }

            public final void run() {
                this.f195719a.invoke();
            }

            RunnableC86810c(AbstractC89171a aVar) {
                this.f195719a = aVar;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.j.a$d$b */
        static final class C86809b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86807d f195718a;

            static {
                Covode.recordClassIndex(102508);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86809b(C86807d dVar) {
                super(0);
                this.f195718a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC86796e eVar = this.f195718a.f195714b;
                if (eVar != null) {
                    eVar.onSuccess(this.f195718a.f195715c);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.j.a$d$a */
        static final class C86808a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86807d f195716a;

            /* renamed from: b */
            final /* synthetic */ Exception f195717b;

            static {
                Covode.recordClassIndex(102507);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86808a(C86807d dVar, Exception exc) {
                super(0);
                this.f195716a = dVar;
                this.f195717b = exc;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC86796e eVar = this.f195716a.f195714b;
                if (eVar != null) {
                    eVar.onFail(this.f195716a.f195715c, new C86840e(this.f195717b));
                }
                return C89391z.f203057a;
            }
        }

        @Override // p4519d.p4520a.p4533f.AbstractC88065d
        public final void run() {
            try {
                this.f195713a.run();
                m150372a(new C86809b(this));
            } catch (Exception e) {
                m150372a(new C86808a(this, e));
            }
        }

        /* renamed from: a */
        private static void m150372a(AbstractC89171a<C89391z> aVar) {
            C88073f.m153147a(new RunnableC86810c(aVar));
        }

        public C86807d(C86859c cVar, AbstractC86796e eVar, String[] strArr) {
            this.f195713a = cVar;
            this.f195714b = eVar;
            this.f195715c = strArr;
        }
    }

    /* renamed from: a */
    public final C86704a mo140038a() {
        C86704a aVar = this.f195704g;
        if (aVar != null) {
            return aVar;
        }
        C86704a aVar2 = new C86704a(this.f195703d, this.f195700a, this.f195702c, this.f195701b);
        this.f195704g = aVar2;
        return aVar2;
    }

    /* renamed from: b */
    public final C86707d mo140042b() {
        C86707d dVar = this.f195705h;
        if (dVar != null) {
            return dVar;
        }
        C86707d dVar2 = new C86707d(this.f195701b, this.f195702c, this.f195703d.f195439G);
        this.f195705h = dVar2;
        return dVar2;
    }

    /* renamed from: com.ss.ugc.effectplatform.j.a$b */
    public static final class C86805b extends AbstractC86891b {

        /* renamed from: a */
        final /* synthetic */ C86803a f195706a;

        /* renamed from: b */
        final /* synthetic */ String[] f195707b;

        /* renamed from: c */
        final /* synthetic */ Map f195708c;

        /* renamed from: d */
        final /* synthetic */ AbstractC86796e f195709d;

        static {
            Covode.recordClassIndex(102504);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: b */
        public final void mo139953b() {
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: a */
        public final void mo139952a() {
            try {
                this.f195706a.mo140038a().mo139941a(C89064i.m154508i(this.f195707b), this.f195708c);
                AbstractC86796e eVar = this.f195709d;
                if (eVar != null) {
                    eVar.onSuccess(Long.valueOf(this.f195706a.mo140042b().getEffectHandle()));
                }
            } catch (Exception e) {
                AbstractC86796e eVar2 = this.f195709d;
                if (eVar2 != null) {
                    eVar2.onFail(null, new C86840e(e));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86805b(C86803a aVar, String[] strArr, Map map, AbstractC86796e eVar, String str) {
            super(str);
            this.f195706a = aVar;
            this.f195707b = strArr;
            this.f195708c = map;
            this.f195709d = eVar;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.j.a$c */
    public static final class C86806c extends AbstractC86891b {

        /* renamed from: a */
        final /* synthetic */ C86803a f195710a;

        /* renamed from: b */
        final /* synthetic */ List f195711b;

        /* renamed from: c */
        final /* synthetic */ AbstractC86796e f195712c;

        static {
            Covode.recordClassIndex(102505);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: b */
        public final void mo139953b() {
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: a */
        public final void mo139952a() {
            try {
                this.f195710a.mo140038a().mo139941a(this.f195711b, null);
                AbstractC86796e eVar = this.f195712c;
                if (eVar != null) {
                    Object[] array = this.f195711b.toArray(new String[0]);
                    if (array != null) {
                        eVar.onSuccess(array);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } catch (Exception e) {
                AbstractC86796e eVar2 = this.f195712c;
                if (eVar2 != null) {
                    eVar2.onFail(null, new C86840e(e));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86806c(C86803a aVar, List list, AbstractC86796e eVar, String str) {
            super(str);
            this.f195710a = aVar;
            this.f195711b = list;
            this.f195712c = eVar;
        }
    }

    /* renamed from: a */
    private final boolean m150359a(String str) {
        boolean isResourceAvailable = mo140042b().isResourceAvailable(str);
        try {
            Collection<ModelInfo> a = mo140038a().mo139940a(new String[]{str});
            if (a == null) {
                return isResourceAvailable;
            }
            if (a.isEmpty()) {
                return isResourceAvailable;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private C86803a(C86687a aVar) {
        int i;
        this.f195703d = aVar;
        this.f195702c = new C86712f(aVar.f195435C, aVar.f195437E);
        this.f195700a = C86861aa.C86862a.m150472a(aVar);
        AbstractC86755f a = C86751d.m150298a(aVar.f195440H);
        if (a == null || !(a instanceof C86734a)) {
            String str = aVar.f195440H;
            String str2 = aVar.f195447c;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            C86734a aVar2 = new C86734a(str, i, this.f195702c);
            this.f195701b = aVar2;
            C86751d.m150299a(aVar.f195440H, aVar2);
            return;
        }
        this.f195701b = (C86734a) a;
    }

    /* renamed from: a */
    public final boolean mo140041a(Effect effect) {
        C89219l.m154719c(effect, "");
        if (C86980a.m150631a(effect)) {
            C88060b.m153136a("AlgorithmRepository", "decrypt error effect: " + effect.getEffect_id() + ", name: " + effect.getName() + ", requirements_sec: " + effect.getRequirements_sec(), null);
            return false;
        }
        String[] a = C86980a.m150632a(effect, this.f195703d.f195461q);
        if (a == null || a.length == 0) {
            C88060b.m153135a("AlgorithmRepository", "effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return true;
        }
        this.f195701b.mo140010d();
        for (String str : a) {
            if ((!C86706c.f195531c.mo142589a() || !C86706c.m150202a(C87000n.m150684a(str))) && !m150359a(str)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C86803a(C86687a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final String mo140039a(int i, String str) {
        C89219l.m154719c(str, "");
        return mo140042b().realFindResourceUri(i, null, str);
    }

    /* renamed from: a */
    public final void mo140040a(List<String> list, AbstractC86796e<String[]> eVar) {
        C89219l.m154719c(list, "");
        C86882al alVar = this.f195703d.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86806c(this, list, eVar, C87006t.m150696a()));
        }
    }
}
