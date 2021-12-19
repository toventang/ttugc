package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.liveevent.d */
public enum EnumC58802d {
    Failed(0),
    Success(1),
    ArgumentError(10001),
    NoPermission(10003),
    AlreadyExists(10004);
    

    /* renamed from: b */
    private final int f133831b;

    public final int getValue() {
        return this.f133831b;
    }

    static {
        Covode.recordClassIndex(69112);
    }

    private EnumC58802d(int i) {
        this.f133831b = i;
    }
}
