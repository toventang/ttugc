package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;

/* renamed from: com.tencent.wcdb.e */
public final class C87263e extends IndexOutOfBoundsException {
    static {
        Covode.recordClassIndex(103152);
    }

    public C87263e(String str) {
        super(str);
    }

    public C87263e(int i, int i2) {
        super("Index " + i + " requested, with a size of " + i2);
    }
}
