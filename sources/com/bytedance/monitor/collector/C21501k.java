package com.bytedance.monitor.collector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p788p.C12569d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.AbstractC21480e;
import com.bytedance.monitor.collector.C21483g;
import com.bytedance.monitor.p1546a.p1547a.C21433b;
import com.bytedance.services.apm.api.AbstractC22711d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.monitor.collector.k */
public class C21501k {

    /* renamed from: a */
    public static volatile boolean f51022a;

    /* renamed from: q */
    private static volatile C21501k f51023q;

    /* renamed from: b */
    public final List<AbstractC21475b> f51024b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public volatile boolean f51025c;

    /* renamed from: d */
    public volatile boolean f51026d;

    /* renamed from: e */
    public volatile boolean f51027e;

    /* renamed from: f */
    public volatile boolean f51028f;

    /* renamed from: g */
    public volatile boolean f51029g;

    /* renamed from: h */
    public BinderMonitor f51030h;

    /* renamed from: i */
    public C21506l f51031i;

    /* renamed from: j */
    public C21477c f51032j;

    /* renamed from: k */
    public IOMonitor f51033k;

    /* renamed from: l */
    public C21483g f51034l;

    /* renamed from: m */
    public AbstractC21480e f51035m;

    /* renamed from: n */
    public AbstractC21482f f51036n;

    /* renamed from: o */
    public C21499j f51037o;

    /* renamed from: p */
    public C12569d f51038p;

    /* renamed from: r */
    private volatile boolean f51039r;

    /* renamed from: s */
    private Runnable f51040s = new Runnable() {
        /* class com.bytedance.monitor.collector.C21501k.RunnableC215021 */

        static {
            Covode.recordClassIndex(25129);
        }

        public final void run() {
            C21501k.this.mo35100a(false);
        }
    };

    /* renamed from: com.bytedance.monitor.collector.k$a */
    public interface AbstractC21505a {
        static {
            Covode.recordClassIndex(25132);
        }

        /* renamed from: a */
        void mo20287a(List<String> list);
    }

    static {
        Covode.recordClassIndex(25128);
    }

    /* renamed from: b */
    public final AbstractC21480e.AbstractC21481a mo35101b() {
        AbstractC21480e eVar = this.f51035m;
        if (eVar == null) {
            return null;
        }
        return eVar.mo35080a();
    }

    /* renamed from: d */
    public final C21483g.AbstractC21490c mo35103d() {
        C21483g gVar = this.f51034l;
        if (gVar == null) {
            return null;
        }
        return gVar.f50927f;
    }

    /* renamed from: e */
    public final C21483g.C21492e mo35104e() {
        C21483g gVar = this.f51034l;
        if (gVar == null) {
            return null;
        }
        return gVar.mo35083d();
    }

    private C21501k() {
        ActivityLifeObserver.getInstance().register(new AbstractC22711d() {
            /* class com.bytedance.monitor.collector.C21501k.C215032 */

            static {
                Covode.recordClassIndex(25130);
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: a */
            public final void mo20108a(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: c */
            public final void mo20109c(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: l_ */
            public final void mo20110l_() {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: a */
            public final void mo20033a(Activity activity) {
                C21501k kVar = C21501k.this;
                if (kVar.f51036n != null) {
                    boolean z = kVar.f51029g;
                }
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: b */
            public final void mo20035b(Activity activity) {
                C21501k kVar = C21501k.this;
                if (kVar.f51036n != null) {
                    boolean z = kVar.f51029g;
                }
            }
        });
    }

    /* renamed from: a */
    public static C21501k m40384a() {
        if (f51023q == null) {
            synchronized (C21501k.class) {
                if (f51023q == null) {
                    f51023q = new C21501k();
                }
            }
        }
        return f51023q;
    }

    /* renamed from: c */
    public final JSONObject mo35102c() {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.f51024b.size(); i++) {
            try {
                Pair<String, ?> c = this.f51024b.get(i).mo35059c();
                jSONObject.put((String) c.first, c.second);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static synchronized boolean m40385a(Context context) {
        boolean z;
        synchronized (C21501k.class) {
            if (!f51022a) {
                f51022a = C21433b.m40237a(context, "monitorcollector-lib");
                ByteHook.m7797a();
            }
            z = f51022a;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo35100a(boolean z) {
        if (this.f51039r) {
            try {
                if (f51022a) {
                    C12569d dVar = this.f51038p;
                    if (dVar != null) {
                        if (z) {
                            dVar.mo20400b(this.f51040s);
                            dVar.mo20399a(this.f51040s, 10000);
                        } else {
                            dVar.mo20400b(this.f51040s);
                        }
                    }
                    MonitorJni.doSetRecordSwitch(z);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo35099a(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.f51024b.size(); i++) {
            try {
                Pair<String, ?> a = this.f51024b.get(i).mo35057a(j, j2);
                jSONObject.put((String) a.first, a.second);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
