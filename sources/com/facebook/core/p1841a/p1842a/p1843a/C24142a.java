package com.facebook.core.p1841a.p1842a.p1843a;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.core.a.a.a.a */
public final class C24142a {

    /* renamed from: a */
    private static final String f57093a = C24142a.class.getSimpleName();

    /* renamed from: b */
    private boolean f57094b;

    /* renamed from: c */
    private Object f57095c;

    /* renamed from: d */
    private Field f57096d;

    /* renamed from: e */
    private Field f57097e;

    static {
        Covode.recordClassIndex(28273);
    }

    /* renamed from: a */
    public final List<C24143a> mo39731a() {
        if (!this.f57094b) {
            this.f57094b = true;
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                this.f57095c = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.f57096d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.f57097e = declaredField2;
                declaredField2.setAccessible(true);
            } catch (InvocationTargetException e) {
                C1764a.m5928a("could not invoke: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"});
                e.getCause();
            } catch (ClassNotFoundException unused) {
                C1764a.m5928a("could not find class: %s", new Object[]{"android.view.WindowManagerGlobal"});
            } catch (NoSuchFieldException unused2) {
                C1764a.m5928a("could not find field: %s or %s on %s", new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"});
            } catch (NoSuchMethodException unused3) {
                C1764a.m5928a("could not find method: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"});
            } catch (RuntimeException unused4) {
                C1764a.m5928a("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"});
            } catch (IllegalAccessException unused5) {
                C1764a.m5928a("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"});
            }
        }
        if (this.f57095c == null || this.f57096d == null || this.f57097e == null) {
            return null;
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            List list = (List) this.f57096d.get(this.f57095c);
            List list2 = (List) this.f57097e.get(this.f57095c);
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new C24143a((View) list.get(i4), (WindowManager.LayoutParams) list2.get(i4), (byte) 0));
            }
            return arrayList;
        } catch (RuntimeException unused6) {
            C1764a.m5928a("Reflective access to %s or %s on %s failed.", new Object[]{this.f57096d, this.f57097e, this.f57095c});
            return null;
        } catch (IllegalAccessException unused7) {
            C1764a.m5928a("Reflective access to %s or %s on %s failed.", new Object[]{this.f57096d, this.f57097e, this.f57095c});
            return null;
        }
    }

    /* renamed from: com.facebook.core.a.a.a.a$a */
    public static class C24143a {

        /* renamed from: a */
        public final View f57098a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f57099b;

        static {
            Covode.recordClassIndex(28274);
        }

        private C24143a(View view, WindowManager.LayoutParams layoutParams) {
            this.f57098a = view;
            this.f57099b = layoutParams;
        }

        /* synthetic */ C24143a(View view, WindowManager.LayoutParams layoutParams, byte b) {
            this(view, layoutParams);
        }
    }
}
