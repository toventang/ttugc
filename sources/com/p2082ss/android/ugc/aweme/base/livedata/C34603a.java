package com.p2082ss.android.ugc.aweme.base.livedata;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.livedata.a */
public final class C34603a {

    /* renamed from: a */
    public final Map<String, C33943c<Object>> f81658a;

    static {
        Covode.recordClassIndex(41566);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.livedata.a$a */
    public static class C34604a {

        /* renamed from: a */
        public static final C34603a f81659a = new C34603a((byte) 0);

        static {
            Covode.recordClassIndex(41567);
        }
    }

    private C34603a() {
        this.f81658a = new HashMap();
    }

    /* synthetic */ C34603a(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized <T> C33943c<T> mo61063a(String str) {
        C33943c<T> cVar;
        MethodCollector.m26663i(13935);
        if (!this.f81658a.containsKey(str)) {
            this.f81658a.put(str, new C33943c<>());
        }
        cVar = (C33943c<T>) this.f81658a.get(str);
        MethodCollector.m26664o(13935);
        return cVar;
    }
}
