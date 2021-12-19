package com.squareup.p2075a.p2076a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import p4632k.AbstractC89430k;
import p4632k.AbstractC89447y;
import p4632k.C89420f;

/* renamed from: com.squareup.a.a.c */
class C29186c extends AbstractC89430k {

    /* renamed from: a */
    private boolean f69123a;

    static {
        Covode.recordClassIndex(35535);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50846a() {
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, p4632k.AbstractC89430k, java.lang.AutoCloseable
    public void close() {
        if (!this.f69123a) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f69123a = true;
                mo50846a();
            }
        }
    }

    @Override // p4632k.AbstractC89447y, p4632k.AbstractC89430k, java.io.Flushable
    public void flush() {
        if (!this.f69123a) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f69123a = true;
                mo50846a();
            }
        }
    }

    public C29186c(AbstractC89447y yVar) {
        super(yVar);
    }

    @Override // p4632k.AbstractC89447y, p4632k.AbstractC89430k
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        if (this.f69123a) {
            fVar.mo143838l(j);
            return;
        }
        try {
            super.mo22060a(fVar, j);
        } catch (IOException unused) {
            this.f69123a = true;
            mo50846a();
        }
    }
}
