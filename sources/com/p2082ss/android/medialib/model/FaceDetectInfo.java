package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.FaceDetectInfo */
public class FaceDetectInfo {
    FaceDetect[] info;

    static {
        Covode.recordClassIndex(36486);
    }

    public FaceDetect[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceDetect[] faceDetectArr) {
        this.info = faceDetectArr;
    }
}
