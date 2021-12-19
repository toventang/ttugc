package androidx.p060l;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.al */
final class C1094al implements AbstractC1096an {

    /* renamed from: a */
    private final IBinder f3759a;

    static {
        Covode.recordClassIndex(1187);
    }

    public final int hashCode() {
        return this.f3759a.hashCode();
    }

    C1094al(IBinder iBinder) {
        this.f3759a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1094al) || !((C1094al) obj).f3759a.equals(this.f3759a)) {
            return false;
        }
        return true;
    }
}
