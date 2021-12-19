package com.bytedance.scene.p1623e;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.scene.p1622d.C22171k;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.scene.e.d */
public class C22179d extends ContextWrapper {

    /* renamed from: a */
    private Resources.Theme f52422a;

    /* renamed from: b */
    public int f52423b;

    /* renamed from: c */
    public Configuration f52424c;

    /* renamed from: d */
    private LayoutInflater f52425d;

    /* renamed from: e */
    private Resources f52426e;

    /* renamed from: f */
    private boolean f52427f;

    static {
        Covode.recordClassIndex(25983);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f52422a;
        if (theme != null) {
            return theme;
        }
        m41665a();
        return this.f52422a;
    }

    /* renamed from: a */
    private void m41665a() {
        if (this.f52422a == null) {
            this.f52422a = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f52422a.setTo(theme);
            }
        }
        this.f52422a.applyStyle(this.f52423b, true);
    }

    public Resources getResources() {
        if (this.f52426e == null) {
            if (this.f52424c == null) {
                this.f52426e = super.getResources();
            } else {
                int i = Build.VERSION.SDK_INT;
                this.f52426e = createConfigurationContext(this.f52424c).getResources();
            }
        }
        return this.f52426e;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void setTheme(int i) {
        if (this.f52423b != i) {
            this.f52423b = i;
            if (this.f52427f) {
                this.f52422a = null;
                this.f52426e = null;
            }
            m41665a();
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return m41664a(getBaseContext(), str);
        }
        if (this.f52425d == null) {
            this.f52425d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f52425d;
    }

    public C22179d(Context context, int i) {
        super(context);
        this.f52423b = i;
        if (i == 0) {
            throw new IllegalArgumentException("themeResId can't be zero");
        }
    }

    public C22179d(Context context, Resources.Theme theme) {
        super(context);
        this.f52422a = (Resources.Theme) C22171k.m41656a(theme, "theme can't be null");
        this.f52427f = true;
    }

    /* renamed from: a */
    private static Object m41664a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9499);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9499);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
