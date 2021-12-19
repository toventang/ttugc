package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDVideoUploaderListener */
public interface BDVideoUploaderListener {
    static {
        Covode.recordClassIndex(100808);
    }

    String getStringFromExtern(int i);

    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, BDVideoInfo bDVideoInfo);

    void onUploadVideoStage(int i, long j);

    int videoUploadCheckNetState(int i, int i2);
}
