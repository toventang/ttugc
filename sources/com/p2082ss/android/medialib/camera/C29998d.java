package com.p2082ss.android.medialib.camera;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.medialib.camera.p2157a.AbstractC29995a;
import com.p2082ss.android.medialib.p2155b.C29983a;
import com.p2082ss.android.medialib.presenter.AbstractC30026c;
import com.p2082ss.android.medialib.presenter.AbstractC30028e;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.vesdk.C85315al;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.medialib.camera.d */
public final class C29998d {

    /* renamed from: f */
    public static boolean f71584f = true;

    /* renamed from: o */
    private static C29998d f71585o;

    /* renamed from: a */
    public AbstractC29997c f71586a;

    /* renamed from: b */
    public AbstractC30026c f71587b;

    /* renamed from: c */
    public AbstractC30028e f71588c;

    /* renamed from: d */
    public int f71589d;

    /* renamed from: e */
    public C29996b f71590e;

    /* renamed from: g */
    public int f71591g;

    /* renamed from: h */
    public long f71592h;

    /* renamed from: i */
    public long f71593i;

    /* renamed from: j */
    public final Object f71594j = new Object();

    /* renamed from: k */
    public long f71595k = 0;

    /* renamed from: l */
    public boolean f71596l = false;

    /* renamed from: m */
    public AbstractC29995a f71597m;

    /* renamed from: n */
    public AtomicBoolean f71598n = new AtomicBoolean(false);

    /* renamed from: p */
    private int f71599p = -1;

    /* renamed from: q */
    private C29983a.AbstractC29985b f71600q = new C29983a.AbstractC29985b() {
        /* class com.p2082ss.android.medialib.camera.C29998d.C299991 */

        static {
            Covode.recordClassIndex(36452);
        }

        @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
        /* renamed from: b */
        public final void mo52798b() {
            C85315al.m146639b("IESCameraManager", "onOpenGLDestroy...");
            if (C29998d.this.f71597m != null) {
                C29998d.this.f71597m.mo52798b();
            }
        }

        @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
        /* renamed from: a */
        public final void mo52797a() {
            C85315al.m146639b("IESCameraManager", "onOpenGLCreate...");
            if (C29998d.this.f71588c == null || C29998d.this.f71597m == null) {
                C85315al.m146642d("IESCameraManager", "presenter or camera provider is null!");
                return;
            }
            C29998d.this.f71597m.mo52797a();
            new Object() {
                /* class com.p2082ss.android.medialib.camera.C29998d.C299991.C300001 */

                static {
                    Covode.recordClassIndex(36453);
                }
            };
            C29998d.this.f71591g = 0;
            C29998d dVar = C29998d.this;
            long currentTimeMillis = System.currentTimeMillis();
            dVar.f71593i = currentTimeMillis;
            dVar.f71592h = currentTimeMillis;
        }

        @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
        /* renamed from: c */
        public final int mo52799c() {
            int c;
            if (C29998d.this.f71598n.getAndSet(false) && C29998d.this.f71590e.f71581b != null) {
                C29998d dVar = C29998d.this;
                dVar.mo52827a(dVar.f71590e.f71581b);
            }
            if (C29998d.this.f71597m != null && (c = C29998d.this.f71597m.mo52799c()) < 0) {
                return c;
            }
            if (C29998d.this.f71586a != null && C29998d.this.f71586a.mo52826c()) {
                return -3;
            }
            if (C29998d.this.f71596l) {
                return -4;
            }
            return 0;
        }
    };

    /* renamed from: r */
    private int[] f71601r = new int[2];

    /* renamed from: com.ss.android.medialib.camera.d$a */
    public interface AbstractC30001a {
        static {
            Covode.recordClassIndex(36454);
        }

        /* renamed from: a */
        void mo52828a();
    }

    static {
        Covode.recordClassIndex(36451);
    }

    private C29998d() {
    }

    /* renamed from: a */
    public static C29998d m60545a() {
        MethodCollector.m26663i(1620);
        if (f71585o == null) {
            synchronized (C29998d.class) {
                try {
                    if (f71585o == null) {
                        f71585o = new C29998d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1620);
                    throw th;
                }
            }
        }
        C29998d dVar = f71585o;
        MethodCollector.m26664o(1620);
        return dVar;
    }

    /* renamed from: a */
    public final synchronized void mo52827a(Context context) {
        int a;
        MethodCollector.m26663i(1635);
        ((WindowManager) m60546a(context, "window")).getDefaultDisplay().getRotation();
        synchronized (this.f71594j) {
            try {
                a = this.f71586a.mo52824a();
            } finally {
                MethodCollector.m26664o(1635);
            }
        }
        this.f71589d = a;
        if (this.f71587b != null) {
            C85315al.m146637a("IESCameraManager", "Camera deflection angle: ".concat(String.valueOf(a)));
        }
    }

    /* renamed from: a */
    private static Object m60546a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1668);
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
                    MethodCollector.m26664o(1668);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
