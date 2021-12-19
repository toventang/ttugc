package com.p2082ss.android.newmedia.p2165c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.newmedia.c.a */
public final class C30127a implements NetworkUtils.AbstractC29829b {

    /* renamed from: a */
    private boolean f71873a;

    /* renamed from: b */
    private final Object f71874b = new Object();

    static {
        Covode.recordClassIndex(36626);
    }

    @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29829b
    /* renamed from: a */
    public final void mo52112a() {
        MethodCollector.m26663i(3397);
        if (!"ActionReaper".equals(Thread.currentThread().getName())) {
            synchronized (this.f71874b) {
                try {
                    if (!this.f71873a) {
                        try {
                            Thread.sleep(1500);
                        } catch (Exception unused) {
                        }
                        this.f71873a = true;
                    }
                } finally {
                    MethodCollector.m26664o(3397);
                }
            }
            return;
        }
        MethodCollector.m26664o(3397);
    }

    @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29829b
    /* renamed from: a */
    public final String mo52111a(String str, boolean z) {
        return AppLog.addCommonParams(str, z);
    }

    @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29829b
    /* renamed from: a */
    public final void mo52113a(List<C29934d> list, boolean z) {
        HashMap hashMap = new HashMap();
        C29803q.m60037b(hashMap, z);
        for (Map.Entry entry : hashMap.entrySet()) {
            list.add(new C29934d((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
