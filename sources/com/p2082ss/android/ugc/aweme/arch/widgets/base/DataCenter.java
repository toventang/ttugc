package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.DataCenter */
public class DataCenter extends AbstractC1174ac {

    /* renamed from: a */
    protected AbstractC1204m f80259a;

    /* renamed from: b */
    public AtomicInteger f80260b = new AtomicInteger(0);

    /* renamed from: c */
    private Map<String, Object> f80261c = new HashMap();

    /* renamed from: d */
    private Map<String, C33943c<C33942b>> f80262d = new HashMap();

    /* renamed from: e */
    private Thread f80263e;

    /* renamed from: f */
    private Handler f80264f = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(40861);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f80261c.clear();
        this.f80262d.clear();
        this.f80259a = null;
    }

    /* renamed from: a */
    public final DataCenter mo60188a(AbstractC1214u<C33942b> uVar) {
        for (C33943c<C33942b> cVar : this.f80262d.values()) {
            cVar.removeObserver(uVar);
        }
        return this;
    }

    /* renamed from: b */
    public final C33943c<C33942b> mo60194b(String str) {
        C33943c<C33942b> cVar = this.f80262d.get(str);
        if (cVar == null) {
            cVar = new C33943c<>();
            if (this.f80261c.containsKey(str)) {
                cVar.setValue(new C33942b(str, this.f80261c.get(str)));
            }
            this.f80262d.put(str, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final <T> T mo60192a(String str) {
        T t = (T) this.f80261c.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final DataCenter mo60189a(String str, AbstractC1214u<C33942b> uVar) {
        return mo60190a(str, uVar, false);
    }

    /* renamed from: a */
    public static DataCenter m69492a(C1175ad adVar, AbstractC1204m mVar) {
        DataCenter dataCenter = (DataCenter) adVar.mo3983a(DataCenter.class);
        dataCenter.f80259a = mVar;
        return dataCenter;
    }

    /* renamed from: b */
    public final <T> T mo60195b(String str, T t) {
        return !this.f80261c.containsKey(str) ? t : (T) mo60192a(str);
    }

    /* renamed from: b */
    public final DataCenter mo60193b(String str, AbstractC1214u<C33942b> uVar) {
        C33943c<C33942b> cVar;
        if (!TextUtils.isEmpty(str) && (cVar = this.f80262d.get(str)) != null) {
            cVar.removeObserver(uVar);
        }
        return this;
    }

    /* renamed from: a */
    public final DataCenter mo60191a(final String str, final Object obj) {
        MethodCollector.m26663i(1156);
        if (this.f80263e == null) {
            this.f80263e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f80263e) {
            while (this.f80260b.get() > 0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException unused) {
                }
            }
            synchronized (this) {
                try {
                    this.f80261c.put(str, obj);
                    C33943c<C33942b> cVar = this.f80262d.get(str);
                    if (cVar != null) {
                        cVar.setValue(new C33942b(str, obj));
                    }
                } finally {
                    MethodCollector.m26664o(1156);
                }
            }
            return this;
        }
        this.f80264f.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter.RunnableC339391 */

            static {
                Covode.recordClassIndex(40862);
            }

            public final void run() {
                DataCenter.this.mo60191a(str, obj);
            }
        });
        MethodCollector.m26664o(1156);
        return this;
    }

    /* renamed from: a */
    public final DataCenter mo60190a(String str, AbstractC1214u<C33942b> uVar, boolean z) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            mo60194b(str).mo60213a(this.f80259a, uVar, z);
        }
        return this;
    }
}
