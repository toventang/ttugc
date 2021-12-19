package androidx.p060l;

import android.view.View;
import android.view.WindowId;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.am */
final class C1095am implements AbstractC1096an {

    /* renamed from: a */
    private final WindowId f3760a;

    static {
        Covode.recordClassIndex(1188);
    }

    public final int hashCode() {
        return this.f3760a.hashCode();
    }

    C1095am(View view) {
        this.f3760a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1095am) || !((C1095am) obj).f3760a.equals(this.f3760a)) {
            return false;
        }
        return true;
    }
}
