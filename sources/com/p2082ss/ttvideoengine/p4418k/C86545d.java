package com.p2082ss.ttvideoengine.p4418k;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.ss.ttvideoengine.k.d */
public final class C86545d {

    /* renamed from: a */
    public static volatile String f194995a;

    /* renamed from: b */
    public static volatile long f194996b;

    static {
        Covode.recordClassIndex(101773);
    }

    /* renamed from: a */
    public static void m149798a() {
        if (SystemClock.elapsedRealtime() - f194996b >= 300000) {
            C86631b.m150044a(new Runnable() {
                /* class com.p2082ss.ttvideoengine.p4418k.C86545d.RunnableC865461 */

                static {
                    Covode.recordClassIndex(101774);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C86545d.f194995a = byName.getHostAddress();
                            C86545d.f194996b = SystemClock.elapsedRealtime();
                            C86641i.m150110a("DNSServerIP", "update dns server ip:" + C86545d.f194995a);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
