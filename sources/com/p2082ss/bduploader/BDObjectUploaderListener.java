package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDObjectUploaderListener */
public interface BDObjectUploaderListener {
    static {
        Covode.recordClassIndex(100797);
    }

    int objectUploadCheckNetState(int i, int i2);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDObjectInfo bDObjectInfo);
}
