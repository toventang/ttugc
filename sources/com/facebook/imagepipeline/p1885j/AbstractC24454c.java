package com.facebook.imagepipeline.p1885j;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.j.c */
public abstract class AbstractC24454c implements AbstractC24457f, Closeable {
    static {
        Covode.recordClassIndex(28597);
    }

    /* renamed from: a */
    public abstract boolean mo40289a();

    /* renamed from: b */
    public abstract int mo40290b();

    /* renamed from: c */
    public boolean mo40291c() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* renamed from: e */
    public AbstractC24459h mo40297e() {
        return C24458g.f58105a;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!mo40289a()) {
            String simpleName = getClass().getSimpleName();
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            if (C24099a.f57025a.mo39656b(3)) {
                C24099a.f57025a.mo39654b("CloseableImage", C1764a.m5929a(null, "finalize: %s %x still open.", new Object[]{simpleName, valueOf}));
            }
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
