package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDImageUploaderListener */
public interface BDImageUploaderListener {
    static {
        Covode.recordClassIndex(100780);
    }

    int imageUploadCheckNetState(int i, int i2);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDImageInfo bDImageInfo);
}
