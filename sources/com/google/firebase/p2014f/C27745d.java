package com.google.firebase.p2014f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.f.d */
public class C27745d {

    /* renamed from: b */
    private static volatile C27745d f65194b;

    /* renamed from: a */
    private final Set<AbstractC27747f> f65195a = new HashSet();

    static {
        Covode.recordClassIndex(33329);
    }

    C27745d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<AbstractC27747f> mo46382a() {
        Set<AbstractC27747f> unmodifiableSet;
        MethodCollector.m26663i(8035);
        synchronized (this.f65195a) {
            try {
                unmodifiableSet = Collections.unmodifiableSet(this.f65195a);
            } finally {
                MethodCollector.m26664o(8035);
            }
        }
        return unmodifiableSet;
    }

    /* renamed from: b */
    public static C27745d m55467b() {
        MethodCollector.m26663i(8037);
        C27745d dVar = f65194b;
        if (dVar == null) {
            synchronized (C27745d.class) {
                try {
                    dVar = f65194b;
                    if (dVar == null) {
                        dVar = new C27745d();
                        f65194b = dVar;
                    }
                } finally {
                    MethodCollector.m26664o(8037);
                }
            }
        }
        return dVar;
    }
}
