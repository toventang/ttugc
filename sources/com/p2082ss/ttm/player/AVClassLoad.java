package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.AVClassLoad */
class AVClassLoad {
    static {
        Covode.recordClassIndex(101381);
    }

    AVClassLoad() {
    }

    static Object getClassLoader() {
        return AVClassLoad.class.getClassLoader();
    }
}
