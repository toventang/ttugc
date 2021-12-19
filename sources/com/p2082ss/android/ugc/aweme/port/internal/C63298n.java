package com.p2082ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.n */
public final class C63298n implements IVideoConfigService {

    /* renamed from: a */
    private static int f143675a = 576;

    /* renamed from: b */
    private static int f143676b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f143677c = new AtomicBoolean(false);

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoHeight() {
        m114785a();
        return f143676b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final int getVideoWidth() {
        m114785a();
        return f143675a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService
    public final void invalidate() {
        f143677c.set(false);
    }

    static {
        Covode.recordClassIndex(74575);
    }

    /* renamed from: a */
    private static void m114785a() {
        int[] g;
        MethodCollector.m26663i(10907);
        AtomicBoolean atomicBoolean = f143677c;
        if (atomicBoolean.get()) {
            MethodCollector.m26664o(10907);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (g = C65357b.m117051g()) != null && g.length == 2 && g[0] > 0 && g[1] > 0) {
                    f143675a = g[0];
                    f143676b = g[1];
                }
            } finally {
                MethodCollector.m26664o(10907);
            }
        }
    }
}
