package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fv */
public class C25965fv {

    /* renamed from: a */
    private static boolean f61151a = true;

    /* renamed from: b */
    private static volatile C25965fv f61152b;

    /* renamed from: c */
    private static volatile C25965fv f61153c;

    /* renamed from: d */
    private static final C25965fv f61154d = new C25965fv((byte) 0);

    /* renamed from: e */
    private final Map<C25966a, AbstractC25981gj.C25985d<?, ?>> f61155e;

    /* renamed from: com.google.android.gms.internal.measurement.fv$a */
    static final class C25966a {

        /* renamed from: a */
        private final Object f61156a;

        /* renamed from: b */
        private final int f61157b;

        static {
            Covode.recordClassIndex(31381);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f61156a) * 65535) + this.f61157b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C25966a)) {
                return false;
            }
            C25966a aVar = (C25966a) obj;
            if (this.f61156a == aVar.f61156a && this.f61157b == aVar.f61157b) {
                return true;
            }
            return false;
        }

        C25966a(Object obj, int i) {
            this.f61156a = obj;
            this.f61157b = i;
        }
    }

    C25965fv() {
        this.f61155e = new HashMap();
    }

    static {
        Covode.recordClassIndex(31380);
    }

    /* renamed from: a */
    public static C25965fv m50500a() {
        MethodCollector.m26663i(7204);
        C25965fv fvVar = f61152b;
        if (fvVar == null) {
            synchronized (C25965fv.class) {
                try {
                    fvVar = f61152b;
                    if (fvVar == null) {
                        fvVar = f61154d;
                        f61152b = fvVar;
                    }
                } finally {
                    MethodCollector.m26664o(7204);
                }
            }
        }
        return fvVar;
    }

    /* renamed from: b */
    public static C25965fv m50501b() {
        MethodCollector.m26663i(7341);
        C25965fv fvVar = f61153c;
        if (fvVar != null) {
            MethodCollector.m26664o(7341);
            return fvVar;
        }
        synchronized (C25965fv.class) {
            try {
                C25965fv fvVar2 = f61153c;
                if (fvVar2 != null) {
                    return fvVar2;
                }
                C25965fv a = AbstractC25980gi.m50553a(C25965fv.class);
                f61153c = a;
                MethodCollector.m26664o(7341);
                return a;
            } finally {
                MethodCollector.m26664o(7341);
            }
        }
    }

    private C25965fv(byte b) {
        this.f61155e = Collections.emptyMap();
    }

    /* renamed from: a */
    public final <ContainingType extends AbstractC26020hq> AbstractC25981gj.C25985d<ContainingType, ?> mo42575a(ContainingType containingtype, int i) {
        return (AbstractC25981gj.C25985d<ContainingType, ?>) this.f61155e.get(new C25966a(containingtype, i));
    }
}
