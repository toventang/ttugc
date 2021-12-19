package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.toutiao.proxyserver.z */
public final class C87407z extends IOException {
    public int errorCode;

    static {
        Covode.recordClassIndex(103304);
    }

    public C87407z(String str) {
        super(str);
        this.errorCode = 1;
    }

    public C87407z(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
