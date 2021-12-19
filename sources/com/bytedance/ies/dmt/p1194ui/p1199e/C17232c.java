package com.bytedance.ies.dmt.p1194ui.p1199e;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ies.dmt.ui.e.c */
public class C17232c {

    /* renamed from: a */
    private static C17232c f41162a;

    /* renamed from: b */
    private String f41163b;

    /* renamed from: c */
    private long f41164c;

    static {
        Covode.recordClassIndex(19693);
    }

    /* renamed from: a */
    public static C17232c m31804a() {
        MethodCollector.m26663i(11084);
        if (f41162a == null) {
            synchronized (C17232c.class) {
                try {
                    if (f41162a == null) {
                        f41162a = new C17232c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11084);
                    throw th;
                }
            }
        }
        C17232c cVar = f41162a;
        MethodCollector.m26664o(11084);
        return cVar;
    }

    /* renamed from: a */
    public final boolean mo27258a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f41164c <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && TextUtils.equals(this.f41163b, str)) {
            return false;
        }
        this.f41163b = str;
        this.f41164c = currentTimeMillis;
        return true;
    }
}
