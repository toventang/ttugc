package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.C41072a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77876c;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4090d.C77882b;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.b */
public final class C77903b {

    /* renamed from: b */
    public static final C77904a f174781b = new C77904a((byte) 0);

    /* renamed from: a */
    public final AbstractC84398d f174782a;

    /* renamed from: c */
    private final C0484a<String, Boolean> f174783c = new C0484a<>();

    /* renamed from: d */
    private final AbstractC89244h f174784d = C89250i.m154773a((AbstractC89171a) new C77905b(this));

    static {
        Covode.recordClassIndex(90992);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41072a<C77876c, Void> mo121553a() {
        return (C41072a) this.f174784d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.b$a */
    public static final class C77904a {
        static {
            Covode.recordClassIndex(90993);
        }

        private C77904a() {
        }

        public /* synthetic */ C77904a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.b$b */
    static final class C77905b extends AbstractC89220m implements AbstractC89171a<C41072a<C77876c, Void>> {

        /* renamed from: a */
        final /* synthetic */ C77903b f174785a;

        static {
            Covode.recordClassIndex(90994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77905b(C77903b bVar) {
            super(0);
            this.f174785a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41072a<C77876c, Void> invoke() {
            C41072a aVar = new C41072a(new C77882b(this.f174785a.f174782a));
            aVar.f96007a = 0;
            aVar.f96009c = true;
            aVar.f96008b = true;
            aVar.f96010d = new AbstractC41090d() {
                /* class com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77903b.C77905b.C779061 */

                static {
                    Covode.recordClassIndex(90995);
                }

                @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d
                /* renamed from: a */
                public final void mo70309a(Exception exc) {
                    C89219l.m154721d(exc, "");
                    C41093a.m82763a(exc);
                }
            };
            return aVar;
        }
    }

    public C77903b(AbstractC84398d dVar) {
        C89219l.m154721d(dVar, "");
        this.f174782a = dVar;
    }

    /* renamed from: e */
    private final synchronized void m136041e(ComposerBeauty composerBeauty) {
        MethodCollector.m26663i(9981);
        this.f174783c.put(composerBeauty.getEffect().getEffectId(), true);
        MethodCollector.m26664o(9981);
    }

    /* renamed from: c */
    private final boolean m136039c(ComposerBeauty composerBeauty) {
        if (C77878d.m135993a(composerBeauty.getEffect().getEffectId()) < 0 || m136040d(composerBeauty)) {
            return true;
        }
        boolean c = this.f174782a.mo78918c(composerBeauty.getEffect());
        if (c) {
            m136041e(composerBeauty);
        }
        return c;
    }

    /* renamed from: d */
    private final synchronized boolean m136040d(ComposerBeauty composerBeauty) {
        boolean a;
        MethodCollector.m26663i(9979);
        a = C89219l.m154714a((Object) this.f174783c.get(composerBeauty.getEffect().getEffectId()), (Object) true);
        MethodCollector.m26664o(9979);
        return a;
    }

    /* renamed from: a */
    public final boolean mo121555a(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (4 == mo121556b(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo121556b(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        if (m136039c(composerBeauty)) {
            return 4;
        }
        if (mo121553a().mo70292b(new C77876c(composerBeauty)) || mo121553a().mo70295c(new C77876c(composerBeauty))) {
            return 8;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo121554a(C77876c cVar, AbstractC41085a<C77876c, Void> aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        mo121553a().mo70286a(cVar, aVar, null);
    }
}
