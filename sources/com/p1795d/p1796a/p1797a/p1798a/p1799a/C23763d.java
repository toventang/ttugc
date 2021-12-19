package com.p1795d.p1796a.p1797a.p1798a.p1799a;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.d.a.a.a.a.d */
public final class C23763d extends ContentObserver {

    /* renamed from: a */
    public final Context f56214a;

    /* renamed from: b */
    private final AudioManager f56215b;

    /* renamed from: c */
    private final C23760a f56216c;

    /* renamed from: d */
    private final AbstractC23762c f56217d;

    /* renamed from: e */
    private float f56218e;

    static {
        Covode.recordClassIndex(27871);
    }

    public C23763d(Handler handler, Context context, C23760a aVar, AbstractC23762c cVar) {
        super(handler);
        this.f56214a = context;
        this.f56215b = (AudioManager) m44910a(context, DataType.AUDIO);
        this.f56216c = aVar;
        this.f56217d = cVar;
    }

    /* renamed from: b */
    private float m44911b() {
        return C23760a.m44908a(this.f56215b.getStreamVolume(3), this.f56215b.getStreamMaxVolume(3));
    }

    /* renamed from: c */
    private void m44912c() {
        this.f56217d.mo39218a(this.f56218e);
    }

    /* renamed from: a */
    public final void mo39219a() {
        this.f56218e = m44911b();
        m44912c();
        this.f56214a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: a */
    private static Object m44910a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4441);
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
                    MethodCollector.m26664o(4441);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float b = m44911b();
        if (b != this.f56218e) {
            this.f56218e = b;
            m44912c();
        }
    }
}
