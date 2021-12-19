package com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40046b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40055c;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40059f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl */
public final class AntiAddictionServiceImpl implements IAntiAddictionService {
    static {
        Covode.recordClassIndex(47884);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: d */
    public final boolean mo68596d() {
        return C40059f.m81018a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: e */
    public final String mo68597e() {
        return C40059f.m81019b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: f */
    public final String mo68598f() {
        String str = C40059f.f94099a;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: g */
    public final AbstractC33485al mo68599g() {
        return new C40055c();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: a */
    public final String mo68591a() {
        C40046b a = C40046b.m81004a();
        String str = a.f94081f;
        a.f94081f = "";
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: b */
    public final int mo68594b() {
        C40046b a = C40046b.m81004a();
        boolean z = a.f94080e;
        a.f94080e = false;
        return z ? 1 : 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: c */
    public final void mo68595c() {
        C39162r.m79460a("addict_alert", new C33744d().f79943a);
    }

    /* renamed from: h */
    public static IAntiAddictionService m81090h() {
        MethodCollector.m26663i(1549);
        Object a = C81908b.m141854a(IAntiAddictionService.class, false);
        if (a != null) {
            IAntiAddictionService iAntiAddictionService = (IAntiAddictionService) a;
            MethodCollector.m26664o(1549);
            return iAntiAddictionService;
        }
        if (C81908b.f183159aO == null) {
            synchronized (IAntiAddictionService.class) {
                try {
                    if (C81908b.f183159aO == null) {
                        C81908b.f183159aO = new AntiAddictionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1549);
                    throw th;
                }
            }
        }
        AntiAddictionServiceImpl antiAddictionServiceImpl = (AntiAddictionServiceImpl) C81908b.f183159aO;
        MethodCollector.m26664o(1549);
        return antiAddictionServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: a */
    public final void mo68593a(IESSettingsProxy iESSettingsProxy) {
        C89219l.m154721d(iESSettingsProxy, "");
        C40046b a = C40046b.m81004a();
        a.f94076a = SettingsManager.m29616a().mo25394a("anti_addiction_separation", 22);
        a.f94077b = iESSettingsProxy.getAntiAddictionDayTime().intValue();
        a.f94078c = iESSettingsProxy.getAntiAddictionNightTime().intValue();
        a.f94079d = iESSettingsProxy.getAntiAddictionToastTime().intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    /* renamed from: a */
    public final void mo68592a(Aweme aweme) {
        String str;
        C89219l.m154721d(aweme, "");
        if (C40046b.m81004a().mo69206a(System.currentTimeMillis())) {
            str = "night";
        } else {
            str = "day";
        }
        MobClick value = MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(aweme.getAid());
        String str2 = "1";
        C33743c a = new C33743c().mo59976a("is_addicted", str2).mo59976a("appear_time", str);
        if (!aweme.getAllowGift()) {
            str2 = "0";
        }
        C39162r.onEvent(value.setJsonObject(a.mo59976a("is_giftable", str2).mo59977a()));
    }
}
