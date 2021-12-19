package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.g */
public final class C14624g extends IOException {
    private static final long serialVersionUID = -210264743726619965L;

    static {
        Covode.recordClassIndex(16715);
    }

    public C14624g() {
    }

    public C14624g(String str) {
        super(str);
    }

    public C14624g(Throwable th) {
        initCause(th);
    }

    public C14624g(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
