package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89568bz;
import p4600h.C89388w;

/* renamed from: kotlinx.coroutines.ce */
public abstract class AbstractC89583ce<J extends AbstractC89568bz> extends AbstractC89503ad implements AbstractC89548bh, AbstractC89563bu {

    /* renamed from: c */
    public final J f203312c;

    static {
        Covode.recordClassIndex(105674);
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public C89588cj getList() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89548bh
    public final void cQ_() {
        Object p;
        J j = this.f203312c;
        if (j != null) {
            JobSupport jobSupport = (JobSupport) j;
            do {
                p = jobSupport.mo144012p();
                if (p instanceof AbstractC89583ce) {
                    if (p != this) {
                        return;
                    }
                } else if ((p instanceof AbstractC89563bu) && ((AbstractC89563bu) p).getList() != null) {
                    cR_();
                    return;
                } else {
                    return;
                }
            } while (!JobSupport.f203154d.compareAndSet(jobSupport, p, C89584cf.f203319g));
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public AbstractC89583ce(J j) {
        this.f203312c = j;
    }
}
