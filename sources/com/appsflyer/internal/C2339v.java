package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.v */
public final class C2339v {
    static {
        Covode.recordClassIndex(2611);
    }

    C2339v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.v$a */
    public static class C2340a extends IllegalStateException {
        static {
            Covode.recordClassIndex(2612);
        }

        C2340a(String str) {
            super(str);
        }
    }

    /* renamed from: Ι */
    public static C2341w m7150(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new C2341w(Settings.Secure.getString(contentResolver, "advertising_id"), false);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new C2341w(str, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3.length() == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC, Splitter:B:32:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7151(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2339v.m7151(android.content.Context, java.util.Map):void");
    }
}
