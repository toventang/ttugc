package com.p2082ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.i */
public final class C63282i implements IVideoConfigService {

    /* renamed from: a */
    private static int f143639a = 576;

    /* renamed from: b */
    private static int f143640b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f143641c = new AtomicBoolean(false);

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        m114779a();
        return f143640b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        m114779a();
        return f143639a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        f143641c.set(false);
    }

    static {
        Covode.recordClassIndex(74559);
    }

    /* renamed from: a */
    private static void m114779a() {
        int[] h;
        MethodCollector.m26663i(11052);
        AtomicBoolean atomicBoolean = f143641c;
        if (atomicBoolean.get()) {
            MethodCollector.m26664o(11052);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (h = C65357b.m117052h()) != null && h.length == 2 && h[0] > 0 && h[1] > 0) {
                    f143639a = h[0];
                    f143640b = h[1];
                }
            } finally {
                MethodCollector.m26664o(11052);
            }
        }
    }
}
