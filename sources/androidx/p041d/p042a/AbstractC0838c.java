package androidx.p041d.p042a;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: androidx.d.a.c */
public abstract class AbstractC0838c extends AbstractC0833a {

    /* renamed from: a */
    private LayoutInflater f3102a;

    /* renamed from: k */
    public int f3103k;

    /* renamed from: l */
    public int f3104l;

    static {
        Covode.recordClassIndex(922);
    }

    public AbstractC0838c(Context context, int i) {
        super(context);
        this.f3104l = i;
        this.f3103k = i;
        this.f3102a = (LayoutInflater) m2972a(context, "layout_inflater");
    }

    /* renamed from: a */
    private static Object m2972a(Context context, String str) {
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

    @Override // androidx.p041d.p042a.AbstractC0833a
    /* renamed from: a */
    public View mo1808a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C1764a.m5927a(this.f3102a, this.f3103k, viewGroup, false);
    }

    @Override // androidx.p041d.p042a.AbstractC0833a
    /* renamed from: b */
    public final View mo3046b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C1764a.m5927a(this.f3102a, this.f3104l, viewGroup, false);
    }
}
