package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.a */
public final class C14618a extends IOException {
    static {
        Covode.recordClassIndex(16709);
    }

    public C14618a() {
    }

    public C14618a(String str) {
        super(str);
    }

    public C14618a(Throwable th) {
        initCause(th);
    }

    public C14618a(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
