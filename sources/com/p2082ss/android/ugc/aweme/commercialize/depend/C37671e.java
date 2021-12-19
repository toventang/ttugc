package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.settings.C68726aa;
import com.p2082ss.android.ugc.aweme.settings.C68762z;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.e */
public final class C37671e implements AbstractC33117e {
    static {
        Covode.recordClassIndex(45104);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: j */
    public final boolean mo58980j() {
        try {
            if (C68726aa.m121163a() != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: k */
    public final Integer mo58981k() {
        try {
            C68762z a = C68726aa.m121163a();
            if (a != null) {
                return Integer.valueOf(a.f153809a);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: l */
    public final String[] mo58982l() {
        try {
            C68762z a = C68726aa.m121163a();
            if (a != null) {
                return a.f153810b;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: o */
    public final boolean mo58985o() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_audio_auto_play", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: a */
    public final String mo58971a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            return adLandingPageConfig.getAnalytics();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: b */
    public final boolean mo58972b() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Boolean adLandingPagePreloadEnabled = adLandingPageConfig.getAdLandingPagePreloadEnabled();
            C89219l.m154716b(adLandingPagePreloadEnabled, "");
            return adLandingPagePreloadEnabled.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: c */
    public final List<String> mo58973c() {
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        C89219l.m154716b(adLandingPageConfig, "");
        return adLandingPageConfig.getAdCardPreloadCommonPrefix();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: d */
    public final boolean mo58974d() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Boolean enableDynamicNavbar = adLandingPageConfig.getEnableDynamicNavbar();
            C89219l.m154716b(enableDynamicNavbar, "");
            return enableDynamicNavbar.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: e */
    public final boolean mo58975e() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
            C89219l.m154716b(adLandingPageReportWifiOnlyEnable, "");
            return adLandingPageReportWifiOnlyEnable.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: f */
    public final int mo58976f() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
            C89219l.m154716b(adLandingPageReportPageCount, "");
            return adLandingPageReportPageCount.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: g */
    public final int mo58977g() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
            C89219l.m154716b(adLandingPageReportLimitTimes, "");
            return adLandingPageReportLimitTimes.intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: h */
    public final String mo58978h() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: i */
    public final String mo58979i() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportPacketKey();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: m */
    public final String mo58983m() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> adLandingPageConfig = inst.getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            return adLandingPageConfig.mo59941c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: n */
    public final String mo58984n() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> jsActlogUrl = inst.getJsActlogUrl();
        C89219l.m154716b(jsActlogUrl, "");
        return jsActlogUrl.mo59941c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: q */
    public final int mo58987q() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            return adLandingPageConfig.getAdLandingPageReportDelay();
        } catch (Throwable unused) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: r */
    public final int mo58988r() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Integer adLandingPagePreloadCacheCount = adLandingPageConfig.getAdLandingPagePreloadCacheCount();
            if (adLandingPagePreloadCacheCount != null) {
                return adLandingPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable unused) {
            return 40;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: s */
    public final int mo58989s() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            Integer adLynxPagePreloadCacheCount = adLandingPageConfig.getAdLynxPagePreloadCacheCount();
            if (adLynxPagePreloadCacheCount != null) {
                return adLynxPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable unused) {
            return 40;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e
    /* renamed from: p */
    public final List<String> mo58986p() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
            C89219l.m154716b(adLandingPageConfig, "");
            List<String> adCardPreloadCommonChannel = adLandingPageConfig.getAdCardPreloadCommonChannel();
            if (adCardPreloadCommonChannel == null) {
                return new ArrayList();
            }
            return adCardPreloadCommonChannel;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }
}
