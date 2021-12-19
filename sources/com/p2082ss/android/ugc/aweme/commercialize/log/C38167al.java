package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.al */
public class C38167al {

    /* renamed from: c */
    private static C38167al f90147c;

    /* renamed from: a */
    public Set<String> f90148a = new HashSet();

    /* renamed from: b */
    public boolean f90149b = false;

    /* renamed from: d */
    private Set<String> f90150d = new HashSet();

    static {
        Covode.recordClassIndex(45646);
    }

    /* renamed from: a */
    public static C38167al m77380a() {
        MethodCollector.m26663i(8513);
        if (f90147c == null) {
            synchronized (C38167al.class) {
                try {
                    if (f90147c == null) {
                        f90147c = new C38167al();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8513);
                    throw th;
                }
            }
        }
        C38167al alVar = f90147c;
        MethodCollector.m26664o(8513);
        return alVar;
    }

    /* renamed from: a */
    public final boolean mo66466a(String str) {
        return this.f90148a.contains(str);
    }

    /* renamed from: b */
    public final void mo66467b(String str) {
        this.f90148a.add(str);
    }
}
