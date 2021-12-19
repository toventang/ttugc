package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.video2.C29624j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video2.f */
public class C29618f {

    /* renamed from: d */
    private static volatile C29618f f70632d;

    /* renamed from: e */
    private static long f70633e = 500;

    /* renamed from: f */
    private static long f70634f = 3000;

    /* renamed from: a */
    public Timer f70635a;

    /* renamed from: b */
    public boolean f70636b;

    /* renamed from: c */
    public int f70637c;

    /* renamed from: g */
    private C29624j f70638g;

    static {
        Covode.recordClassIndex(36014);
    }

    /* renamed from: c */
    public final void mo51910c() {
        this.f70636b = false;
        Timer timer = this.f70635a;
        if (timer != null) {
            timer.cancel();
            this.f70635a = null;
        }
    }

    /* renamed from: b */
    public final void mo51909b() {
        C29624j jVar = this.f70638g;
        if (jVar != null) {
            jVar.mo51916d();
            this.f70638g = null;
        }
        Timer timer = this.f70635a;
        if (timer != null) {
            timer.cancel();
            this.f70635a = null;
        }
    }

    /* renamed from: a */
    public static C29618f m59608a() {
        MethodCollector.m26663i(11640);
        if (f70632d == null) {
            synchronized (C29618f.class) {
                try {
                    if (f70632d == null) {
                        f70632d = new C29618f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11640);
                    throw th;
                }
            }
        }
        C29618f fVar = f70632d;
        MethodCollector.m26664o(11640);
        return fVar;
    }

    /* renamed from: a */
    public static void m59609a(C29455b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.f70032j);
            jSONObject.put("ad_fetch_time", bVar.f70024b);
            C29495h.m59099a(bVar.f70026d, "splash_ad", "mute", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m59610a(C29455b bVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f));
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.f70032j);
            jSONObject.put("ad_fetch_time", bVar.f70024b);
            C29495h.m59099a(bVar.f70026d, "splash_ad", "unmute", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo51907a(C29455b bVar, Context context) {
        if (bVar.f69990O != 0) {
            if (this.f70638g == null) {
                this.f70638g = new C29624j(context);
            }
            int b = this.f70638g.mo51914b();
            int a = this.f70638g.mo51913a();
            this.f70637c = a;
            float f = (((float) a) * 1.0f) / ((float) b);
            if (f == 0.0f) {
                m59609a(bVar);
            } else {
                m59610a(bVar, f);
            }
            this.f70636b = false;
            this.f70638g.f70647a = new C29624j.AbstractC29626b(f, b, bVar) {
                /* class com.p2082ss.android.p2092ad.splash.core.video2.C29618f.C296191 */

                /* renamed from: a */
                float f70639a;

                /* renamed from: b */
                final /* synthetic */ float f70640b;

                /* renamed from: c */
                final /* synthetic */ int f70641c;

                /* renamed from: d */
                final /* synthetic */ C29455b f70642d;

                static {
                    Covode.recordClassIndex(36015);
                }

                @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29624j.AbstractC29626b
                /* renamed from: a */
                public final void mo51911a(int i) {
                    if (!C29618f.this.f70636b) {
                        float f = this.f70639a;
                        if (f == 0.0f && i > 0) {
                            float f2 = (((float) i) * 1.0f) / ((float) this.f70641c);
                            this.f70639a = f2;
                            C29618f.m59610a(this.f70642d, f2);
                        } else if (f > 0.0f && i == 0) {
                            this.f70639a = (float) i;
                            C29618f.m59609a(this.f70642d);
                        }
                    }
                }

                {
                    this.f70640b = r2;
                    this.f70641c = r3;
                    this.f70642d = r4;
                    this.f70639a = r2;
                }
            };
            C29644g.m59688b("Init volume:" + this.f70637c);
            this.f70638g.mo51915c();
        }
    }

    /* renamed from: a */
    public final void mo51908a(final AbstractC29621g gVar, int i, long j) {
        if (gVar != null) {
            C29624j jVar = this.f70638g;
            if (jVar == null || j <= f70634f) {
                gVar.mo51860a(true);
            } else if (i == 0) {
                gVar.mo51860a(true);
            } else if (i == 1) {
                gVar.mo51860a(false);
                gVar.mo51857a(0.0f, 0.0f);
            } else if (i == 2) {
                gVar.mo51860a(false);
                this.f70635a = new Timer();
                this.f70636b = true;
                final float a = (((float) this.f70638g.mo51913a()) * 1.0f) / ((float) f70634f);
                if (a > 0.0f) {
                    this.f70635a.schedule(new TimerTask() {
                        /* class com.p2082ss.android.p2092ad.splash.core.video2.C29618f.C296202 */

                        static {
                            Covode.recordClassIndex(36016);
                        }

                        public final void run() {
                            try {
                                float f = a * ((float) gVar.mo51868f());
                                if (f >= ((float) C29618f.this.f70637c)) {
                                    gVar.mo51857a((float) C29618f.this.f70637c, (float) C29618f.this.f70637c);
                                    C29618f.this.f70635a.cancel();
                                    return;
                                }
                                gVar.mo51857a(f, f);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, 0, f70633e);
                }
            } else if (i != 3) {
                if (i == 4) {
                    int a2 = jVar.mo51913a();
                    gVar.mo51860a(true);
                    float f = ((float) a2) * 1.0f;
                    gVar.mo51857a(f, f);
                }
                gVar.mo51860a(true);
            } else {
                int a3 = jVar.mo51913a();
                gVar.mo51860a(false);
                float f2 = ((float) a3) * 1.0f;
                gVar.mo51857a(f2, f2);
            }
        }
    }
}
