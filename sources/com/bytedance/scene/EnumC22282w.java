package com.bytedance.scene;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.w */
public enum EnumC22282w {
    NONE(0, "NONE"),
    VIEW_CREATED(1, "VIEW_CREATED"),
    ACTIVITY_CREATED(2, "ACTIVITY_CREATED"),
    STARTED(3, "STARTED"),
    RESUMED(4, "RESUMED");
    
    public final String name;
    public final int value;

    public final String getName() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(26098);
    }

    private EnumC22282w(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
