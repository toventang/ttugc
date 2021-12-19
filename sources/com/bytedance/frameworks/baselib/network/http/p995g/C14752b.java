package com.bytedance.frameworks.baselib.network.http.p995g;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.b */
public final class C14752b extends IOException {
    private static final long serialVersionUID = -1098012010869697449L;

    /* renamed from: a */
    final int f35956a;

    /* renamed from: b */
    final long f35957b;

    static {
        Covode.recordClassIndex(16849);
    }

    public final long getLength() {
        return this.f35957b;
    }

    public final int getMaxSize() {
        return this.f35956a;
    }

    public C14752b(int i, long j) {
        super("Download file too large: " + j + " exceed maxsize: " + i);
        this.f35956a = i;
        this.f35957b = j;
    }
}
