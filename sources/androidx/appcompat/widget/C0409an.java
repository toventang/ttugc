package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.an */
public final class C0409an {
    static {
        Covode.recordClassIndex(474);
    }

    /* renamed from: a */
    public static void m1520a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnAttachStateChangeListenerC0410ao.m1522a(view, charSequence);
        }
    }
}
