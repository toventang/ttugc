package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.AVMDLNetClientMaker */
public interface AVMDLNetClientMaker {
    static {
        Covode.recordClassIndex(101235);
    }

    AVMDLNetClient getNetClient();
}
