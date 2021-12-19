package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.b.ay */
public final class C26907ay extends AbstractC26906ax {

    /* renamed from: a */
    private final AbstractC26906ax f63792a;

    /* renamed from: b */
    private final long f63793b;

    /* renamed from: c */
    private final long f63794c;

    static {
        Covode.recordClassIndex(32382);
    }

    public C26907ay(AbstractC26906ax axVar, long j, long j2) {
        this.f63792a = axVar;
        long a = m53451a(j);
        this.f63793b = a;
        this.f63794c = m53451a(a + j2);
    }

    /* renamed from: a */
    private final long m53451a(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f63792a.mo44462a() ? this.f63792a.mo44462a() : j;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26906ax
    /* renamed from: a */
    public final long mo44462a() {
        return this.f63794c - this.f63793b;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p1963b.AbstractC26906ax
    /* renamed from: a */
    public final InputStream mo44463a(long j, long j2) {
        long a = m53451a(this.f63793b);
        return this.f63792a.mo44463a(a, m53451a(j2 + a) - a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
