package com.bytedance.keva;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class KevaMonitor {
    static {
        Covode.recordClassIndex(24231);
    }

    /* renamed from: com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m38930x4cca8ce2(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    public void onLoadRepo(String str, int i) {
    }

    /* access modifiers changed from: protected */
    public void reportWarning(int i, String str, String str2, Object obj, String str3) {
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        m38929x316d05f2(str);
    }

    /* renamed from: com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m38929x316d05f2(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* access modifiers changed from: protected */
    public void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        m38930x4cca8ce2("Keva", "action: [" + i + "], repo: [" + str + "], key: [" + str2 + "], value: [" + obj + "], msg: " + th.getMessage(), th);
    }
}
