package com.p2082ss.android.ugc.aweme.performance;

import android.os.SystemClock;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.LinkedList;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.performance.a */
public final class C62827a {

    /* renamed from: h */
    public static final C62829b f142465h = new C62829b((byte) 0);

    /* renamed from: a */
    C62828a f142466a = new C62828a(-1, null);

    /* renamed from: b */
    C62828a f142467b;

    /* renamed from: c */
    LinkedList<C62828a> f142468c = new LinkedList<>();

    /* renamed from: d */
    boolean f142469d;

    /* renamed from: e */
    public LagDataCallback f142470e;

    /* renamed from: f */
    public int f142471f = 1000;

    /* renamed from: g */
    public final String f142472g;

    /* renamed from: i */
    private final Runnable f142473i = new RunnableC62832d(this);

    /* renamed from: j */
    private boolean f142474j;

    /* renamed from: k */
    private long f142475k;

    static {
        Covode.recordClassIndex(73653);
    }

    /* renamed from: com.ss.android.ugc.aweme.performance.a$b */
    public static final class C62829b {
        static {
            Covode.recordClassIndex(73655);
        }

        private C62829b() {
        }

        public /* synthetic */ C62829b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.performance.a$d */
    static final class RunnableC62832d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C62827a f142486a;

        static {
            Covode.recordClassIndex(73658);
        }

        RunnableC62832d(C62827a aVar) {
            this.f142486a = aVar;
        }

        public final void run() {
            this.f142486a.mo100795b();
        }
    }

    /* renamed from: a */
    public final void mo100792a() {
        if (!this.f142469d) {
            this.f142469d = true;
            this.f142475k = SystemClock.uptimeMillis();
            this.f142468c.clear();
            C62834b a = C62834b.m113231a();
            a.f142491b.add(this);
            if (!a.f142492c && !a.f142492c) {
                C12364f.f29788r.mo20120a(a);
                a.f142492c = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo100795b() {
        if (this.f142469d) {
            this.f142469d = false;
            if (this.f142474j) {
                C34727m.m70943a().removeCallbacks(this.f142473i);
            }
            this.f142474j = false;
            C62834b a = C62834b.m113231a();
            a.f142491b.remove(this);
            if (a.f142491b.isEmpty() && a.f142492c) {
                C12364f.f29788r.mo20122b(a);
                a.f142492c = false;
            }
            LinkedList<C62828a> linkedList = this.f142468c;
            this.f142468c = new LinkedList<>();
            C12560b.C12564a.f30567a.mo20387a(new RunnableC62830c(this, linkedList, SystemClock.uptimeMillis() - this.f142475k));
            this.f142475k = 0;
            this.f142466a.mo100796a(-1, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.performance.a$c */
    public static final class RunnableC62830c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C62827a f142482a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f142483b;

        /* renamed from: c */
        final /* synthetic */ long f142484c;

        static {
            Covode.recordClassIndex(73656);
        }

        RunnableC62830c(C62827a aVar, LinkedList linkedList, long j) {
            this.f142482a = aVar;
            this.f142483b = linkedList;
            this.f142484c = j;
        }

        public final void run() {
            MethodCollector.m26663i(6045);
            int i = 0;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            for (C62828a aVar : this.f142483b) {
                j += aVar.f142476a - aVar.f142480e;
                if (aVar.f142479d) {
                    i++;
                }
                if (aVar.f142478c) {
                    i2++;
                }
                if (aVar.f142477b) {
                    i3++;
                }
            }
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", this.f142482a.f142472g);
            jSONObject.put("duration", this.f142484c);
            jSONObject.put("block_count", this.f142483b.size());
            jSONObject.put("block_duration", j);
            jSONObject.put("block_count_on_frame", i);
            jSONObject.put("delay_doFrame_count", i2);
            jSONObject.put("delay_input_count", i3);
            synchronized (this.f142482a) {
                try {
                    LagDataCallback lagDataCallback = this.f142482a.f142470e;
                    if (lagDataCallback != null) {
                        lagDataCallback.onDataAvailable(jSONObject);
                        return;
                    }
                    HandlerThreadC29808t.m60042a().mo52082b(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.performance.C62827a.RunnableC62830c.RunnableC628311 */

                        static {
                            Covode.recordClassIndex(73657);
                        }

                        public final void run() {
                            C39162r.m79461a("tool_performance_fps_info", jSONObject);
                        }
                    });
                    MethodCollector.m26664o(6045);
                } finally {
                    MethodCollector.m26664o(6045);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100793a(long j) {
        if (!this.f142469d) {
            mo100792a();
            this.f142474j = true;
            C34727m.m70943a().postDelayed(this.f142473i, j);
        }
    }

    public C62827a(String str) {
        C89219l.m154721d(str, "");
        this.f142472g = str;
    }

    /* renamed from: a */
    public final void mo100794a(LagDataCallback lagDataCallback) {
        MethodCollector.m26663i(7480);
        synchronized (this) {
            try {
                this.f142470e = lagDataCallback;
            } finally {
                MethodCollector.m26664o(7480);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.performance.a$a */
    public static final class C62828a {

        /* renamed from: a */
        public long f142476a = -1;

        /* renamed from: b */
        public boolean f142477b;

        /* renamed from: c */
        public boolean f142478c;

        /* renamed from: d */
        public boolean f142479d;

        /* renamed from: e */
        public long f142480e;

        /* renamed from: f */
        public String f142481f;

        static {
            Covode.recordClassIndex(73654);
        }

        public C62828a(long j, String str) {
            this.f142480e = j;
            this.f142481f = str;
        }

        /* renamed from: a */
        public final void mo100796a(long j, String str) {
            this.f142480e = j;
            this.f142481f = str;
            this.f142476a = -1;
            this.f142477b = false;
            this.f142478c = false;
            this.f142479d = false;
        }
    }
}
