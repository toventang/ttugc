package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDImageXUploaderListener */
public interface BDImageXUploaderListener {
    static {
        Covode.recordClassIndex(100784);
    }

    int imageXUploadCheckNetState(int i, int i2);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDImageXInfo bDImageXInfo);
}
