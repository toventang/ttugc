package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.b.ax */
public abstract class AbstractC26906ax implements Closeable {
    static {
        Covode.recordClassIndex(32381);
    }

    /* renamed from: a */
    public abstract long mo44462a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo44463a(long j, long j2);

    /* renamed from: b */
    public final synchronized InputStream mo44592b() {
        return mo44463a(0, mo44462a());
    }
}
