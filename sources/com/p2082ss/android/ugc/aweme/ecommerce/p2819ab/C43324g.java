package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.g */
public final class C43324g {

    /* renamed from: a */
    public static final C43319b f101111a = new C43319b((byte) 0);

    /* renamed from: b */
    public static final C43324g f101112b = new C43324g();

    private C43324g() {
    }

    /* renamed from: a */
    public static final String m86442a() {
        String str = m86443b().f101096a;
        if (str == null) {
            return "sslocal://webcast_lynxview?url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_coupon_panel%2Fpages%2Fcoupon%2Ftemplate.js&gravity=bottom&type=popup&hide_nav_bar=1&hide_status_bar=1&web_bg_color=ffffff&show_dim=1&mask_alpha=0.5";
        }
        return str;
    }

    static {
        Covode.recordClassIndex(51538);
    }

    /* renamed from: b */
    public static final C43319b m86443b() {
        SettingsManager a = SettingsManager.m29616a();
        C43319b bVar = f101111a;
        C43319b bVar2 = (C43319b) a.mo25397a("ecom_settings_config", C43319b.class, bVar);
        return bVar2 == null ? bVar : bVar2;
    }
}
