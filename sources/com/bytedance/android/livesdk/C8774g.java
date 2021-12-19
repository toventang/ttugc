package com.bytedance.android.livesdk;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.g */
public class C8774g {

    /* renamed from: b */
    private static volatile C8774g f21633b;

    /* renamed from: c */
    private static volatile int f21634c;

    /* renamed from: a */
    public C1213t<Boolean> f21635a = new C1213t<>();

    static {
        Covode.recordClassIndex(9651);
    }

    /* renamed from: b */
    public final void mo15045b() {
        f21634c++;
        this.f21635a.postValue(true);
    }

    /* renamed from: c */
    public final void mo15046c() {
        int i = f21634c - 1;
        f21634c = i;
        if (i < 0) {
            f21634c = 0;
        }
        if (f21634c == 0) {
            this.f21635a.postValue(false);
        }
    }

    /* renamed from: a */
    public static C8774g m17073a() {
        MethodCollector.m26663i(11146);
        if (f21633b == null) {
            synchronized (C8774g.class) {
                try {
                    if (f21633b == null) {
                        f21633b = new C8774g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11146);
                    throw th;
                }
            }
        }
        C8774g gVar = f21633b;
        MethodCollector.m26664o(11146);
        return gVar;
    }
}
