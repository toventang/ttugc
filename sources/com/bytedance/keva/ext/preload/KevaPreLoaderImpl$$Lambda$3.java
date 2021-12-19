package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import java.io.File;

final /* synthetic */ class KevaPreLoaderImpl$$Lambda$3 implements Runnable {
    private final KevaPreLoaderImpl arg$1;
    private final File arg$2;

    static {
        Covode.recordClassIndex(24259);
    }

    KevaPreLoaderImpl$$Lambda$3(KevaPreLoaderImpl kevaPreLoaderImpl, File file) {
        this.arg$1 = kevaPreLoaderImpl;
        this.arg$2 = file;
    }

    public final void run() {
        this.arg$1.lambda$writeCache2File$1$KevaPreLoaderImpl(this.arg$2);
    }
}
