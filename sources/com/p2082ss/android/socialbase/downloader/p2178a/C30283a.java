package com.p2082ss.android.socialbase.downloader.p2178a;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.a.a */
public final class C30283a {

    /* renamed from: a */
    public Application f72243a;

    /* renamed from: b */
    public final List<AbstractC30285a> f72244b;

    /* renamed from: c */
    public int f72245c;

    /* renamed from: d */
    public WeakReference<Activity> f72246d;

    /* renamed from: e */
    volatile int f72247e;

    /* renamed from: f */
    public volatile boolean f72248f;

    /* renamed from: g */
    public final Application.ActivityLifecycleCallbacks f72249g;

    /* renamed from: com.ss.android.socialbase.downloader.a.a$a */
    public interface AbstractC30285a {
        static {
            Covode.recordClassIndex(36797);
        }

        /* renamed from: a */
        void mo53753a();

        /* renamed from: b */
        void mo53754b();
    }

    static {
        Covode.recordClassIndex(36795);
    }

    /* renamed from: com.ss.android.socialbase.downloader.a.a$b */
    public static class C30286b {

        /* renamed from: a */
        public static final C30283a f72251a = new C30283a((byte) 0);

        static {
            Covode.recordClassIndex(36798);
        }
    }

    private C30283a() {
        this.f72244b = new ArrayList();
        this.f72247e = -1;
        this.f72248f = false;
        this.f72249g = new Application.ActivityLifecycleCallbacks() {
            /* class com.p2082ss.android.socialbase.downloader.p2178a.C30283a.C302841 */

            static {
                Covode.recordClassIndex(36796);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityPaused(Activity activity) {
                C30283a.this.f72248f = true;
                if (C30283a.this.f72245c == 0 && activity != null) {
                    C30283a.this.f72245c = activity.hashCode();
                }
            }

            public final void onActivityResumed(Activity activity) {
                int i;
                int i2 = C30283a.this.f72245c;
                C30283a.this.f72248f = false;
                C30283a aVar = C30283a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f72245c = i;
                if (i2 == 0) {
                    C30283a.this.mo53745c();
                }
            }

            public final void onActivityStarted(Activity activity) {
                int i;
                C30283a.this.f72246d = new WeakReference<>(activity);
                int i2 = C30283a.this.f72245c;
                C30283a aVar = C30283a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f72245c = i;
                C30283a.this.f72248f = false;
                if (i2 == 0) {
                    C30283a.this.mo53745c();
                }
            }

            public final void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == C30283a.this.f72245c) {
                    C30283a.this.f72245c = 0;
                    C30283a aVar = C30283a.this;
                    aVar.f72247e = 0;
                    Object[] b = aVar.mo53744b();
                    if (b != null) {
                        for (Object obj : b) {
                            ((AbstractC30285a) obj).mo53754b();
                        }
                    }
                }
                C30283a.this.f72248f = false;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53743a() {
        /*
            r2 = this;
            int r1 = r2.f72247e
            r0 = -1
            if (r1 != r0) goto L_0x000b
            boolean r1 = r2.m61279d()
            r2.f72247e = r1
        L_0x000b:
            r0 = 1
            if (r1 != r0) goto L_0x000f
            return r0
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2178a.C30283a.mo53743a():boolean");
    }

    /* renamed from: c */
    public final void mo53745c() {
        this.f72247e = 1;
        Object[] b = mo53744b();
        if (b != null) {
            for (Object obj : b) {
                ((AbstractC30285a) obj).mo53753a();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 123
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    /* renamed from: d */
    private boolean m61279d() {
        /*
            r6 = this;
            r5 = 0
            android.app.Application r1 = r6.f72243a     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0006
            return r5
        L_0x0006:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = m61278a(r1, r0)     // Catch:{ all -> 0x0022 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = r1.getPackageName()     // Catch:{ all -> 0x0022 }
            java.util.List r1 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0022
        L_0x001f:
            if (r0 == 0) goto L_0x0027
            r5 = 1
        L_0x0022:
            return r5
        L_0x0023:
            java.util.Iterator r3 = r1.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x0027
            java.lang.String r0 = r2.processName
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2178a.C30283a.m61279d():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo53744b() {
        Object[] objArr;
        MethodCollector.m26663i(12411);
        synchronized (this.f72244b) {
            try {
                if (this.f72244b.size() > 0) {
                    objArr = this.f72244b.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.m26664o(12411);
            }
        }
        return objArr;
    }

    /* synthetic */ C30283a(byte b) {
        this();
    }

    /* renamed from: a */
    private static Object m61278a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6113);
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
                    MethodCollector.m26664o(6113);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
