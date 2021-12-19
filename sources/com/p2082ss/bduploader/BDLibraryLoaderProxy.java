package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDLibraryLoaderProxy */
public interface BDLibraryLoaderProxy {
    static {
        Covode.recordClassIndex(100785);
    }

    boolean loadLibrary(String str);
}
