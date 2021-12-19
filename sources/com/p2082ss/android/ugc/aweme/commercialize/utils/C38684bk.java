package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37872ay;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.video.C81079v;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bk */
public class C38684bk {

    /* renamed from: g */
    private static volatile C38684bk f91390g;

    /* renamed from: a */
    public Handler f91391a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Aweme f91392b;

    /* renamed from: c */
    public int f91393c;

    /* renamed from: d */
    public int f91394d;

    /* renamed from: e */
    public Runnable f91395e;

    /* renamed from: f */
    public Runnable f91396f;

    /* renamed from: h */
    private int f91397h;

    static {
        Covode.recordClassIndex(46225);
    }

    private C38684bk() {
    }

    /* renamed from: a */
    public static C38684bk m78498a() {
        MethodCollector.m26663i(1218);
        if (f91390g == null) {
            synchronized (C38684bk.class) {
                try {
                    if (f91390g == null) {
                        f91390g = new C38684bk();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1218);
                    throw th;
                }
            }
        }
        C38684bk bkVar = f91390g;
        MethodCollector.m26664o(1218);
        return bkVar;
    }

    /* renamed from: a */
    public final void mo67264a(int i) {
        this.f91393c = i;
        C1764a.m5928a("played:%d, target:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f91397h)});
        if (this.f91393c == this.f91397h) {
            RunnableC386851 r1 = new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.utils.C38684bk.RunnableC386851 */

                /* renamed from: a */
                final Aweme f91398a;

                /* renamed from: b */
                long f91399b;

                static {
                    Covode.recordClassIndex(46226);
                }

                public final void run() {
                    long n;
                    if (this.f91398a == C38684bk.this.f91392b) {
                        AbstractC33208e a = C33205b.m68071a();
                        AbstractC37872ay a2 = C37889c.C37890a.m76706a();
                        if (C37699a.m76251aW(C38684bk.this.f91392b) && a != null) {
                            n = a.mo59102f();
                        } else if (!C37699a.m76277aw(C38684bk.this.f91392b) || a2 == null) {
                            n = C81079v.m140776O().mo123891n();
                        } else {
                            n = a2.mo65913d();
                        }
                        if (n < 0) {
                            n = 0;
                        }
                        C1764a.m5928a("pos: %d, targetDelay: %d", new Object[]{Long.valueOf(n), Integer.valueOf(C38684bk.this.f91394d)});
                        if (n >= ((long) C38684bk.this.f91394d) || (n < this.f91399b && C38684bk.this.f91393c > 0)) {
                            Runnable runnable = C38684bk.this.f91395e;
                            if (runnable != null) {
                                try {
                                    runnable.run();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            C38684bk.this.f91395e = null;
                            return;
                        }
                        this.f91399b = n;
                        C38684bk.this.f91391a.postDelayed(this, 1000);
                    }
                }

                {
                    this.f91398a = C38684bk.this.f91392b;
                }
            };
            this.f91396f = r1;
            this.f91391a.post(r1);
        }
    }

    /* renamed from: a */
    public final void mo67265a(int i, Runnable runnable) {
        long j;
        Aweme aweme = this.f91392b;
        if (aweme != null) {
            AbstractC33208e a = C33205b.m68071a();
            AbstractC37872ay a2 = C37889c.C37890a.m76706a();
            if (C37699a.m76251aW(this.f91392b) && a != null) {
                j = a.mo59103g();
            } else if (!C37699a.m76277aw(aweme) || a2 == null) {
                j = C81079v.m140776O().mo123887j();
                if (j <= 0) {
                    if (aweme.getVideo() == null || aweme.getVideo().getDuration() <= 0) {
                        j = 1;
                    } else {
                        j = (long) aweme.getVideo().getDuration();
                    }
                }
            } else {
                j = a2.mo65912c();
            }
            long j2 = (long) i;
            this.f91397h = (int) (j2 / j);
            this.f91394d = (int) (j2 % j);
            this.f91395e = runnable;
            C1764a.m5928a("milliseconds:%d, duration:%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
            mo67264a(0);
        }
    }
}
