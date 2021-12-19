package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.bi */
public final class C89549bi extends AbstractC89669k {

    /* renamed from: a */
    private final AbstractC89548bh f203271a;

    static {
        Covode.recordClassIndex(105640);
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f203271a + ']';
    }

    public C89549bi(AbstractC89548bh bhVar) {
        this.f203271a = bhVar;
    }

    @Override // kotlinx.coroutines.AbstractC89670l
    /* renamed from: a */
    public final void mo144051a(Throwable th) {
        this.f203271a.cQ_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144051a(th);
        return C89391z.f203057a;
    }
}
