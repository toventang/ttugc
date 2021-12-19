package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: com.tencent.wcdb.database.c */
public abstract class AbstractC87245c implements Closeable {

    /* renamed from: a */
    private int f197663a = 1;

    static {
        Covode.recordClassIndex(103134);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo141108c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo141229e();
    }

    /* renamed from: d */
    public final void mo141228d() {
        synchronized (this) {
            int i = this.f197663a;
            if (i > 0) {
                this.f197663a = i + 1;
            } else {
                throw new IllegalStateException("attempt to re-open an already-closed object: ".concat(String.valueOf(this)));
            }
        }
    }

    /* renamed from: e */
    public final void mo141229e() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.f197663a - 1;
            this.f197663a = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            mo141108c();
        }
    }
}
