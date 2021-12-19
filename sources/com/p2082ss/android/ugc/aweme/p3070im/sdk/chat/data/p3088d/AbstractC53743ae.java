package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ae */
public abstract class AbstractC53743ae implements AbstractC88412b {

    /* renamed from: a */
    private final AtomicBoolean f123276a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(63323);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo90324a();

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public boolean isDisposed() {
        return this.f123276a.get();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public void dispose() {
        if (this.f123276a.compareAndSet(false, true)) {
            mo90324a();
        }
    }
}
