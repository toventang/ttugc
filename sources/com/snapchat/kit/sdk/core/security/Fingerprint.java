package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class Fingerprint {
    private final String mPackageName;

    static {
        Covode.recordClassIndex(35377);
    }

    private native String sign(String str);

    private String generateFingerprintPayload() {
        return C1764a.m5928a("%s:%d", new Object[]{this.mPackageName, Long.valueOf(System.currentTimeMillis())});
    }

    public synchronized String getEncryptedFingerprint() {
        String sign;
        MethodCollector.m26663i(5538);
        sign = sign(generateFingerprintPayload());
        MethodCollector.m26664o(5538);
        return sign;
    }

    public Fingerprint(Context context) {
        m58031x6e277207("pruneau");
        this.mPackageName = context.getPackageName();
    }

    /* renamed from: com_snapchat_kit_sdk_core_security_Fingerprint_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m58031x6e277207(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
