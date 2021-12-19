package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.db */
public final class C89608db extends AbstractC89507ah {

    /* renamed from: a */
    public static final C89608db f203335a = new C89608db();

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final boolean isDispatchNeeded(AbstractC89127f fVar) {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        return "Unconfined";
    }

    private C89608db() {
    }

    static {
        Covode.recordClassIndex(105699);
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        C89610dd ddVar = (C89610dd) fVar.get(C89610dd.f203336b);
        if (ddVar != null) {
            ddVar.f203337a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
