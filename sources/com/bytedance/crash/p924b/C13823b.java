package com.bytedance.crash.p924b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.util.C14075v;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.b.b */
public final class C13823b {

    /* renamed from: b */
    public static long f33619b;

    /* renamed from: d */
    public static boolean f33620d = true;

    /* renamed from: a */
    public final C13820a f33621a;

    /* renamed from: c */
    public boolean f33622c;

    /* renamed from: e */
    private final Runnable f33623e;

    static {
        Covode.recordClassIndex(15880);
    }

    C13823b(C13820a aVar) {
        RunnableC138241 r3 = new Runnable() {
            /* class com.bytedance.crash.p924b.C13823b.RunnableC138241 */

            static {
                Covode.recordClassIndex(15881);
            }

            public final void run() {
                if (!C13823b.this.f33622c) {
                    C14075v.m25650a("oldAnr start");
                    new Thread("anr_monitor_new") {
                        /* class com.bytedance.crash.p924b.C13823b.RunnableC138241.C138251 */

                        static {
                            Covode.recordClassIndex(15882);
                        }

                        public final void run() {
                            super.run();
                            while (true) {
                                SystemClock.sleep(C13933m.f33942g.getDefaultAnrCheckInterval());
                                if (!C13823b.this.f33622c) {
                                    C13823b.this.f33621a.mo22263a((JSONArray) null, -1);
                                    C13823b.f33619b = SystemClock.uptimeMillis();
                                } else {
                                    return;
                                }
                            }
                        }
                    }.start();
                }
            }
        };
        this.f33623e = r3;
        this.f33621a = aVar;
        if (C13994b.m25344j()) {
            f33620d = false;
            C14019n.m25421b().mo22552a(r3, 5000);
        }
    }
}
