package com.bytedance.android.livesdk.utils.p653a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNtpServerUrlSetting;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.utils.a.a */
public class C11200a {

    /* renamed from: a */
    static volatile C11200a f26832a;

    /* renamed from: b */
    C11204e f26833b;

    /* renamed from: c */
    private AbstractC88412b f26834c;

    static {
        Covode.recordClassIndex(12828);
    }

    /* renamed from: a */
    public static long m19851a() {
        if (f26832a == null || f26832a.f26833b == null || !f26832a.f26833b.f26840a) {
            return System.currentTimeMillis() + C11225an.f26870a;
        }
        return f26832a.f26833b.mo17971b();
    }

    private C11200a(Context context) {
        AbstractC88398aa a;
        String value = LiveNtpServerUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            this.f26833b = C11204e.m19854a(context, value);
            AbstractC88979t<Long> b = C11231b.m19899b(60, TimeUnit.MINUTES).mo143276b(2147483647L);
            if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
                a = C88925a.m154180b(C88946a.f201991c);
            } else {
                a = C88925a.m154160a(C88946a.f201990b);
            }
            this.f26834c = b.mo143278b(a).mo143292d(C11201b.f26835a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C11202c.f26836a, C11203d.f26837a);
        }
    }

    /* renamed from: a */
    public static void m19852a(Context context) {
        MethodCollector.m26663i(9828);
        if (f26832a == null) {
            synchronized (C11200a.class) {
                try {
                    if (f26832a == null) {
                        f26832a = new C11200a(context);
                    }
                } finally {
                    MethodCollector.m26664o(9828);
                }
            }
            return;
        }
        MethodCollector.m26664o(9828);
    }
}
