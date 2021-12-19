package okhttp3.internal.p4653a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import p4632k.AbstractC89430k;
import p4632k.AbstractC89447y;
import p4632k.C89420f;

/* renamed from: okhttp3.internal.a.e */
class C90071e extends AbstractC89430k {

    /* renamed from: a */
    private boolean f204394a;

    static {
        Covode.recordClassIndex(106243);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo144805a() {
    }

    @Override // p4632k.AbstractC89447y, java.io.Closeable, p4632k.AbstractC89430k, java.lang.AutoCloseable
    public void close() {
        if (!this.f204394a) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f204394a = true;
                mo144805a();
            }
        }
    }

    @Override // p4632k.AbstractC89447y, p4632k.AbstractC89430k, java.io.Flushable
    public void flush() {
        if (!this.f204394a) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f204394a = true;
                mo144805a();
            }
        }
    }

    C90071e(AbstractC89447y yVar) {
        super(yVar);
    }

    @Override // p4632k.AbstractC89447y, p4632k.AbstractC89430k
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        if (this.f204394a) {
            fVar.mo143838l(j);
            return;
        }
        try {
            super.mo22060a(fVar, j);
        } catch (IOException unused) {
            this.f204394a = true;
            mo144805a();
        }
    }
}
