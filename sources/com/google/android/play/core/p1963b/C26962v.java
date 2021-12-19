package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.v */
public final class C26962v implements AbstractC26904av {

    /* renamed from: a */
    private final ByteBuffer f63849a;

    static {
        Covode.recordClassIndex(32437);
    }

    public C26962v(ByteBuffer byteBuffer) {
        this.f63849a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26904av
    /* renamed from: a */
    public final long mo44590a() {
        return (long) this.f63849a.capacity();
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26904av
    /* renamed from: a */
    public final void mo44591a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        MethodCollector.m26663i(10872);
        synchronized (this.f63849a) {
            try {
                int i2 = (int) j;
                this.f63849a.position(i2);
                this.f63849a.limit(i2 + i);
                slice = this.f63849a.slice();
            } finally {
                MethodCollector.m26664o(10872);
            }
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
