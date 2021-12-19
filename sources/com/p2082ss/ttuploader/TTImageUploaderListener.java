package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTImageUploaderListener */
public interface TTImageUploaderListener {
    static {
        Covode.recordClassIndex(101476);
    }

    void onNotify(int i, long j, TTImageInfo tTImageInfo);
}
