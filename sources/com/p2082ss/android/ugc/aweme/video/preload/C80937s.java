package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.preload.s */
public final class C80937s {

    /* renamed from: a */
    public static final Object f180970a = new Object();

    /* renamed from: b */
    public static AbstractC80918i f180971b = null;

    /* renamed from: c */
    public static Map<String, String> f180972c;

    static {
        Covode.recordClassIndex(94239);
    }

    /* renamed from: b */
    public static AbstractC80918i m140453b() {
        MethodCollector.m26663i(5873);
        AbstractC80918i iVar = f180971b;
        if (iVar != null) {
            MethodCollector.m26664o(5873);
            return iVar;
        }
        synchronized (f180970a) {
            try {
                AbstractC80918i iVar2 = f180971b;
                if (iVar2 != null) {
                    return iVar2;
                }
                AbstractC80918i a = AbstractC80920j.m140447a();
                f180971b = a;
                MethodCollector.m26664o(5873);
                return a;
            } finally {
                MethodCollector.m26664o(5873);
            }
        }
    }

    /* renamed from: a */
    public static AbstractC80918i m140452a() {
        MethodCollector.m26663i(5737);
        if (f180971b == null) {
            synchronized (f180970a) {
                try {
                    if (f180971b == null) {
                        f180971b = AbstractC80920j.m140447a();
                        C84231a.m144836b().ensureNotReachHere(new Exception(), "VideoPreloadManagerService getInstance NULL.");
                        if (C84231a.m144834a().isDebug()) {
                            RuntimeException runtimeException = new RuntimeException("VideoPreloadManagerService getInstance NULL.");
                            MethodCollector.m26664o(5737);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5737);
                    throw th;
                }
            }
        }
        AbstractC80918i iVar = f180971b;
        MethodCollector.m26664o(5737);
        return iVar;
    }
}
