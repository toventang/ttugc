package com.p2082ss.android.ugc.aweme.recommend;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.guide.C49594i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53449i;
import com.p2082ss.android.ugc.aweme.main.C59038ax;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79665j;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.o */
public final class C66642o {

    /* renamed from: a */
    public static final C66642o f149807a = new C66642o();

    private C66642o() {
    }

    static {
        Covode.recordClassIndex(78200);
    }

    /* renamed from: a */
    public static final boolean m118411a() {
        int a = C16048b.m29633a().mo25412a(true, "popup_alert_recommend_strategy", 0);
        if (a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m118415d() {
        if (C59038ax.f134410a || (C79665j.C79666a.m138473a() && C49594i.m93009b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m118413b() {
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && C16048b.m29633a().mo25412a(true, "popup_alert_recommend_strategy", 0) == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m118414c() {
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && C16048b.m29633a().mo25412a(true, "popup_alert_recommend_strategy", 0) == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m118412a(Aweme aweme) {
        if (C66639l.f149800b || C80580in.m139687c() || !C80064f.m138815a(C80061e.f179403k.mo123508a()) || m118415d()) {
            return false;
        }
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        if ((!C13603b.m24435a((Collection) iESSettingsProxy.getContentLanguageGuideCodes()) && !C80580in.m139692f()) || C53449i.m98634a() == 1) {
            return false;
        }
        if ((aweme == null || !aweme.isWithSurvey()) && C51648a.f118980a.mo87293a("homepage_hot") == 0) {
            return true;
        }
        return false;
    }
}
