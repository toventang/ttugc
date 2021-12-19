package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.p032a.C0629c;
import androidx.core.p034e.C0657b;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.g */
final class C0717g extends C0721k {

    /* renamed from: a */
    static final Method f2814a;

    /* renamed from: b */
    private static final Class<?> f2815b;

    /* renamed from: c */
    private static final Constructor<?> f2816c;

    /* renamed from: d */
    private static final Method f2817d;

    C0717g() {
    }

    /* renamed from: a */
    private static Object m2537a() {
        try {
            return f2816c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Class<?> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls;
        Method method;
        Method method2;
        Covode.recordClassIndex(798);
        Constructor<?> constructor = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            method = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            Constructor<?> constructor3 = constructor;
            method2 = constructor3;
            method = method2;
            cls = constructor3;
        }
        f2816c = constructor;
        f2815b = cls;
        f2814a = method;
        f2817d = method2;
    }

    /* renamed from: a */
    private static Typeface m2536a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2815b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2817d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2796a(Context context, CancellationSignal cancellationSignal, C0657b.C0663b[] bVarArr, int i) {
        Object a = m2537a();
        if (a == null) {
            return null;
        }
        C0497g gVar = new C0497g();
        for (C0657b.C0663b bVar : bVarArr) {
            Uri uri = bVar.f2674a;
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0725l.m2576a(context, (CancellationSignal) null, uri);
                gVar.put(uri, byteBuffer);
                if (byteBuffer == null) {
                    return null;
                }
            }
            if (!m2538a(a, byteBuffer, bVar.f2675b, bVar.f2676c, bVar.f2677d)) {
                return null;
            }
        }
        Typeface a2 = m2536a(a);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2797a(Context context, C0629c.C0631b bVar, Resources resources, int i) {
        Object a = m2537a();
        if (a == null) {
            return null;
        }
        C0629c.C0632c[] cVarArr = bVar.f2625a;
        for (C0629c.C0632c cVar : cVarArr) {
            ByteBuffer a2 = C0725l.m2575a(context, resources, cVar.f2631f);
            if (a2 == null || !m2538a(a, a2, cVar.f2630e, cVar.f2627b, cVar.f2628c)) {
                return null;
            }
        }
        return m2536a(a);
    }

    /* renamed from: a */
    private static boolean m2538a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2814a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
