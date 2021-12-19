package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2549c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.c.a */
public final class C37741a {

    /* renamed from: a */
    public static final boolean f89136a = false;

    /* renamed from: b */
    public static final C37741a f89137b = new C37741a();

    private C37741a() {
    }

    static {
        Covode.recordClassIndex(45184);
    }

    /* renamed from: a */
    public static boolean m76370a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_wishlist_product_tab", false);
        } catch (Throwable unused) {
            return f89136a;
        }
    }
}
