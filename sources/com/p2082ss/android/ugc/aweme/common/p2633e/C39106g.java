package com.p2082ss.android.ugc.aweme.common.p2633e;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.e.g */
public final class C39106g extends RuntimeException {
    public final int insertPosition;
    public final int listSize;

    static {
        Covode.recordClassIndex(46722);
    }

    public C39106g(int i, int i2) {
        super("decide to insert position:" + i + ",but listSize limit:" + i2 + ".");
        this.insertPosition = i;
        this.listSize = i2;
    }
}
