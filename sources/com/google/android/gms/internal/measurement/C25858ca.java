package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ca */
public final class C25858ca implements AbstractC25836bf {

    /* renamed from: d */
    private static final Map<String, C25858ca> f60985d = new C0484a();

    /* renamed from: a */
    final Object f60986a = new Object();

    /* renamed from: b */
    volatile Map<String, ?> f60987b;

    /* renamed from: c */
    final List<Object> f60988c = new ArrayList();

    /* renamed from: e */
    private final SharedPreferences f60989e;

    /* renamed from: f */
    private final SharedPreferences.OnSharedPreferenceChangeListener f60990f;

    static {
        Covode.recordClassIndex(31273);
    }

    /* renamed from: a */
    public static synchronized void m50059a() {
        synchronized (C25858ca.class) {
            MethodCollector.m26663i(4761);
            for (C25858ca caVar : f60985d.values()) {
                caVar.f60989e.unregisterOnSharedPreferenceChangeListener(caVar.f60990f);
            }
            f60985d.clear();
            MethodCollector.m26664o(4761);
        }
    }

    private C25858ca(SharedPreferences sharedPreferences) {
        SharedPreferences$OnSharedPreferenceChangeListenerC25856bz bzVar = new SharedPreferences$OnSharedPreferenceChangeListenerC25856bz(this);
        this.f60990f = bzVar;
        this.f60989e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(bzVar);
    }

    /* renamed from: b */
    private static SharedPreferences m50060b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            throw new NullPointerException("startsWith");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: a */
    static C25858ca m50058a(Context context) {
        C25858ca caVar;
        MethodCollector.m26663i(4655);
        if (C25829az.m50014a()) {
            throw new NullPointerException("startsWith");
        }
        synchronized (C25858ca.class) {
            try {
                Map<String, C25858ca> map = f60985d;
                caVar = map.get(null);
                if (caVar == null) {
                    caVar = new C25858ca(m50060b(context));
                    map.put(null, caVar);
                }
            } finally {
                MethodCollector.m26664o(4655);
            }
        }
        return caVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25836bf
    /* renamed from: a */
    public final Object mo42187a(String str) {
        Object obj;
        MethodCollector.m26663i(4667);
        Map<String, ?> map = this.f60987b;
        if (map == null) {
            synchronized (this.f60986a) {
                try {
                    map = this.f60987b;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = this.f60989e.getAll();
                            this.f60987b = map;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            MethodCollector.m26664o(4667);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    MethodCollector.m26664o(4667);
                    throw th2;
                }
            }
        }
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        MethodCollector.m26664o(4667);
        return obj;
    }
}
