package com.p2082ss.android.ugc.aweme.kids.intergration.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57352d;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.EnumC57349a;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.C57635a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.account.C57828a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.AppStateReporterKid$init$1;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.C57864b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl */
public final class KidsCommonServiceImpl implements IKidsCommonService {
    static {
        Covode.recordClassIndex(67695);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: e */
    public final void mo94338e() {
        C57635a.m104363a();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: c */
    public final String mo94336c() {
        return C68432f.f153189a.getReleaseBuildString();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: d */
    public final void mo94337d() {
        C18236d.f43454b = C57721a.f131706a;
        C18236d.f43456d = C57721a.f131706a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: f */
    public final void mo94339f() {
        C57352d.f130729a = EnumC57349a.COLD;
        C57352d.f130730b = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: b */
    public final void mo94335b() {
        BulletService.m71938f().mo61856b().f38809b.mo25659a("kids_mode", new C57828a());
    }

    /* renamed from: g */
    public static IKidsCommonService m104422g() {
        MethodCollector.m26663i(8133);
        Object a = C81908b.m141854a(IKidsCommonService.class, false);
        if (a != null) {
            IKidsCommonService iKidsCommonService = (IKidsCommonService) a;
            MethodCollector.m26664o(8133);
            return iKidsCommonService;
        }
        if (C81908b.f183215bR == null) {
            synchronized (IKidsCommonService.class) {
                try {
                    if (C81908b.f183215bR == null) {
                        C81908b.f183215bR = new KidsCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8133);
                    throw th;
                }
            }
        }
        KidsCommonServiceImpl kidsCommonServiceImpl = (KidsCommonServiceImpl) C81908b.f183215bR;
        MethodCollector.m26664o(8133);
        return kidsCommonServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: a */
    public final void mo94333a() {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new AppStateReporterKid$init$1()).mo95706a();
        C17873f.m33094b().mo143289d(C57864b.C57865a.f131933a);
        C17873f.m33095c().mo143289d(C57864b.C57866b.f131934a);
        C17873f.m33097e().mo143289d(C57864b.C57867c.f131935a);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    /* renamed from: a */
    public final void mo94334a(Context context) {
        C89219l.m154721d(context, "");
        C39223a.m79603q().mo68630b(context);
    }
}
