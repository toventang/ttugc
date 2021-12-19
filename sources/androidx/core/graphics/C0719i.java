package androidx.core.graphics;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.i */
public final class C0719i extends C0718h {
    static {
        Covode.recordClassIndex(800);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0718h
    /* renamed from: a */
    public final Typeface mo2799a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2818a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2824g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0718h
    /* renamed from: a */
    public final Method mo2800a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
