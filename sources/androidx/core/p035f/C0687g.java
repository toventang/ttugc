package androidx.core.p035f;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: androidx.core.f.g */
public final class C0687g {

    /* renamed from: a */
    private static final Locale f2747a = new Locale("", "");

    static {
        Covode.recordClassIndex(766);
    }

    /* renamed from: a */
    public static int m2442a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    /* renamed from: b */
    private static int m2443b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality == 1 || directionality == 2) {
            return 1;
        }
        return 0;
    }
}
