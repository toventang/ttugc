package com.bytedance.keva;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

class KevaPreLoaderHolder {
    private static IKevaPreLoader sPreLoader;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.keva.KevaPreLoaderHolder$1 */
    public static /* synthetic */ class C206821 {
        static {
            Covode.recordClassIndex(24234);
        }
    }

    static {
        Covode.recordClassIndex(24233);
    }

    /* access modifiers changed from: package-private */
    public static final class NoOpPreLoader implements IKevaPreLoader {
        static {
            Covode.recordClassIndex(24235);
        }

        @Override // com.bytedance.keva.IKevaPreLoader
        public final void access(String str, int i) {
        }

        @Override // com.bytedance.keva.IKevaPreLoader
        public final void preload() {
        }

        private NoOpPreLoader() {
        }

        /* synthetic */ NoOpPreLoader(C206821 r1) {
            this();
        }
    }

    KevaPreLoaderHolder() {
    }

    public static IKevaPreLoader getPreLoader() {
        MethodCollector.m26663i(3044);
        synchronized (KevaPreLoaderHolder.class) {
            try {
                IKevaPreLoader iKevaPreLoader = sPreLoader;
                if (iKevaPreLoader != null) {
                    return iKevaPreLoader;
                }
                NoOpPreLoader noOpPreLoader = new NoOpPreLoader(null);
                MethodCollector.m26664o(3044);
                return noOpPreLoader;
            } finally {
                MethodCollector.m26664o(3044);
            }
        }
    }

    public static synchronized void injectPreLoader(IKevaPreLoader iKevaPreLoader) {
        synchronized (KevaPreLoaderHolder.class) {
            MethodCollector.m26663i(3045);
            sPreLoader = iKevaPreLoader;
            MethodCollector.m26664o(3045);
        }
    }
}
