package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89534ax;
import kotlinx.coroutines.AbstractC89548bh;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.AbstractC89671m;
import p4600h.p4603c.AbstractC89127f;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.q */
public final class C89654q extends AbstractC89587ci implements AbstractC89534ax {

    /* renamed from: a */
    private final Throwable f203403a;

    /* renamed from: c */
    private final String f203404c;

    static {
        Covode.recordClassIndex(105747);
    }

    /* renamed from: a */
    private final Void m155620a() {
        String str;
        if (this.f203403a != null) {
            StringBuilder sb = new StringBuilder("Module with the Main dispatcher had failed to initialize");
            String str2 = this.f203404c;
            if (str2 == null || (str = ". ".concat(String.valueOf(str2))) == null) {
                str = "";
            }
            throw new IllegalStateException(sb.append((Object) str).toString(), this.f203403a);
        }
        C89653p.m155616a();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Main[missing");
        if (this.f203403a != null) {
            str = ", cause=" + this.f203403a;
        } else {
            str = "";
        }
        return sb.append(str).append(']').toString();
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final boolean isDispatchNeeded(AbstractC89127f fVar) {
        m155620a();
        throw null;
    }

    public C89654q(Throwable th, String str) {
        this.f203403a = th;
        this.f203404c = str;
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final /* synthetic */ void dispatch(AbstractC89127f fVar, Runnable runnable) {
        m155620a();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public final AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        m155620a();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public final /* synthetic */ void scheduleResumeAfterDelay(long j, AbstractC89671m mVar) {
        m155620a();
        throw null;
    }
}
