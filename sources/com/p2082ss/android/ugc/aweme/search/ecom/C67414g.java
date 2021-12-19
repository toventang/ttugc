package com.p2082ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67402b;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.g */
public final class C67414g implements AbstractC67411e {

    /* renamed from: a */
    public final AbstractC89171a<User> f151020a;

    /* renamed from: b */
    public final AbstractC89171a<C67568r> f151021b;

    /* renamed from: c */
    public final AbstractC89171a<String> f151022c;

    /* renamed from: d */
    public final AbstractC89171a<String> f151023d;

    /* renamed from: e */
    public final AbstractC89171a<Boolean> f151024e;

    /* renamed from: f */
    private final AbstractC89244h f151025f = C89250i.m154773a((AbstractC89171a) C67415a.f151026a);

    static {
        Covode.recordClassIndex(79047);
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo106320a() {
        return (Map) this.f151025f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.g$a */
    static final class C67415a extends AbstractC89220m implements AbstractC89171a<Map<String, Boolean>> {

        /* renamed from: a */
        public static final C67415a f151026a = new C67415a();

        static {
            Covode.recordClassIndex(79048);
        }

        C67415a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Boolean> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ecom.AbstractC67411e
    /* renamed from: a */
    public final void mo106319a(C67394a aVar, int i) {
        String str;
        C89219l.m154721d(aVar, "");
        String str2 = aVar.f150985a;
        if (str2 != null && str2.length() != 0 && this.f151024e.invoke().booleanValue()) {
            boolean z = mo106320a().get(str2);
            if (z == null) {
                mo106320a().put(str2, true);
                z = false;
            }
            if (!C89219l.m154714a((Object) z, (Object) true)) {
                C67568r invoke = this.f151021b.invoke();
                Map<String, String> a = C67404c.m119439a(this.f151020a.invoke(), aVar, invoke);
                a.put("item_order", String.valueOf(i + 1));
                new C67402b().mo106450b(a).mo96792f();
                C67542d dVar = (C67542d) ((C67542d) ((C67542d) ((C67542d) C42317b.m84679a(invoke).mo106487g(invoke.f151319n)).mo106497x(this.f151022c.invoke())).mo106496w(this.f151023d.invoke())).mo106491r("mt_goods");
                User invoke2 = this.f151020a.invoke();
                if (invoke2 != null) {
                    str = invoke2.getUid();
                } else {
                    str = null;
                }
                ((C67542d) ((C67542d) dVar.mo106495v(str)).mo106492s(aVar.f150986b)).mo106490d(Integer.valueOf(i)).mo96792f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C67414g(AbstractC89171a<? extends User> aVar, AbstractC89171a<C67568r> aVar2, AbstractC89171a<String> aVar3, AbstractC89171a<String> aVar4, AbstractC89171a<Boolean> aVar5) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        C89219l.m154721d(aVar5, "");
        this.f151020a = aVar;
        this.f151021b = aVar2;
        this.f151022c = aVar3;
        this.f151023d = aVar4;
        this.f151024e = aVar5;
    }
}
