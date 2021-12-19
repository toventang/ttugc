package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89657t;
import p4600h.p4603c.AbstractC89124d;

/* renamed from: kotlinx.coroutines.da */
public final class RunnableC89607da<U, T extends U> extends C89657t<T> implements Runnable {

    /* renamed from: b */
    public final long f203334b = 3000;

    static {
        Covode.recordClassIndex(105698);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.AbstractC89458a
    /* renamed from: h */
    public final String mo144005h() {
        return super.mo144005h() + "(timeMillis=" + this.f203334b + ')';
    }

    public final void run() {
        mo144000d((Throwable) new C89604cz("Timed out waiting for " + this.f203334b + " ms", this));
    }

    public RunnableC89607da(AbstractC89124d<? super U> dVar) {
        super(dVar.getContext(), dVar);
    }
}
