package com.p2082ss.android.ugc.aweme.net.cache;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.cache.j */
public final class C61328j {

    /* renamed from: c */
    public static final C61329a f139285c = new C61329a((byte) 0);

    /* renamed from: a */
    final C0490e<String, C0490e<String, C61320e>> f139286a;

    /* renamed from: b */
    public int f139287b;

    static {
        Covode.recordClassIndex(71959);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.cache.j$a */
    public static final class C61329a {
        static {
            Covode.recordClassIndex(71960);
        }

        private C61329a() {
        }

        public /* synthetic */ C61329a(byte b) {
            this();
        }
    }

    public C61328j() {
        this.f139287b = 0;
        this.f139287b = 16;
        this.f139286a = new C0490e<>(this.f139287b);
    }

    /* renamed from: a */
    public final C22099u<?> mo98946a(Request request) {
        boolean z;
        String str;
        C61320e eVar;
        MethodCollector.m26663i(9314);
        C89219l.m154721d(request, "");
        C61318d b = C61316b.m111003b(request);
        if (b == null) {
            MethodCollector.m26664o(9314);
            return null;
        }
        String e = C61316b.m111006e(request);
        String str2 = b.f139265a;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = request.getPath();
        } else {
            str = b.f139265a;
        }
        if (str == null) {
            MethodCollector.m26664o(9314);
            return null;
        }
        synchronized (this.f139286a) {
            try {
                C0490e<String, C61320e> a = this.f139286a.mo2091a(str);
                if (a != null) {
                    eVar = a.mo2091a(e);
                } else {
                    eVar = null;
                }
            } finally {
                MethodCollector.m26664o(9314);
            }
        }
        if (eVar == null) {
            MethodCollector.m26664o(9314);
            return null;
        }
        C89219l.m154721d(eVar, "");
        if (System.currentTimeMillis() - eVar.f139270b > ((long) b.f139267c)) {
            C0490e<String, C61320e> a2 = this.f139286a.mo2091a(str);
            if (a2 != null) {
                a2.mo2097b(e);
            }
            return null;
        }
        C22099u<?> uVar = eVar.f139269a;
        MethodCollector.m26664o(9314);
        return uVar;
    }
}
