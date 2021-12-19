package com.p2082ss.android.ugc.aweme.account.util;

import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.util.e */
public final class C33035e {
    static {
        Covode.recordClassIndex(39842);
    }

    /* renamed from: a */
    public static CookieManager m67668a() {
        try {
            return CookieManager.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m67669b() {
        try {
            String shareCookieHost = NetworkUtils.getShareCookieHost();
            if (!C33028a.m67665a() || shareCookieHost.toLowerCase(Locale.ROOT).startsWith("https")) {
                return CookieManager.getInstance().getCookie(shareCookieHost);
            }
            throw new IllegalArgumentException("Cookie url must be https");
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }
}
