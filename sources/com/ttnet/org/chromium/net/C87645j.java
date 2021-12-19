package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.ttnet.org.chromium.net.j */
public final class C87645j extends RejectedExecutionException {
    static {
        Covode.recordClassIndex(103627);
    }

    public C87645j() {
        super("Inline execution is prohibited for this request");
    }
}
