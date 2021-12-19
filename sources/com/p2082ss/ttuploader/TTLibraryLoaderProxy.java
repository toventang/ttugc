package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTLibraryLoaderProxy */
public interface TTLibraryLoaderProxy {
    static {
        Covode.recordClassIndex(101481);
    }

    boolean loadLibrary(String str);
}
