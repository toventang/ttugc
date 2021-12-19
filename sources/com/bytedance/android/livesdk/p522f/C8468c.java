package com.bytedance.android.livesdk.p522f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.bytedance.android.livesdk.f.c */
public final class C8468c {
    static {
        Covode.recordClassIndex(9316);
    }

    /* renamed from: a */
    public static boolean m16674a(String str) {
        Context e;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) || !C6935a.m14807c("com.android.vending") || (e = C3966y.m9669e()) == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            C84349a.m145093a(intent, e);
            e.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
