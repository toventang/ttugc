package androidx.appcompat.view;

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
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.view.d */
public final class C0277d extends ContextWrapper {

    /* renamed from: a */
    public int f894a;

    /* renamed from: b */
    private Resources.Theme f895b;

    /* renamed from: c */
    private LayoutInflater f896c;

    /* renamed from: d */
    private Configuration f897d;

    /* renamed from: e */
    private Resources f898e;

    static {
        Covode.recordClassIndex(311);
    }

    public C0277d() {
        super(null);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f895b;
        if (theme != null) {
            return theme;
        }
        if (this.f894a == 0) {
            this.f894a = R.style.l4;
        }
        m963a();
        return this.f895b;
    }

    /* renamed from: a */
    private void m963a() {
        if (this.f895b == null) {
            this.f895b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f895b.setTo(theme);
            }
        }
        this.f895b.applyStyle(this.f894a, true);
    }

    public final Resources getResources() {
        if (this.f898e == null) {
            if (this.f897d == null) {
                this.f898e = super.getResources();
            } else {
                int i = Build.VERSION.SDK_INT;
                this.f898e = createConfigurationContext(this.f897d).getResources();
            }
        }
        return this.f898e;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i) {
        if (this.f894a != i) {
            this.f894a = i;
            m963a();
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return m962a(getBaseContext(), str);
        }
        if (this.f896c == null) {
            this.f896c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f896c;
    }

    public C0277d(Context context, int i) {
        super(context);
        this.f894a = i;
    }

    /* renamed from: a */
    private static Object m962a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
