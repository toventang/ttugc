package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.common.wschannel.l */
public class C13758l {

    /* renamed from: b */
    private static volatile C13758l f33413b;

    /* renamed from: a */
    public final WsChannelMultiProcessSharedProvider.C13641b f33414a;

    static {
        Covode.recordClassIndex(15793);
    }

    /* renamed from: a */
    public final boolean mo22109a() {
        return this.f33414a.mo21919a("frontier_enabled", true);
    }

    /* renamed from: b */
    public final boolean mo22110b() {
        return this.f33414a.mo21919a("enableAppStateChangeReport", false);
    }

    private C13758l(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f33414a = WsChannelMultiProcessSharedProvider.m24550a(applicationContext);
    }

    /* renamed from: a */
    public static C13758l m24811a(Context context) {
        MethodCollector.m26663i(12728);
        if (f33413b == null) {
            synchronized (C13758l.class) {
                try {
                    if (f33413b == null) {
                        f33413b = new C13758l(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12728);
                    throw th;
                }
            }
        }
        C13758l lVar = f33413b;
        MethodCollector.m26664o(12728);
        return lVar;
    }
}
