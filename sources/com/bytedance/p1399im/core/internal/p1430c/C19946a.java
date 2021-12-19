package com.bytedance.p1399im.core.internal.p1430c;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.im.core.internal.c.a */
public class C19946a {

    /* renamed from: b */
    public static boolean f47436b;

    /* renamed from: c */
    public static boolean f47437c;

    /* renamed from: d */
    private static C19946a f47438d;

    /* renamed from: a */
    public boolean f47439a;

    static {
        Covode.recordClassIndex(22790);
    }

    /* renamed from: b */
    public static boolean m37585b() {
        if (!f47436b || f47437c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C19946a m37584a() {
        MethodCollector.m26663i(10223);
        if (f47438d == null) {
            synchronized (C19946a.class) {
                try {
                    f47438d = new C19946a();
                } catch (Throwable th) {
                    MethodCollector.m26664o(10223);
                    throw th;
                }
            }
        }
        C19946a aVar = f47438d;
        MethodCollector.m26664o(10223);
        return aVar;
    }

    /* renamed from: c */
    public final void mo31816c() {
        boolean z = C19483d.m36365a().mo31141b().f46221aC;
        C20041s.m37876a();
        boolean l = C20041s.m37905l();
        C19512f.m36457b("MultiTableQueryOptManager", "notifySyncDone: " + this.f47439a + ", " + z + ", " + l, (Throwable) null);
        if (this.f47439a && z && !l) {
            C199471 r1 = new AbstractC19986c<Void>() {
                /* class com.bytedance.p1399im.core.internal.p1430c.C19946a.C199471 */

                static {
                    Covode.recordClassIndex(22791);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Void mo31187a() {
                    String str;
                    boolean z = C19483d.m36365a().mo31141b().f46221aC;
                    C20041s.m37876a();
                    boolean l = C20041s.m37905l();
                    C19512f.m36457b("MultiTableQueryOptManager", "notifySyncDone onRun: " + C19946a.f47436b + ", " + C19946a.this.f47439a + ", " + z + ", " + l, (Throwable) null);
                    if (C19946a.this.f47439a && z && !l) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C19946a.f47437c = false;
                        boolean b = C19777i.m37191b();
                        C19517i a = new C19517i().mo31179a("im_sdk_msg_update_flag").mo31180a("cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        if (b) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        a.mo31180a("is_success", str).mo31182c();
                        if (b) {
                            C20041s.m37876a();
                            C20041s.m37906m();
                        }
                        C19512f.m36457b("MultiTableQueryOptManager", "notifySyncDone, update result: " + b + ", current thread: " + Thread.currentThread(), (Throwable) null);
                    }
                    return null;
                }
            };
            boolean z2 = C19483d.m36365a().f46159d;
            if (z2) {
                RunnableC19987d dVar = new RunnableC19987d(r1, null, C19983a.m37717a());
                if (dVar.f47511a != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 100003;
                    obtain.obj = dVar;
                    dVar.f47511a.sendMessageDelayed(obtain, 60000);
                }
                RunnableC19987d.f47510b.put(Integer.valueOf(dVar.hashCode()), new SoftReference<>(dVar));
                return;
            }
            C19512f.m36457b("imsdk", "Task executorDelay not start, isLogin:".concat(String.valueOf(z2)), (Throwable) null);
        }
    }
}
