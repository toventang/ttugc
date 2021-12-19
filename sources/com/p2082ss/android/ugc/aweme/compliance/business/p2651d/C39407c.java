package com.p2082ss.android.ugc.aweme.compliance.business.p2651d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.C89420f;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.d.c */
public final class C39407c extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C39406b f93012a;

    static {
        Covode.recordClassIndex(47094);
    }

    public final void reset() {
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f93012a.mo68869a((long) this.count);
    }

    /* renamed from: a */
    public final synchronized boolean mo68872a() {
        MethodCollector.m26663i(10433);
        boolean z = false;
        try {
            C89420f fVar = new C89420f();
            int i = 64;
            if (this.buf.length < 64) {
                i = this.buf.length;
            }
            byte[] bArr = this.buf;
            C89219l.m154716b(bArr, "");
            fVar.mo68852a(bArr, 0, i);
            int i2 = 0;
            while (!fVar.mo143815e()) {
                int t = fVar.mo143851t();
                if (!Character.isISOControl(t) || Character.isWhitespace(t)) {
                    i2++;
                    if (i2 >= 16) {
                        break;
                    }
                } else {
                    MethodCollector.m26664o(10433);
                    return false;
                }
            }
            z = true;
        } catch (EOFException unused) {
        }
        MethodCollector.m26664o(10433);
        return z;
    }

    public C39407c(C39406b bVar) {
        C89219l.m154721d(bVar, "");
        MethodCollector.m26663i(10598);
        this.f93012a = bVar;
        MethodCollector.m26664o(10598);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final void write(int i) {
        MethodCollector.m26663i(9948);
        long b = this.f93012a.mo68870b(1);
        synchronized (this) {
            if (b > 0) {
                try {
                    super.write(i);
                } catch (Throwable th) {
                    MethodCollector.m26664o(9948);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(9948);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(10281);
        long b = this.f93012a.mo68870b((long) i2);
        synchronized (this) {
            if (b > 0) {
                try {
                    super.write(bArr, i, (int) b);
                } catch (Throwable th) {
                    MethodCollector.m26664o(10281);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(10281);
    }
}
