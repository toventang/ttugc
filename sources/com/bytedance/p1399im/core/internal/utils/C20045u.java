package com.bytedance.p1399im.core.internal.utils;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.u */
public class C20045u implements HandlerC20049x.AbstractC20050a {

    /* renamed from: a */
    private static C20045u f47638a;

    /* renamed from: b */
    private volatile boolean f47639b;

    /* renamed from: c */
    private HandlerC20049x f47640c;

    /* renamed from: d */
    private long f47641d;

    static {
        Covode.recordClassIndex(22890);
    }

    private C20045u() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-SNAPSHOT");
        handlerThread.start();
        this.f47640c = new HandlerC20049x(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public static C20045u m37926a() {
        MethodCollector.m26663i(9857);
        if (f47638a == null) {
            synchronized (C20045u.class) {
                try {
                    if (f47638a == null) {
                        f47638a = new C20045u();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9857);
                    throw th;
                }
            }
        }
        C20045u uVar = f47638a;
        MethodCollector.m26664o(9857);
        return uVar;
    }

    /* renamed from: b */
    public static List<C19638h> m37927b() {
        C20041s.m37876a();
        try {
            return Arrays.asList((C19638h[]) C19999h.f47538a.mo46670a(C20041s.f47627a.mo27996b(C20041s.m37878a("im_snapshot"), ""), C19638h[].class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo31918c() {
        if (!this.f47640c.hasMessages(1001) && !this.f47639b) {
            if (SystemClock.uptimeMillis() - this.f47641d <= C19483d.m36365a().mo31141b().f46202K) {
                this.f47640c.sendEmptyMessageDelayed(1001, (this.f47641d + C19483d.m36365a().mo31141b().f46202K) - SystemClock.uptimeMillis());
            } else {
                m37928d();
            }
        }
    }

    /* renamed from: d */
    private synchronized void m37928d() {
        MethodCollector.m26663i(10010);
        this.f47639b = true;
        try {
            this.f47641d = SystemClock.uptimeMillis();
            List<C19638h> b = C19640j.m36671a().mo31596b();
            if (b.size() > C19483d.m36365a().mo31141b().f46201J) {
                b = b.subList(0, C19483d.m36365a().mo31141b().f46201J);
            }
            try {
                String b2 = C19999h.f47538a.mo46674b(b.toArray(new C19638h[0]));
                C20041s.m37876a();
                C20041s.f47627a.mo27992a(C20041s.m37878a("im_snapshot"), b2);
            } catch (Exception unused) {
                this.f47639b = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.f47639b = false;
        } finally {
            this.f47639b = false;
            MethodCollector.m26664o(10010);
        }
    }

    @Override // com.bytedance.p1399im.core.internal.utils.HandlerC20049x.AbstractC20050a
    /* renamed from: a */
    public final void mo31686a(Message message) {
        if (message.what == 1001) {
            m37928d();
        }
    }
}
