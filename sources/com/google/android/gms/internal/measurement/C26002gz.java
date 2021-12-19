package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.gz */
public class C26002gz {

    /* renamed from: d */
    private static final C25965fv f61274d = C25965fv.m50500a();

    /* renamed from: a */
    AbstractC25943fb f61275a;

    /* renamed from: b */
    volatile AbstractC26020hq f61276b;

    /* renamed from: c */
    volatile AbstractC25943fb f61277c;

    public int hashCode() {
        return 1;
    }

    static {
        Covode.recordClassIndex(31417);
    }

    /* renamed from: a */
    public final int mo42657a() {
        if (this.f61277c != null) {
            return this.f61277c.zza();
        }
        if (this.f61276b != null) {
            return this.f61276b.mo42621m();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC25943fb mo42658b() {
        MethodCollector.m26663i(7767);
        if (this.f61277c != null) {
            AbstractC25943fb fbVar = this.f61277c;
            MethodCollector.m26664o(7767);
            return fbVar;
        }
        synchronized (this) {
            try {
                if (this.f61277c != null) {
                    return this.f61277c;
                }
                if (this.f61276b == null) {
                    this.f61277c = AbstractC25943fb.zza;
                } else {
                    this.f61277c = this.f61276b.mo42363g();
                }
                AbstractC25943fb fbVar2 = this.f61277c;
                MethodCollector.m26664o(7767);
                return fbVar2;
            } finally {
                MethodCollector.m26664o(7767);
            }
        }
    }

    /* renamed from: a */
    private final AbstractC26020hq m50625a(AbstractC26020hq hqVar) {
        MethodCollector.m26663i(7591);
        if (this.f61276b == null) {
            synchronized (this) {
                try {
                    if (this.f61276b == null) {
                        try {
                            this.f61276b = hqVar;
                            this.f61277c = AbstractC25943fb.zza;
                        } catch (C25994gr unused) {
                            this.f61276b = hqVar;
                            this.f61277c = AbstractC25943fb.zza;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7591);
                    throw th;
                }
            }
        }
        AbstractC26020hq hqVar2 = this.f61276b;
        MethodCollector.m26664o(7591);
        return hqVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26002gz)) {
            return false;
        }
        C26002gz gzVar = (C26002gz) obj;
        AbstractC26020hq hqVar = this.f61276b;
        AbstractC26020hq hqVar2 = gzVar.f61276b;
        if (hqVar == null) {
            if (hqVar2 == null) {
                return mo42658b().equals(gzVar.mo42658b());
            }
            return m50625a(hqVar2.mo42615H_()).equals(hqVar2);
        } else if (hqVar2 != null) {
            return hqVar.equals(hqVar2);
        } else {
            return hqVar.equals(gzVar.m50625a(hqVar.mo42615H_()));
        }
    }
}
