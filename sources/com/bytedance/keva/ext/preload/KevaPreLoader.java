package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.IKevaPreLoader;
import java.io.File;
import java.util.concurrent.Executor;

public class KevaPreLoader {
    private static IKevaPreLoader sPreLoader;

    static {
        Covode.recordClassIndex(24253);
    }

    public static synchronized IKevaPreLoader getPreLoader() {
        IKevaPreLoader iKevaPreLoader;
        synchronized (KevaPreLoader.class) {
            MethodCollector.m26663i(12876);
            iKevaPreLoader = sPreLoader;
            MethodCollector.m26664o(12876);
        }
        return iKevaPreLoader;
    }

    public static class PreloadConfig {
        public final int maxRepos;
        public final long preloadConfigExpiredTimeInMills;
        public final long preloadTimeInMills;

        static {
            Covode.recordClassIndex(24254);
        }

        public PreloadConfig(long j, int i, long j2) {
            this.preloadTimeInMills = j;
            this.maxRepos = i;
            this.preloadConfigExpiredTimeInMills = j2;
        }
    }

    public static IKevaPreLoader makePreLoader(File file, PreloadConfig preloadConfig, Executor executor) {
        MethodCollector.m26663i(12875);
        if (file == null || preloadConfig == null) {
            MethodCollector.m26664o(12875);
            return null;
        }
        KevaPreLoaderImpl kevaPreLoaderImpl = new KevaPreLoaderImpl(file, executor, preloadConfig.preloadTimeInMills, preloadConfig.maxRepos, preloadConfig.preloadConfigExpiredTimeInMills);
        synchronized (KevaPreLoader.class) {
            try {
                sPreLoader = kevaPreLoaderImpl;
            } finally {
                MethodCollector.m26664o(12875);
            }
        }
        return kevaPreLoaderImpl;
    }
}
