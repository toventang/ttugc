package com.p2082ss.android.ugc.aweme.account.login.p2268v2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31554b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a */
public final class C32331a {

    /* renamed from: a */
    public static final C32331a f77120a = new C32331a();

    /* renamed from: b */
    private static final List<String> f77121b = C89070n.m154522b("gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com");

    /* renamed from: c */
    private static final Date f77122c;

    private C32331a() {
    }

    static {
        long j;
        Covode.recordClassIndex(39099);
        long currentTimeMillis = System.currentTimeMillis();
        if (!C31554b.m65835a()) {
            j = 31536000000L;
        } else {
            j = 0;
        }
        f77122c = new Date(currentTimeMillis - j);
    }

    /* renamed from: a */
    public static List<String> m66700a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            EmailLoginSettings emailLoginSettings = iESSettingsProxy.getEmailLoginSettings();
            C89219l.m154716b(emailLoginSettings, "");
            List<String> domainRecommendation = emailLoginSettings.getDomainRecommendation();
            C89219l.m154716b(domainRecommendation, "");
            if (!domainRecommendation.isEmpty()) {
                return emailLoginSettings.getDomainRecommendation();
            }
        } catch (C16041a unused) {
        }
        return f77121b;
    }

    /* renamed from: b */
    public static Date m66701b() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AgeGateSettings ageGateSettings = iESSettingsProxy.getAgeGateSettings();
            C89219l.m154716b(ageGateSettings, "");
            if (ageGateSettings.getInitialDate().intValue() > 0) {
                return new Date(TimeUnit.SECONDS.toMillis((long) ageGateSettings.getInitialDate().intValue()));
            }
        } catch (C16041a unused) {
        }
        return f77122c;
    }
}
