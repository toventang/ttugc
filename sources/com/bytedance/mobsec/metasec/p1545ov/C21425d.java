package com.bytedance.mobsec.metasec.p1545ov;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4646ms.p4647bd.p4648o.C89865a;
import p4646ms.p4647bd.p4648o.C89868b;
import p4646ms.p4647bd.p4648o.C89933s1;
import p4646ms.p4647bd.p4648o.C89941t1;

/* renamed from: com.bytedance.mobsec.metasec.ov.d */
public final class C21425d {

    /* renamed from: com.bytedance.mobsec.metasec.ov.d$b */
    public static class C21427b extends C89868b.AbstractC89869a {
        static {
            Covode.recordClassIndex(25050);
        }

        @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
        /* renamed from: a */
        public final Object mo35029a(long j, String str, Object obj) {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.d$c */
    public static class C21428c extends C89868b.AbstractC89869a {
        static {
            Covode.recordClassIndex(25051);
        }

        @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
        /* renamed from: a */
        public final Object mo35029a(long j, String str, Object obj) {
            return C89933s1.m156045a();
        }
    }

    static {
        Covode.recordClassIndex(25048);
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.d$a */
    public static class C21426a extends C89868b.AbstractC89869a {
        static {
            Covode.recordClassIndex(25049);
        }

        /* renamed from: a */
        private static Object m40224a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(2689);
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
                        MethodCollector.m26664o(2689);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
        /* renamed from: a */
        public final Object mo35029a(long j, String str, Object obj) {
            try {
                Display defaultDisplay = ((WindowManager) m40224a(C89865a.f203764a.f203765b, "window")).getDefaultDisplay();
                Point point = new Point();
                int i = Build.VERSION.SDK_INT;
                defaultDisplay.getRealSize(point);
                C89941t1.f203828a = point.x;
                C89941t1.f203829b = point.y;
            } catch (Throwable unused) {
            }
            return C89941t1.f203828a + "*" + C89941t1.f203829b;
        }
    }
}
