package androidx.core.p035f;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.f.b */
public final class C0674b {
    static {
        Covode.recordClassIndex(753);
    }

    /* renamed from: a */
    public static Spanned m2427a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
