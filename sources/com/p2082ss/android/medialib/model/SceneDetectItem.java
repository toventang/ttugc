package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.SceneDetectItem */
public class SceneDetectItem {
    float prob;
    boolean satisfied;

    static {
        Covode.recordClassIndex(36489);
    }

    public float getProb() {
        return this.prob;
    }

    public boolean isSatisfied() {
        return this.satisfied;
    }

    public void setProb(float f) {
        this.prob = f;
    }

    public void setSatisfied(boolean z) {
        this.satisfied = z;
    }
}
