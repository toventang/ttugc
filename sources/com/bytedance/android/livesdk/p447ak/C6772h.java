package com.bytedance.android.livesdk.p447ak;

import com.bytedance.android.livesdk.livesetting.other.LiveLocalizationEnableSettings;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11655j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.ak.h */
public class C6772h implements AbstractC11655j {

    /* renamed from: a */
    private static volatile C6772h f16815a;

    static {
        Covode.recordClassIndex(7510);
    }

    private C6772h() {
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11655j
    /* renamed from: a */
    public final boolean mo13045a() {
        return LiveLocalizationEnableSettings.INSTANCE.getValue();
    }

    /* renamed from: b */
    public static C6772h m14558b() {
        MethodCollector.m26663i(10813);
        if (f16815a == null) {
            synchronized (C6772h.class) {
                try {
                    if (f16815a == null) {
                        f16815a = new C6772h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10813);
                    throw th;
                }
            }
        }
        C6772h hVar = f16815a;
        MethodCollector.m26664o(10813);
        return hVar;
    }
}
