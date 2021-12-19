package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelLibraryLoader */
public class DownloadableModelLibraryLoader {
    public static final DownloadableModelLibraryLoader INSTANCE = new DownloadableModelLibraryLoader();
    private static volatile boolean hasLoadedLibrary;

    private DownloadableModelLibraryLoader() {
    }

    static {
        Covode.recordClassIndex(95352);
    }

    public final void loadLibrary() {
        MethodCollector.m26663i(12963);
        if (hasLoadedLibrary) {
            MethodCollector.m26664o(12963);
            return;
        }
        synchronized (this) {
            try {
                if (!hasLoadedLibrary) {
                    DownloadableModelSupport.sLibraryLoader.loadLibrary("oldep");
                    hasLoadedLibrary = true;
                }
            } finally {
                MethodCollector.m26664o(12963);
            }
        }
    }
}
