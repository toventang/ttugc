package androidx.core.p037h;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.s */
public final class C0789s {

    /* renamed from: a */
    public Object f2947a;

    static {
        Covode.recordClassIndex(870);
    }

    private C0789s(Object obj) {
        this.f2947a = obj;
    }

    /* renamed from: a */
    public static C0789s m2732a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0789s(PointerIcon.getSystemIcon(context, 1002));
        }
        return new C0789s(null);
    }
}
