package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20751h;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24405w;
import com.facebook.imagepipeline.p1879d.C24371d;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1879d.C24388i;
import com.facebook.imagepipeline.p1879d.C24398q;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.lighten.loader.a */
public final class C20778a {

    /* renamed from: a */
    public C24382h<AbstractC24026e, AbstractC24454c> f49163a;

    /* renamed from: b */
    public int f49164b;

    /* renamed from: c */
    private C20792j f49165c;

    static {
        Covode.recordClassIndex(24354);
    }

    /* renamed from: com.bytedance.lighten.loader.a$a */
    public static final class C20782a {

        /* renamed from: a */
        public static final C20778a f49171a = new C20778a((byte) 0);

        static {
            Covode.recordClassIndex(24358);
        }
    }

    /* renamed from: a */
    public final void mo34212a() {
        C24382h<AbstractC24026e, AbstractC24454c> hVar = this.f49163a;
        if (hVar != null) {
            try {
                hVar.mo40204a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private C20778a() {
        int memoryClass;
        Context context = C20751h.f48987a;
        ActivityManager activityManager = (ActivityManager) C20831z.m39188a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        int i = (int) ((((long) memoryClass) * 1048576) / 10);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) C20831z.m39188a(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
        if (i > i2) {
            i = i2;
        } else if (i < 6291456) {
            i = 6291456;
        }
        this.f49164b = i;
        this.f49163a = new C24382h<>(new AbstractC24405w<AbstractC24454c>() {
            /* class com.bytedance.lighten.loader.C20778a.C207802 */

            static {
                Covode.recordClassIndex(24356);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.imagepipeline.p1879d.AbstractC24405w
            /* renamed from: a */
            public final /* synthetic */ int mo34215a(AbstractC24454c cVar) {
                return cVar.mo40290b();
            }
        }, new C24371d(), new C24388i((ActivityManager) m39109a(C20751h.f48987a, "activity")) {
            /* class com.bytedance.lighten.loader.C20778a.C207813 */

            static {
                Covode.recordClassIndex(24357);
            }

            @Override // com.facebook.imagepipeline.p1879d.C24388i
            /* renamed from: a */
            public final C24398q mo34217b() {
                return new C24398q(C20778a.this.f49164b, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            }
        });
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "bitmap-cache";
        this.f49165c = new C20792j(C40780g.m82242a(a.mo70028a()));
    }

    /* synthetic */ C20778a(byte b) {
        this();
    }

    /* renamed from: a */
    public final C24117a<Bitmap> mo34211a(String str) {
        C24117a<AbstractC24454c> a = this.f49163a.mo40201a(new C24031j(str));
        if (a != null) {
            return m39108a(a);
        }
        return null;
    }

    /* renamed from: a */
    private static C24117a<Bitmap> m39108a(C24117a<AbstractC24454c> aVar) {
        C24455d dVar;
        try {
            if (C24117a.m45710a((C24117a<?>) aVar) && (aVar.mo39695a() instanceof C24455d) && (dVar = (C24455d) aVar.mo39695a()) != null) {
                return dVar.mo40299f();
            }
            C24117a.m45712c(aVar);
            return null;
        } finally {
            C24117a.m45712c(aVar);
        }
    }

    /* renamed from: a */
    private static Object m39109a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10480);
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
                    MethodCollector.m26664o(10480);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r2 = r5.mo40293d().mo40124a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34213a(final java.lang.String r4, com.facebook.imagepipeline.p1885j.C24452a r5) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r5 == 0) goto L_0x0029
            com.facebook.imagepipeline.a.a.e r0 = r5.mo40293d()
            if (r0 == 0) goto L_0x0029
            com.facebook.imagepipeline.a.a.e r0 = r5.mo40293d()
            com.facebook.common.h.a r2 = r0.mo40124a()
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2.mo39700d()
            if (r0 == 0) goto L_0x0029
            com.bytedance.lighten.loader.a$1 r1 = new com.bytedance.lighten.loader.a$1
            r1.<init>(r2, r4)
            com.bytedance.lighten.loader.j r0 = r3.f49165c
            p077b.C1731i.m5640b(r1, r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C20778a.mo34213a(java.lang.String, com.facebook.imagepipeline.j.a):void");
    }
}
