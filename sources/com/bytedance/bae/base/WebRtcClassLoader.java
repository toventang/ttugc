package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

class WebRtcClassLoader {
    static {
        Covode.recordClassIndex(15028);
    }

    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
