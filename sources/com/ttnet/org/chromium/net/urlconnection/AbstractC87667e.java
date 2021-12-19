package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ttnet.org.chromium.net.urlconnection.e */
public abstract class AbstractC87667e extends OutputStream {

    /* renamed from: a */
    private IOException f199156a;

    /* renamed from: b */
    private boolean f199157b;

    /* renamed from: c */
    private boolean f199158c;

    static {
        Covode.recordClassIndex(103650);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo142072a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo142073b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC87678z mo142074c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f199157b = true;
    }

    AbstractC87667e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo142088e() {
        IOException iOException = this.f199156a;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo142087d() {
        if (this.f199158c) {
            mo142088e();
            throw new IOException("Writing after request completed.");
        } else if (this.f199157b) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo142086a(IOException iOException) {
        this.f199156a = iOException;
        this.f199158c = true;
    }
}
