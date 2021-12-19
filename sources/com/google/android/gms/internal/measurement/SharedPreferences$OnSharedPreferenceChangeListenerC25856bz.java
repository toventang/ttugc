package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.bz */
final /* synthetic */ class SharedPreferences$OnSharedPreferenceChangeListenerC25856bz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C25858ca f60984a;

    static {
        Covode.recordClassIndex(31271);
    }

    SharedPreferences$OnSharedPreferenceChangeListenerC25856bz(C25858ca caVar) {
        this.f60984a = caVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        MethodCollector.m26663i(4589);
        C25858ca caVar = this.f60984a;
        synchronized (caVar.f60986a) {
            try {
                caVar.f60987b = null;
                AbstractC25845bo.f60968c.incrementAndGet();
            } finally {
                MethodCollector.m26664o(4589);
            }
        }
        synchronized (caVar) {
            try {
                Iterator<Object> it = caVar.f60988c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(4589);
            }
        }
    }
}
