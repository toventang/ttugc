package com.p2082ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;
import org.webrtc.NativeLibraryLoadListener;

/* renamed from: com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener */
public interface RTCNativeLibraryLoaderListener extends NativeLibraryLoadListener {
    static {
        Covode.recordClassIndex(101109);
    }

    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadAlready(String str);

    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadError(String str);

    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadSuccess(String str);
}
