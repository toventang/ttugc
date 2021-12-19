package com.bytedance.ies.ugc.aweme.network.p1264a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a.e */
public final class C18087e {

    /* renamed from: a */
    private final List<C18088a> f43059a;

    static {
        Covode.recordClassIndex(20724);
    }

    public C18087e() {
        this.f43059a = new ArrayList();
    }

    /* renamed from: b */
    public final C18087e mo28849b() {
        return new C18087e(mo28847a());
    }

    /* renamed from: a */
    public final synchronized List<C18088a> mo28847a() {
        List<C18088a> unmodifiableList;
        MethodCollector.m26663i(10134);
        unmodifiableList = Collections.unmodifiableList(this.f43059a);
        MethodCollector.m26664o(10134);
        return unmodifiableList;
    }

    private C18087e(List<C18088a> list) {
        this.f43059a = list;
    }

    /* renamed from: a */
    public final synchronized void mo28848a(C18088a aVar) {
        MethodCollector.m26663i(10133);
        this.f43059a.add(aVar);
        MethodCollector.m26664o(10133);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.a.e$a */
    public static final class C18088a {

        /* renamed from: a */
        public int f43060a;

        /* renamed from: b */
        public int f43061b;

        /* renamed from: c */
        public long f43062c;

        /* renamed from: d */
        public long f43063d = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(20725);
        }

        public C18088a(long j, int i, int i2) {
            this.f43060a = i2;
            this.f43061b = i;
            this.f43062c = j;
        }
    }
}
