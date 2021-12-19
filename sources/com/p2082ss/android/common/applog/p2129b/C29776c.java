package com.p2082ss.android.common.applog.p2129b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.applog.b.c */
public class C29776c {

    /* renamed from: k */
    private static volatile C29776c f70997k;

    /* renamed from: n */
    private static volatile AbstractC29773a f70998n;

    /* renamed from: a */
    public boolean f70999a;

    /* renamed from: b */
    public boolean f71000b;

    /* renamed from: c */
    public boolean f71001c = true;

    /* renamed from: d */
    public long f71002d = System.currentTimeMillis();

    /* renamed from: e */
    public C29784d f71003e;

    /* renamed from: f */
    public C29774b f71004f;

    /* renamed from: g */
    public final List<C29784d> f71005g = new ArrayList();

    /* renamed from: h */
    public boolean f71006h = false;

    /* renamed from: i */
    public final Runnable f71007i = new Runnable() {
        /* class com.p2082ss.android.common.applog.p2129b.C29776c.RunnableC297793 */

        static {
            Covode.recordClassIndex(36184);
        }

        public final void run() {
            if (C29776c.this.f71003e != null) {
                if (C29776c.this.f71006h) {
                    C29776c.this.f71004f.mo52035a(C29776c.this.f71003e);
                } else {
                    C29776c.this.f71005g.add(C29776c.this.f71003e);
                }
                C29776c.this.f71003e = null;
                C29776c.this.f71004f.mo52036a("");
            }
        }
    };

    /* renamed from: j */
    public final Runnable f71008j = new Runnable() {
        /* class com.p2082ss.android.common.applog.p2129b.C29776c.RunnableC297804 */

        static {
            Covode.recordClassIndex(36185);
        }

        public final void run() {
            C29776c.this.f71006h = true;
            for (C29784d dVar : new ArrayList(C29776c.this.f71005g)) {
                C29776c.this.f71004f.mo52035a(dVar);
            }
            C29776c.this.f71005g.clear();
        }
    };

    /* renamed from: l */
    private Handler f71009l;

    /* renamed from: m */
    private Context f71010m;

    static {
        Covode.recordClassIndex(36181);
    }

    /* renamed from: c */
    public final void mo52042c() {
        m59977d().removeMessages(1);
    }

    /* renamed from: b */
    public final void mo52041b() {
        this.f70999a = false;
        this.f71005g.clear();
        this.f71006h = false;
    }

    /* renamed from: d */
    private Handler m59977d() {
        MethodCollector.m26663i(12632);
        if (this.f71009l == null) {
            synchronized (this) {
                try {
                    if (this.f71009l == null) {
                        this.f71009l = new Handler(HandlerThreadC29808t.m60042a().getLooper()) {
                            /* class com.p2082ss.android.common.applog.p2129b.C29776c.HandlerC297771 */

                            static {
                                Covode.recordClassIndex(36182);
                            }

                            public final void handleMessage(Message message) {
                                boolean equals;
                                super.handleMessage(message);
                                boolean z = true;
                                if (message.what == 1) {
                                    if (C29776c.this.f71003e != null) {
                                        Object obj = message.obj;
                                        if (obj instanceof String) {
                                            String str = (String) obj;
                                            String str2 = C29776c.this.f71003e.f71025b;
                                            if (str != null) {
                                                equals = str.equals(str2);
                                            } else if (str2 == null) {
                                                equals = true;
                                            } else {
                                                equals = false;
                                            }
                                            if (!C29776c.this.f71001c || !C29776c.this.f71000b) {
                                                z = false;
                                            }
                                            if (equals && z) {
                                                C29776c.this.f71003e.f71030g = System.currentTimeMillis();
                                                C29776c.this.f71004f.mo52037b(C29776c.this.f71003e);
                                                C29776c.this.mo52040a(str);
                                                C29776c.this.mo52039a();
                                                return;
                                            }
                                        }
                                    }
                                    C29776c.this.f71004f.mo52036a("");
                                    C29776c.this.mo52039a();
                                }
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12632);
                    throw th;
                }
            }
        }
        Handler handler = this.f71009l;
        MethodCollector.m26664o(12632);
        return handler;
    }

    /* renamed from: a */
    public final void mo52039a() {
        boolean a = f70998n.mo52034a();
        if (this.f71000b == a) {
            return;
        }
        if (a) {
            final long currentTimeMillis = System.currentTimeMillis();
            HandlerThreadC29808t.m60042a().mo52080a(new Runnable() {
                /* class com.p2082ss.android.common.applog.p2129b.C29776c.RunnableC297837 */

                static {
                    Covode.recordClassIndex(36188);
                }

                public final void run() {
                    if (!C29776c.this.f71000b) {
                        C29776c.this.f71000b = true;
                        if (C29776c.this.f71001c) {
                            C29776c.this.f70999a = true;
                            if (C29776c.this.f71003e == null) {
                                C29776c.this.f71003e = new C29784d(currentTimeMillis);
                                C29776c.this.f71004f.mo52036a("");
                                C29776c cVar = C29776c.this;
                                cVar.mo52040a(cVar.f71003e.f71025b);
                                return;
                            }
                            long j = currentTimeMillis - C29776c.this.f71003e.f71030g;
                            if (j <= 15000) {
                                HandlerThreadC29808t.m60042a().mo52084c(C29776c.this.f71007i);
                                C29776c.this.f71003e.f71031h += j;
                                C29776c.this.f71003e.f71030g = currentTimeMillis;
                                C29776c.this.f71004f.mo52037b(C29776c.this.f71003e);
                                C29776c cVar2 = C29776c.this;
                                cVar2.mo52040a(cVar2.f71003e.f71025b);
                                return;
                            }
                            HandlerThreadC29808t.m60042a().mo52084c(C29776c.this.f71007i);
                            C29776c.this.f71007i.run();
                            C29776c.this.f71003e = new C29784d(currentTimeMillis);
                            C29776c.this.f71004f.mo52036a("");
                            C29776c cVar3 = C29776c.this;
                            cVar3.mo52040a(cVar3.f71003e.f71025b);
                        }
                    }
                }
            });
            return;
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        HandlerThreadC29808t.m60042a().mo52080a(new Runnable() {
            /* class com.p2082ss.android.common.applog.p2129b.C29776c.RunnableC297815 */

            static {
                Covode.recordClassIndex(36186);
            }

            public final void run() {
                if (C29776c.this.f71000b) {
                    C29776c.this.f71000b = false;
                    if (C29776c.this.f71001c && C29776c.this.f71003e != null) {
                        C29776c.this.f71003e.f71030g = currentTimeMillis2;
                        HandlerThreadC29808t.m60042a().mo52081a(C29776c.this.f71007i, 15000);
                        C29776c.this.f71004f.mo52037b(C29776c.this.f71003e);
                        C29776c.this.mo52042c();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private static Context m59976b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo52040a(String str) {
        Handler d = m59977d();
        d.removeMessages(1);
        d.sendMessageDelayed(Message.obtain(d, 1, str), 5000);
    }

    private C29776c(Context context) {
        this.f71010m = m59976b(context);
        this.f71004f = new C29774b(context);
    }

    /* renamed from: a */
    public static C29776c m59975a(Context context) {
        MethodCollector.m26663i(5897);
        if (f70997k == null) {
            synchronized (C29776c.class) {
                try {
                    if (f70997k == null) {
                        f70997k = new C29776c(m59976b(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5897);
                    throw th;
                }
            }
        }
        C29776c cVar = f70997k;
        MethodCollector.m26664o(5897);
        return cVar;
    }
}
