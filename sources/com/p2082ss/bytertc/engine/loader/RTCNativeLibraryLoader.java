package com.p2082ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;
import org.webrtc.NativeLibraryLoader;

/* renamed from: com.ss.bytertc.engine.loader.RTCNativeLibraryLoader */
public interface RTCNativeLibraryLoader extends NativeLibraryLoader {
    static {
        Covode.recordClassIndex(101106);
    }

    @Override // org.webrtc.NativeLibraryLoader
    boolean load(String str);
}
