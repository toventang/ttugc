package androidx.appcompat.p017a.p018a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0428h;
import androidx.core.content.C0643b;
import androidx.core.content.p032a.C0627a;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.a.a.a */
public final class C0196a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f514a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0197a>> f515b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f516c = new Object();

    static {
        Covode.recordClassIndex(226);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.a.a.a$a */
    public static class C0197a {

        /* renamed from: a */
        final ColorStateList f517a;

        /* renamed from: b */
        final Configuration f518b;

        static {
            Covode.recordClassIndex(227);
        }

        C0197a(ColorStateList colorStateList, Configuration configuration) {
            this.f517a = colorStateList;
            this.f518b = configuration;
        }
    }

    /* renamed from: b */
    public static Drawable m619b(Context context, int i) {
        return C0428h.m1581a().mo1926a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m620c(Context context, int i) {
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f514a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0627a.m2328a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static ColorStateList m621d(Context context, int i) {
        C0197a aVar;
        synchronized (f516c) {
            SparseArray<C0197a> sparseArray = f515b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.f518b.equals(context.getResources().getConfiguration())) {
                    return aVar.f517a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static ColorStateList m618a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m621d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m620c(context, i);
        if (c == null) {
            return C0643b.m2374b(context, i);
        }
        synchronized (f516c) {
            WeakHashMap<Context, SparseArray<C0197a>> weakHashMap = f515b;
            SparseArray<C0197a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0197a(c, context.getResources().getConfiguration()));
        }
        return c;
    }
}
