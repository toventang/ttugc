package com.p2082ss.optimizer.live.sdk.p4400a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.optimizer.live.sdk.p4400a.p4401a.C86124a;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.a.e */
public final class C86130e {

    /* renamed from: a */
    public final Set<AbstractC86134a> f192065a = new HashSet();

    /* renamed from: b */
    public final Handler f192066b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C86123a f192067c;

    /* renamed from: d */
    public C86124a f192068d = null;

    /* renamed from: e */
    public boolean f192069e = false;

    /* renamed from: f */
    public int f192070f = 0;

    /* renamed from: g */
    public long f192071g = 10000;

    /* renamed from: h */
    public int f192072h = 5;

    /* renamed from: i */
    private final C86135f f192073i;

    /* renamed from: com.ss.optimizer.live.sdk.a.e$a */
    public interface AbstractC86134a {
        static {
            Covode.recordClassIndex(101275);
        }

        /* renamed from: a */
        void mo136408a(C86124a aVar);
    }

    static {
        Covode.recordClassIndex(101271);
    }

    /* renamed from: a */
    public final void mo136404a() {
        if (!this.f192069e) {
            this.f192069e = true;
            this.f192073i.mo136409a(new Runnable() {
                /* class com.p2082ss.optimizer.live.sdk.p4400a.C86130e.RunnableC861311 */

                static {
                    Covode.recordClassIndex(101272);
                }

                public final void run() {
                    final C86124a aVar;
                    try {
                        C86123a aVar2 = C86130e.this.f192067c;
                        aVar = new C86124a(new JSONObject(aVar2.f192032b.mo16645a(C86123a.m147920a(aVar2.f192031a + "/video/live/qos/v2/ipSettings", aVar2.f192033c))));
                    } catch (Exception e) {
                        e.printStackTrace();
                        aVar = null;
                    }
                    C86130e.this.f192066b.post(new Runnable() {
                        /* class com.p2082ss.optimizer.live.sdk.p4400a.C86130e.RunnableC861311.RunnableC861321 */

                        static {
                            Covode.recordClassIndex(101273);
                        }

                        public final void run() {
                            C86130e.this.f192069e = false;
                            if (aVar == null) {
                                C86130e eVar = C86130e.this;
                                int i = eVar.f192070f + 1;
                                eVar.f192070f = i;
                                if (i <= C86130e.this.f192072h) {
                                    C86130e eVar2 = C86130e.this;
                                    long j = C86130e.this.f192071g;
                                    eVar2.f192066b.removeCallbacksAndMessages(null);
                                    eVar2.f192066b.postDelayed(new Runnable() {
                                        /* class com.p2082ss.optimizer.live.sdk.p4400a.C86130e.RunnableC861332 */

                                        static {
                                            Covode.recordClassIndex(101274);
                                        }

                                        public final void run() {
                                            C86130e.this.mo136404a();
                                        }
                                    }, j);
                                    return;
                                }
                                return;
                            }
                            C86130e.this.f192070f = 0;
                            C86130e.this.f192068d = aVar;
                            for (AbstractC86134a aVar : C86130e.this.f192065a) {
                                aVar.mo136408a(C86130e.this.f192068d);
                            }
                        }
                    });
                }
            });
        }
    }

    C86130e(C86135f fVar, C86123a aVar, long j, int i) {
        this.f192073i = fVar;
        this.f192067c = aVar;
        this.f192071g = j;
        this.f192072h = i;
    }
}
