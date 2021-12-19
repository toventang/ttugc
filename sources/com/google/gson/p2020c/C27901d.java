package com.google.gson.p2020c;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.google.gson.c.d */
public final class C27901d extends IOException {
    private static final long serialVersionUID = 1;

    static {
        Covode.recordClassIndex(33495);
    }

    public C27901d(String str) {
        super(str);
    }

    public C27901d(Throwable th) {
        initCause(th);
    }

    public C27901d(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
