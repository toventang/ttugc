package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.InputStream;
import p4632k.AbstractC89426h;

/* renamed from: com.squareup.a.y */
public abstract class AbstractC29251y implements Closeable {
    static {
        Covode.recordClassIndex(35600);
    }

    /* renamed from: a */
    public abstract long mo50878a();

    /* renamed from: b */
    public abstract AbstractC89426h mo50879b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo50879b().close();
    }

    /* renamed from: c */
    public final InputStream mo51042c() {
        return mo50879b().mo143819f();
    }
}
