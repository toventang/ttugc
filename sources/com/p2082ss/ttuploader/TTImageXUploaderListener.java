package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTImageXUploaderListener */
public interface TTImageXUploaderListener {
    static {
        Covode.recordClassIndex(101480);
    }

    void onNotify(int i, long j, TTImageXInfo tTImageXInfo);
}
