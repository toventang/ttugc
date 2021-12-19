package com.bytedance.p1399im.core.p1413f;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1413f.p1414a.C19686a;
import com.bytedance.p1399im.core.proto.GetConversationsCheckInfoRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;

/* renamed from: com.bytedance.im.core.f.a */
public class C19682a {

    /* renamed from: a */
    public static boolean f46792a;

    /* renamed from: e */
    public static int f46793e = 8;

    /* renamed from: f */
    private static volatile C19682a f46794f;

    /* renamed from: b */
    public Handler f46795b;

    /* renamed from: c */
    public Runnable f46796c;

    /* renamed from: d */
    public long f46797d;

    static {
        Covode.recordClassIndex(22526);
    }

    /* renamed from: g */
    private void m36783g() {
        this.f46795b.postDelayed(new Runnable() {
            /* class com.bytedance.p1399im.core.p1413f.C19682a.RunnableC196842 */

            static {
                Covode.recordClassIndex(22528);
            }

            public final void run() {
                int[] a = C19996e.m37756a();
                for (int i : a) {
                    new C19686a().mo31798a(i, new RequestBody.Builder().get_conversations_checkinfo_body(new GetConversationsCheckInfoRequestBody.Builder().build()).build(), null, new Object[0]);
                }
            }
        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    /* renamed from: b */
    public final long mo31635b() {
        long j = this.f46797d;
        if (j > 0) {
            return j;
        }
        return C19738a.m36937c();
    }

    private C19682a() {
        HandlerThread handlerThread = new HandlerThread("RepairManager-Thread");
        handlerThread.start();
        this.f46795b = new Handler(handlerThread.getLooper());
        f46792a = true;
    }

    /* renamed from: f */
    private static void m36782f() {
        if (C19483d.m36365a().f46159d && C19738a.m36934a()) {
            f46793e = 8;
            m36780a().mo31636c();
        }
    }

    /* renamed from: c */
    public final void mo31636c() {
        if (this.f46796c == null) {
            RunnableC196831 r5 = new Runnable() {
                /* class com.bytedance.p1399im.core.p1413f.C19682a.RunnableC196831 */

                static {
                    Covode.recordClassIndex(22527);
                }

                public final void run() {
                    int[] a = C19996e.m37756a();
                    if (a != null) {
                        for (int i : a) {
                            C19930x.m37536a();
                            C19930x.m37543b(i, C19682a.f46793e);
                        }
                        C19682a.this.f46795b.postDelayed(C19682a.this.f46796c, C19682a.this.mo31635b() * 1000);
                    }
                }
            };
            this.f46796c = r5;
            this.f46795b.postDelayed(r5, mo31635b() * 1000);
        }
    }

    /* renamed from: d */
    public final void mo31637d() {
        Runnable runnable = this.f46796c;
        if (runnable != null) {
            this.f46795b.removeCallbacks(runnable);
            this.f46796c = null;
            this.f46797d = 0;
        }
    }

    /* renamed from: a */
    public static C19682a m36780a() {
        MethodCollector.m26663i(9544);
        if (f46794f == null) {
            synchronized (C19682a.class) {
                try {
                    if (f46794f == null) {
                        f46794f = new C19682a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9544);
                    throw th;
                }
            }
        }
        C19682a aVar = f46794f;
        MethodCollector.m26664o(9544);
        return aVar;
    }

    /* renamed from: e */
    public static void m36781e() {
        m36782f();
        if (C19738a.m36938d()) {
            long currentTimeMillis = System.currentTimeMillis();
            C20041s.m37876a();
            if (currentTimeMillis - C20041s.m37898g() > C19738a.m36939e()) {
                C20041s.m37876a();
                C20041s.m37885b(currentTimeMillis);
                m36780a().m36783g();
            }
        }
    }
}
