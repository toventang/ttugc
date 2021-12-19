package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoader {
    static {
        Covode.recordClassIndex(106679);
    }

    boolean load(String str);
}
