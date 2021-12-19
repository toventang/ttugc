package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.p032a.C0629c;
import androidx.core.p034e.C0657b;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.h */
public class C0718h extends C0716f {

    /* renamed from: a */
    protected final Class<?> f2818a;

    /* renamed from: b */
    protected final Constructor<?> f2819b;

    /* renamed from: c */
    protected final Method f2820c;

    /* renamed from: d */
    protected final Method f2821d;

    /* renamed from: e */
    protected final Method f2822e;

    /* renamed from: f */
    protected final Method f2823f;

    /* renamed from: g */
    protected final Method f2824g;

    static {
        Covode.recordClassIndex(799);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo2800a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: a */
    private boolean m2541a() {
        if (this.f2820c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Object m2544b() {
        try {
            return this.f2819b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    public C0718h() {
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            Method method6 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method3 = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = mo2800a(cls2);
            cls = cls2;
            method = method6;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method5 = cls;
            method4 = method5;
            constructor = method4;
            Constructor<?> constructor2 = constructor;
            method2 = constructor2;
            method3 = method2;
            method = constructor2;
        }
        this.f2818a = cls;
        this.f2819b = constructor;
        this.f2820c = method;
        this.f2821d = method2;
        this.f2822e = method3;
        this.f2823f = method4;
        this.f2824g = method5;
    }

    /* renamed from: c */
    private void m2546c(Object obj) {
        try {
            this.f2823f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: b */
    private boolean m2545b(Object obj) {
        try {
            return ((Boolean) this.f2822e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2799a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2818a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2824g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0716f, androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2796a(Context context, CancellationSignal cancellationSignal, C0657b.C0663b[] bVarArr, int i) {
        Typeface a;
        if (bVarArr.length <= 0) {
            return null;
        }
        if (!m2541a()) {
            C0657b.C0663b a2 = mo2802a(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.f2674a, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.f2676c).setItalic(a2.f2677d).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a3 = C0657b.m2399a(context, bVarArr, (CancellationSignal) null);
            Object b = m2544b();
            if (b == null) {
                return null;
            }
            boolean z = false;
            for (C0657b.C0663b bVar : bVarArr) {
                ByteBuffer byteBuffer = a3.get(bVar.f2674a);
                if (byteBuffer != null) {
                    if (!m2543a(b, byteBuffer, bVar.f2675b, bVar.f2676c, bVar.f2677d ? 1 : 0)) {
                        m2546c(b);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m2546c(b);
                return null;
            } else if (m2545b(b) && (a = mo2799a(b)) != null) {
                return Typeface.create(a, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // androidx.core.graphics.C0716f, androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2797a(Context context, C0629c.C0631b bVar, Resources resources, int i) {
        if (!m2541a()) {
            return super.mo2797a(context, bVar, resources, i);
        }
        Object b = m2544b();
        if (b == null) {
            return null;
        }
        C0629c.C0632c[] cVarArr = bVar.f2625a;
        for (C0629c.C0632c cVar : cVarArr) {
            if (!m2542a(context, b, cVar.f2626a, cVar.f2630e, cVar.f2627b, cVar.f2628c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2629d))) {
                m2546c(b);
                return null;
            }
        }
        if (!m2545b(b)) {
            return null;
        }
        return mo2799a(b);
    }

    /* renamed from: a */
    private boolean m2543a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2821d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2798a(Context context, Resources resources, int i, String str, int i2) {
        if (!m2541a()) {
            return super.mo2798a(context, resources, i, str, i2);
        }
        Object b = m2544b();
        if (b == null) {
            return null;
        }
        if (!m2542a(context, b, str, 0, -1, -1, null)) {
            m2546c(b);
            return null;
        } else if (!m2545b(b)) {
            return null;
        } else {
            return mo2799a(b);
        }
    }

    /* renamed from: a */
    private boolean m2542a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2820c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
