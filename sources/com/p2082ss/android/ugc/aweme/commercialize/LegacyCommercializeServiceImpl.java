package com.p2082ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37877ba;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37878bb;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37868aw;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37893d;
import com.p2082ss.android.ugc.aweme.commercialize.link.AbstractC38035a;
import com.p2082ss.android.ugc.aweme.commercialize.link.C38039c;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38493d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38660az;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38674ba;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38675bb;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38621ae;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38640ao;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38733bt;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38769y;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38670c;
import com.p2082ss.android.ugc.aweme.services.CommerceDataServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl */
public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {

    /* renamed from: a */
    private AbstractC37880bd f88823a;

    /* renamed from: b */
    private AbstractC37878bb f88824b;

    /* renamed from: c */
    private AbstractC37873az f88825c;

    /* renamed from: d */
    private AbstractC38660az f88826d;

    /* renamed from: e */
    private AbstractC38035a f88827e;

    /* renamed from: f */
    private AbstractC38677bd f88828f;

    /* renamed from: g */
    private AbstractC38675bb f88829g;

    static {
        Covode.recordClassIndex(44996);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: g */
    public final AbstractC18020d mo65453g() {
        return C38493d.f90925e;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: j */
    public final AbstractC38674ba mo65456j() {
        return C38640ao.f91306d;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: e */
    public final AbstractC37498i mo65451e() {
        return C37438a.m75484d();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: i */
    public final AbstractC37877ba mo65455i() {
        return C37893d.m76713a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: a */
    public final AbstractC37880bd mo65447a() {
        if (this.f88823a == null) {
            this.f88823a = new C37868aw();
        }
        return this.f88823a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: b */
    public final AbstractC37878bb mo65448b() {
        if (this.f88824b == null) {
            this.f88824b = new CommerceDataServiceImpl();
        }
        return this.f88824b;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: c */
    public final AbstractC37873az mo65449c() {
        if (this.f88825c == null) {
            this.f88825c = new C38769y();
        }
        return this.f88825c;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: d */
    public final AbstractC38660az mo65450d() {
        if (this.f88826d == null) {
            this.f88826d = new C38621ae();
        }
        return this.f88826d;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: f */
    public final AbstractC38035a mo65452f() {
        if (this.f88827e == null) {
            this.f88827e = new C38039c();
        }
        return this.f88827e;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: h */
    public final AbstractC38677bd mo65454h() {
        if (this.f88828f == null) {
            this.f88828f = new C38733bt();
        }
        return this.f88828f;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    /* renamed from: k */
    public final AbstractC38675bb mo65457k() {
        if (this.f88829g == null) {
            this.f88829g = new C38670c();
        }
        return this.f88829g;
    }

    /* renamed from: l */
    public static ILegacyCommercializeService m75830l() {
        MethodCollector.m26663i(8210);
        Object a = C81908b.m141854a(ILegacyCommercializeService.class, false);
        if (a != null) {
            ILegacyCommercializeService iLegacyCommercializeService = (ILegacyCommercializeService) a;
            MethodCollector.m26664o(8210);
            return iLegacyCommercializeService;
        }
        if (C81908b.f183178ah == null) {
            synchronized (ILegacyCommercializeService.class) {
                try {
                    if (C81908b.f183178ah == null) {
                        C81908b.f183178ah = new LegacyCommercializeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8210);
                    throw th;
                }
            }
        }
        LegacyCommercializeServiceImpl legacyCommercializeServiceImpl = (LegacyCommercializeServiceImpl) C81908b.f183178ah;
        MethodCollector.m26664o(8210);
        return legacyCommercializeServiceImpl;
    }
}
