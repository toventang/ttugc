package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2544b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.b.a */
public final class C37702a {

    /* renamed from: a */
    public static final boolean f89064a = false;

    /* renamed from: b */
    public static final C37702a f89065b = new C37702a();

    private C37702a() {
    }

    static {
        Covode.recordClassIndex(45140);
    }

    /* renamed from: a */
    public static boolean m76322a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_shopify_anchor_pdp_half_screen", false);
        } catch (Throwable unused) {
            return f89064a;
        }
    }
}
