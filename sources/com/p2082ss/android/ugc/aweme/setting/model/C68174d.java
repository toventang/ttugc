package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.PushPrePermissionView;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense;
import com.p2082ss.android.ugc.aweme.p2756df.C41466b;
import com.p2082ss.android.ugc.aweme.setting.p3718f.C68079b;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4050b.p4051a.C77265a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.d */
public class C68174d {

    /* renamed from: a */
    private static volatile C68174d f152637a;

    static {
        Covode.recordClassIndex(80373);
    }

    /* renamed from: f */
    public static AdLandingPageConfig m120425f() {
        try {
            return C52912c.f121688a.f121689b.getAdLandingPageConfig();
        } catch (C16041a unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static Object m120426g() {
        try {
            return SettingsManager.m29616a().mo25396a("download_sdk_config", Object.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static boolean m120436q() {
        return SettingsManager.m29616a().mo25400a("enable_twitter_new_key_secret", false);
    }

    /* renamed from: c */
    public static C68189q m120422c() {
        try {
            return (C68189q) SettingsManager.m29616a().mo25396a("share_url_whitelist", C68189q.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static C77265a m120423d() {
        try {
            return (C77265a) SettingsManager.m29616a().mo25396a("story_publish_sync_duoshan", PublishSyncDuoshanAllConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static AwemeFEConfigs m120424e() {
        try {
            return (AwemeFEConfigs) SettingsManager.m29616a().mo25396a("aweme_fe_conf", AwemeFEConfigs.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static List<UrlModel> m120427h() {
        try {
            UrlModel[] urlModelArr = (UrlModel[]) SettingsManager.m29616a().mo25396a("default_cover_urls", com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel[].class);
            if (urlModelArr != null) {
                return Arrays.asList(urlModelArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static List<UrlModel> m120428i() {
        try {
            UrlModel[] urlModelArr = (UrlModel[]) SettingsManager.m29616a().mo25396a("white_cover_urls", com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class);
            if (urlModelArr != null) {
                return Arrays.asList(urlModelArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m120429j() {
        String[] strArr;
        try {
            strArr = (String[]) SettingsManager.m29616a().mo25396a("search_tab", String[].class);
        } catch (Throwable unused) {
            strArr = null;
        }
        return new C27910f().mo46674b(strArr);
    }

    /* renamed from: k */
    public static ShowCreatorLicense m120430k() {
        try {
            return (ShowCreatorLicense) SettingsManager.m29616a().mo25396a("show_creator_license_230", ShowCreatorLicense.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static PushPrePermissionView m120431l() {
        try {
            return (PushPrePermissionView) SettingsManager.m29616a().mo25396a("push_pre_permission_view", PushPrePermissionView.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static GeckoConfig m120432m() {
        try {
            return (GeckoConfig) SettingsManager.m29616a().mo25396a("aweme_gecko_conf", GeckoConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static List<String> m120433n() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25396a("aweme_gecko_offline_host_prefix", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static List<String> m120437r() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25396a("covid_19_ids", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static C41466b m120438s() {
        try {
            return (C41466b) SettingsManager.m29616a().mo25396a("wallet_conf", C41466b.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static C68079b m120439t() {
        try {
            return (C68079b) SettingsManager.m29616a().mo25396a("hateful", C68079b.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static List<String> m120440u() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25396a("aweme_ad_link_priority", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C68174d m120420a() {
        MethodCollector.m26663i(6260);
        if (f152637a == null) {
            synchronized (C68174d.class) {
                try {
                    if (f152637a == null) {
                        f152637a = new C68174d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6260);
                    throw th;
                }
            }
        }
        C68174d dVar = f152637a;
        MethodCollector.m26664o(6260);
        return dVar;
    }

    /* renamed from: b */
    public static List<String> m120421b() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25396a("share_h5_url_whitelist", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return Arrays.asList("tiktokcdn.com", "tiktokv.com", "tiktok.com");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static List<Integer> m120434o() {
        try {
            int[] iArr = (int[]) SettingsManager.m29616a().mo25396a("self_profile_landing_tabs", int[].class);
            if (iArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(iArr.length);
            try {
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: p */
    public static List<Integer> m120435p() {
        try {
            int[] iArr = (int[]) SettingsManager.m29616a().mo25396a("other_profile_landing_tabs", int[].class);
            if (iArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(iArr.length);
            try {
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
