package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53746c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53747d;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.l */
public final class C53730l implements AbstractC53729k {

    /* renamed from: a */
    public final ConcurrentHashMap<String, AbstractC17434e> f123259a;

    /* renamed from: b */
    private final AbstractC53727i f123260b;

    static {
        Covode.recordClassIndex(63310);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.l$a */
    static final class C53731a implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C53730l f123261a;

        /* renamed from: b */
        final /* synthetic */ String f123262b;

        static {
            Covode.recordClassIndex(63311);
        }

        C53731a(C53730l lVar, String str) {
            this.f123261a = lVar;
            this.f123262b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f123261a.f123259a.remove(this.f123262b);
        }
    }

    public /* synthetic */ C53730l() {
        this(new C53728j());
    }

    private C53730l(AbstractC53727i iVar) {
        C89219l.m154721d(iVar, "");
        this.f123260b = iVar;
        this.f123259a = new ConcurrentHashMap<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k
    /* renamed from: b */
    public final AbstractC88979t<AbstractC53746c> mo90312b(String str) {
        C89219l.m154721d(str, "");
        AbstractC17434e a = mo90311a(str);
        C89219l.m154721d(a, "");
        AbstractC88979t<AbstractC53746c> a2 = new C53747d(a).mo143262a(new C53731a(this, str));
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k
    /* renamed from: c */
    public final void mo90313c(String str) {
        C89219l.m154721d(str, "");
        AbstractC17434e eVar = this.f123259a.get(str);
        if (eVar != null) {
            eVar.mo27762c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k
    /* renamed from: d */
    public final void mo90314d(String str) {
        C89219l.m154721d(str, "");
        AbstractC17434e eVar = this.f123259a.get(str);
        if (eVar != null) {
            eVar.mo27763d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k
    /* renamed from: e */
    public final void mo90315e(String str) {
        C89219l.m154721d(str, "");
        AbstractC17434e eVar = this.f123259a.get(str);
        if (eVar != null) {
            eVar.mo27765f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k
    /* renamed from: a */
    public final AbstractC17434e mo90311a(String str) {
        AbstractC17434e putIfAbsent;
        C89219l.m154721d(str, "");
        ConcurrentHashMap<String, AbstractC17434e> concurrentHashMap = this.f123259a;
        AbstractC17434e eVar = concurrentHashMap.get(str);
        if (eVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (eVar = this.f123260b.mo90310a(str)))) != null) {
            eVar = putIfAbsent;
        }
        C89219l.m154716b(eVar, "");
        return eVar;
    }
}
