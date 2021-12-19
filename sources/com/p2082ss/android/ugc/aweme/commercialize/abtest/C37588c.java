package com.p2082ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.c */
public final class C37588c {

    /* renamed from: a */
    public static CommerceAdLandpageBulletConfig f88836a;

    /* renamed from: b */
    public static final C37588c f88837b = new C37588c();

    private C37588c() {
    }

    static {
        Covode.recordClassIndex(45002);
    }

    /* renamed from: a */
    public static final boolean m75845a() {
        CommerceAdLandpageBulletConfig c = m75847c();
        if (c != null && c.getTotalEnable()) {
            return c.getAdLandpageRealEnable();
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m75846b() {
        CommerceAdLandpageBulletConfig c = m75847c();
        if (c != null && c.getTotalEnable()) {
            return c.getAdLandpageNonFullScreenEnable();
        }
        return false;
    }

    /* renamed from: c */
    public static CommerceAdLandpageBulletConfig m75847c() {
        CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfig = f88836a;
        if (commerceAdLandpageBulletConfig != null) {
            return commerceAdLandpageBulletConfig;
        }
        try {
            f88836a = (CommerceAdLandpageBulletConfig) SettingsManager.m29616a().mo25396a("commerce_ad_landpage_bullet_config", CommerceAdLandpageBulletConfig.class);
        } catch (Throwable unused) {
        }
        return f88836a;
    }
}
