package com.p2082ss.android.ugc.aweme.common.keyboard;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.a */
public class C39140a {

    /* renamed from: c */
    private static final String f92352c = C39140a.class.getSimpleName();

    /* renamed from: a */
    protected int f92353a;

    /* renamed from: b */
    public boolean f92354b;

    /* renamed from: d */
    private int f92355d;

    /* renamed from: e */
    private long f92356e;

    /* renamed from: f */
    private List<AbstractC39142c> f92357f;

    static {
        Covode.recordClassIndex(46759);
    }

    /* renamed from: b */
    public final void mo67905b(AbstractC39142c cVar) {
        List<AbstractC39142c> list = this.f92357f;
        if (list != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: a */
    private boolean m79430a(int i) {
        int i2 = this.f92355d;
        if (i2 == 0) {
            this.f92355d = i;
            return false;
        } else if (i2 != i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m79428a(Context context) {
        Point point = new Point();
        ((WindowManager) m79429a(context, "window")).getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* renamed from: a */
    public final void mo67903a(AbstractC39142c cVar) {
        if (this.f92357f == null) {
            this.f92357f = new ArrayList();
        }
        this.f92357f.add(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo67906b(Context context, int i) {
        if (!C80329c.m139264b()) {
            return false;
        }
        int a = m79428a(context);
        if (i <= a && !m79430a(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m79429a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10745);
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
                    MethodCollector.m26664o(10745);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public void mo67902a(Context context, int i) {
        int size = View.MeasureSpec.getSize(i);
        if (!mo67906b(context, size)) {
            int i2 = this.f92353a;
            if (i2 == 0) {
                this.f92353a = size;
            } else if (i2 != size) {
                int i3 = i2 - size;
                if (((float) Math.abs(i3)) >= C13628n.m24520b(context, 80.0f)) {
                    if (Build.VERSION.SDK_INT == 30) {
                        long nanoTime = System.nanoTime() / 1000000;
                        if (nanoTime - this.f92356e > 100) {
                            this.f92356e = nanoTime;
                        } else {
                            return;
                        }
                    }
                    if (i3 > 0) {
                        this.f92354b = true;
                    } else {
                        this.f92354b = false;
                    }
                    mo67904a(this.f92354b, Math.abs(i3));
                    this.f92353a = size;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67904a(boolean z, int i) {
        List<AbstractC39142c> list = this.f92357f;
        if (list != null) {
            for (AbstractC39142c cVar : list) {
                cVar.mo64600a(z, i);
            }
        }
    }
}
