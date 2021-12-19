package com.bytedance.falconx.p973a;

import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.p973a.p974a.C14559a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.falconx.a.a */
public final class C14557a {

    /* renamed from: a */
    public static List<C14559a> f35191a;

    /* renamed from: b */
    public static final List<C14558a> f35192b = new ArrayList();

    static {
        Covode.recordClassIndex(16644);
    }

    /* renamed from: a */
    public static void m26635a(String str, String str2, long j) {
        MethodCollector.m26663i(4463);
        if (!C14560b.f35205a) {
            MethodCollector.m26664o(4463);
            return;
        }
        List<C14558a> list = f35192b;
        synchronized (list) {
            try {
                list.add(new C14558a(false, str, str2, j));
            } finally {
                MethodCollector.m26664o(4463);
            }
        }
    }

    /* renamed from: com.bytedance.falconx.a.a$a */
    public static class C14558a {

        /* renamed from: a */
        public boolean f35193a;

        /* renamed from: b */
        public String f35194b;

        /* renamed from: c */
        public String f35195c;

        /* renamed from: d */
        public long f35196d;

        static {
            Covode.recordClassIndex(16645);
        }

        public C14558a(boolean z, String str, String str2, long j) {
            this.f35193a = z;
            this.f35194b = str;
            this.f35195c = str2;
            this.f35196d = j;
        }
    }
}
