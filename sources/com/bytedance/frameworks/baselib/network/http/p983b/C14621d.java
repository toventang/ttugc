package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.d */
public final class C14621d extends IOException {
    private static final long serialVersionUID = -7281385706782665299L;

    static {
        Covode.recordClassIndex(16712);
    }

    public C14621d() {
    }

    public C14621d(String str) {
        super(str);
    }

    public C14621d(Throwable th) {
        initCause(th);
    }

    public C14621d(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
