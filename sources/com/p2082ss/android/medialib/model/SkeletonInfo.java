package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.SkeletonInfo */
public class SkeletonInfo {
    private Skeleton[] info;

    static {
        Covode.recordClassIndex(36492);
    }

    public Skeleton[] getInfo() {
        return this.info;
    }

    public void setInfo(Skeleton[] skeletonArr) {
        this.info = skeletonArr;
    }
}
