package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.p034e.C0657b;
import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.e */
public final class C0715e {

    /* renamed from: a */
    public static final C0721k f2807a;

    /* renamed from: b */
    public static final C0490e<String, Typeface> f2808b = new C0490e<>(16);

    static {
        Covode.recordClassIndex(796);
        if (Build.VERSION.SDK_INT >= 29) {
            f2807a = new C0720j();
        } else if (Build.VERSION.SDK_INT >= 28) {
            f2807a = new C0719i();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2807a = new C0718h();
        } else if (Build.VERSION.SDK_INT >= 24 && C0717g.f2814a != null) {
            f2807a = new C0717g();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f2807a = new C0716f();
        } else {
            f2807a = new C0721k();
        }
    }

    /* renamed from: a */
    public static Typeface m2526a(Context context, C0657b.C0663b[] bVarArr, int i) {
        return f2807a.mo2796a(context, (CancellationSignal) null, bVarArr, i);
    }

    /* renamed from: a */
    public static String m2527a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: a */
    public static Typeface m2525a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f2807a.mo2798a(context, resources, i, str, i2);
        if (a != null) {
            f2808b.mo2092a(m2527a(resources, i, i2), a);
        }
        return a;
    }
}
