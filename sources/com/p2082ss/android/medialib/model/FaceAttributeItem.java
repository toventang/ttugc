package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.FaceAttributeItem */
public class FaceAttributeItem {
    String category;
    float label;
    float score;

    static {
        Covode.recordClassIndex(36483);
    }

    public String getCategory() {
        return this.category;
    }

    public float getLabel() {
        return this.label;
    }

    public float getScore() {
        return this.score;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setLabel(float f) {
        this.label = f;
    }

    public void setScore(float f) {
        this.score = f;
    }
}
