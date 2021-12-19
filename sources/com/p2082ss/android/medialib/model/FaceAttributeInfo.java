package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.FaceAttributeInfo */
public class FaceAttributeInfo {
    FaceAttribute[] info;

    static {
        Covode.recordClassIndex(36482);
    }

    public FaceAttribute[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceAttribute[] faceAttributeArr) {
        this.info = faceAttributeArr;
    }
}
