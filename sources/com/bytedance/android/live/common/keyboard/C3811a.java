package com.bytedance.android.live.common.keyboard;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.deviceregister.p2139d.C29897d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.bytedance.android.live.common.keyboard.a */
public class C3811a {

    /* renamed from: d */
    private static final String f10539d = C3811a.class.getSimpleName();

    /* renamed from: a */
    protected int f10540a;

    /* renamed from: b */
    public List<AbstractC3814c> f10541b;

    /* renamed from: c */
    public boolean f10542c;

    /* renamed from: e */
    private int f10543e;

    static {
        Covode.recordClassIndex(4338);
    }

    /* renamed from: a */
    private boolean m9370a(int i) {
        int i2 = this.f10543e;
        if (i2 == 0) {
            this.f10543e = i;
            return false;
        } else if (i2 != i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m9368a(Context context) {
        Point point = new Point();
        ((WindowManager) m9369a(context, "window")).getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo9158b(Context context, int i) {
        if (!C29897d.m60265a()) {
            return false;
        }
        int a = m9368a(context);
        if (i <= a && !m9370a(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo9156a(Context context, int i) {
        int size = View.MeasureSpec.getSize(i);
        if (!mo9158b(context, size)) {
            int i2 = this.f10540a;
            if (i2 == 0) {
                this.f10540a = size;
            } else if (i2 != size) {
                int i3 = i2 - size;
                if (((float) Math.abs(i3)) >= C11227ap.m19885a(context, 80.0f)) {
                    if (i3 > 0) {
                        this.f10542c = true;
                    } else {
                        this.f10542c = false;
                    }
                    mo9157a(this.f10542c, Math.abs(i3));
                    this.f10540a = size;
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m9369a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13277);
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
                    MethodCollector.m26664o(13277);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9157a(boolean z, int i) {
        List<AbstractC3814c> list = this.f10541b;
        if (list != null) {
            for (AbstractC3814c cVar : list) {
                cVar.mo9159a(z, i);
            }
        }
    }
}
