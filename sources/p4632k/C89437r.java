package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: k.r */
public final class C89437r implements AbstractC89447y {

    /* renamed from: a */
    private final OutputStream f203120a;

    /* renamed from: b */
    private final C89409ab f203121b;

    static {
        Covode.recordClassIndex(105521);
    }

    @Override // p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return this.f203121b;
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f203120a.close();
    }

    @Override // p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
        this.f203120a.flush();
    }

    public final String toString() {
        return "sink(" + this.f203120a + ')';
    }

    public C89437r(OutputStream outputStream, C89409ab abVar) {
        C89219l.m154719c(outputStream, "");
        C89219l.m154719c(abVar, "");
        this.f203120a = outputStream;
        this.f203121b = abVar;
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        long j2 = j;
        MethodCollector.m26663i(5216);
        C89219l.m154719c(fVar, "");
        C89413c.m155000a(fVar.f203091b, 0, j2);
        while (j2 > 0) {
            this.f203121b.mo143786f();
            C89443v vVar = fVar.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int min = (int) Math.min(j2, (long) (vVar.f203133c - vVar.f203132b));
            this.f203120a.write(vVar.f203131a, vVar.f203132b, min);
            vVar.f203132b += min;
            long j3 = (long) min;
            j2 -= j3;
            fVar.f203091b -= j3;
            if (vVar.f203132b == vVar.f203133c) {
                fVar.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            }
        }
        MethodCollector.m26664o(5216);
    }
}
