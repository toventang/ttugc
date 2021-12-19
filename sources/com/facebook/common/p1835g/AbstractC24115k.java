package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.g.k */
public abstract class AbstractC24115k extends OutputStream {
    static {
        Covode.recordClassIndex(28243);
    }

    /* renamed from: a */
    public abstract AbstractC24111h mo39691a();

    /* renamed from: b */
    public abstract int mo39692b();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C24098m.m45632b(e);
        }
    }
}
