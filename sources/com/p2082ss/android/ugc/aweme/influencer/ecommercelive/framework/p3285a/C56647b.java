package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.b */
public final class C56647b {

    /* renamed from: a */
    public static final C56647b f129101a = new C56647b();

    /* renamed from: b */
    private static final long f129102b = (((long) Process.myPid()) << 16);

    /* renamed from: c */
    private static final HandlerThread f129103c;

    /* renamed from: d */
    private static final Handler f129104d;

    /* renamed from: e */
    private static final AtomicInteger f129105e = new AtomicInteger(1);

    /* renamed from: f */
    private static final WeakHashMap<C56648a, Map<String, Object>> f129106f = new WeakHashMap<>();

    /* renamed from: g */
    private static final C0489d<C56648a> f129107g = new C0489d<>();

    private C56647b() {
    }

    static {
        Covode.recordClassIndex(66492);
        HandlerThread handlerThread = new HandlerThread("keys_keep");
        f129103c = handlerThread;
        handlerThread.start();
        f129104d = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final synchronized C56648a mo93533a(String str) {
        C56648a aVar;
        MethodCollector.m26663i(4689);
        C89219l.m154721d(str, "");
        aVar = new C56648a(f129102b | ((long) f129105e.getAndAdd(1)), str);
        f129106f.put(aVar, new LinkedHashMap());
        MethodCollector.m26664o(4689);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized Map<String, Object> mo93534a(C56648a aVar) {
        Map<String, Object> map;
        MethodCollector.m26663i(4745);
        C89219l.m154721d(aVar, "");
        WeakHashMap<C56648a, Map<String, Object>> weakHashMap = f129106f;
        map = weakHashMap.get(aVar);
        if (map == null) {
            map = new LinkedHashMap<>();
            weakHashMap.put(aVar, map);
        }
        MethodCollector.m26664o(4745);
        return map;
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.b$a */
    public static final class C56648a {

        /* renamed from: a */
        public C56648a f129108a;

        /* renamed from: b */
        public final long f129109b;

        /* renamed from: c */
        public final String f129110c;

        static {
            Covode.recordClassIndex(66493);
        }

        public C56648a(long j, String str) {
            C89219l.m154721d(str, "");
            this.f129109b = j;
            this.f129110c = str;
        }
    }
}
