package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.EffectFileInfo */
public class EffectFileInfo {
    String path;
    int type;

    static {
        Covode.recordClassIndex(36477);
    }

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i, String str) {
        this.type = i;
        this.path = str;
    }
}
