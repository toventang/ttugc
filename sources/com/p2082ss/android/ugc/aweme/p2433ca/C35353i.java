package com.p2082ss.android.ugc.aweme.p2433ca;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.ca.i */
public class C35353i {

    /* renamed from: c */
    private static final String f83393c = C35353i.class.getSimpleName();

    /* renamed from: a */
    public final Map<String, LayoutInflater> f83394a = new ConcurrentHashMap();

    /* renamed from: b */
    public AbstractC35354a f83395b;

    /* renamed from: com.ss.android.ugc.aweme.ca.i$a */
    public interface AbstractC35354a {
        static {
            Covode.recordClassIndex(42522);
        }

        /* renamed from: a */
        LayoutInflater mo62227a();
    }

    static {
        Covode.recordClassIndex(42521);
    }

    /* renamed from: a */
    public final synchronized void mo62225a() {
        MethodCollector.m26663i(12894);
        this.f83395b = null;
        this.f83394a.clear();
        MethodCollector.m26664o(12894);
    }

    /* renamed from: a */
    public final synchronized LayoutInflater mo62224a(Context context) {
        MethodCollector.m26663i(12977);
        LayoutInflater layoutInflater = null;
        AbstractC35354a aVar = this.f83395b;
        if (aVar != null) {
            layoutInflater = aVar.mo62227a();
        }
        if (layoutInflater != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                MethodCollector.m26664o(12977);
                return layoutInflater;
            }
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        MethodCollector.m26664o(12977);
        return layoutInflater;
    }

    /* renamed from: a */
    public final synchronized void mo62226a(AbstractC35354a aVar) {
        MethodCollector.m26663i(12893);
        synchronized (this) {
            try {
                this.f83395b = aVar;
            } finally {
                MethodCollector.m26664o(12893);
            }
        }
    }
}
