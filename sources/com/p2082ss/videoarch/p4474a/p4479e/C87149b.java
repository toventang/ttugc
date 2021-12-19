package com.p2082ss.videoarch.p4474a.p4479e;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.lang.reflect.Field;

/* renamed from: com.ss.videoarch.a.e.b */
public final class C87149b {

    /* renamed from: a */
    public final Context f196950a;

    /* renamed from: b */
    public AbstractC86253m f196951b = null;

    /* renamed from: c */
    public float f196952c = 1.0f;

    /* renamed from: d */
    private float f196953d;

    static {
        Covode.recordClassIndex(102950);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m151080a() {
        /*
            r3 = this;
            android.content.Context r1 = r3.f196950a
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = m151081a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamMaxVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4479e.C87149b.m151080a():float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m151082b() {
        /*
            r3 = this;
            android.content.Context r1 = r3.f196950a
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = m151081a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4479e.C87149b.m151082b():float");
    }

    public C87149b(Context context) {
        this.f196950a = context;
    }

    /* renamed from: a */
    public final void mo140954a(boolean z) {
        AbstractC86253m mVar = this.f196951b;
        if (mVar != null) {
            if (mVar.mo16707a()) {
                float a = m151080a();
                if (a > 0.0f) {
                    this.f196953d = m151082b() / a;
                }
                if (z) {
                    this.f196951b.mo16685a(0.0f, 0.0f);
                    return;
                }
                AbstractC86253m mVar2 = this.f196951b;
                float f = this.f196953d;
                mVar2.mo16685a(f, f);
                return;
            }
            this.f196951b.mo16712b(z);
        }
    }

    /* renamed from: a */
    public static Object m151081a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5849);
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
                    MethodCollector.m26664o(5849);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
