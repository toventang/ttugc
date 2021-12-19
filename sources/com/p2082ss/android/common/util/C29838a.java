package com.p2082ss.android.common.util;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.common.util.a */
public final class C29838a extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;

    /* renamed from: a */
    final int f71182a;

    /* renamed from: b */
    final long f71183b;

    static {
        Covode.recordClassIndex(36246);
    }

    public final long getLength() {
        return this.f71183b;
    }

    public final int getMaxSize() {
        return this.f71182a;
    }

    public C29838a(int i, long j) {
        super("Download file too large: " + i + " " + j);
        this.f71182a = i;
        this.f71183b = j;
    }
}
