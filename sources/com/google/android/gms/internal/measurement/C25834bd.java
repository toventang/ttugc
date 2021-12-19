package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.bd */
final class C25834bd extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C25832bb f60956a;

    static {
        Covode.recordClassIndex(31249);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25834bd(C25832bb bbVar) {
        super(null);
        this.f60956a = bbVar;
    }

    public final void onChange(boolean z) {
        MethodCollector.m26663i(4791);
        C25832bb bbVar = this.f60956a;
        synchronized (bbVar.f60948a) {
            try {
                bbVar.f60949b = null;
                AbstractC25845bo.f60968c.incrementAndGet();
            } finally {
                MethodCollector.m26664o(4791);
            }
        }
        synchronized (bbVar) {
            try {
                Iterator<Object> it = bbVar.f60950c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(4791);
            }
        }
    }
}
