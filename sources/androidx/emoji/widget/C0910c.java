package androidx.emoji.widget;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.emoji.widget.c */
public final class C0910c extends Editable.Factory {

    /* renamed from: a */
    private static final Object f3266a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f3267b;

    /* renamed from: c */
    private static Class<?> f3268c;

    static {
        Covode.recordClassIndex(998);
    }

    private C0910c() {
        try {
            f3268c = getClass().getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Editable.Factory m3118a() {
        if (f3267b == null) {
            synchronized (f3266a) {
                if (f3267b == null) {
                    f3267b = new C0910c();
                }
            }
        }
        return f3267b;
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f3268c;
        if (cls != null) {
            return new C0921j(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
