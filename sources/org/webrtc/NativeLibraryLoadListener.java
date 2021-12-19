package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoadListener {
    static {
        Covode.recordClassIndex(106678);
    }

    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
