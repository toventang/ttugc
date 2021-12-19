package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: k.p */
public final class C89435p implements AbstractC89408aa {

    /* renamed from: a */
    private final InputStream f203118a;

    /* renamed from: b */
    private final C89409ab f203119b;

    static {
        Covode.recordClassIndex(105519);
    }

    @Override // p4632k.AbstractC89408aa
    public final C89409ab timeout() {
        return this.f203119b;
    }

    @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f203118a.close();
    }

    public final String toString() {
        return "source(" + this.f203118a + ')';
    }

    public C89435p(InputStream inputStream, C89409ab abVar) {
        C89219l.m154719c(inputStream, "");
        C89219l.m154719c(abVar, "");
        this.f203118a = inputStream;
        this.f203119b = abVar;
    }

    @Override // p4632k.AbstractC89408aa
    public final long read(C89420f fVar, long j) {
        MethodCollector.m26663i(3583);
        C89219l.m154719c(fVar, "");
        if (j == 0) {
            MethodCollector.m26664o(3583);
            return 0;
        } else if (j >= 0) {
            try {
                this.f203119b.mo143786f();
                C89443v j2 = fVar.mo143834j(1);
                int read = this.f203118a.read(j2.f203131a, j2.f203133c, (int) Math.min(j, (long) (8192 - j2.f203133c)));
                if (read == -1) {
                    MethodCollector.m26664o(3583);
                    return -1;
                }
                j2.f203133c += read;
                long j3 = (long) read;
                fVar.f203091b += j3;
                MethodCollector.m26664o(3583);
                return j3;
            } catch (AssertionError e) {
                if (C89436q.m155165a(e)) {
                    IOException iOException = new IOException(e);
                    MethodCollector.m26664o(3583);
                    throw iOException;
                }
                MethodCollector.m26664o(3583);
                throw e;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
            MethodCollector.m26664o(3583);
            throw illegalArgumentException;
        }
    }
}
