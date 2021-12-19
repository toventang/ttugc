package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.f */
public final class C14623f extends IOException {
    private static final long serialVersionUID = -5588326043064908201L;

    static {
        Covode.recordClassIndex(16714);
    }

    public C14623f() {
    }

    public C14623f(String str) {
        super(str);
    }

    public C14623f(Throwable th) {
        initCause(th);
    }

    public C14623f(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
