package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24066b;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lighten.loader.j */
public final class C20792j extends C24066b {
    static {
        Covode.recordClassIndex(24368);
    }

    public C20792j(Executor executor) {
        super("FixSizeSerialExecutor", executor, new C20791i());
    }

    @Override // com.facebook.common.p1830b.C24066b
    public final synchronized void execute(Runnable runnable) {
        MethodCollector.m26663i(13182);
        super.execute(runnable);
        MethodCollector.m26664o(13182);
    }
}
