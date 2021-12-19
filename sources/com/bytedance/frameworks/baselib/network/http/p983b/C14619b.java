package com.bytedance.frameworks.baselib.network.http.p983b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.b */
public class C14619b extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    static {
        Covode.recordClassIndex(16710);
    }

    public C14619b() {
    }

    public C14619b(String str) {
        super(str);
    }

    public C14619b(Throwable th) {
        initCause(th);
    }

    public C14619b(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
