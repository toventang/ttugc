package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.g.e */
final class C25744e extends OutputStream {
    static {
        Covode.recordClassIndex(31159);
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    C25744e() {
        MethodCollector.m26663i(13292);
        MethodCollector.m26664o(13292);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C25743d.m49692a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C25743d.m49692a(bArr);
    }
}
