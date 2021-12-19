package com.p2082ss.android.vesdk.runtime.cloudconfig;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.Config */
public class Config<T> {
    public final T defaultValue;
    public final String key;
    public final int type;

    static {
        Covode.recordClassIndex(99729);
    }

    public Config(String str, int i, T t) {
        this.key = str;
        this.type = i;
        this.defaultValue = t;
    }
}
