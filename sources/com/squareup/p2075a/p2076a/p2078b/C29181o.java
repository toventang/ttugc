package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.p2076a.C29206j;
import java.net.ProtocolException;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;

/* renamed from: com.squareup.a.a.b.o */
public final class C29181o implements AbstractC89447y {

    /* renamed from: a */
    public final C89420f f69099a;

    /* renamed from: b */
    private boolean f69100b;

    /* renamed from: c */
    private final int f69101c;

    static {
        Covode.recordClassIndex(35530);
    }

    @Override // p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
    }

    @Override // p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return C89409ab.f203072h;
    }

    public C29181o() {
        this(-1);
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f69100b) {
            this.f69100b = true;
            if (this.f69099a.f203091b < ((long) this.f69101c)) {
                throw new ProtocolException("content-length promised " + this.f69101c + " bytes, but received " + this.f69099a.f203091b);
            }
        }
    }

    public C29181o(int i) {
        this.f69099a = new C89420f();
        this.f69101c = i;
    }

    /* renamed from: a */
    public final void mo50883a(AbstractC89447y yVar) {
        C89420f fVar = new C89420f();
        C89420f fVar2 = this.f69099a;
        fVar2.mo143803a(fVar, 0, fVar2.f203091b);
        yVar.mo22060a(fVar, fVar.f203091b);
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        if (!this.f69100b) {
            C29206j.m58437a(fVar.f203091b, j);
            if (this.f69101c == -1 || this.f69099a.f203091b <= ((long) this.f69101c) - j) {
                this.f69099a.mo22060a(fVar, j);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f69101c + " bytes");
        }
        throw new IllegalStateException("closed");
    }
}
