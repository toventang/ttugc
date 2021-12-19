package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.a */
public final class C43451a {

    /* renamed from: a */
    public static final C43451a f101365a = new C43451a();

    /* renamed from: b */
    private static final List<String> f101366b = C89070n.m154522b("gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com");

    private C43451a() {
    }

    static {
        Covode.recordClassIndex(51680);
    }

    /* renamed from: a */
    public static List<String> m86513a() {
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
        } catch (Exception e) {
            C22708a.m42800a("getDomainRecommendation error: " + e.getMessage());
        }
        return f101366b;
    }
}
