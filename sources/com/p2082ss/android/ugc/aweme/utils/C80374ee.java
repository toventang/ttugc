package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.utils.ee */
public final class C80374ee {

    /* renamed from: a */
    public static final C80374ee f179901a = new C80374ee();

    private C80374ee() {
    }

    static {
        Covode.recordClassIndex(93642);
    }

    /* renamed from: a */
    public static boolean m139354a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
